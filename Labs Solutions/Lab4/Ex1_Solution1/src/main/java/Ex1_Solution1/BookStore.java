/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Ex1_Solution1;

/**
 *
 * @author A.Ashraf
 */
import java.time.LocalDate;
import java.util.Scanner;

public class BookStore
{
   static Book read()
   {
      Scanner in = new Scanner(System.in);
      String type;
      String title;
      LocalDate releaseDate;
      int year, month, day, price;
      int numberOfPages, LengthInMin;
  

      System.out.print("Enter book type [text/audio] : "); 
      type  = in.next();
      
      System.out.print("Enter title : ");
      title = in.next();

      System.out.print("Enter release date (year month day) : ");
      year  = in.nextInt();
      month = in.nextInt();
      day   = in.nextInt();
      releaseDate = LocalDate.of(year, month, day);

      System.out.print("Enter price : ");
      price = in.nextInt();

      Book b; // b is a Book reference that can store addresses of Book objects or objects from any class that inherit Book class.
      switch (type)
      {
         case "text":
            System.out.print("Enter number of pages : ");
            numberOfPages = in.nextInt();
            b = new TextBook(title, releaseDate, price, numberOfPages);
            break;

         case "audio":
            System.out.print("Enter length in minutes : ");
            LengthInMin = in.nextInt();
            b = new AudioBook(title, releaseDate, price, LengthInMin);
            break;

         default:
            b = new Book(title, releaseDate, price); 
      }
      return b;
   }

   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Welcome to our Book store, we sell text and audio books");
      System.out.println("---------------------------------------------------------");
      System.out.print("Enter the number of books : ");
      int numberOfBooks = in.nextInt();
      Book[] books = new Book[numberOfBooks]; // Book[] is an array that contains references to objects of type Book.

      for (int i = 0; i < numberOfBooks; i++)
      {
         System.out.println("Enter book " + (i + 1) + " Data");
         books[i] = read(); 
         System.out.println();
         // pay attention that read() can return a reference to Book or TextBook or AudioBook.
         // and since TextBook and AudioBook inherit Book class, they can be normally casted (implicit casting) to reference of type Book without any errors (we can store them in Book[]).
         // But the opposite cannot happen unless you use explicit casting.
         // If you are asking why would you need to use explicit casting, see the for loop below that use print methods.
         
      }
      //We have references of type Book but it may also contain references to type textBook or AudioBook, how to check this?
      //we can use 'instanceOf' method which return true if the object is instance of the specified class (type). 
      for (Book b : books)
      {
         if (b instanceof TextBook)
         {
            System.out.println("TextBook");
            ( (TextBook)b ).printTextBook();
         }
         else if (b instanceof AudioBook)
         {
            System.out.println("AudioBook");
            ( (AudioBook)b ).printAudioBook();
         }
         else
         {
            System.out.println("Book");
            b.printBook();
         }
         /*
            why I didn't use b.printTextBook or b.printAudioBook directly ?
            the reason is as we know sub class (child class) objects can access super class (parent class) methods and data fields.
            but the opposite can't happen, so any Book object won't be able to use printTextBook or printAudioBook.
            b is a reference of type Book that can refer to objects of type Book, TextBook and AudioBook.
            but the compiler will not know that since this will happen at runtime, so by default it will treat b as reference of type Book, which will prevent us from using printTextBook or printAudioBook. 
            so we need to tell the compiler that we are sure b refers to TextBook and AudioBook objects.
            and that why we used instanceOf and explicit casting to change b from Book reference to TextBook or AudioBook reference which will make b access printTextBook or printAudioBook.
         */
         // finally remember with inhertiance the default direction is from child to parent but if you want to go from parent to child you have to use explicit casting and also be careful as this may cause problems if it wasn't done correctly.
         // it is as going from int (small) to float (large) and using casting to go from float to int which can casue losing data.
      }
   }
}
