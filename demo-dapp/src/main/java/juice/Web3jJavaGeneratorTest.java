package juice;

import org.web3j.console.Runner;

public class Web3jJavaGeneratorTest {

    public static void main(String[] args) throws Exception {

        String abiPath = "C:\\sunzone\\MyDocument\\github02\\demo-collect\\demo-dapp\\contract\\BookManager.abi";
        String binPath = "C:\\sunzone\\MyDocument\\github02\\demo-collect\\demo-dapp\\contract\\BookManager.bin";
        String destPath = "C:\\sunzone\\MyDocument\\github02\\demo-collect\\demo-dapp\\tmp";
        String packageName = "com.juzix.contract.wrapper";

        String arg = "solidity generate "+binPath+" "+abiPath+" -o "+destPath+" -p "+packageName+"";
        Runner.main(arg.split(" "));
    }
}
