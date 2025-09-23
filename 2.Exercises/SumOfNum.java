import java.util.*;

public class SumOfNum {
    public static void main(String args[]){
     try(Scanner sc = new Scanner(System.in)){
     System.out.print("Input num:");
     int n = sc.nextInt();
     int a = 0;
     int b = 0;
     int c = 0;
     int d = 0;
     a = n % 10;
     b = (n / 10) % 10;
     c = (n / 100) % 10;
     d = n / 1000;

        System.out.println((a + b + c + d));



     


 
     }

    }
}