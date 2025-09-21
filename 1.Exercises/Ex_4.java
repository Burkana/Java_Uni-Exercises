import java.util.*;


public class Ex_4 {
    public static void main(String[] args){
    try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Firm name: ");
        String name= sc.nextLine();
        System.out.print("Firm addres: ");
        String addres = sc.nextLine();
        System.out.print("Firm number: ");
        String number = sc.nextLine();
        System.out.print("Firm fax: ");
        String fax = sc.nextLine();
        System.out.print("Firm website: ");
        String web = sc.nextLine();
        System.out.print("Manager name: ");
        String manager_name = sc.nextLine();
        System.out.print("Manager surname: ");
        String manager_surname = sc.nextLine();
        System.out.print("Manager number: ");
        String manager_num = sc.nextLine();


        System.out.println("|----------------------------------|");
        System.out.println("Firm: " + name);
        System.out.println("Addres: " + addres);
        System.out.println("Number: " + number);
        System.out.println("Fax: " + fax);
        System.out.println("Website: " + web);
        System.out.println("Manager \n Name: " + manager_name);
        System.out.println("Surname: " + manager_surname);
        System.out.println("Number: " + manager_num);
        System.out.println("|----------------------------------|");

        }

    
   }
}
