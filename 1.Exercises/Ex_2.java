import java.util.*;

public class Ex_2 {
    public static void main(String[] args){
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("How many days off do you have: ");
        int dayoff = sc.nextInt();
        int year = 365;
        int minutes = 30000;
        int playtime = 0;
        //playtime 63 min work days
        //playtime 127 min off work

        year = year - dayoff;
        playtime = year * 63 + dayoff * 127;
        minutes = minutes - playtime;

        System.out.println("Difference of playtime is: " + minutes +"min ");
        System.out.println("Difference of playtime is: " + minutes / 60 +"h ");
    }

    
   }
}
