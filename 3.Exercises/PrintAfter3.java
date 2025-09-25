import java.util.Scanner;

public class PrintAfter3 {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
        System.out.print("Input num:");
        int n = sc.nextInt();
        
        for(int i = 1; i < n; i = i + 3){
            System.out.println(i);
        }
        
        }
        }
        
    }

