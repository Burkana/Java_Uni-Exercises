import java.util.*;

public class Theatre {


    public interface Ticketable{
      boolean book(int num);
    }

    public static class Performance implements Ticketable{
       protected String title;
       protected String director;
       protected String date;
       protected int totalSeats;
       protected int price;
        public Performance(String title, String director, String date, int totalSeats, int price){
           this.title = title;
           this.director = director;
           this.date = date;
           this.totalSeats = totalSeats;
           this.price = price;
        }
             @Override
             public boolean book(int num){
            
                
                if(num > totalSeats) 
                {
                  throw new ArithmeticException("NoMoreSeatsEception");
                }
            totalSeats = totalSeats - num;
            return true;
        }
   
    }
    public static class Drama extends Performance{
         private String mainActor;
      public Drama(String title, String director, String date, int totalSeats,int price,String mainActor) {
            super(title, director, date, totalSeats, price);
            this.mainActor = mainActor;
            
        }

     
    }
     public static class Comedy extends Performance{
        private String leadComedian;
         public Comedy(String title, String director, String date, int totalSeats,int price,String leadComedian) {
            super(title, director, date, totalSeats, price);
            this.leadComedian = leadComedian;
        }

         
    }
    public static void main(String args[]){
     try(Scanner sc = new Scanner(System.in)){

    }
}
}