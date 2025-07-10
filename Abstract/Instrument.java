package Abstract;

abstract public class Instrument {
    String name;

    public Instrument(String name) {
        this.name = name;
    }
    
    public void tune() {
        System.out.println("Tuning the " + name);
    }

    abstract void play();
}
