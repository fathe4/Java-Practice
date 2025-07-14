package Final;

public class Bike {
    final void run() {
        System.out.println("Bike running");
    }
}


class Honda extends Bike {
    // @Override
    // void run() {
        // ❌ ERROR: can't override final method
    // }
}