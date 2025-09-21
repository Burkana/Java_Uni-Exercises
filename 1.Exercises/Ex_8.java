import java.util.*;


public class Ex_8 {
    public static void main(String[] args){
    try (Scanner sc = new Scanner(System.in)) {
        int m[] = new int [20];
        int max;
        int sum = 0;

        for(int i = 0; i < 20; i++){
            
            System.out.print("Arr["+(i+1)+"]:");
            m[i] = sc.nextInt();
            m[i] = m[i] * 5;

        }
         max = m[0];
        for(int i = 0; i < 20; i++){
           
         sum = sum + m[i];
         if(max < m[i]) max = m[i];

            

        }
                    
           for(int i = 0; i < 20; i++){
            System.out.print(m[i] + " ");
        }

         System.out.println("\nThe sum is =" + sum + " while the max num is: " + max);
    }

    
   }
}