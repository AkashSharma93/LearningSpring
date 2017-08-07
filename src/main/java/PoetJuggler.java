import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Created by akash on 07/08/17.
 */
public class PoetJuggler extends Juggler {
    private Poem poem;

    public PoetJuggler(Poem poem) {
        super();
        this.poem = poem;
    }

    public PoetJuggler(int beanBags, Poem poem) {
        super(beanBags);
        this.poem = poem;
    }

    public void perform() {
        super.perform();
        poem.recite();
    }
}
