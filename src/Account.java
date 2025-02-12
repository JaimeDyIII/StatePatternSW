public class Account{
    private String id;
    private Double balance;
    private AccountState accountState;

    public Account(String id, Double balance){
        accountState = new ActiveState();
        this.id = id;
        this.balance = balance;
    }

    public void deposit(Double depositAmount){
        accountState.deposit(this, depositAmount);
    }

    public void withdraw(Double withdrawAmount){
        accountState.withdraw(this, withdrawAmount);
    }

    public void activate(){
        accountState.activate(this);
    }

    public void suspend(){
        accountState.suspend(this);
    }

    public void close(){
        accountState.close(this);
    }

    public void setState(AccountState accountState){
        this.accountState = accountState;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance){
        this.balance = balance;
    }

    @Override
    public String toString(){
        return "Account ID: " + id + "\n"
             + "Balance: ₱" + balance;
    }
}