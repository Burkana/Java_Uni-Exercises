import java.util.*;

public class Present {
    public static void main(String args[]){
     try(Scanner sc = new Scanner(System.in)){
     double orhid = 13.25;
     double flower1 = 5;
     double rose = 8.50;
     double cactus = 8;
     double flower2 = 3;
     int order = 0;
     double sum = 0;
     System.out.print("How much the phone costs:");
     double phone_price = sc.nextDouble();

     System.out.print("How many orhids you want: ");
     order = sc.nextInt();
     sum = sum + (order * orhid);
     
     System.out.print("How many flowers you want: ");
     order = sc.nextInt();
     sum = sum + (order * flower1);
     System.out.print("How many roses you want: ");
     order = sc.nextInt();
     sum = sum + (order * rose);
     System.out.print("How many cactus you want: ");
     order = sc.nextInt();
     sum = sum +(order * cactus);
     System.out.print("How many flowers you want: ");
     order = sc.nextInt();
     sum = sum + (order * flower2);

     sum = sum * 0.97;
     Math.floor(sum);
     System.out.println("She has "+ sum + " euro");
      
     if(phone_price <= sum){
        System.out.println("She is left with " + (sum - phone_price) + " euro");
     } 
     else System.out.println("She needs " + (phone_price - sum) + " euro");






     }

    }
}
