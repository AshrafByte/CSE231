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
class AudioBook extends Book
{

   private int LengthInMin;

   public AudioBook() // you could remove this constructor and the class will work fine since the super class constructor is called anyway
   {
      super();
   }

   int getLengthInMin()
   {
      return LengthInMin;
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
      System.out.print("Enter length in minutes : ");
      LengthInMin = in.nextInt();
   }
   @Override
   public String toString()
   {
      return  super.toString() +
              "\nLength in minutes : " + LengthInMin +
              "\nType : Audio";
   }

   @Override
   public boolean equals(Object obj)
   {
      if (this == obj)
         return true;
      
      if (this.getClass() != obj.getClass())
         return false;
      
      AudioBook other = (AudioBook) obj;
      return  super.equals(obj) && (this.LengthInMin == other.LengthInMin);
   }
}
