package packagea;

public class Dog extends Animal {
    public int number = 4;
    public Dog() {
        this(2);
    }

    public Dog(int age) {
        super(2,"a");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        Animal a = new Animal();
        System.out.println(d.number);
        System.out.println(a.number);

    }
}
