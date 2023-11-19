public class BinarySearchExample {

    public static void main(String[] args) {
        // Sorted array of integers
        int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15};

        // Element to search for
        int targetElement = 7;

        // Perform binary search
        int result = binarySearch(sortedArray, targetElement);

        // Display the result
        if (result == -1) {
            System.out.println("Element " + targetElement + " not found in the array.");
        } else {
            System.out.println("Element " + targetElement + " found at index " + result + ".");
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if the target is present at the middle
            if (arr[mid] == target) {
                return mid;
            }

            // If the target is greater, ignore the left half
            else if (arr[mid] < target) {
                low = mid + 1;
            }

            // If the target is smaller, ignore the right half
            else {
                high = mid - 1;
            }
        }

        // Element not present in the array
        return -1;
    }
}
