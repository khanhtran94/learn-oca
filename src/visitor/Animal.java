package visitor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.*;

public class Animal {
    String name;
    public Animal(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
//        String a = "a";
//        String b = new String(a);
//        int t = 2;
////        String b = t + 1;
////        System.out.println(b);
//        if ("a" == a) System.out.println("t");
//        if ("a" == b) System.out.println("t1");
//        if (a == b) System.out.println("t2");
//        String s1 = "java";
//        StringBuilder s2 = new StringBuilder(s1);
//        StringBuilder letter = new StringBuilder("asdfgh");
//        letter.append(5);
//        letter.substring(3,4);
//        System.out.println(letter);
//        char[] c = new char[2];
//        c[0] = '1';
//        c[1] = '2';
//        char[] c1 = new char[2];
//        c1[0] = '1';
//        c1[1] = '2';
//
//        if (c == c1) System.out.println("equal");
//        if (c.equals(c1)) System.out.println("equal");
//        ArrayList<Animal> test = new ArrayList<>();
//        ArrayList<Animal> test1 = new ArrayList<>();
//        if (test == test1) System.out.println("array");
//        if (test.equals(test1)) System.out.println("array 123");
//        List<Integer> list = Arrays.asList(10, 4, -1, 5);
//        Collections.sort(list);
//        Integer array[] = list.toArray(new Integer[4]);
//        int  a = Integer.valueOf("2");
////        LocalDate date = LocalDate.of(2018, Month.APRIL, 40);
//        LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
////        Period p = Period.of(1, 2, 3);
////        d.minus(p);
//        DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
//
//        Period p = Period.ofDays(1).ofYears(2);
//        d = d.minus(p);
//        System.out.println(d.format(f));
        String test = "";
//        test += "a";
        if ("" == test) System.out.println("==");
        if ("a".equals(test)) System.out.println("equal");

        StringBuilder b = "rumble";
        b.append(4).deleteCharAt(3).delete(3, b.length() - 1);
        System.out.println(b);

    }
}
