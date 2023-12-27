// MyApplication.java
public class MyApplication {
    public static void main(String[] args) {
        // Create an array of points
        Point[] points = new Point[10];
        for (int i = 0; i < points.length; i++) {
            points[i] = new Point(Math.random() * 10, Math.random() * 10);
        }

        // Create a shape using the array of points
        Shape shape = new Shape(points);

        // Calculate and print the perimeter of the shape
        System.out.println("Perimeter: " + shape.perimeter());

        // Find and print the length of the longest side in the shape
        System.out.println("Longest Side: " + shape.longestSide());

        // Calculate and print the average length of the sides in the shape
        System.out.println("Average Side: " + shape.averageSide());
    }
}

