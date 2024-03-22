/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex1_Solution2;

/**
 *
 * @author A.Ashraf
 */
import java.util.Scanner;

class TextBook extends Book
{
   int numberOfPages ;
   
   @Override
   public void read()
   {
      super.read();
      Scanner in = new Scanner(System.in);
      System.out.print("Enter number of pages : ");
      numberOfPages = in.nextInt();
   }
   
   @Override
   public void print()
   {
      super.print();
      System.out.println("Number of pages : " + numberOfPages);
      System.out.println("Type : Text Book ");
      System.out.println();
   }

}
