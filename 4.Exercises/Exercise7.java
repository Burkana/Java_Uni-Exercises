import java.util.*;

public class Exercise7{

    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
        System.out.print("Input num: "); 
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        

        for(int i = 0; i < n; i++){
         System.out.print("Ar1["+i+"]: ");
          list.add(sc.nextInt());
        }
            for(int i = 0; i < n; i++){
      
          list.sort(Comparator.naturalOrder());
          System.out.println("Sorted Array: " + list.get(i));
        }
          for(int i = 0; i < n; i++){
      
          list.sort(Comparator.reverseOrder());
          System.out.println("Sorted Array: " + list.get(i));
        }


        
      
  
    }
}

}