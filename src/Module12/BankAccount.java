package Module12;

public class BankAccount {
    public int id;
    public double balance;

    public BankAccount(int id, double balance){
        this.id = id;
        this.balance = balance;
    }

    public double withdrawAmount(double withdrawAmount){
        return this.balance = balance - withdrawAmount;
    }

    public double depositAmount(double depositAmount){
        return this.balance = balance + depositAmount;
    }
}
