package Abstract;

public class Drum extends Instrument {
    public Drum(String name) {
        super(name);
    }

    public void play() {
        System.out.println("Beating the drum rhythm.");
    }
}
