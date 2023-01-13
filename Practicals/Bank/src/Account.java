public abstract class Account {
    protected double balance;
    private int acno;

    public Account(int acno) {
        this.acno = acno;
        balance = 0;
    }
    public void deposit( double sum ){
        if(sum>0)
        balance += sum;
        else System.out.println("Cannot deposit -ve amount");
    }

    public abstract void withdraw(double sum);

    public double getBalance() {
        return balance;
    }

    public int getAcno() {
        return acno;
    }

    public final void print(){
        System.out.println( toString());
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Account{" +
                "balance=" + balance +
                ", acno=" + acno +
                '}';
    }
}
