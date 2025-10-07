import java.util.Scanner;

public class ArraysGenerator {

    public static void fillPatternA(int[][] arr, int n) {
        int m = 1;
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                arr[i][j] = m++;
            }
        }
    }

    public static void fillPatternB(int[][] arr, int n) {
        int m = 1;
        for (int j = 0; j < n; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < n; i++) {
                    arr[i][j] = m++;
                }
            } else {
                for (int i = n - 1; i >= 0; i--) {
                    arr[i][j] = m++;
                }
            }
        }
    }
public static void fillPatternC(int[][] arr, int n) {
    int m = 1;
    for (int j = 0; j < n; j++) {
        for (int i = n - 1; i >= 0; i--) {
            arr[i][j] = m++;
        }
    }
}



    public static void fillPatternDStar(int[][] arr, int n) {
        int m = 1;
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;

        while (m <= n * n) {
            for (int i = top; i <= bottom && m <= n * n; i++) {
                arr[i][left] = m++;
            }
            left++;

            for (int j = left; j <= right && m <= n * n; j++) {
                arr[bottom][j] = m++;
            }
            bottom--;

            for (int i = bottom; i >= top && m <= n * n; i--) {
                arr[i][right] = m++;
            }
            right--;

            for (int j = right; j >= left && m <= n * n; j--) {
                arr[top][j] = m++;
            }
            top++;
        }
    }

    public static void printArray(int[][] arr) {
        int n = arr.length;
        int maxWidth = String.valueOf(n * n).length();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%" + (maxWidth + 1) + "d", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Input num: ");
            int n = sc.nextInt();
            
            
            int[][] arrA = new int[n][n];
            fillPatternA(arrA, n);
            System.out.println("\n--- Array1 ---");
            printArray(arrA);

            int[][] arrB = new int[n][n];
            fillPatternB(arrB, n);
            System.out.println("\n--- Array2 ---");
            printArray(arrB);


            int[][] arrC = new int[n][n];
            fillPatternC(arrC, n);
            System.out.println("\n--- Array3 ---");
            printArray(arrC);


            int[][] arrD = new int[n][n];
            fillPatternDStar(arrD, n);
            System.out.println("\n--- Array4 ---");
            printArray(arrD);

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
