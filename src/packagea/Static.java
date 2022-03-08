package packagea;

//import static java.util.ArrayList.*;
import static java.util.Arrays.asList;
import static java.util.Arrays.*;
import static java.time.LocalTime.now;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Arrays.*;

public class Static {
    static final int COUNT = 1;
    final static int EGGS = 1;

    static void test() {
        int t = number;
        asList("one");
        Arrays.asList("one");

    }

    static void method1() {
        test();
    }

    void method2() {
        test();
        number++;
        count++;
    }

    static void method3(Cat cat) {
        cat = new Cat("123");
        System.out.println(cat);
        return;
    }

    static void method4(Cat cat) {
        System.out.println(cat);
        cat.name = "123";
    }

    static void method5(String s) {
        s = "123";
    }
    static void method5(int s) {
        System.out.println("s" + s);
    }
    static void method6(Integer integer) {
        System.out.println("integer "+integer);
    }
    static void fly(int i) {
        System.out.println("int" + i);
    }
    static void fly(long l) {
        System.out.println("long" + l);
    }
    static int number;
    int count;

    public static void main(String[] args) {
        Cat cat = new Cat("test");
        System.out.println(cat);
        method3(cat);
        method4(cat);
        System.out.println(cat.name);

        System.out.println("---");
        String s = "111";
        method5(s);
        System.out.println(s);

        System.out.println("----");

        method5(1);
        method6(new Integer(1));
        System.out.println("----");

        int test = 1;
        long testL = 2;
        fly(123);
        fly(testL);

        System.out.println("----");
        speak(1l);
        speak();
//        print(5.4);

        print(4.0f);

    }
    static void print(float f) {
        System.out.println("float");
    }
    static void speak(Long l) {
        System.out.println("speak");
    }
    static void speak(Long... l) {
        System.out.println("speak v2");
    }

}

class Cat {
    public Cat(String name) {
        this.name = name;
    }

    String name;

    public void setName(String name) {
        this.name = name;
    }
}

