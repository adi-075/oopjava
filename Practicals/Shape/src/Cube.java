/**
 *
 * Cube class that extends the Cuboid class.
 *
 */
public class Cube extends Cuboid {

    /**
     * This constructor uses the super to reference the extended Cuboid Class
     *
     * @param edge the value for each edge of the cube
     */
    public Cube(double edge) {
        super(edge, edge, edge);
    }

    /**
     * getShapeType method
     * This method returns the shape of the object, here it overrides
     * the Shape class getShapeType method
     *
     * @return shape of the object here "Cube"
     */
    public String getShapeType() {
        return "Cube";
    }
}