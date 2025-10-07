import java.util.Arrays;
import java.util.Scanner;

public class MostFrequentElementFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        scanner.close();

        findMostFrequent(numbers);
    }

    public static void findMostFrequent(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("The array is empty.");
            return;
        }

        Arrays.sort(arr);

        int maxCount = 1;
        int mostFrequent = arr[0];
        int currentCount = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                currentCount++;
            } else {
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    mostFrequent = arr[i - 1];
                }
                currentCount = 1;
            }
        }

        if (currentCount > maxCount) {
            maxCount = currentCount;
            mostFrequent = arr[arr.length - 1];
        }

        System.out.println("The most frequent element is " + mostFrequent + ", which appears " + maxCount + " times.");
    }
}