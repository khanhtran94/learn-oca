package packageb;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Arrays.sort;
import static packagea.C.printC;
//import static packagea.C.printC;

//import java.util.Arrays;
public class B {
//    private static List objects = new List();
//
//    @Override
//    protected void finalize() throws Throwable {
//        objects.add(String.valueOf(this));
//    }

    private String brand;
    int length;
    boolean empty;

    B(String brand, int length) {
        this.brand = brand;
        length = this.length;
    }


    public static void main(String[] args) {
        B b = new B("white", 2);
        System.out.println(b.brand + "  " + b.length);
//        B b = new B();
//        System.out.print("empty " + b.empty);
//        System.out.print(" brand " + b.brand);
//        int x = 2 * 5 + 3 * 4 - 8;
//        System.out.println(x);
//        int x = 3;
//        int y = ++x * 5 / x-- + --x;
//        System.out.println("x is " + x);
//        System.out.println("y is " + y);
//        short x = 10;
//        short y = 3;
//        short z = x * y;  // DOES NOT COMPILE
        long x = 10;
        int y = 5;
        // y = x * y; //not compiler due to the result being promoted to a long and assign to an int
        int ids[], types;
        ids = new int[]{1, 2, 3};
        types = 1;
//        ids = new int[2];
//        System.out.println(Arrays.toString(ids));
//        String[] strings = {"stringValue"};
//
//        Object[] objects = strings;
//        objects[0] = new StringBuilder();
//        int number[] = {3,2,1};
//        System.out.println(Arrays.binarySearch(number, 2));
//        System.out.println(Arrays.binarySearch(number, 3));
//        ArrayList test = new ArrayList();
//        A a = new A();
//        B b = new B();
//        test.add(a);
//        test.add(b);
//        System.out.println(test.get(0));
//        System.out.println(test.get(1));
//        ArrayList test = new ArrayList();
//        test.add("2");
//        test.add("1");
//        test.add("2");
//        test.add("1");
//        test.add("2");
//        test.add("1");
//        test.remove(1);
//        System.out.println(test);
//        List<String> list = new ArrayList<>();
//        List<String> list = new ArrayList<>();
//        list.add("a");
//        list.add("b");
//        String[] strings = list.toArray(new String[0]);
//        List<A> aList = new ArrayList<>();
//        A a1 = new A();
//        A a2 = new A();
//        aList.add(a1);
//        aList.add(a2);
//        A[] arrayA = aList.toArray(new A[5]);
//        System.out.println(arrayA.length);
//        System.out.println(strings.length);
//        System.out.println(LocalTime.now());
//        System.out.println(LocalDate.now());
//        System.out.println(LocalDateTime.now());
//        System.out.println(LocalDateTime.now().toString());

//        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
//        LocalTime time = LocalTime.of(5,15);
//        LocalDateTime dateTime = LocalDateTime.of(date, time);
//        dateTime = dateTime.minusDays(1);
//        dateTime = dateTime.minusHours(10);
//        System.out.println(dateTime);

//        LocalDate start = LocalDate.of(2020, Month.JANUARY, 1);
//        LocalDate end = LocalDate.of(2020, Month.JANUARY, 30);
//        Period period = Period.ofMonths(1);
//        LocalDate finish = start.plus(period);
//        System.out.println(finish);
//        LocalDateTime dateTime = LocalDateTime.now();
//        LocalDate date = LocalDate.now();
//        LocalTime time = LocalTime.now();
//        DateTimeFormatter shortDateTime =
//                DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
//        System.out.println(dateTime.format(shortDateTime));
//        System.out.println(date.format(shortDateTime));
//        System.out.println(time.format(shortDateTime));
//        System.out.println("---");
//        System.out.println(shortDateTime.format(date));
//
//        DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
//        LocalDate date1 = LocalDate.parse("01 20 2022", f);
//        LocalDate date22 = LocalDate.parse("2022/11/01", formatter);
//        System.out.println(date22);
//        String numbers = "012345678";
//        System.out.println(numbers.substring(7,7));
//        run(11);
        asList("1");
        int[] test = {32, 23, 1, 21, 2, 3};
        sort(test);
        System.out.println(test[0]);
//        Arrays.asList("2"); error compiler
        List a = new ArrayList();

//        C c = new C();
        printC();
        Integer integer = 2;
        int i = Integer.parseInt("2");
        System.out.println(integer < 4);
        System.out.println("i = " + i);


    }

    public static void run(int... nums) {
        System.out.println(nums[1]);

    }
}
