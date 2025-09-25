import java.util.Scanner;

public class Exercise6 {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
        System.out.print("Input num:");
        int n = sc.nextInt();
         System.out.print("Input num:");
        int m = sc.nextInt();
        int sum = 0;
        
        for(int i = n; i <= m; i++){
           sum = sum + i;
        }
          for(int i = n; i <= m; i++){
              System.out.println(i+ "^3: " + Math.pow(i,3));
        }
            System.out.println("Sum: " + sum);
        
        }
        }
        
    }

