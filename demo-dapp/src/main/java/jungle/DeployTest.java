package jungle;

import contracts.NulsStandardToken;
import org.bouncycastle.util.encoders.Hex;
import org.web3j.crypto.Credentials;
import org.web3j.crypto.RawTransaction;
import org.web3j.crypto.TransactionEncoder;
import org.web3j.crypto.WalletUtils;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameterName;
import org.web3j.protocol.core.methods.response.EthGetTransactionCount;
import org.web3j.protocol.core.methods.response.EthSendTransaction;
import org.web3j.protocol.core.methods.response.EthTransaction;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.RawTransactionManager;
import org.web3j.tx.TransactionManager;
import utils.Web3jUtils;

import java.io.File;
import java.math.BigInteger;

public class DeployTest {

	private final static BigInteger gasPrice = new BigInteger("23000000000");
	private final static BigInteger gasLimit = new BigInteger("3041562");
	private final static String url = "http://116.62.160.218:4567";
	private final static String directory = "C:\\Users\\jungle\\Desktop\\tool\\wallets";
	private final static String walletPath = directory.concat("\\test01.json");
	private final static String walletPwd = "11111111";
	private final static String address = "0x007d3dd6f98a1127904d88d8245941b10dddace6";
	private final static String toAddress= "0x007d3dd6f98a1127904d88d8245941b10dddac77";

	public static void main(String[] args) {
		try {
			Web3j web3j = Web3j.build(new HttpService(url));

			Credentials credentials = WalletUtils.loadCredentials(walletPwd, walletPath);

            //getBalance(web3j,credentials);
            // get the next available nonce
            sendRawTransaction(web3j, credentials);

			//deployContract(web3j, credentials);


			//
			//deployTokenContract(web3j, credentials);

			//
			//generatorWallet();


			//currentTransaction(web3j, credentials);

		}catch (Exception e){
			e.printStackTrace();
		}

	}

