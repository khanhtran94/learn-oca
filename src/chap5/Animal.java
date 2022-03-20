package chap5;

public class Animal {
    private int age = 10;

    public Animal(int age) {
        this.age = age;
    }
    public Animal() {

    }

    public Exception testException() {
        return new Exception();
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public static void eat() throws StackOverflowError {
        System.out.println("mean");
    }
}
