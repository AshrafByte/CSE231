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
class AudioBook extends Book
{

   private int LengthinMin;

   public AudioBook(String tilte, LocalDate releaseDate, int price, int LengthInMin)
   {
      // 'super' keyword is used to access super class (parent class) constructors, methods and data fields.
      // but it can access them only if they don't use private access modifier.
      // like 'this' , 'super' help you to call the constructor since you can't just call it by class name.
      super(tilte, releaseDate, price);
      this.LengthinMin = LengthInMin;
   }

   int getLengthInMin()
   {
      return LengthinMin;
   }

   void printAudioBook()
   {
      // since inherited Audiobook class inherit book class ,we can access all Book methods and data fields.
      // book class can't access AudioBook class methods and data fields.
      printBook();
      System.out.println("Length in minutes  : " + LengthinMin);
      System.out.println();
   }
}
