/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex3;

import java.util.ArrayList;
import javafx.geometry.Point2D;

/**
 *
 * @author A.Ashraf
 */
public class Canvas
{
   private ArrayList<GeoShape> shapes;

   public Canvas()
   {  
      shapes= new ArrayList<GeoShape>();
   }
   
   
   public void addShape (GeoShape GeoShapes)
   {
      shapes.add(GeoShapes);
   }
   
   public void removeSahpe (GeoShape GeoShapes)
   {
      shapes.remove(GeoShapes);
   }
   
   public GeoShape getShape (Point2D point)
   { 
      GeoShape closetShape = shapes.getFirst(); // exception will happen if shapes is empty.
      Point2D start = closetShape.getStart();
      double distance ;
      double minDistance = start.distance(point);
      for (GeoShape shape : shapes)
      {
         start = shape.getStart();
         distance = start.distance(point);
         if (distance < minDistance)
         {
            minDistance = distance;
            closetShape = shape ;
         }
      }
      return closetShape;
   }
   
   public void drawAll()
   {
      for (GeoShape shape : shapes)
         shape.draw();
   }
   
   public static void main(String[] args)
   {
      Canvas cs = new Canvas();
      
      GeoShape [] GeoShapes = new GeoShape[3];
      GeoShapes[0] = new Line(30, 30, 10, 10);
      GeoShapes[1] = new Rectangle(20, 20, 10, 10);
      GeoShapes[2] = new Ellipse(10, 10, 10, 10);
      
      for (GeoShape shape : GeoShapes)
         cs.addShape(shape);
      cs.drawAll();
      System.out.println("=====================");
      
      cs.removeSahpe(GeoShapes[2]);
      cs.drawAll();
      System.out.println("=====================");
      
      GeoShape shape = cs.getShape(new Point2D(35,35));
      shape.draw();
   }
   
}
