package chap5;

public class Zebrz extends Animal {
    public Zebrz(int age) {
        super(age);
    }

    public Zebrz() {
    }

    public void displayInfo() {
        System.out.println("age " + getAge());
    }


    public static void main(String[] args) {
//        Zebrz zebrz = new Zebrz(2);
//        zebrz.displayInfo();
//        Zebrz.eat();
//        Animal.eat();
        Object object = new Integer(3);

        Integer integer = new Integer(3);
        Object object1 = new Object();
//        object1 = new Integer(2);
//        String str = (String) object1;

        Integer integer1 = (Integer) object;
        System.out.println(integer1);
//        Number number = object;
//        System.out.println(number);

        //long khong the cast ve kieu integer
//        Object l = new Long(2);
//        Integer i = (Integer) l;
//        System.out.println(i);

        Object objectInt = new Integer(2);
        Long l = (Long) objectInt;
        System.out.println(l);

    }

    public static void eat() {
        System.out.println("crop");
    }
}
