/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex2;

/**
 *
 * @author A.Ashraf
 */
public class Vector2D
{

   private double x, y;

   public Vector2D()
   {
      x = 0;
      y = 0;
   }

   public Vector2D(double x, double y)
   {
      this.x = x;
      this.y = y;
   }

   double getX()
   {
      return x;
   }

   double getY()
   {
      return y;
   }

   void setX(double x)
   {
      this.x = x;
   }

   void setY(double y)
   {
      this.y = y;
   }

   double magnitude()
   {
      return Math.sqrt(x * x + y * y);
   }

   double angle() // return angle in degree
   {
      return Math.atan(y / x) * (180 / (Math.PI));
   }

   void print()
   {
      System.out.printf("%.2fi + %.2fj\n", x, y); // or System.out.println(x+"i + "+y+"j")
      System.out.printf("%.2f[%.2f]\n", magnitude(), angle()); // printf allow us to set the precision of both float and double datatype. i.e (.2) is the precision.
      System.out.println();
   }

   Vector2D add(Vector2D v)
   {
      Vector2D add = new Vector2D();
      add.setX(x + v.getX());
      add.setY(y + v.getY());
      return add;
   }

   Vector2D sub(Vector2D v)
   {
      Vector2D sub = new Vector2D();
      sub.x = x - v.x; // since we are inside vector class, we don't need to use setter and getter.
      sub.y = y - v.y;
      return sub;
   }
}
