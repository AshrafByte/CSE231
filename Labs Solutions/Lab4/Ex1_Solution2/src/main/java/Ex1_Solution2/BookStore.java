/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Ex1_Solution2;

/**
 *
 * @author A.Ashraf
 */
import java.util.Scanner;

public class BookStore
{

   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.println("Welcome to our Book store, we sell text and audio books");
      System.out.println("---------------------------------------------------------");
      System.out.print("Enter the number of books you need: ");
      int numberOfBooks = in.nextInt();
      Book[] books = new Book[numberOfBooks];
      System.out.println();

      for (int i = 0; i < numberOfBooks; i++)
      {
         boolean notValid;
         do
         {
            notValid = false;
            System.out.print("Enter book " + (i + 1) + " type [text/audio] : ");
            String type = in.next();
            
            if (type.equals("text"))   // don't use '==' since it compares only with string address not the value.
               books[i] = new TextBook();

            else if (type.equals("audio"))
               books[i] = new AudioBook();

            else
            {
               System.out.println("Invalid type");
               System.out.println("Please Enter valid book type\n");
               notValid = true;
            }
         }
         while (notValid);
         
         books[i].read();
         System.out.println();
      }

      System.out.println("List of books you entered:-\n");
      for (Book b : books)
         b.print();
   }
}
