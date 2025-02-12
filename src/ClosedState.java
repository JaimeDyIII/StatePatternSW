public class ClosedState implements AccountState{
    @Override
    public void deposit(Account account, Double depositAmount){
        System.out.println("You can not deposit on a closed account!");

    }

    @Override
    public void withdraw(Account account, Double withdrawAmount){
        System.out.println("You can not withdraw on a closed account!");

    }

    @Override
    public void activate(Account account){
        System.out.println("You can not activate a closed account!");
    }

    @Override
    public void suspend(Account account){
        System.out.println("You can not suspend a closed account!");
    }

    @Override
    public void close(Account account){
        System.out.println("Account is already closed!");
    }
}