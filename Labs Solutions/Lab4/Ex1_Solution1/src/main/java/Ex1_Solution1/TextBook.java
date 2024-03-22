/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex1_Solution1;

/**
 *
 * @author A.Ashraf
 */
import java.time.LocalDate;

class TextBook extends Book
{

   private int numberOfPages;

   public TextBook(String tilte, LocalDate releaseDate, int price, int numberOfPages)
   {
      // 'super' keyword is used to access super class (parent class) constructors, methods and data fields.
      // but it can access them only if they don't use private access modifier.
      // like 'this' , 'super' help you to call the constructor since you can't just call it by class name.
      super(tilte, releaseDate, price);
      this.numberOfPages = numberOfPages;
   }

   int getNumberOfPages()
   {
      return numberOfPages;
   }
   
   void printTextBook()
   {
      // since inherited Textbook class inherit book class ,we can access all Book methods and data fields.
      // book class can't access TextBook class methods and data fields.
      printBook(); 
      System.out.println("Number of pages : " + numberOfPages);
      System.out.println();
   }
}
