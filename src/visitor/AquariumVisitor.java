package visitor;
import aquarium.*;

public class AquariumVisitor {
    Jelly jelly;
    public static void adminre() {
    }

    public AquariumVisitor(Jelly jelly) {
//        this();
        this.jelly = jelly;
    }

    public static void main(String[] args) {
//        int x = 0;
//        while (++x < 10) {
//            System.out.println("int while " + x);
//        }
//        System.out.println("not while " + x);

        int count = 0;
        ROW_LOOP: for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <=2; col++){
                if (row * col % 2 == 0) continue ROW_LOOP;
                count++;
            }
        }
        System.out.println(count);
    }
}
