package classloader;

import contracts.NulsStandardToken;
import org.web3j.abi.EventEncoder;
import org.web3j.abi.EventValues;
import org.web3j.abi.FunctionReturnDecoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Event;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.tx.ChainId;
import org.web3j.tx.RawTransactionManager;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.response.NoOpProcessor;
import org.web3j.tx.response.TransactionReceiptProcessor;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        // ChainId.NONE
        String address = null;
        Web3j web3j = null;
        Credentials credentials = null;
        BigInteger gasPrice = null;
        BigInteger gasLimit = null;

        TransactionReceiptProcessor txReceiptProcessor = new NoOpProcessor(web3j);
        TransactionManager txManager = new RawTransactionManager(web3j, credentials, ChainId.NONE, txReceiptProcessor);

        NulsStandardToken nuls = NulsStandardToken.load(address,web3j,txManager,gasPrice, gasLimit);
        //parseLogs();

    }

    // [{"blockHash":"0xc101059cf1991260561e9a141a1e300a8876630544a367fa2a012795629bfb23","address":"0x0f46a24b42923aae949cd82b78b90b21e990cbad","logIndex":0,"data":"0x0000000000000000000000000000000000000000000000008ac7230489e80000","topics":["0xddf252ad1be2c89b69c2b068fc378daa952ba7f163c4a11628f55a4df523b3ef","0x000000000000000000000000effe4ec552e7b2133ce3062403ad9874c2989655","0x000000000000000000000000facbc5f2c40565d7a588c0f6afa790abce1e678c"],"blockNumber":1050157,"transactionIndex":0,"type":"mined","transactionHash":"0x4c04c2a2a2da2c64afa7db0a23ff250a3c0758cfca70793b6cd148cfa446a377","polarity":false}]
    public static void parseLogs(){

        final Event event = new Event("Transfer",
                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Address>() {}),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));

        List<String> topics = Arrays.asList(new String[]{"0xddf252ad1be2c89b69c2b068fc378daa952ba7f163c4a11628f55a4df523b3ef","0x000000000000000000000000effe4ec552e7b2133ce3062403ad9874c2989655","0x000000000000000000000000facbc5f2c40565d7a588c0f6afa790abce1e678c"});
        String encodedEventSignature = EventEncoder.encode(event);
        if (!topics.get(0).equals(encodedEventSignature)) {
           //TODO: false 签名不和规范
        }

        String logData = "0x0000000000000000000000000000000000000000000000008ac7230489e80000";
        List<Type> indexedValues = new ArrayList<>();
        List<Type> nonIndexedValues = FunctionReturnDecoder.decode(logData, event.getNonIndexedParameters());
        // 解析 indexed
        List<TypeReference<Type>> indexedParameters = event.getIndexedParameters();
        for (int i = 0; i < indexedParameters.size(); i++) {
            Type value = FunctionReturnDecoder.decodeIndexedValue(
                    topics.get(i + 1), indexedParameters.get(i));
            indexedValues.add(value);
        }
        EventValues eventValues = new EventValues(indexedValues, nonIndexedValues);
        String from = (String) eventValues.getIndexedValues().get(0).getValue();
        String to = (String) eventValues.getIndexedValues().get(1).getValue();
        BigInteger value = (BigInteger) eventValues.getNonIndexedValues().get(0).getValue();

    }
}













