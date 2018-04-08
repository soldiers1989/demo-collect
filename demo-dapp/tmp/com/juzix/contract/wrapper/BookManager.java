package com.juzix.contract.wrapper;

import java.lang.Override;
import java.lang.String;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Future;
import org.web3j.abi.EventEncoder;
import org.web3j.abi.EventValues;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Event;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Int256;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameterName;
import org.web3j.protocol.core.methods.request.EthFilter;
import org.web3j.protocol.core.methods.response.Log;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import rx.Observable;
import rx.functions.Func1;

/**
 * <p>Auto generated code.<br>
 * <strong>Do not modify!</strong><br>
 * Please use {@link org.web3j.codegen.SolidityFunctionWrapperGenerator} to update.
 *
 * <p>Generated with web3j version 1.5.3.
 */
public final class BookManager extends Contract {
    private static final String BINARY = "606060405260006002600050555b5b33600060006101000a81548173ffffffffffffffffffffffffffffffffffffffff02191690836c010000000000000000000000009081020402179055506011600160006101000a81548173ffffffffffffffffffffffffffffffffffffffff02191690836c010000000000000000000000009081020402179055505b6100cc604060405190810160405280601581526020017f6465706c6f7920426f6f6b4d6f64756c652e2e2e2e00000000000000000000008152602001506101cc565b506101bd604060405190810160405280600a81526020017f426f6f6b4d6f64756c6500000000000000000000000000000000000000000000815260200150604060405190810160405280600781526020017f302e302e312e3000000000000000000000000000000000000000000000000000815260200150604060405190810160405280600b8152602";

    private BookManager(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    private BookManager(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public List<NotifyEventResponse> getNotifyEvents(TransactionReceipt transactionReceipt) {
        final Event event = new Event("Notify", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Utf8String>() {}));
        List<EventValues> valueList = extractEventParameters(event,transactionReceipt);
        ArrayList<NotifyEventResponse> responses = new ArrayList<NotifyEventResponse>(valueList.size());
        for(EventValues eventValues : valueList) {
            NotifyEventResponse typedResponse = new NotifyEventResponse();
            typedResponse._errno = (Uint256)eventValues.getNonIndexedValues().get(0);
            typedResponse._info = (Utf8String)eventValues.getNonIndexedValues().get(1);
            responses.add(typedResponse);
        }
        return responses;
    }

    public Observable<NotifyEventResponse> notifyEventObservable() {
        final Event event = new Event("Notify", 
                Arrays.<TypeReference<?>>asList(),
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}, new TypeReference<Utf8String>() {}));
        EthFilter filter = new EthFilter(DefaultBlockParameterName.EARLIEST,DefaultBlockParameterName.LATEST, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(event));
        return web3j.ethLogObservable(filter).map(new Func1<Log, NotifyEventResponse>() {
            @Override
            public NotifyEventResponse call(Log log) {
                EventValues eventValues = extractEventParameters(event, log);
                NotifyEventResponse typedResponse = new NotifyEventResponse();
                typedResponse._errno = (Uint256)eventValues.getNonIndexedValues().get(0);
                typedResponse._info = (Utf8String)eventValues.getNonIndexedValues().get(1);
                return typedResponse;
            }
        });
    }

    public Future<TransactionReceipt> register(Utf8String _moduleName, Utf8String _moduleVersion, Utf8String _contractName, Utf8String _contractVersion) {
        Function function = new Function("register", Arrays.<Type>asList(_moduleName, _moduleVersion, _contractName, _contractVersion), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function);
    }

    public Future<Uint256> getErrno() {
        Function function = new Function("getErrno", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<Uint256> log(Utf8String _str, Utf8String _str2, Utf8String _str3) {
        Function function = new Function("log", 
                Arrays.<Type>asList(_str, _str2, _str3), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<Uint256> log(Utf8String _str, Address _addr) {
        Function function = new Function("log", 
                Arrays.<Type>asList(_str, _addr), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<TransactionReceipt> deleteByNumber(Utf8String _number) {
        Function function = new Function("deleteByNumber", Arrays.<Type>asList(_number), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function);
    }

    public Future<Uint256> log(Utf8String _str, Int256 _i) {
        Function function = new Function("log", 
                Arrays.<Type>asList(_str, _i), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<TransactionReceipt> changeModuleRegisterOwner(Utf8String _moduleName, Utf8String _moduleVersion, Address _newOwner) {
        Function function = new Function("changeModuleRegisterOwner", Arrays.<Type>asList(_moduleName, _moduleVersion, _newOwner), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function);
    }

    public Future<TransactionReceipt> register(Utf8String _moduleName, Utf8String _moduleVersion) {
        Function function = new Function("register", Arrays.<Type>asList(_moduleName, _moduleVersion), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function);
    }

    public Future<Uint256> log(Utf8String _str) {
        Function function = new Function("log", 
                Arrays.<Type>asList(_str), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<TransactionReceipt> kill() {
        Function function = new Function("kill", Arrays.<Type>asList(), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function);
    }

    public Future<Uint256> log(Utf8String _str, Utf8String _str2) {
        Function function = new Function("log", 
                Arrays.<Type>asList(_str, _str2), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<Utf8String> getSender() {
        Function function = new Function("getSender", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<Utf8String> listAll() {
        Function function = new Function("listAll", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<TransactionReceipt> changeContractRegisterOwner(Utf8String _moduleName, Utf8String _moduleVersion, Utf8String _contractName, Utf8String _contractVersion, Address _newOwner) {
        Function function = new Function("changeContractRegisterOwner", Arrays.<Type>asList(_moduleName, _moduleVersion, _contractName, _contractVersion, _newOwner), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function);
    }

    public Future<Uint256> writedb(Utf8String _name, Utf8String _key, Utf8String _value) {
        Function function = new Function("writedb", 
                Arrays.<Type>asList(_name, _key, _value), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<Utf8String> getOwner() {
        Function function = new Function("getOwner", 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<Uint256> log(Utf8String _str, Uint256 _ui) {
        Function function = new Function("log", 
                Arrays.<Type>asList(_str, _ui), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeCallSingleValueReturnAsync(function);
    }

    public Future<TransactionReceipt> add(Utf8String _number, Utf8String _name, Utf8String _price, Utf8String _author, Utf8String _remark) {
        Function function = new Function("add", Arrays.<Type>asList(_number, _name, _price, _author, _remark), Collections.<TypeReference<?>>emptyList());
        return executeTransactionAsync(function);
    }

    public static Future<BookManager> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialValue) {
        return deployAsync(BookManager.class, web3j, credentials, gasPrice, gasLimit, BINARY, "", initialValue);
    }

    public static Future<BookManager> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialValue) {
        return deployAsync(BookManager.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "", initialValue);
    }

    public static BookManager load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new BookManager(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static BookManager load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new BookManager(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static class NotifyEventResponse {
        public Uint256 _errno;

        public Utf8String _info;
    }
}
