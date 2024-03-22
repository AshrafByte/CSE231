/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex1_Solution2;

/**
 *
 * @author A.Ashraf
 */
import java.time.LocalDate;
import java.util.Scanner;

class Book
{
    private static int count = 0;
    private int id ;
    private String title;
    private LocalDate releaseDate;
    private double price;
   
   Book()
   {
      id = ++count;
   }

   public int getId()
   {
      return id;
   }

   public String getTitle()
   {
      return title;
   }

   public LocalDate getReleaseDate()
   {
      return releaseDate;
   }

   public double getPrice()
   {
      return price;
   }
   public void print()
   {
      System.out.println( "ID : " + id);
      System.out.println( "Title : " + title);
      System.out.println( "Release date : " + releaseDate);
      System.out.println( "Price : " + price);
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
}

