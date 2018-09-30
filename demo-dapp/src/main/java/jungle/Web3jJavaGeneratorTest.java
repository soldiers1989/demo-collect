package jungle;

public class Web3jJavaGeneratorTest {

    public static void main(String[] args) throws Exception {

        String abiPath = "C:\\sunzone\\MyDocument\\github02\\demo-collect\\demo-dapp\\contract\\snt.abi";
        String binPath = "C:\\sunzone\\MyDocument\\github02\\demo-collect\\demo-dapp\\contract\\nuls.bin";
        String destPath = "C:\\sunzone\\MyDocument\\github02\\demo-collect\\demo-dapp\\tmp";
        String packageName = "com.juzix.contract.wrapper";

        // web3j solidity generate [--javaTypes|--solidityTypes] /path/to/<smart-contract>.bin /path/to/<smart-contract>.abi -o /path/to/src/main/java -p com.your.organisation.name
        String arg = "solidity generate "+binPath+" "+abiPath+" -o "+destPath+" -p "+packageName+"";

    }
}
