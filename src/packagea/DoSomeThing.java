package packagea;

class DoSomething {
    public void go() {
        System.out.print("A");
        try {
            stop();
        } catch (ArithmeticException e) {
            System.out.print("B");
        } catch (NullPointerException n) {
            System.out.println("null");
        }
        finally {
            System.out.print("C");
        }
        System.out.print("D");
    }

    public void stop() throws StackOverflowError{
        System.out.print("E");
        Object x = null;
        x.toString();
        System.out.print("F");
    }

    public static void main(String[] args) {
        new DoSomething().go();
    }
}