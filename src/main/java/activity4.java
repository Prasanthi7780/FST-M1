

class activity4 {
    public static void main(String[] args) {
        // Initialize array with random numbers
        int[] numbers = {4, 3, 2, 10, 12, 1, 5, 6};

        // Display array before sorting
        System.out.print("Before sorting: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Insertion Sort
        for (int i = 1; i < numbers.length; i++) {
            int key = numbers[i];
            int j = i - 1;

            // Move elements of numbers[0..i-1] that are greater than key
            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = key; // Insert key at correct position
        }

        // Display array after sorting
        System.out.print("After sorting: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}


