import java.util.*;


public class Ex_3 {
    public static void main(String[] args){
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("How many hours does the project needs: ");
        int hoursneeded= sc.nextInt();
        System.out.print("How many days your team works: ");
        double workdays = sc.nextDouble();
        System.out.print("How many employes you have: ");
        int employes = sc.nextInt();
        int workhours = 10;
        double projectime = 0;

        workdays = workdays * 0.9;
        projectime = Math.floor(workdays) * workhours * employes;
        if(projectime >= hoursneeded){
        System.out.println("Yes!" + (int)(projectime - hoursneeded) +" hours left ");
        }
        else
        System.out.println("Not enough time!" + (int)(hoursneeded - projectime) +" hours needed ");
    }

    
   }
}
