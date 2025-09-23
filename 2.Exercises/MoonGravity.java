import java.util.*;

public class MoonGravity {
    public static void main(String args[]){
     try(Scanner sc = new Scanner(System.in)){
     System.out.print("Input weight:");
     double weight = sc.nextDouble();

 
     weight = weight * 0.83; // 83 + 17 = 100
     
      System.out.println("Weight on the moon is: " + weight); 

 
     }

    }
}
