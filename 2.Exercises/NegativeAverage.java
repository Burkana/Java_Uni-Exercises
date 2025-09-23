import java.util.*;

public class NegativeAverage {
    public static void main(String args[]){
     try(Scanner sc = new Scanner(System.in)){
     System.out.print("Input num:");
     int num = 1;
     int sum = 0;
     int i = 0;
     double avr = 0;
     

     
     while(num > 0){
        num = sc.nextInt();
        i++;
        sum = sum + num;
     }
     avr = sum / i;
      System.out.println("The Avr is: " + avr);




     }

    }
}