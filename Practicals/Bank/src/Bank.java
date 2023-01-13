import java.util.ArrayList;

public class Bank {
    public static final int SA = 1;
    public static final int CA = 2;
    ArrayList<Account> accounts;

    public Bank() {
        accounts = new ArrayList<Account>();
    }

    public void openAccount(int acno , int ac_type){
        switch(ac_type){
            case SA:
                accounts.add(new SavingsAccount(acno));
                break;
            case CA:
                accounts.add(new CurrentAccount(acno));
                break;
            default:
                System.out.println(" Ac Type Invalid .. :( ");
        }
    }
    public void closeAccount(int acno){
        for( Account ac : accounts){
            if(ac.getAcno()== acno)
            {
                accounts.remove(ac);
                return;
            }

        }
    }

    public Account getAccount(int acno) {
        for(Account account: accounts)
            if(account.getAcno() == acno) return account;

        return null;
    }

    public void updateAccounts()
    {
        for( Account ac : accounts){
            if( ac instanceof  SavingsAccount) {
               SavingsAccount sac =  (SavingsAccount) ac;
               sac.addInterest();
            }
            if( ac instanceof  CurrentAccount) {
                if(ac.getBalance() < 0 )
                    sendEmail( ac );
            }
            System.out.println("A/c no:" +ac.getAcno() +" has been updated... :) ");
        }
    }

    private void sendEmail(Account ac) {
        System.out.println(" Your Account is overdrawn...");
    }

    public void payDividend(int amount)
    {
        for(Account ac : accounts){
            ac.deposit(amount);
            System.out.println("Dividend credited to " + ac);
        }
    }

}
