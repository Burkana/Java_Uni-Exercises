import java.util.*;

public class InputArray {
    public static void main(String args[]){
     try(Scanner sc = new Scanner(System.in)){
     System.out.print("Input num:");
     int n = sc.nextInt();
     int mas[] = new int [20];
       
     while(n > 20){
        System.out.print("Input num less than 20:");
        n = sc.nextInt();
     }
     for(int i = 0 ; i < n; i++)
     {
        
        while(mas[i] < 10 || mas[i] > 25){
            System.out.print("X["+i+"] (10-25):");
            mas[i] = sc.nextInt();
        }
        
     }
     int max = mas[0];
     int b = 0;
     for(int i = 0 ; i < n; i++)
     {
        if(max < mas[i])
        {
            max = mas[i];
            b = i;

        }

     }
        System.out.println("Max:" + max + " at index:" + b);
    
        }

    }
}
