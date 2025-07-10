package Abstract;

public class Guitar extends Instrument {
    
    public Guitar(String name) {
        super(name);
    }
    
    public void play() {
        System.out.println("Strumming the guitar strings");
    }
}
