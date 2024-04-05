/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex2;

import javafx.geometry.Point2D;

/**
 *
 * @author A.Ashraf
 */
public abstract class GeoShape
{
   private Point2D start; 

   public GeoShape(Point2D start)
   {
      this.start = start;
   }
   
   public GeoShape(double x , double y)
   {
      start = new Point2D(x, y);
   }
   
   
   final public Point2D getStart() // no shape will need to override getStart method as it only returns start.
   {
      return start;
   }
   public abstract void draw(); // this force all classes that inherit GeoShape to override draw method.
   // this allow you as the abstract class creator to set your own rules that all child classes must follow.
   // think about it that you are forcing all child class creators to use polymorphism.
   
   public static void main(String[] args)
   {
      GeoShape [] gs = new GeoShape[3];
      gs[0] = new Line(0, 0, 10, 10);
      gs[1] = new Rectangle(0, 0, 20, 5);
      gs[2] = new Ellipse(0, 0, 15, 5);
      for (GeoShape shape : gs)
      {
         shape.draw();
         System.out.println("");
      }
   }
   
}
