import java.util.ArrayList;
import java.io.IOException;
import java.util.Collections;

/**
 *
 * Lab 5
 * Driver class that creates a list of 3D shaped objects and compares them by
 * their properties
 */
public class Driver {
    /**
     * Main Method
     *
     * @param args Not used
     * @throws IOException If there is an IO error
     */
    public static void main(String[] args) throws IOException {
        /**
         * Array list of type Shape is generated to store the 3D shape objects
         */
        ArrayList<Shape> list = new ArrayList<Shape>();
        // Sphere Object with radius 4
        Shape s1 = new Sphere(4.0);
        // Cylinder Object with height 4 and radius 1
        Shape s2 = new Cylinder(4.0, 1.0);
        // Cuboid Object with length 3, breadth 4 and height 5
        Shape s3 = new Cuboid(3.0, 4.0, 5.0);
        // Cube Object with edge length 2
        Shape s4 = new Cube(2.0);
        // Cube Object with edge length 3
        Shape s5 = new Cube(3.0);

        // Adding 3D Shape Objects to the arrayList
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        System.out.println("###");
        // Loop to print the Shapes in the arrayList in the order they are added
        // This syntax causes us to iterate through all of the Shapes in the list.
        // At each step in the loop, s is set to a unique Shape from the list
        for (Shape s : list) {
            System.out.println(s);
        }

        /**
         * Sorting the arrayList using the Sort method in Collections framework that
         * uses the compareTo method defined
         * in the Shape Class for sorting.
         */
        Collections.sort(list);

        System.out.println("###");
        // Printing the newly sorted arraylist based on compareTo method in Shape Class
        for (Shape s : list) {
            System.out.println(s);
        }

        /**
         * Sorting the arrayList using the Sort method in Collections framework that
         * uses the compare method defined
         * in the ShapeComparator Class for sorting. Here the compare method returns the
         * ArrayList items in descending
         * order of their respective Volumes
         */
        // Collections.sort(list, new ShapeComparator());

        System.out.println("###");
        // Printing the newly sorted arraylist based on compare method in
        // ShapeComparator Class
        for (Shape s : list) {
            System.out.println(s);
        }
    }
}