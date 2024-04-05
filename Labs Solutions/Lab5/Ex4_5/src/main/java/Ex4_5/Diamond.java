/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex4_5;

import javafx.geometry.Point2D;
import java.lang.Comparable;

/**
 *
 * @author A.Ashraf
 */
// Diamond class has to implement both move and draw methods.
public class Diamond extends GeoShape implements Moveable,Comparable <Diamond>
{
   private final double length , width ; // we used final keyword since we will not provide setter or any method that will modify the data fields.

   public Diamond(Point2D start, double length, double width)
   {
      super(start);
      this.length = length;
      this.width = width;
   }
   
   public Diamond(double x , double y ,double length, double width)
   {
      super(x,y);
      this.length = length;
      this.width = width;
   }
   
   @Override
   public void move (double dx , double dy) // you have to use public access modifier otherwise you will get compilation error
   {
      Point2D newStart = getStart().add(dx,dy);
      setStart(newStart);
   }
   
   @Override
   final public void draw()
   {
      System.out.println("Start point : " + getStart() ); // toString method will be invoked.
      System.out.println("Length : " + length);
      System.out.println("Width  : "  + width);
      System.out.println();
   }

   @Override
   public int compareTo(Diamond other) // compare 2 points by their distance from the orgin.
   {
      double thisDist  = this.getStart().distance(0,0); // or you can just use getStart().distance(0,0).
      double otherDist = other.getStart().distance(0,0);
      // sorting method we will sort in ascending. if you want sort method to sort in dscending order make "thisDist > otherDist" return -1 and chnage else to return 1.
      if (thisDist > otherDist)
         return 1;
      
      else if (thisDist == otherDist)
         return 0;
      
      else
         return -1;
   }
   
   
}
