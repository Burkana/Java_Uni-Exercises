import java.util.*;

public class IntervalOfNumbers {
    public static void main(String args[]){
     try(Scanner sc = new Scanner(System.in)){
     System.out.print("Input num:");
     int num = 11;
     int sum = 0;

     while(num > 10 || num < -10){
        num = sc.nextInt();
        if(num > 0)
        sum = sum + num;
     }
      System.out.println("The Sum is: " + sum);




     }

    }
}