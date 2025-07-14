package Encapsulation;

public class Main {
    static public void main(String[] args) {
        Balance b = new Balance();
        b.increaseBalance(100);
        b.getBalance();
        b.decreaseBalance(50);
        b.getBalance();
    }
}
