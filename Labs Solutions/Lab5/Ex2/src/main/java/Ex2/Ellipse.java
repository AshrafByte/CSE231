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
public class Ellipse extends GeoShape
{
   double length , width ;
   
   public Ellipse(double x_start , double y_start , double length , double width)
   {
      super (new Point2D(x_start , y_start) );
      this.length = length ;
      this.width  = width  ;
   }
   
   public double getLength()
   {
      return length;
   }
   
   public double getWidth()
   {
      return width;
   }
   
   @Override
   public void draw()
   {
      System.out.println("Ellipse start point: " + getStart());
      System.out.println("Ellipse length: " + length);
      System.out.println("Ellipse width: " + width);
   }
}
