import java.util.*;


public class Ex_6 {
    public static void main(String[] args){
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("How many numbers you want to print: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            if( i % 3 != 0 && i % 7 != 0 )
            System.out.print(" " + (i) );
        }

    }

    
   }
}