public class AccountTest{
    public static void main(String[] args){
        Account account = new Account("1234", 10000.0);

        account.activate();
        account.suspend();
        account.activate();

        System.out.println();

        account.deposit(5000.0);
        account.withdraw(5000.0);

        System.out.println();

        account.close();
        account.activate();
        account.suspend();

        System.out.println();

        account.deposit(5000.0);
        account.withdraw(5000.0);

        System.out.println("\n" + account.toString());
    }
}