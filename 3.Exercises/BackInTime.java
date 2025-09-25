import java.util.Scanner;

public class BackInTime {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
        double dollar = 1;
        double dollar2 = 5;
        double dollar3 = 10;
        double dollar4 = 20;
        double dollar5 = 50;
        double dollar6 = 100;
        double cent = 0.1;
        double cent2 = 0.5;  
        double cent3 = 0.10;
        double cent4 = 0.25;
        int mas [] = new int [10];
        
        System.out.print("Input price:");
        double price = sc.nextDouble();
        System.out.print("Input the money you got:");
        double sum = sc.nextDouble();
        double change = sum - price;
        System.out.println("Your change is:" + change);//1. 50dollar 2. 20 dollar 1. 5 dollar 1. 1 dolalr , 2. 25 cent 1. 10 cent; 

        while(change >= 100){
         change = change - dollar6;
          mas[0]++;
        }
          while(change >= 50){
         change = change - dollar5;
         mas[1]++;

        }
          while(change >= 20){
         change = change - dollar4;
         mas[2]++;

        }
          while(change >= 10){
         change = change - dollar3;
         mas[3]++;

        }
          while(change >= 5){
         change = change - dollar2;
         mas[4]++;


        }
            while(change >= 1){
         change = change - dollar;
         mas[5]++;


        }
        while(change >= 0.25){
         change = change - cent4;
         mas[6]++;

        }
          while(change >= 0.10){
         change = change - cent3;
         mas[7]++;

        }
          while(change >= 0.5){
         change = change - cent2;
         mas[8]++;

        }
          while(change >= 0.1){
         change = change - cent;
            mas[9]++;

        }
        System.out.println("You have to give " + mas[0] + " 100 dollar");
        System.out.println("You have to give " + mas[1] + " 50 dollar");
        System.out.println("You have to give " + mas[2] + " 20 dollar");
        System.out.println("You have to give " + mas[3] + " 10 dollar");
        System.out.println("You have to give " + mas[4] + " 5 dollar");
        System.out.println("You have to give " + mas[5] + " 1 dollar");
        System.out.println("You have to give " + mas[6] + " 25 cent");
        System.out.println("You have to give " + mas[7] + " 10 cent");
        System.out.println("You have to give " + mas[8] + " 5 cent");
        System.out.println("You have to give " + mas[9] + " 1 cent");
        }
        
        
    }
}