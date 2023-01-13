public class Driver {
    public static void main(String args[]){
        Bank bank = new Bank();

        bank.openAccount(101 , Bank.SA);
        bank.openAccount(102 ,  Bank.CA);
        bank.openAccount(103 , Bank.SA);
        bank.openAccount(104 , Bank.CA);
        bank.openAccount(105 , Bank.SA);

    //    Account ac0 = new Account(66);
        Account ac1 = new SavingsAccount(100);
        Account ac2 = new CurrentAccount(99);

        for (Account account : bank.accounts) {
            account.deposit(1000);
        }
        bank.getAccount(101).withdraw(9000);
        bank.getAccount(102).withdraw(1200);
        bank.getAccount(103).withdraw(600);
        bank.getAccount(104).withdraw(1700);
        bank.getAccount(105).withdraw(900);

        System.out.println("\n Updating accounts:");
        bank.updateAccounts();

        bank.closeAccount(103);

        System.out.println("\n Sending Dividends in accounts:");
        bank.payDividend(100);
    }
}
