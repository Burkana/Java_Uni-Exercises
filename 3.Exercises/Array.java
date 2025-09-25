import java.util.*;

public class Array {
    public static void main(String args[]){
     try(Scanner sc = new Scanner(System.in)){
     System.out.print("Input num:");
     int n = sc.nextInt();
     int mas[] = new int [100];

     for(int i = 0 ; i < n; i++)
     {
        System.out.print("X["+i+"]");
        mas[i] = sc.nextInt();
     }

     for(int i = 0 ; i < n; i++)
     {
        if(mas[i] >= 85 && mas[i] <= 100)
        {
            if(mas[i] % 2 == 0)
            System.out.println("Even:" + Math.pow(mas[i], 3));
        
            if(mas[i] % 2 != 0)
            System.out.println("Odd at index:" + i);
        }
        else System.out.println("Out of range");
     }

    }
}
}