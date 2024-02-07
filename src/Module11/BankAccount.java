package Module11;

public class BankAccount {
    private int Id;
    private double balance;
    public BankAccount(int id){
        this.Id = id;
        this.balance = 300;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setId(int id){
        this.Id = id;
    }
    public double getBalance(){
        return this.balance;
    }
    public int getId(){
        return this.Id;
    }
    public double withDraw(double withDrawAmount){
        return balance = balance - withDrawAmount;
    }
    public double deposit(double depositAmount){
        return balance = balance + depositAmount;
    }

}
