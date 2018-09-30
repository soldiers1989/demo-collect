//package juice;
//
//import org.web3j.abi.EventEncoder;
//import org.web3j.abi.EventValues;
//import org.web3j.abi.FunctionEncoder;
//import org.web3j.abi.TypeReference;
//import org.web3j.abi.datatypes.*;
//import org.web3j.abi.datatypes.generated.Uint256;
//import org.web3j.abi.datatypes.generated.Uint8;
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
//public final class NulsStandardToken extends Contract {
//    private static final String BINARY = "60a0604052600460608190527f56302e3100000000000000000000000000000000000000000000000000000000608090815261003e91600691906100d7565b50341561004757fe5b604051610a5d380380610a5d833981016040908152815160208301519183015160608401519193928301929091015b600160a060020a033316600090815260016020908152604082208690559085905583516100a991600391908601906100d7565b506004805460ff191660ff841617905580516100cc9060059060208401906100d7565b505b50505050610177565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f1061011857805160ff1916838001178555610145565b82800160010185558215610145579182015b8281111561014557825182559160200191906001019061012a565b5b50610152929150610156565b5090565b61017491905b80821115610152576000815560010161015c565b5090565b90565b6108d7806101866000396000f300606060405236156100ac5763ffffffff7c010000000000000000000000000000000000000000000000000000000060003504166306fdde0381146100bd578063095ea7b31461014d57806318160ddd1461018057806323b872dd146101a2578063313ce567146101db57806354fd4d501461020157806370a082311461029157806395d89b41146102bf578063a9059cbb1461034f578063cae9ca5114610382578063dd62ed3e146103f9575b34156100b457fe5b6100bb5b5b565b005b34156100c557fe5b6100cd61042d565b604080516020808252835181830152835191928392908301918501908083838215610113575b80518252602083111561011357601f1990920191602091820191016100f3565b505050905090810190601f16801561013f5780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b341561015557fe5b61016c600160a060020a03600435166024356104bb565b604080519115158252519081900360200190f35b341561018857fe5b610190610526565b60408051918252519081900360200190f35b34156101aa57fe5b61016c600160a060020a036004358116906024351660443561052c565b604080519115158252519081900360200190f35b34156101e357fe5b6101eb610622565b6040805160ff9092168252519081900360200190f35b341561020957fe5b6100cd61062b565b604080516020808252835181830152835191928392908301918501908083838215610113575b80518252602083111561011357601f1990920191602091820191016100f3565b505050905090810190601f16801561013f5780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b341561029957fe5b610190600160a060020a03600435166106b9565b60408051918252519081900360200190f35b34156102c757fe5b6100cd6106d8565b604080516020808252835181830152835191928392908301918501908083838215610113575b80518252602083111561011357601f1990920191602091820191016100f3565b505050905090810190601f16801561013f5780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b341561035757fe5b61016c600160a060020a0360043516602435610766565b604080519115158252519081900360200190f35b341561038a57fe5b604080516020600460443581810135601f810184900484028501840190955284845261016c948235600160a060020a031694602480359560649492939190920191819084018382808284375094965061081295505050505050565b604080519115158252519081900360200190f35b341561040157fe5b610190600160a060020a036004358116906024351661087e565b60408051918252519081900360200190f35b6003805460408051602060026001851615610100026000190190941693909304601f810184900484028201840190925281815292918301828280156104b35780601f10610488576101008083540402835291602001916104b3565b820191906000526020600020905b81548152906001019060200180831161049657829003601f168201915b505050505081565b600160a060020a03338116600081815260026020908152604080832094871680845294825280832086905580518681529051929493927f8c5be1e5ebec7d5bd14f71427d1e84f3dd0314c0f7b2291e5b200ac8c7c3b925929181900390910190a35060015b92915050565b60005481565b600160a060020a03831660009081526001602052604081205482901080159061057c5750600160a060020a0380851660009081526002602090815260408083203390941683529290522054829010155b80156105885750600082115b1561061657600160a060020a03808416600081815260016020908152604080832080548801905588851680845281842080548990039055600283528184203390961684529482529182902080548790039055815186815291519293927fddf252ad1be2c89b69c2b068fc378daa952ba7f163c4a11628f55a4df523b3ef9281900390910190a350600161061a565b5060005b5b9392505050565b60045460ff1681565b6006805460408051602060026001851615610100026000190190941693909304601f810184900484028201840190925281815292918301828280156104b35780601f10610488576101008083540402835291602001916104b3565b820191906000526020600020905b81548152906001019060200180831161049657829003601f168201915b505050505081565b600160a060020a0381166000908152600160205260409020545b919050565b6005805460408051602060026001851615610100026000190190941693909304601f810184900484028201840190925281815292918301828280156104b35780601f10610488576101008083540402835291602001916104b3565b820191906000526020600020905b81548152906001019060200180831161049657829003601f168201915b505050505081565b600160a060020a03331660009081526001602052604081205482901080159061078f5750600082115b1561080357600160a060020a03338116600081815260016020908152604080832080548890039055938716808352918490208054870190558351868152935191937fddf252ad1be2c89b69c2b068fc378daa952ba7f163c4a11628f55a4df523b3ef929081900390910190a3506001610520565b506000610520565b5b92915050565b600160a060020a03338116600081815260026020908152604080832094881680845294825280832087905580518781529051929493927f8c5be1e5ebec7d5bd14f71427d1e84f3dd0314c0f7b2291e5b200ac8c7c3b925929181900390910190a35060015b9392505050565b600160a060020a038083166000908152600260209081526040808320938516835292905220545b929150505600a165627a7a72305820ae6a9e409d459396445e3c7251999e52a68bff65ddf79909ebac26a2f4a2f5100029";
//
//    private NulsStandardToken(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
//        super(contractAddress, web3j, credentials, gasPrice, gasLimit);
//    }
//
//    private NulsStandardToken(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
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
//    public List<ApprovalEventResponse> getApprovalEvents(TransactionReceipt transactionReceipt) {
//        final Event event = new Event("Approval",
//                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Address>() {}),
//                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
//        List<EventValues> valueList = extractEventParameters(event,transactionReceipt);
//        ArrayList<ApprovalEventResponse> responses = new ArrayList<ApprovalEventResponse>(valueList.size());
//        for(EventValues eventValues : valueList) {
//            ApprovalEventResponse typedResponse = new ApprovalEventResponse();
//            typedResponse._owner = (Address)eventValues.getIndexedValues().get(0);
//            typedResponse._spender = (Address)eventValues.getIndexedValues().get(1);
//            typedResponse._value = (Uint256)eventValues.getNonIndexedValues().get(0);
//            responses.add(typedResponse);
//        }
//        return responses;
//    }
//
//    public Observable<ApprovalEventResponse> approvalEventObservable() {
//        final Event event = new Event("Approval",
//                Arrays.<TypeReference<?>>asList(new TypeReference<Address>() {}, new TypeReference<Address>() {}),
//                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
//        EthFilter filter = new EthFilter(DefaultBlockParameterName.EARLIEST,DefaultBlockParameterName.LATEST, getContractAddress());
//        filter.addSingleTopic(EventEncoder.encode(event));
//        return web3j.ethLogObservable(filter).map(new Func1<Log, ApprovalEventResponse>() {
//            @Override
//            public ApprovalEventResponse call(Log log) {
//                EventValues eventValues = extractEventParameters(event, log);
//                ApprovalEventResponse typedResponse = new ApprovalEventResponse();
//                typedResponse._owner = (Address)eventValues.getIndexedValues().get(0);
//                typedResponse._spender = (Address)eventValues.getIndexedValues().get(1);
//                typedResponse._value = (Uint256)eventValues.getNonIndexedValues().get(0);
//                return typedResponse;
//            }
//        });
//    }
//
//    public Future<Utf8String> name() {
//        Function function = new Function("name",
//                Arrays.<Type>asList(),
//                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
//        return executeCallSingleValueReturnAsync(function);
//    }
//
//    public Future<TransactionReceipt> approve(Address _spender, Uint256 _value) {
//        Function function = new Function("approve", Arrays.<Type>asList(_spender, _value), Collections.<TypeReference<?>>emptyList());
//        return executeTransactionAsync(function);
//    }
//
//    public Future<Uint256> totalSupply() {
//        Function function = new Function("totalSupply",
//                Arrays.<Type>asList(),
//                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
//        return executeCallSingleValueReturnAsync(function);
//    }
//
//    public Future<TransactionReceipt> transferFrom(Address _from, Address _to, Uint256 _value) {
//        Function function = new Function("transferFrom", Arrays.<Type>asList(_from, _to, _value), Collections.<TypeReference<?>>emptyList());
//        return executeTransactionAsync(function);
//    }
//
//    public Future<Uint8> decimals() {
//        Function function = new Function("decimals",
//                Arrays.<Type>asList(),
//                Arrays.<TypeReference<?>>asList(new TypeReference<Uint8>() {}));
//        return executeCallSingleValueReturnAsync(function);
//    }
//
//    public Future<Utf8String> version() {
//        Function function = new Function("version",
//                Arrays.<Type>asList(),
//                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
//        return executeCallSingleValueReturnAsync(function);
//    }
//
//    public Future<Uint256> balanceOf(Address _owner) {
//        Function function = new Function("balanceOf",
//                Arrays.<Type>asList(_owner),
//                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
//        return executeCallSingleValueReturnAsync(function);
//    }
//
//    public Future<Utf8String> symbol() {
//        Function function = new Function("symbol",
//                Arrays.<Type>asList(),
//                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
//        return executeCallSingleValueReturnAsync(function);
//    }
//
//    public Future<TransactionReceipt> transfer(Address _to, Uint256 _value) {
//        Function function = new Function("transfer", Arrays.<Type>asList(_to, _value), Collections.<TypeReference<?>>emptyList());
//        return executeTransactionAsync(function);
//    }
//
//    public Future<TransactionReceipt> approveAndCall(Address _spender, Uint256 _value, DynamicBytes _extraData) {
//        Function function = new Function("approveAndCall", Arrays.<Type>asList(_spender, _value, _extraData), Collections.<TypeReference<?>>emptyList());
//        return executeTransactionAsync(function);
//    }
//
//    public Future<Uint256> allowance(Address _owner, Address _spender) {
//        Function function = new Function("allowance",
//                Arrays.<Type>asList(_owner, _spender),
//                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
//        return executeCallSingleValueReturnAsync(function);
//    }
//
//    public static Future<NulsStandardToken> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialValue, Uint256 _initialAmount, Utf8String _tokenName, Uint8 _decimalUnits, Utf8String _tokenSymbol) {
//        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(_initialAmount, _tokenName, _decimalUnits, _tokenSymbol));
//        return deployAsync(NulsStandardToken.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor, initialValue);
//    }
//
//    public static Future<NulsStandardToken> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialValue, Uint256 _initialAmount, Utf8String _tokenName, Uint8 _decimalUnits, Utf8String _tokenSymbol) {
//        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(_initialAmount, _tokenName, _decimalUnits, _tokenSymbol));
//        return deployAsync(NulsStandardToken.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor, initialValue);
//    }
//
//    public static NulsStandardToken load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
//        return new NulsStandardToken(contractAddress, web3j, credentials, gasPrice, gasLimit);
//    }
//
//    public static NulsStandardToken load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
//        return new NulsStandardToken(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
//    }
//
//    public static class TransferEventResponse {
//        public Address _from;
//
//        public Address _to;
//
//        public Uint256 _value;
//    }
//
//    public static class ApprovalEventResponse {
//        public Address _owner;
//
//        public Address _spender;
//
//        public Uint256 _value;
//    }
//}
