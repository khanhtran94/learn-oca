package chap5;

public class Car extends Engine implements CanFly, CanFlyV2{
    public static String name = "Car static";
    public String nameNoStateic = "Car no stati";

    @Override
    void eat() {
        System.out.println("eat gas");
    }


    private final void princt() {
        System.out.println("pring car");
    }

    @Override
    public void run() {
        System.out.println("Car");
    }

    public static void look() {
        System.out.println("Car satic");
    }

    public void privateTest() {
        System.out.println("car test");
    }

    @Override
    public void hack() {
        System.out.println("car hack no static");

    }

    @Override
    public void flyDefault() {
        System.out.println("car fly default");
    }

    public static void main(String[] args) {
//        Car car = new Car();
//        Engine engine = (Engine) new Car();
//        Car.look();

        Engine e1 = (Engine) new Car();
        Engine engine = new Car();

        Car car =  new Car();
        Car carOfEngine = (Car) engine;
        CanFly canFly = (CanFly) new Car();

        System.out.println("---");
        System.out.println("e1 "  + e1.name);
        System.out.println("engine " + engine.name);
        System.out.println("carOfEngine " + carOfEngine.name);
        System.out.println("car " + car.name);
        System.out.println("---");
        System.out.println("e1 "  + e1.nameNoStateic);
        System.out.println("engine " + engine.nameNoStateic);
        System.out.println("carOfEngine " + carOfEngine.nameNoStateic);
        System.out.println("car " + car.nameNoStateic);
        System.out.println("---");
        e1.hack();
        engine.hack();
        carOfEngine.hack();
        car.hack();
        System.out.println("---");
        e1.look();
        engine.look();
        carOfEngine.look();
        car.look();
        car.flyDefault();
        canFly.flyDefault();


    }
}
