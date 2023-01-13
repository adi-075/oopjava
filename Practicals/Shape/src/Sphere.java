public class Sphere extends Shape {
    private double r;

    public Sphere(double r) {
        this.r = r;
    }

    @Override
    public double getVolume() {
        return 4 / 3 * Math.PI * Math.pow(r, 3);
    }

    @Override
    public double getSurfaceArea() {
        return 4 * Math.PI * Math.pow(r, 2);
    }

    @Override
    public String getShapeType() {
        return "Sphere";
    }

    public String toString() {
        return String.format(
                "%s\tradius = %.2f",
                super.toString(), this.r);
    }
}