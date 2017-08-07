/**
 * Created by akash on 06/08/17.
 */
public class Juggler implements Performer {
    int beanBags = 3;

    public Juggler() {}

    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }

    public void perform() {
        System.out.println("Juggling " + beanBags + " bean bags.");
    }
}
