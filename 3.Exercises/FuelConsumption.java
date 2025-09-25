import java.util.Scanner;

public class FuelConsumption {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
        System.out.print("Input fuel:");
        int fuel = sc.nextInt();
         System.out.print("Input how many miles you passed with 1 gallon:");
        int miles = sc.nextInt();
         System.out.print("Input price of gallon:");
        int price = sc.nextInt();
        
       int passed = fuel * miles;
        System.out.println("You can pass:" + passed + " miles");

        int finale = price * 100;
        System.out.println("Price per 100 miles: " + finale);
        
        }
        }
        
    }