import java.util.*;


public class Ex_7 {
    public static void main(String[] args){
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("How many point do you need: ");
        int n = sc.nextInt();
        int m[] = new int [10];
        int x[] = new int [10];

        for(int i = 0; i < n; i++){
            
            System.out.print("X["+(i+1)+"]:");
            m[i] = sc.nextInt();


        }

        for(int i = 0; i < n; i++){
            
            if(m[i] >=1 && m[i] <= 3)
            x[i] = m[i] * 10;

            if(m[i] >=4 && m[i] <= 6)
            x[i] = m[i] * 100;

            if(m[i] >=7 && m[i] <= 9)
            x[i] = m[i] * 1000;
        }
                    
           for(int i = 0; i < n; i++){
            if(x[i] != 0)
            System.out.print(x[i] + " ");
            else
            System.out.print("Error! ");
            
        }
    }

    
   }
}