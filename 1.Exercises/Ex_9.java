import java.util.*;


public class Ex_9 {
    public static void main(String[] args){
    try (Scanner sc = new Scanner(System.in)) {
        String m[] = {"Jan:31", "Feb:28", "Mar:31", "Apr:30", "Jun:31", "Jul:30", "Aug:31", "Sep:30", "Oct:31", "Nov:30", "Dec:31"};
        System.out.print("Year: ");
        int year = sc.nextInt();
        System.out.print("Whitch mounth you want to see: ");
        int i = sc.nextInt();
        
        if(year % 4 == 0){
        m[1] = "Feb 29";    
        }
        System.out.println(m[i-1]);



       }
      
     
        


    }

    
   }
