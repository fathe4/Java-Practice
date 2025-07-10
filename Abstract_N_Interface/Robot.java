package Abstract_N_Interface;

public class Robot extends Machine implements Flyable, Speakable {

    public Robot(String name) {
        super(name);
    }

    public void shutdown() {
        System.out.println("Shutting down " + name);  
    }

    public void speak() {
        System.out.println("Speaking " + name);
    }

    public void fly() {
        System.out.println("Flying " + name);
    }
    
}
