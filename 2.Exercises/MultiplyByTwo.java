import java.util.*;

public class MultiplyByTwo {
    public static void main(String args[]){
     try(Scanner sc = new Scanner(System.in)){
     System.out.print("Input num:");
     double num = 0;
     
     while(num >= 0){
        num = sc.nextDouble();
        if(num >= 0)
        System.out.println("Result: " + (num*2));
     }
      System.out.println("Negative number!");




     }

    }
}