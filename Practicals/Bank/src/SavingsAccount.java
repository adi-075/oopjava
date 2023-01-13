public  class SavingsAccount extends Account{

    private double interest = 0.02;   // @2% rate of interest
    SavingsAccount( int acno)
    {
        super(acno);
    }

    /*   Not Allowed to override final print()
    public void print(){
        System.out.println(toString());
    }*/

    @Override
    public void withdraw(double sum) {
        if(sum <= getBalance() && sum > 0) balance -= sum;
    }

    public void addInterest()
    {
        deposit(interest*getBalance());
    }

    @Override
    protected void finalize()  {
        System.out.println("Account " + getAcno() + " Deleted");
    }
}
