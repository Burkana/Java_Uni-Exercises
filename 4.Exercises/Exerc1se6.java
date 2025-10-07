import java.util.*;

public class Exerc1se6{

    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
        System.out.print("Input num: "); 
        int n = sc.nextInt();
        System.out.print("Input num: "); 
        int k = sc.nextInt();
        int [] arr = new int [n];
        

        for(int i = 0; i < n; i++){
         System.out.print("Ar1["+i+"]: ");
         arr[i] = sc.nextInt();
        }
        int [] maxnums = new int [n];
        int sum = 0;
        int max = arr[0];
        int b = 0;
        int j = 0;
        
        while(k > b){
        for (int i = 0; i < n; i++) {
         if(arr[i] > max)
         {
                max = arr[i];
                j = i;
        }
        } 
        maxnums[b] = max;
        arr[j] = 0;
        max = 0;
        b++;
        }
        for (int i = 0; i < k; i++) {
            sum = sum + maxnums[i];
            System.out.println("Max number " + (i+1) + " is: " + maxnums[i]);
        }
            System.out.println("The sum of the max " + k + " numbers is: " + sum);
  
    }
}

}