import java.util.*;

public class Avarage {
    public static void main(String args[]){
     try(Scanner sc = new Scanner(System.in)){
     System.out.print("Input num:");
     int n = sc.nextInt();
     int mas[] = new int [n];

     for(int i = 0 ; i < n; i++)
     {
        System.out.print("X["+i+"]");
        mas[i] = sc.nextInt();
     }
     int sum = 0;
     double avr = 0;
     for(int i = 0 ; i < n; i++)
     {
         sum = sum + mas[i];
     }
     avr = sum / n;
     
      System.out.println("Sum:" + sum);
      System.out.println("Avarage:" + avr);


 
     }

    }
}