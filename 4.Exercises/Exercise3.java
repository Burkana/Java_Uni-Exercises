import java.util.*;

public class Exercise3 {

    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in); Scanner scs = new Scanner(System.in)) {
            
            System.out.print("Input num: ");    
            int n = sc.nextInt();
            String [] arr1 = new String [n];
            String [] arr2 = new String [n];

            for(int i = 0; i < n; i++){
             System.out.print("Ar1["+i+"]: ");
             arr1[i] = scs.nextLine();


            }
            
            for(int i = 0; i < n; i++){
             System.out.print("Ar2["+i+"]: ");
             arr2[i] = scs.nextLine();


            }
             
               int [] arro1 = new int [n];
               int [] arro2 = new int [n];
              for(int i = 0; i < n; i++){
              arro1[i] = arr1[i].compareTo(arr2[i]);
              arro2[i] = arr2[i].compareTo(arr1[i]);
           

                 if(arr2[i].equals(arr1[i]))System.out.println("The Arrays are equel:" + arr1[i] + " = " + arr2[i]);
                 

                 if(arro1[i] > arro2[i]) System.out.println("The Arrays are:" + arr1[i] + " > " + arr2[i]);
                 if(arro1[i] < arro2[i])  System.out.println("The Arrays are: " + arr1[i] + " < " + arr2[i]);
                 
            }
              

             
        }
        }
       
}


