package visitor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class AquariumVisitor {
    public static void adminre() {
        long t = 192301398193810323L;
        long x1 = 10;
        int y2 = 5;
//        y = x * y; wrong vi dang co ep kieu long ve int
        short a = 1;
        int b = 2;
        b = b * a;
//        a = a * b; wrong vi dang co ep kieu int ve short
        a *= b;
        x1 = x1 * y2;
        boolean test = 5 == 5.0d;

        int y = 10;
        final int x;
        if (y > 5) {
            x = 2 * y;
        } else {
            x = 3 * y;
        }

        String condition = "1";
        final String monday = "monday";
        String thursday = "thursday";
        switch (condition) {
            case "1":
                break;
            case "2":
                break;
            case monday:
                break;
            case "0":
                break;
            default:
                break;
        }

        char day = 0;
        switch (day) {
            default:
                System.out.println(3);
            case 'a':
                System.out.println(1);
            case 2:
                System.out.println(2);
        }

    }

    public static void main(String[] args) {
//        adminre();
//        for (int a = 1; a<=4; a++) {
//            for (char x = 'a'; x <='c'; x++) {
//                if (a == 2 || x == 'b')
//                    System.out.println(" " + a + x);
//            }
//        }
//        int x= 5;
//        System.out.println(x > 2 ? x < 4 ? 10 : 8 : 7);
//        int a = 1;
//        int b = 2;
//        int c = 1;
//
//        c += b + a;
//        c += b + a;
//        c += b + a;
//
//        int i = 0, d;
//        d = i++;
//        System.out.println(d);
//        d = i++;
//        System.out.println(d);
//        d = i++;
//        i++;
//        System.out.println(i);
//        System.out.println(d);
//        System.out.println(c);
//         int x1 = 50, x2 = 75;
//         boolean b = x1 >= x2;
//         if(b = true) System.out.println("Success");
//         else System.out.println("Failure");
//        String start = "AniMaL   ";
//        String trimmed = start.trim();                 // "AniMaL"
//        String lowercase = trimmed.toLowerCase();      // "animal"
//        String result = lowercase.replace('a', 'A');   // "Animal"
//        System.out.println(result);
//        StringBuilder sb = new StringBuilder("abcdef");
//        sb.deleteCharAt(5);
//        System.out.println(sb);

//        int[] num = new int[2];
//        for (int i : num) {
//            System.out.println(i);
//        }
//
//        int num2[], types;
//        types = 2;
//
//        int[] a, b;
//        a = new int[2];
//        System.out.println(types);
//        String[] test = {"egg", "meat"};
//        System.out.println(Arrays.deepToString(test));
//        System.out.println(Arrays.toString(test));
//
//        Animal a = new Animal("a");
//        Animal b = new Animal("b");
//        Animal[] animals = {a, b};
//        System.out.println(Arrays.deepToString(animals));
//
//        int[] n = {3,2,1};
//        System.out.println(Arrays.binarySearch(n, 2));
//        ArrayList<String> list1 = new ArrayList<>();
//        ArrayList<String> list2 = new ArrayList<>();
//        ArrayList<String> list = new ArrayList<String>();
//        ArrayList list3 = new ArrayList();
//        list3.add(3);
//        list3.add(4);
//        list3.add(5);
//        list3.size();
//        int change = (int) list3.set(0, 4);
//        System.out.println(list3);
//        System.out.println("change " + change);
//        StringBuilder stringBuilder = new StringBuilder("test");
//        stringBuilder.length();
//        String a = "test";
//        a.length();
//        Boolean b = Boolean.valueOf("TRUE");
//        boolean check = Boolean.parseBoolean("false");
//        byte b1 = Byte.parseByte("11", 2);
//        Long l = Long.parseLong("12.0");
//        System.out.println(l);
//
//        List<String> list = new ArrayList<String>();
//        list.add("1");
//        list.add("2");
//
//        Object objects[] = list.toArray();
//        String[] strings = list.toArray(new String[0]);
//        System.out.println(strings.length);
//
//        Integer[] arrInt = {1,2,3};
//        List<Integer> integerList = Arrays.asList(arrInt);
//        integerList.set(0, 2);
//        System.out.println(arrInt[0]);
//        System.out.println(integerList);
//        integerList.add(2);
        LocalDateTime dateTime = LocalDateTime.now();
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        DateTimeFormatter shortDateTime =
                DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
//        System.out.println(shortDateTime.format(dateTime));     // 1/20/20
//        System.out.println(shortDateTime.format(date));
//
//        System.out.println(dateTime.format(shortDateTime));
//        System.out.println(date.format(shortDateTime));
//        DateTimeFormatter timeFormatter = DateTimeFormatter.ISO_LOCAL_TIME;
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
//        System.out.println(time.format(timeFormatter));
//        System.out.println(time.format(timeFormatter));
        DateTimeFormatter f = DateTimeFormatter.ofPattern("hh:mm");
        System.out.println("time " + f.format(time));

        System.out.println(dateTime.format(f));
        DateTimeFormatter parseDT = DateTimeFormatter.ofPattern(" MM dd yyyy");
        LocalDate date1 = LocalDate.parse(" 11 02 2022", parseDT);
        System.out.println(date1.format(shortDateTime));
        DateTimeFormatter parseTime = DateTimeFormatter.ofPattern("HH mm");
        LocalTime time1 = LocalTime.parse("13 01", parseTime);
        System.out.println(time1);
        StringBuilder stringBuilder = new StringBuilder("123");
        StringBuilder stringBuilder1 = new StringBuilder("123");
        System.out.println(stringBuilder == stringBuilder1);
        System.out.println(stringBuilder.equals(stringBuilder1));
    }
}