    public static void sendRawTransaction(Web3j web3j, Credentials credentials) {
        TransactionManager txManager = new RawTransactionManager(web3j, credentials);
        NulsStandardToken token = NulsStandardToken.load("0xefe70b4ef755be55a8bca9e378abbe15c852529f",
                web3j, txManager ,gasPrice,gasLimit);
        try {
            System.out.println(token.balanceOf(credentials.getAddress()).send().toString());
            TransactionReceipt receip = token.transfer("0x4fdd0c79dbf326d9d17e8ac5299632def272fe2a", new BigInteger("20000000000000000000000000")).send();
            System.out.println(receip.getLogs());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	public static void getBalance(Web3j web3j, Credentials credentials) {
	    NulsStandardToken token = NulsStandardToken.load("0xefe70b4ef755be55a8bca9e378abbe15c852529f",
                web3j,credentials,gasPrice,gasLimit);
        try {
            System.out.println(token.balanceOf(credentials.getAddress()).send().toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	public static void generatorWallet(){
		for (int i = 0; i < 500; i++) {
			try {
				Web3jUtils.generateNewWalletFile("11111111", new File(directory), "test" + i);
			}catch (Exception e){
				e.printStackTrace();
			}
		}
	}

	public static void sendTransaction(Web3j web3j, Credentials credentials){
		try {
			EthGetTransactionCount ethGetTransactionCount = web3j.ethGetTransactionCount(
					address, DefaultBlockParameterName.LATEST).sendAsync().get();
			BigInteger nonce = ethGetTransactionCount.getTransactionCount();

			// create our transaction
			RawTransaction rawTransaction  = RawTransaction.createEtherTransaction(
					nonce, gasPrice, gasLimit, toAddress, BigInteger.valueOf(125));

			// sign & send our transaction
			byte[] signedMessage = TransactionEncoder.signMessage(rawTransaction, credentials);
			String hexValue = Hex.toHexString(signedMessage);
			EthSendTransaction ethSendTransaction = web3j.ethSendRawTransaction(hexValue).send();

			System.out.println("hash:" + ethSendTransaction.getTransactionHash());
			EthTransaction result = web3j.ethGetTransactionByHash(ethSendTransaction.getTransactionHash()).send();

			System.out.println(result.getResult());
		}catch (Exception e){
			e.printStackTrace();


		}

	}

	/*public static void currentTransaction(Web3j web3j, Credentials credentials) {

		// test01 作为管理员发布合约
		try {
			// Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, BigInteger initialValue, Uint256 _initialAmount, Utf8String _tokenName, Uint8 _decimalUnits, Utf8String _tokenSymbol
			NulsStandardToken contract = NulsStandardToken.deploy(web3j, credentials,gasPrice, gasLimit,BigInteger.ZERO,new Uint256(BigInteger.valueOf(30000000)),
					new Utf8String("NULS-Token"),new Uint8(BigInteger.valueOf(18)),new Utf8String("NULS")).get();

			// 现进行转账操作
			for (int i = 0; i < 500; i++) {
				try {
					String walletFilePath = directory + "\\test" + i + ".json";
					Credentials tmp = WalletUtils.loadCredentials("11111111", walletFilePath);
					final int tmpI = i;
					new Thread(new Runnable() {
						@Override
						public void run() {
							try {
								TransactionReceipt tr = contract.transfer(new Address(tmp.getAddress()), new Uint256(BigInteger.valueOf(2000 + tmpI))).get();
								List<NulsStandardToken.TransferEventResponse> result = contract.getTransferEvents(tr);
								if(result.size() != 0){
									System.out.println("+++++++++++++++ 转账操作结果：" + result.get(0)._value.getValue().intValue());
								}else{
									System.out.println("++++++++++++++++++Event 未成功获取到+++++++++++++++++");
								}
							}catch (Exception e){
								e.printStackTrace();
							}

						}
					}).start();
				}catch (Exception e){
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}*/

	public static void deployTokenContract(Web3j web3j, Credentials credentials) {

		System.out.println("发布代币合约...");
		try {
		    // Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit,
            // BigInteger _initialAmount, String _tokenName, BigInteger _decimalUnits, String _tokenSymbol
            TransactionManager txManager = new RawTransactionManager(web3j, credentials);
            NulsStandardToken contract = NulsStandardToken.deploy(
			        web3j,
                    txManager,
                    gasPrice,
                    gasLimit,
                    BigInteger.ZERO,
                    "二代超",
                    BigInteger.valueOf(18),
                    "SSS").send();

            String addr = contract.getContractAddress();
			System.out.println("合约地址：" + contract.getContractAddress());
            System.out.println("....");
            //Uint256 balance = contract.balanceOf(new Address("0x007d3dd6f98a1127904d88d8245941b10dddace6")).get();
			//System.out.println("地址余额：" + balance.getValue().intValue());
			//System.out.println(contract.name().get().getValue());

			//for (int i = 0; i < 1000000; i++) {

				//contract.transfer(new Address("0x007d3dd6f98a1127904d88d8245941b10dddac99"), new Uint256(BigInteger.valueOf(1000 + i)));

				/*TransactionReceipt tr = contract.transfer(new Address("0x007d3dd6f98a1127904d88d8245941b10dddac99"), new Uint256(BigInteger.valueOf(1000 + i))).get();
				List<NulsStandardToken.TransferEventResponse> result = contract.getTransferEvents(tr);
				if(result.size() != 0){
					System.out.println("+++++++++++++++ 操作结果：" + result.get(0)._value.getValue().intValue());
				}else{
					System.out.println("++++++++++++++++++Event 未成功获取到+++++++++++++++++");
				}*/
			//}


		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/*public static void deployContract(Web3j web3j, Credentials credentials) {

		try {
			MetaCoin contract = MetaCoin.deploy(web3j, credentials,gasPrice, gasLimit,BigInteger.ZERO).get();
			TransactionReceipt tr = contract.sendCoin(new Address("0x007d3dd6f98a1127904d88d8245941b10dddac88"), new Uint256(BigInteger.valueOf(100))).get();

			List<MetaCoin.TransferEventResponse> list = contract.getTransferEvents(tr);

			System.out.println(list.get(0)._from + "_" + list.get(0)._to);
			System.out.println("合约发布成功.");

		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}

	}*/


}
