//package contracts;
//
//import org.web3j.abi.EventEncoder;
//import org.web3j.abi.EventValues;
//import org.web3j.abi.TypeReference;
//import org.web3j.abi.datatypes.Address;
//import org.web3j.abi.datatypes.Event;
//import org.web3j.abi.datatypes.Function;
//import org.web3j.abi.datatypes.Type;
//import org.web3j.abi.datatypes.generated.Uint256;
//import org.web3j.crypto.Credentials;
//import org.web3j.protocol.Web3j;
//import org.web3j.protocol.core.DefaultBlockParameterName;
//import org.web3j.protocol.core.methods.request.EthFilter;
//import org.web3j.protocol.core.methods.response.Log;
//import org.web3j.protocol.core.methods.response.TransactionReceipt;
//import org.web3j.tx.Contract;
//import org.web3j.tx.TransactionManager;
//import rx.Observable;
//import rx.functions.Func1;
//
//import java.math.BigInteger;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//import java.util.concurrent.Future;
//
///**
// * <p>Auto generated code.<br>
// * <strong>Do not modify!</strong><br>
// * Please use {@link org.web3j.codegen.SolidityFunctionWrapperGenerator} to update.
// *
// * <p>Generated with web3j version 2.1.0.
// */
//public final class MetaCoin extends Contract {
//    private static final String BINARY = "6060604052341561000c57fe5b5b600160a060020a033216600090815260208190526040902061271090555b5b6101ca8061003b6000396000f300606060405263ffffffff7c010000000000000000000000000000000000000000000000000000000060003504166390b98a118114610045578063f8b2cb4f14610085575bfe5b341561004d57fe5b61007173ffffffffffffffffffffffffffffffffffffffff600435166024356100c0565b604080519115158252519081900360200190f35b341561008d57fe5b6100ae73ffffffffffffffffffffffffffffffffffffffff60043516610172565b60408051918252519081900360200190f35b73ffffffffffffffffffffffffffffffffffffffff3316600090815260208190526040812054829010156100f65750600061016c565b73ffffffffffffffffffffffffffffffffffffffff33811660008181526020818152604080832080548890039055938716808352918490208054870190558351868152935191937fddf252ad1be2c89b69c2b068fc378daa952ba7f163c4a11628f55a4df523b3ef929081900390910190a35060015b92915050565b73ffffffffffffffffffffffffffffffffffffffff81166000908152602081905260409020545b9190505600a165627a7a7230582077854c564d72e5627eb334b16d95a45445113c185a4e68c267afc33906bd5de10029";
//
//    private MetaCoin(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
//        super(contractAddress, web3j, credentials, gasPrice, gasLimit);
//    }
//
//    private MetaCoin(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
//        super(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
//    }
//
//    public List<TransferEventResponse> getTransferEvents(TransactionReceipt transactionReceipt) {
//        final Event event = new Event("Transfer",
//                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Address>() {}),
//                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
//        List<EventValues> valueList = extractEventParameters(event,transactionReceipt);
//        ArrayList<TransferEventResponse> responses = new ArrayList<TransferEventResponse>(valueList.size());
//        for(EventValues eventValues : valueList) {
//            TransferEventResponse typedResponse = new TransferEventResponse();
//            typedResponse._from = (Address)eventValues.getIndexedValues().get(0);
//            typedResponse._to = (Address)eventValues.getIndexedValues().get(1);
//            typedResponse._value = (Uint256)eventValues.getNonIndexedValues().get(0);
//            responses.add(typedResponse);
//        }
//        return responses;
//    }
//
//    public Observable<TransferEventResponse> transferEventObservable() {
//        final Event event = new Event("Transfer",
//                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Address>() {}),
//                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
//        EthFilter filter = new EthFilter(DefaultBlockParameterName.EARLIEST,DefaultBlockParameterName.LATEST, getContractAddress());
//        filter.addSingleTopic(EventEncoder.encode(event));
//        return web3j.ethLogObservable(filter).map(new Func1<Log, TransferEventResponse>() {
//            @Override
//            public TransferEventResponse call(Log log) {
//                EventValues eventValues = extractEventParameters(event, log);
//                TransferEventResponse typedResponse = new TransferEventResponse();
//                typedResponse._from = (Address)eventValues.getIndexedValues().get(0);
//                typedResponse._to = (Address)eventValues.getIndexedValues().get(1);
//                typedResponse._value = (Uint256)eventValues.getNonIndexedValues().get(0);
//                return typedResponse;
//            }
//        });
//    }
//
//    public Future<TransactionReceipt> sendCoin(Address receiver, Uint256 amount) {
//        Function function = new Function("sendCoin", Arrays.<Type>asList(receiver, amount), Collections.<TypeReference<?>>emptyList());
//        return executeTransactionAsync(function);
//    }
//
//    public Future<TransactionReceipt> getBalance(Address addr) {
//        Function function = new Function("getBalance", Arrays.<Type>asList(addr), Collections.<TypeReference<?>>emptyList());
//        return executeTransactionAsync(function);
//    }
//
//    public static Future<MetaCoin> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialValue) {
//        return deployAsync(MetaCoin.class, web3j, credentials, gasPrice, gasLimit, BINARY, "", initialValue);
//    }
//
//    public static Future<MetaCoin> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialValue) {
//        return deployAsync(MetaCoin.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "", initialValue);
//    }
//
//    public static MetaCoin load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
//        return new MetaCoin(contractAddress, web3j, credentials, gasPrice, gasLimit);
//    }
//
//    public static MetaCoin load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
//        return new MetaCoin(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
//    }
//
//    public static class TransferEventResponse {
//        public Address _from;
//
//        public Address _to;
//
//        public Uint256 _value;
//    }
//}
