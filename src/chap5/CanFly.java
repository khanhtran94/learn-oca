package chap5;

public interface CanFly {
    public static void fly(){
        System.out.println("static fly");
    };

    default void flyDefault(){
        System.out.println("Default fly");
    }
}
