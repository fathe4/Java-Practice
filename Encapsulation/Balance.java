package Encapsulation;

public class Balance {
    private int balance;

    public void getBalance(){
        System.out.println(this.balance);
    } 
    public void increaseBalance(int amount) {
        this.balance = balance + amount;
    }
    public void decreaseBalance(int amount) {
        if (amount > 0) {
            this.balance = balance - amount;
        }
    }
}
