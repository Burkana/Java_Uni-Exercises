import java.util.*;


public class SubarraySumFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the target sum: ");
        int targetSum = scanner.nextInt();

        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        scanner.close();

        findSubarrayWithSum(numbers, targetSum);
    }

    public static void findSubarrayWithSum(int[] arr, int targetSum) {
        int currentSum = 0;
        int startIndex = 0;
        boolean found = false;

        for (int endIndex = 0; endIndex < arr.length; endIndex++) {
            currentSum += arr[endIndex];

            while (currentSum > targetSum && startIndex <= endIndex) {
                currentSum -= arr[startIndex];
                startIndex++;
            }

            if (currentSum == targetSum) {
                System.out.print("Subarray with the sum " + targetSum + " found: { ");
                for (int i = startIndex; i <= endIndex; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println("}");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No contiguous subarray found with the given sum.");
        }
    }
}