import java.util.*;

public class AreaFind {
    public static void main(String args[]){
     try(Scanner sc = new Scanner(System.in)){
     System.out.print("Input a_square, a_rect, b_rect, a_tri, b_tri, rad:");
     int a_square = sc.nextInt();
     int a_rect = sc.nextInt();
     int b_rect = sc.nextInt();
     int a_tri = sc.nextInt();
     int b_tri = sc.nextInt();
     int rad = sc.nextInt();
     double area = 0;
     area = a_square * a_square;
     System.out.println("Square Area:" + area);
        area = a_rect * b_rect;
        System.out.println("Rectangle Area:" + area);
        area = (a_tri * b_tri) / 2;
        System.out.println("Triangle Area:" + area);
        area = 3.14 * rad * rad;
     System.out.println("Circle Area:" + area);
     }

    }
}