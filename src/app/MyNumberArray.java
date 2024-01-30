package app;

/**
 * The MyNumberArray class provides a method to print elements of a generic array with elements extending the Number class.
 */
public class MyNumberArray {

    /**
     * Prints the elements of a generic array containing elements extending the Number class.
     *
     * @param inputArray The array of generic type extending Number to be printed.
     * @param <E>        The type of elements in the array, extending Number.
     */
    public <E extends Number> void printArray(E[] inputArray) {
        // Iterate over the array and print each element
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
    }

    /**
     * The main method demonstrates the usage of the MyNumberArray class with arrays of different types.
     *
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Create arrays of Integer, Double, and Float
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        Float[] floatArray = {0.0f, 1.0f, 2.5f, 3.5f};

        // Print each array out
        MyNumberArray ma = new MyNumberArray();
        System.out.println("Array IntegerArray contains:");
        ma.printArray(intArray); // pass an Integer array
        System.out.println("\nArray doubleArray contains:");
        ma.printArray(doubleArray); // pass a Double array
        System.out.println("\nArray floatArray contains:");
        ma.printArray(floatArray); // pass a Float array
    }
}