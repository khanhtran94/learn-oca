package chap5;

public abstract class Engine {
    abstract void eat();
    public static String name = "Engine static";
    public String nameNoStateic = "Engine no stati";


    private final void princt() {
        System.out.println("pring engine");
    }
    public abstract void run();
    public static void look() {
        System.out.println("Engine static");
    };
    public void hack() {
        System.out.println("engine hack no static");
    }
    private void privateTest() {
        System.out.println("Engine test");
    }

    public static void main(String[] args) {
        Engine engine = new Car();
        engine.privateTest();
        String[] engines = new String[1];
        System.out.println(engines[0]);
    }
}
