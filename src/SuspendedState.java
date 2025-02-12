public class SuspendedState implements AccountState{
    @Override
    public void deposit(Account account, Double depositAmount){
        System.out.println("You can not deposit on a suspended account!");
    }

    @Override
    public void withdraw(Account account, Double withdrawAmount){
        System.out.println("You can not withdraw with a suspended account!");
    }

    @Override
    public void activate(Account account){
        System.out.println("Account is activated!");
        account.setState(new ActiveState());
    }

    @Override
    public void suspend(Account account){
        System.out.println("Account is already suspended!");
    }

    @Override
    public void close(Account account){
        System.out.println("Account is closed!");
        account.setState(new ClosedState());
    }
}