/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Ex2;

/**
 *
 * @author A.Ashraf
 */
import java.time.LocalDate;
import java.util.Scanner;

public class BookStore
{

   static void readBooks(Book[] books)
   {
      Scanner in = new Scanner(System.in);
      String type;
      boolean notValid;
      
      for (int i = 0; i < books.length; i++)
      {
         System.out.println("Enter book " + (i + 1) + " Data\n");
         do
         {
            notValid = false;
            System.out.print("Choose book type [text/audio] : ");
            type = in.next();

            switch (type)
            {
               case "text":
                  books[i] = new TextBook();
                  break;

               case "audio":
                  books[i] = new AudioBook();
                  break;

               default:
                  System.out.println("\nInvalid type");
                  System.out.println("Please Enter valid book type\n");
                  notValid = true;
            }
         }
         while (notValid);
         
         books[i].read();
         System.out.println();
      }
   }

   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Welcome to our Book store, we sell text and audio books");
      System.out.println("---------------------------------------------------------");
      
      System.out.print("Enter the number of books you need : ");
      int numberOfBooks = in.nextInt();
      Book[] books = new Book[numberOfBooks];

      readBooks(books);
      
      System.out.println("List of books you entered :-\n");
      for (Book b : books)
         b.print(); // or System.out.println(b + "\n");

      System.out.println();
      if (numberOfBooks >= 2)
      {
         String eq ; 
         for (int i = 0 ; i < numberOfBooks - 1 ; i++)
         {
            if (books[i].equals(books[i+1]))
               eq = " equal ";
            else
               eq = " not equal ";
            System.out.println("Book" + (i+1) + eq + "Book" + (i+2) );
         }
      }
   }
}
// finally, try to solve this exercise without using inheritance and polymorphism.
// You should now understand why they are very useful and how/when to use them.
// If you have any questions feel free to ask me :)