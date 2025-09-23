import java.util.*;

public class Ex_1{
    public static void main(String[] args){
      try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter the distance you want to travel: ");
        int km = sc.nextInt();
        System.out.print("Is it a day 1 or a night 0: ");
        int T = sc.nextInt();
         
        double taxi = 0;
        double bus = 0;
        double train = 0;
        
        if(T == 1){
            taxi = 0.90 + 2.30 * km;
            bus = 1.50 * km;
            train = 2.00 * km;
        }
        else taxi = 0.90 + 1.80 * km; 
                 
          if(T != 0 && T != 1) {
          System.out.println("Incorrect time of day");
          return;
          } 

      

          if(km < 20){
           System.out.println("Cheapest option is a taxi: " + taxi);
          }
          if(km >= 20 && bus < taxi){
            System.out.println("Cheapest option is a bus: " + bus);
          }
          if(km >= 100 && train < bus){
            System.out.println("Cheapest option is a train: " + train);
          }
        }

      }

      
}



