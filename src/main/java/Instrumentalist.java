/**
 * Created by akash on 07/08/17.
 */
public class Instrumentalist implements Performer {
    private String song;
    private int age;
    private Instrument instrument;

    public void perform() {
        System.out.println("Playing " + getSong() + " song.");
        getInstrument().play();
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getSong() {
        return song;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
}
