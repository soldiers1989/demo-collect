package jungle;

import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.tx.ChainId;
import org.web3j.tx.RawTransactionManager;
import org.web3j.tx.response.TransactionReceiptProcessor;

import java.io.IOException;
import java.math.BigInteger;

public class SssRawTransactionManager extends RawTransactionManager {

    private volatile BigInteger nonce = BigInteger.valueOf(-1);

    public SssRawTransactionManager(Web3j web3j, Credentials credentials, byte chainId) {
        super(web3j, credentials, chainId);
    }

    public SssRawTransactionManager(Web3j web3j, Credentials credentials) {
        super(web3j, credentials);
    }

    public SssRawTransactionManager(
            Web3j web3j, Credentials credentials,
            TransactionReceiptProcessor transactionReceiptProcessor) {
        super(web3j, credentials, ChainId.NONE, transactionReceiptProcessor);
    }

    public SssRawTransactionManager(
            Web3j web3j, Credentials credentials, byte chainId,
            TransactionReceiptProcessor transactionReceiptProcessor) {
        super(web3j, credentials, chainId, transactionReceiptProcessor);
    }

    @Override
    protected synchronized BigInteger getNonce() throws IOException {
        return BigInteger.valueOf(3);
        /*if (nonce.signum() == -1) {
            // obtain lock
            nonce = super.getNonce();
        } else {
            nonce = nonce.add(BigInteger.ONE);
        }
        return nonce;*/
    }

    public BigInteger getCurrentNonce() {
        return nonce;
    }

    public synchronized void resetNonce() throws IOException {
        nonce = super.getNonce();
    }

    public synchronized void setNonce(BigInteger value) {
        nonce = value;
    }
}
