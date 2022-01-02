package pond.swan;

import javafx.embed.swing.SwingNode;
import packageb.B;
import pond.shore.Bird;
import pond.shore.SubBird;


public class Swan extends Bird {
    public void swim() {
        floatInWater();
        System.out.println(text);
    }

    public void helpOtherSwanSwim() {
        Swan other = new Swan();
        other.floatInWater();
        System.out.println(other.text);
    }

    public void helpOtherBirdSwim() {
        Bird bird = new Bird();
//        bird.text;
        SubBird subBird = new SubBird();
    }
}
