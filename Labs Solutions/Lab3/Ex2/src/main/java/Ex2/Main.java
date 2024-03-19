/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Ex2;

import java.util.Scanner;
import javafx.geometry.Point2D;

/**
 *
 * @author A.Ashraf
 */
public class Main
{

   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      Line2D line1 = new Line2D (1,1,3,3);
      line1.print();
      
      System.out.println("Enter x and y position of the line :");
      Point2D p = new Point2D ( in.nextDouble() , in.nextDouble() ) ;
      
      System.out.println("Enter x and y component of the line :");
      Vector2D v = new Vector2D ( in.nextDouble() , in.nextDouble() ) ;
      
      System.out.println();
      Line2D line2 = new Line2D(v, p);
      line2.print();
      v.add(new Vector2D(10,20)).print();
      
      
   }
}
