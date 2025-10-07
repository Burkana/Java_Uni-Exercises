import java.util.*;

public class Exercise5{

    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in);){
        System.out.print("Input num: "); 
        int n = sc.nextInt();
        int [] arr = new int [n];
        

        for(int i = 0; i < n; i++){
         System.out.print("Ar1["+i+"]: ");
         arr[i] = sc.nextInt();
        }
        int maxCount = 1;
        int currentCount = 1;
        int [] element= new int[n];
        int j = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] < arr[i]) {
                currentCount++;
               
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    element[j] = arr[i-1];
                    element[j+1] = arr[i];
                    j++;
                }
            } else {
                currentCount = 1;
            }
        }
                 System.out.print("Longest { ");
        for (int i = 0; i < maxCount; i++) {
            System.out.print(element[i] + " ");
        }
        System.out.println("}");
    }
}

}