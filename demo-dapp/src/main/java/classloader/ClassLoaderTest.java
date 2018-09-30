package classloader;


public class ClassLoaderTest {

    public static void main(String[] args) {
        ClassLoader c1 = Test.class.getClassLoader();
        System.out.println("Classloader is : " + c1.toString());
    }

}
