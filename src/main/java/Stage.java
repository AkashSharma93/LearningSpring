/**
 * Created by akash on 07/08/17.
 */
public class Stage {
    private static Stage stage;

    private Stage() {
        System.out.println("In the constructor.");
    }

    public static Stage getInstance() {
        System.out.println("Getting instance.");
        if (stage == null) stage = new Stage();
        return stage;
    }

    public void announce() {
        System.out.println("This is a stage announcement.");
    }
}
