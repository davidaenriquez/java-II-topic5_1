package app;

/**
 * The MyArray class provides a method to print elements of a generic array.
 */
public class MyArray {

    /**
     * Prints the elements of a generic array.
     *
     * @param inputArray The array of generic type to be printed.
     * @param <E>        The type of elements in the array.
     */
    public <E> void printArray(E[] inputArray) {
        // Iterate over the array and print each element
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
    }

    /**
     * The main method demonstrates the usage of the MyArray class with arrays of different types.
     *
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Create arrays of Integer, Double, and Character
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

        // Print each array out
        MyArray ma = new MyArray();
        System.out.println("Array IntegerArray contains:");
        ma.printArray(intArray); // pass an Integer array
        System.out.println("\nArray doubleArray contains:");
        ma.printArray(doubleArray); // pass a Double array
        System.out.println("\nArray characterArray contains:");
        ma.printArray(charArray); // pass a Character array
    }

}