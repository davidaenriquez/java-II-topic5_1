package app;

/**
 * The Storage class is a generic class that allows storing and retrieving data of any type.
 *
 * @param <T> The type of data to be stored.
 */
public class Storage<T> {

    // The data stored in the Storage instance
    private T s = null;

    /**
     * Constructs a Storage object with the given initial data.
     *
     * @param s The initial data to be stored.
     */
    public Storage(T s) {
        this.s = s;
    }

    /**
     * Retrieves the stored data from the Storage instance.
     *
     * @return The stored data.
     */
    public T getData() {
        return this.s;
    }

    /**
     * The main method demonstrates the usage of the Storage class with different data types.
     *
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Example usage with String data
        Storage<String> storage1 = new Storage<String>("Mark Reha");
        System.out.println("This is the data: " + storage1.getData());

        // Example usage with Integer data
        Storage<Integer> storage2 = new Storage<Integer>(0);
        System.out.println("This is the data: " + storage2.getData());
    }
}