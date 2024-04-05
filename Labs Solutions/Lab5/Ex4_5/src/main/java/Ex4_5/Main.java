/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex4_5;

import java.util.Arrays;

/**
 *
 * @author A.Ashraf
 */
public class Main
{

   public static void main(String[] args)
   {
      // testing Diamond functionality
      Diamond d1 = new Diamond(10, 10, 5, 5);
      d1.draw();
     
      d1.move(5, 5);
      d1.draw();
      
      Diamond d2 = new Diamond(15, 15, 10, 10);
      System.out.println( "D1 compared to D2 = " + d1.compareTo(d2) );
      System.out.println("======================================");
      
      // testing java Arrays.sort() with array of Movables.
      Moveable [] movables = new Moveable[5];
      movables[0] = new Diamond(15, 15, 10, 10);
      movables[1] = new Diamond(10, 10, 10, 10);
      movables[2] = new Diamond(30, 15, 10, 10);
      movables[3] = new Diamond(30, 30, 10, 10);
      movables[4] = new Diamond(20, 40, 10, 10);
      
      for (Moveable m : movables)
         m.move(5.0,5.0);
      
      Arrays.sort(movables);
      
      for (Moveable m : movables)
         ( (Diamond)m ).draw();
   }
   
}
