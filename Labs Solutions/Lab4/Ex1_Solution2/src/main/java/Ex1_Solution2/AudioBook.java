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
class AudioBook extends Book
{
   int lengthInMin;
   
   // I don't need to write code for the constructor since the default constructor of super class will be invoked anyway.
   @Override
   public void read()
   {
      super.read();
      Scanner in = new Scanner(System.in);
      System.out.print("Enter length in minutes : ");
      lengthInMin = in.nextInt();
   }
   @Override
   public void print()
   {
      super.print();
      System.out.println("Length in minutes : " + lengthInMin);
      System.out.println("Type : Audio book");
      System.out.println();
   }
}
