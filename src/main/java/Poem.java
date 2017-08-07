/**
 * Created by akash on 07/08/17.
 */
public class Poem {
    private String poem;

    public Poem(String poem) {
        this.poem = poem;
    }

    public void recite() {
        System.out.println("Reciting poem: " + poem);
    }
}
