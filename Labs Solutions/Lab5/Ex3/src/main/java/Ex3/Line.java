/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex3;

/**
 *
 * @author A.Ashraf
 */
import javafx.geometry.Point2D;
public class Line extends GeoShape
{
   Point2D end ;
   
   public Line(double x_start , double y_start , double x_end , double y_end)
   {
      super(new Point2D(x_start,y_start));
      end = new Point2D(x_end   , y_end  );
   }
   
   
   public Point2D getEnd()
   {
      return end;
   }
   
   @Override
   public void draw()
   {
      System.out.println("Line start point: " + "(" + getStart());
      System.out.println("Line end   point: " + "(" + end + "\n");
     
   }
}
