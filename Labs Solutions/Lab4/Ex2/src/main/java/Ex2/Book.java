/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex2;

/**
 *
 * @author A.Ashraf
 */
import java.time.LocalDate;
import java.util.Scanner;

class Book
{
   private static int count = 0;
   private int id;
   private String title;
   private int price;
   private LocalDate releaseDate;

   Book()
   {
      id = ++count;
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

   void print()
   {
      System.out.println(this + "\n"); // this will invoke toString method.
   }
   
   public void read()
   {
      Scanner in = new Scanner(System.in);
      System.out.print( "Enter the title : ");
      title = in.next();
      
      System.out.print( "Enter the release date (year month day) : ");
      int year , month , day;
      year  = in.nextInt();
      month = in.nextInt();
      day   = in.nextInt();
      releaseDate = LocalDate.of(year,month,day);
      
      System.out.print( "Enter the price : ");
      price = in.nextInt();
   }
   
   @Override
   public String toString()
   {
      return  "ID : " + id + "\n" +
              "Title : " + title + "\n" +
              "Release Date : " + releaseDate + "\n" +
              "Price : " + price + "$";
   }

   @Override
   public boolean equals(Object obj)
   {
      if (this == obj)
         return true;
      
      if (!(obj instanceof Book)) // or use 'if (this.getClass() == obj.getClass())'
         return false;
      
      // reaching this line mean that obj is an instance of Book class
      // So to access it's data fields we need to typecast it.
      Book other = (Book) obj;
      return   this.title.equalsIgnoreCase(other.title) && this.releaseDate.equals(other.releaseDate);
   }
   
}