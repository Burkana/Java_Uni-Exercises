import java.util.*;

public class OnlineLibrary {


    public abstract static class Stock{
        abstract boolean sellBook(int num);
    }
    public static class Book extends Stock{
       protected String title;
       protected String author;
       protected int releaseYear;
       protected int totalCopies;
       protected int price;
        public Book(String title, String author, int releaseYear, int totalCopies, int price){
           this.title = title;
           this.author = author;
           this.releaseYear = releaseYear;
           this.totalCopies = totalCopies;
           this.price = price;
        }
             @Override
             public boolean sellBook(int num){
            
                
                if(num > totalCopies) 
                {
                  throw new ArithmeticException("OutOfStockException");
                }
            totalCopies = totalCopies - num;
            return true;
        }
   
    }
    public static class FictionBook extends Book{
      public FictionBook(String title, String author, int releaseYear, int totalCopies,int price,String genre) {
            super(title, author, releaseYear, totalCopies, price);
            this.genre = genre;
            
        }

      private String genre;
  
      

      
    }
     public static class NonFictionBook extends Book{
         public NonFictionBook(String title, String author, int releaseYear, int totalCopies,int price, String subject) {
            super(title, author, releaseYear, totalCopies, price);
            this.subject = subject;
        }

         private String subject;


    }
    public static void main(String args[]){
     try(Scanner sc = new Scanner(System.in)){

        Book book = new Book("Neshto ", "Neshto ", 2000, 50, 100);
        FictionBook fbok = new FictionBook("Neshto ", "Nqkoi ", 2005, 10, 100, " Prikluchenie");
        NonFictionBook nfbook = new NonFictionBook("bLQ", "Adv", 2000, 10,500, " Voina");
        


        System.out.println(book.title + book.author + book.releaseYear + " " + book.price + " " +  book.totalCopies);
        System.out.println(fbok.title + fbok.author + fbok.releaseYear + " " + fbok.price + " " + fbok.totalCopies + fbok.genre);
        System.out.println(nfbook.title + nfbook.author + nfbook.releaseYear + " " + nfbook.price + " " +  nfbook.totalCopies + nfbook.subject);
        System.out.println(book.sellBook(10)); 
        

    }
}
}