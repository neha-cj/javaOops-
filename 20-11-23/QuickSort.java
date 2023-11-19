public class QuickSortExample {

    public static void main(String[] args) {
        // Sample list of names
        String[] names = {"Alice", "Charlie", "Bob", "Eve", "David"};

        System.out.println("Original list of names:");
        printNames(names);

        // Perform QuickSort to sort the names
        quickSort(names, 0, names.length - 1);

        System.out.println("Sorted list of names (in ascending order):");
        printNames(names);
    }

    public static void quickSort(String[] arr, int low, int high) {
        if (low < high) {
            // Find the partition index such that elements smaller than the pivot are on the left,
            // and elements greater than the pivot are on the right.
            int partitionIndex = partition(arr, low, high);

            // Recursively sort the sub-arrays
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    private static int partition(String[] arr, int low, int high) {
        String pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            // If the current element is smaller than or equal to the pivot
            if (arr[j].compareToIgnoreCase(pivot) <= 0) {
                i++;

                // Swap arr[i] and arr[j]
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and arr[high] (pivot)
        String temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    private static void printNames(String[] arr) {
        for (String name : arr) {
            System.out.print(name + " ");
        }
        System.out.println();
    }
}
