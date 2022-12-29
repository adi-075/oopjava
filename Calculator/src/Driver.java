public class Driver {
    public static void main(String args[]){
        Calculator c1 = new Calculator(16, 2);

        c1.add(c1.getA(), c1.getB());
        c1.subtract(c1.getA(), c1.getB());
        c1.divide(c1.getA(), c1.getB());
        c1.multiply(c1.getA(), c1.getB());
        c1.sqrt(c1.getA());
    }
}
