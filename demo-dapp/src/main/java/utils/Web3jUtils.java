package utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.web3j.crypto.*;
import org.web3j.protocol.ObjectMapperFactory;

import java.io.File;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

public class Web3jUtils {

    private static final String HEX_PREFIX = "0x";

    private static final String JSONSUFFIX = ".json";

    private static Logger logger = LoggerFactory.getLogger(Web3jUtils.class);


    public static String generateNewWalletFile(String password, File destinationDirectory) throws CipherException, IOException, InvalidAlgorithmParameterException, NoSuchAlgorithmException, NoSuchProviderException {
        ECKeyPair ecKeyPair = Keys.createEcKeyPair();
        return generateWalletFile(password, ecKeyPair, destinationDirectory);
    }

    public static String generateNewWalletFile(String password, File destinationDirectory, String fileName) throws CipherException, IOException, InvalidAlgorithmParameterException, NoSuchAlgorithmException, NoSuchProviderException {
        ECKeyPair ecKeyPair = Keys.createEcKeyPair();
        WalletFile walletFile = Wallet.createStandard(password, ecKeyPair);
        File destination = new File(destinationDirectory, fileName + JSONSUFFIX);
        ObjectMapper objectMapper = ObjectMapperFactory.getObjectMapper();
        objectMapper.writeValue(destination, walletFile);
        return fileName;
    }

    private static String generateWalletFile(String password, ECKeyPair ecKeyPair, File destinationDirectory) throws CipherException, IOException {
        WalletFile walletFile = Wallet.createStandard(password, ecKeyPair);
        String fileName = getWalletFileName(walletFile);
        File destination = new File(destinationDirectory, fileName);
        ObjectMapper objectMapper = ObjectMapperFactory.getObjectMapper();
        objectMapper.writeValue(destination, walletFile);
        return fileName;
    }

    private static String getWalletFileName(WalletFile walletFile) {
        return HEX_PREFIX + walletFile.getAddress() + JSONSUFFIX;
    }

    public static String generateNewIdWalletFile(String password, File destinationDirectory, StringBuilder pulbicKey) throws CipherException, IOException, InvalidAlgorithmParameterException, NoSuchAlgorithmException, NoSuchProviderException {
        ECKeyPair ecKeyPair = Keys.createEcKeyPair();
        String publicKey = ecKeyPair.getPublicKey().toString(16);
        pulbicKey.append(publicKey);
        return generateWalletIdFile(password, ecKeyPair, destinationDirectory);
    }

    public static String generateWalletIdFile(String password, ECKeyPair ecKeyPair, File destinationDirectory) throws CipherException, IOException {
        WalletFile walletFile = Wallet.createStandard(password, ecKeyPair);
        String fileName = getWalletFileIdName(walletFile);
        File destination = new File(destinationDirectory, fileName);

        if (!destination.exists()) {
            FileUtils.touch(destination);
        }

        ObjectMapper objectMapper = ObjectMapperFactory.getObjectMapper();
        objectMapper.writeValue(destination, walletFile);
        return fileName;
    }

    private static String getWalletFileIdName(WalletFile walletFile) {
        return walletFile.getId() + JSONSUFFIX;
    }


}
