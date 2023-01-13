public class Cuboid extends Shape {
    private double l;
    private double b;
    private double h;

    public Cuboid(double l, double b, double h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    @Override
    public double getVolume() {
        return this.l * this.b * this.h;
    }

    @Override
    public double getSurfaceArea() {
        return (2 * (l * b + l * h + b * h));
    }

    @Override
    public String getShapeType() {
        return "Cuboid";
    }

    public String toString() {
        return String.format(
                "%s\tlength = %.2f\tbreadth = %.2f\theight = %.2f",
                super.toString(), this.l, this.b, this.h);
    }
}