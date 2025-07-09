public class Basic {
    public static void main(String[] args) {
        int age = 20;
        String name = "Sam";
        boolean isAdult = age > 18;
        greet(name);
        System.out.println("are you a adult? " + isAdult);
    }

    public static void greet(String name) {
        System.out.println("Hello " + name);
    }
}