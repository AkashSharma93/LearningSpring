/**
 * Created by akash on 06/08/17.
 */
public class Juggler implements Performer {
    int beanBags = 3;
    private static int count = 0;

    public Juggler() {}

    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }

    public void perform() {
        System.out.println("Juggling " + beanBags + " bean bags.");
    }

    public void incCount() {
        System.out.println("Inc Count: " + (++count));
    }

    public void decCount() {
        System.out.println("Dec Count: " + (--count));
    }
}
