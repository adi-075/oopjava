public abstract class Shape implements Comparable<Shape> {

    /**
     * The total number of shapes generated using the Shape Class
     */
    private static int numShapes = 0;

    /**
     * The Id of 3D object generated
     */
    private int id;

    /**
     * Constructor for the Shape Class
     * The numShapes variable is incremented each time a new 3d shape object created
     *
     */
    public Shape() {
        this.id = ++Shape.numShapes;
    }

    /**
     * Return the number of shapes that have been allocated
     *
     * @return numShapes The total number of shapes created so far
     */
    public int getNumShapes() {
        return Shape.numShapes;
    }

    /**
     * getId method
     *
     * @return id The ID of generated 3D object
     */
    public int getId() {
        return this.id;
    }

    /**
     * getVolume Abstract method
     *
     * @return volume of the object
     */
    public abstract double getVolume();

    /**
     * getSurfaceArea Abstract method
     *
     * @return surface area of the object
     */
    public abstract double getSurfaceArea();

    /**
     * getShapeType Abstract method
     *
     * @return String for the object called.
     */
    public abstract String getShapeType();

    /**
     * compareTo method
     * this method compares the current object with passed object.
     * If Surface area of current object less than surface area of passed object
     * return -1.
     * If Surface area of current object greater than surface area of passed object
     * return 1.
     *
     * If Surface area of current object equals surface area of passed object then
     * the volume of the object compared.
     * If volume of current object less than volume of passed object return -1.
     * If volume of current object greater than volume of passed object return 1.
     * If volume of current object equals volume of passed object return 0.
     *
     * @param s Object of type Shape, to be compared with *this* Shape object
     * @return -1 if *this* comes before s, 0 if they are equal or 1 otherwise
     */
    public int compareTo(Shape s) {
        if (this.getSurfaceArea() < s.getSurfaceArea())
            return -1;

        if (this.getSurfaceArea() > s.getSurfaceArea())
            return 1;

        if (this.getVolume() < s.getVolume())
            return -1;

        if (this.getVolume() > s.getVolume())
            return 1;

        return 0;
    }

    /**
     * toString method
     *
     * @return All information about the 3D Shape object in the single line of the
     *         format:
     *         "Cuboid:\tID = 7\tSurface Area = 94.00\tVolume = 60.00"
     */
    public String toString() {
        return String.format(
                "%s\tID = %d\tSurface Area = %.2f\tVolume = %.2f",
                getShapeType(), getId(), getSurfaceArea(), getVolume());
    }
}