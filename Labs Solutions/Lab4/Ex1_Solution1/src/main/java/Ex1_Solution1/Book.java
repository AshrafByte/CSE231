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

class Book
{
   private static int count = 0; // since count is a static variable, it will be shared across all the objects.
   private int id;
   private String title;
   private int price;
   private LocalDate releaseDate;

   Book(String title, LocalDate releaseDate, int price)
   {
      id = ++count;
      this.title = title;
      this.releaseDate = releaseDate;
      this.price = price;
   }

   int getID()
   {
      return id;
   }

   String getTitle()
   {
      return title;
   }

   LocalDate getReleaseDate()
   {
      return releaseDate;
   }

   double getPrice()
   {
      return price;
   }

   void printBook()
   {
      System.out.println("ID : " + id);
      System.out.println("Title : " + title);
      System.out.println("Release date : " + releaseDate);
      System.out.println("Price : " + price);
   }
}
