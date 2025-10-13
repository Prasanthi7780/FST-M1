
class activity2 {
    public static void main(String[] args) {
        int[] numbers = {10, 77, 10, 54, -11, 10};
        int sum = 0;

        // Add all 10's in the array
        for (int num : numbers) {
            if (num == 10) {
                sum += num;
            }
        }

        // Check if sum is 30
        if (sum == 30) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
