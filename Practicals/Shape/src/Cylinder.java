/**
 *
 *
 * Cylinder class that extends the Shape class.
 * It has properties for the cylinder 3d object.
 *
 */
public class Cylinder extends Shape {
    /**
     * The height of the Cylinder object
     */
    private double height;

    /**
     * The radius of the Cylinder object
     */
    private double radius;

    /**
     * Constructor for the Cylinder Class
     *
     * @param height Information related to the height of the cylinder
     * @param radius Information related to the radius of the cylinder
     */
    public Cylinder(double height, double radius) {
        super();
        this.height = height;
        this.radius = radius;
    }

    /**
     * getSurfaceArea method, overrides the shape class getSurfaceArea() method
     *
     * @return Total Surface Area of the Cylinder Object
     */
    public double getSurfaceArea() {
        double surfaceArea = 2 * Math.PI * radius * height + 2.0 * Math.PI * radius * radius;
        return surfaceArea;
    }

    /**
     * getVolume Method, overrides the shape class getVolume() method
     *
     * @return Volume of the Cylinder Object
     */
    public double getVolume() {
        return Math.PI * radius * radius * height;
    }

    /**
     * getShapeType method
     * This method returns the shape of the object, overrides the shape class
     * getShapeType method.
     *
     * @return shape of the object here "Cylinder"
     */
    public String getShapeType() {
        return "Cylinder";
    }

    /**
     * getHeight method
     * This method returns the height of the cylinder object.
     *
     * @return height of the cylinder object.
     */
    public double getHeight() {
        return height;
    }

    /**
     * getRadius method
     * This method returns the radius of the cylinder object.
     *
     * @return radius of the cylinder object.
     */

    public double getRadius() {
        return radius;
    }

    /**
     * toString method
     * It overrides the Shape class toString method
     *
     * @return All information about the cylinder in the single line of the format
     *         Cylinder\tID = 0\tSurface Area = 31.42\tVolume = 12.57\theight =
     *         4.00\tradius = 1.00";
     */
    public String toString() {
        return String.format("%s\theight = %.2f\tradius = %.2f", super.toString(), height, radius);
    }
}