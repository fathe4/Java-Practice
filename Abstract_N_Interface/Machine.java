package Abstract_N_Interface;

abstract public class Machine {

    String name;

    public Machine(String name) {
        this.name = name;
    }

    public void start() {
        System.out.println("Starting " + name);
    }

    abstract public void shutdown();
    
}
