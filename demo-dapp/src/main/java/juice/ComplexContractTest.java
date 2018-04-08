package juice;

import com.juzix.web3j.protocol.CustomerWeb3j;
import com.juzix.web3j.protocol.https.HttpsService;
import com.juzix.web3j.tx.NonceRawTransactionManager;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.crypto.WalletUtils;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.TransactionManager;

import java.io.File;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class ComplexContractTest {

	private final static BigInteger gasPrice = BigInteger.valueOf(20_000_000_000L);
	private final static BigInteger gasLimit = BigInteger.valueOf(19_300_000L);
	private final static String RegisterAddr = "0x0000000000000000000000000000000000000011";
	private final static String url = "https://junode3.juzix.net";
	private final static String walletUrl = "C:\\Users\\jungle\\Desktop\\PPT\\cuiyuqiang.json";
	private final static String walletPwd = "11111111";

	public static void main(String[] args) {

		try {
			HttpsService httpsService = new HttpsService(url);
			Web3j web3j = CustomerWeb3j.build(httpsService);
			Credentials credentials = WalletUtils.loadCredentials(walletPwd, new File(walletUrl));

			//
			RegisterManager registerManager = RegisterManager.load(RegisterAddr, web3j, credentials, gasPrice, gasLimit);
			TransactionManager transactionManager = new NonceRawTransactionManager(web3j, credentials);

			String moduleName = "BookModule";
			String moduleVersion = "0.0.1.0";
			String contractName = "BookManager";
			String contractVersion = "0.0.1.0";

			// 获取合约地址
			Address contractAddr = registerManager.getContractAddress(new Utf8String(moduleName),
					new Utf8String(moduleVersion),
					new Utf8String(contractName),
					new Utf8String(contractVersion)).get();

			//
			BookManager bookManager = BookManager.load(contractAddr.toString(), web3j, transactionManager, gasPrice, gasLimit);

			//
			Utf8String number = new Utf8String("1.0.3");
			Utf8String name = new Utf8String("似水年華31");
			Utf8String price = new Utf8String("12");
			Utf8String author = new Utf8String("张三");
			Utf8String remark = new Utf8String("这是一本小说");

			//
			boolean insertResult = insert(registerManager, bookManager, number, name, price, author, remark);
			System.out.println("+++++++++++++++++ 新增返回结果 ++++++++++++++++++++");
			System.out.println(insertResult);

			//
			String result = getList(registerManager, bookManager);
			System.out.println("+++++++++++++++++ 查询返回结果 ++++++++++++++++++++");
			System.out.println(result);

			// userManager.deleteByNumber(new Utf8String("2")).get();
		}catch (Exception e){
			e.printStackTrace();
		}

		System.exit(0);
	}

	/// @dev 获取列表操作
	public static String getList(RegisterManager registerManager,BookManager bookManager) throws InterruptedException, ExecutionException {
		Utf8String s = bookManager.listAll().get();
		return s.getValue();
	}

	/// @dev 插入操作
	public static boolean insert(RegisterManager registerManager, BookManager bookManager,Utf8String number,Utf8String name,Utf8String price,Utf8String author,Utf8String remark) throws InterruptedException, ExecutionException {
		TransactionReceipt transactionReceipt = bookManager.add(number, name, price, author, remark).get();
		List<BookManager.NotifyEventResponse> responses =bookManager.getNotifyEvents(transactionReceipt);
		if (responses.size() > 0) {
		    Uint256 uint256 = responses.get(0)._errno;
		    Utf8String info = responses.get(0)._info;
		    int code= uint256.getValue().intValue();
			System.out.println("合约返回Notify信息，错误码："+code+"，错误信息："+info.getValue()+"");
			if (0 == code) {
		    	return true;
		    } else {
		    	return false;
		    }
		} else {
			return false;
		}
	}

}
