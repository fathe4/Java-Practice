package Abstract;

public class Main {
    public static void main(String[] args){
        Instrument g = new Guitar("Electric Guiter");
        Instrument d = new Drum("Bass Drum");

        g.tune();
        g.play();

        d.tune();
        d.play();
    }
}
