public class CurrentAccount extends Account{
    private double overdraft_limit;

    public CurrentAccount(int acno) {
        super(acno);
        overdraft_limit=500;
    }

    public CurrentAccount(int acno, double overdraft_limit) {
        super(acno);
        this.overdraft_limit = overdraft_limit;
    }

    @Override
     public void withdraw(double sum){
        if( sum >0 )
            if(getBalance()+overdraft_limit  >= sum ){
                balance = balance - sum;
            }
            else
                System.out.println("Insufficient Funds... :( ");
        else
            System.out.println("Sum cannot be -ve" );
    }




}
