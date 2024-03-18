/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex2;

/**
 *
 * @author A.Ashraf
 */
import javafx.geometry.Point2D;
public class Line2D
{
   private Vector2D vector;
   private Point2D point;
   
   Line2D(Vector2D v , Point2D p)
   {
      vector = v;
      point = p ;
   }

   Line2D(double x , double y , double vx , double vy)
   {
      // vx and vy are the x and y components of the vector.
      point  = new Point2D(x,y);
      vector = new Vector2D(vx,vy);
   }
   
   void print()
   {
      System.out.println("Position : (" + point.getX() + " , " + point.getY() + ")" );
      // another way to print 2d point
      // System.out.println(point); // When printing an object by it's name, it's 'to_string' method is called which is responible to convert object data fields to string.
      System.out.println("Direction :-");
      vector.print();
   }
}
