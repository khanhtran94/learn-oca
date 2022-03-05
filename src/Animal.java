
public class Animal {
    static  TestPackage testPackage = new TestPackage();
    static  TestPackage testPackage1 = new TestPackage();
    public static void main(String[] args) throws Throwable {
        testPackage = testPackage1;
    }
    String name ;

    public Animal(String name) {
        this.name = name;
    }
}
