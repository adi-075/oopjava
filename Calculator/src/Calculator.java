public class Calculator extends SciCalc implements Calc1{
    private int a;
    private int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "1st Number=" + a +
                ", 2nd Number=" + b +
                '}';
    }

    @Override
    public int add(int a, int b) {
        int c = a + b;
        System.out.println("Addition = "+c);
        return 0;
    }

    @Override
    public int subtract(int a, int b) {
        int c = a - b;
        System.out.println("Subtraction = "+c);
        return 0;
    }

    @Override
    public int multiply(int a, int b) {
        int c = a * b;
        System.out.println("Multiplication = "+ c);
        return 0;
    }

    @Override
    public int divide(int a, int b) {
        int c = a / b;
        System.out.println("Division = "+ c);
        return 0;
    }
}
