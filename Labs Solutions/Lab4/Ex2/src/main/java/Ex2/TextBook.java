/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex2;

/**
 *
 * @author A.Ashraf
 */
import java.util.Scanner;

class TextBook extends Book
{

   private int numberOfPages;

   int getNumberOfPages()
   {
      return numberOfPages;
   }
   
   @Override
   void print()
   {
      System.out.println(this + "\n"); // this will invoke toString method.
   }
   
   @Override
   public void read()
   {
      super.read();
      Scanner in = new Scanner(System.in);
      System.out.print("Enter number of pages : ");
      numberOfPages = in.nextInt();
   }
   @Override
   public String toString()
   {
      return  super.toString() + 
              "\nNumber of pages : " + numberOfPages +
              "\nType : Text";
   }

   @Override
   public boolean equals(Object obj)
   {
      if (this == obj) // check if they contain the same reference (address)
         return true;
      // you can also use getClass() method.
      if (!(obj instanceof TextBook)) // check if obj contains reference to object of type TextBook.
         return false;
      
      TextBook other = (TextBook) obj; // type casting so we can access numberOfPages data field.
      return  super.equals(obj) && (this.numberOfPages == other.numberOfPages);    
   }
}