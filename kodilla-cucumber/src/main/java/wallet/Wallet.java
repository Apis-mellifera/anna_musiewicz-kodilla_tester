package wallet;

public class Wallet {
    private int balance = 0;
    private String number;

    public Wallet() {

    }

    public void deposit(int money) {
        this.balance += money;
    }

    public void debit(int money) {
        this.balance -= money;
    }

    public int getBalance() {
        return  balance;
    }

    public String getNumber() {
        return number;
    }
}
