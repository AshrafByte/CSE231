/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex3;
import javafx.geometry.Point2D;

/**
 *
 * @author A.Ashraf
 */
public abstract class GeoShape
{
   protected final Point2D start;

   public GeoShape(Point2D start)
   {
      this.start = start;
   }
   
   final public Point2D getStart() // no shape will need to override getStart method as only return start.
   {
      return start;
   }
   
   public abstract void draw(); // this force all classes that inherit GeoShape to override draw method.
   // this allow you as the abstract class creator to set your own rules that all child classes must follow.
   // think about it that you are forcing all child class creators to use polymorphism.
}
