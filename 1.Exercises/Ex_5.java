import java.util.*;


public class Ex_5 {
    public static void main(String[] args){
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("How many numbers you want to print: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){

            System.out.print(" " + i );
        }

    }

    
   }
}