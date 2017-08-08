import java.util.List;

/**
 * Created by akash on 08/08/17.
 */
public class MultiPerformer implements Performer {
    List<Instrument> instruments;

    public void perform() {
        for (Instrument instrument: instruments) {
            instrument.play();
        }
    }

    public void setInstruments(List<Instrument> instruments) {
        this.instruments = instruments;
    }
}
