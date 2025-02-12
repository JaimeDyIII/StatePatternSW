public class ActiveState implements AccountState{
    @Override
    public void deposit(Account account, Double depositAmount){
        account.setBalance(account.getBalance() + depositAmount);
        System.out.println("Succesfully deposited ₱" + depositAmount + "\n"
                         + "Balance: ₱" + account.getBalance());
    }

    @Override
    public void withdraw(Account account, Double withdrawAmount){
        account.setBalance(account.getBalance() - withdrawAmount);
        if((account.getBalance() - withdrawAmount) < 0) System.out.println("Insufficient ammount");
        System.out.println("Succesfully withdrawn ₱" + withdrawAmount + "\n"
                         + "Balance: ₱" + account.getBalance());
    }

    @Override
    public void activate(Account account){
        System.out.println("Account is already activated!");
    }

    @Override
    public void suspend(Account account){
        System.out.println("Account is suspended!");
        account.setState(new SuspendedState());
    }

    @Override
    public void close(Account account){
        System.out.println("Account is closed!");
        account.setState(new ClosedState());
    }
}