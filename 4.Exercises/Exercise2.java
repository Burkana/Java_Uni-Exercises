import java.util.*;

public class Exercise2 {

    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in);){
        System.out.print("Input num: "); 
        int n = sc.nextInt();
        int [] arr1 = new int [n];
        int [] arr2 = new int [n];

        for(int i = 0; i < n; i++){
         System.out.print("Ar1["+i+"]: ");
         arr1[i] = sc.nextInt();


        }
        
        for(int i = 0; i < n; i++){
         System.out.print("Ar2["+i+"]: ");
         arr2[i] = sc.nextInt();


        }
          for(int i = 0; i < n; i++){
         if(arr1[i]==arr2[i]){
             System.out.println("The Arrays are equel:" + arr1[i] + " " + arr2[i]);
         }
         
         


        }
       



        }

    }
    
}
