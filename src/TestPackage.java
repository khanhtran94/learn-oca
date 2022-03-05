import java.util.*;

public class TestPackage {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("test package");
        object.add(this);
    }
    public static List object = new ArrayList<TestPackage>();
    public static void main(String[] args) {
        TestPackage testPackage = new TestPackage();
        testPackage = null;
        System.gc();
    }
}


