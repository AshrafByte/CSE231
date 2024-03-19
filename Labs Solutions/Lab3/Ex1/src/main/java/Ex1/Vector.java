/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex1;

/**
 *
 * @author A.Ashraf
 */
import java.util.Scanner;

public class Vector
{
   
   // using private keyword (access modifier) with data fields will make them accessible only inside the class (Vector class in our case), and the only way to access them outside the class is by using getter and setter methods.
   private double x, y; 
   // Using public keyword (access modifier) with constructor or class methods will make them accessible outside and inside the package ('Ex1' package in our case).
   public Vector()
   {
      x = 0;
      y = 0;
   }
   /*
   If you don't specify any access modifiers, the methods or data fields will be considered [package private]
   which means they can be used by any class within the package but not outside of it.
   */
   Vector(double x, double y)
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
      // or 
      // return Math.atan2(y,x);
   }
   
   void print()
   {
      System.out.printf("%.2fi + %.2fj\n", x, y); // or System.out.println(x+"i + "+y+"j")
      System.out.printf("%.2f[%.2f]\n", magnitude(), angle()); // printf allow us to set the precision of both float and double datatype. i.e (.2) is the precision.
      System.out.println();
   }
   
   // Remember that using static keyword makes the method accessible by class name and it is object (instance) independent.
   // lets see the differnce between v1.add(v2) and Vector.add(v1,v2).
   // both v1 and v2 are arguments that are passed to add function.
   // but the difference is that in v1.add(v2), v2 was passed to add method explicitly while v1 was passed implicitly.
   // In Vector.add(v1,v2), both v1 and v2 are passed explicitly.
   // implicit argument is the object that called the method and you can access it's data fields by using 'this' keyword or directly using data fields names inside the called method.
   // explicit argument is the argument inside the braces.  '.add(v1,v2)'
   static Vector add(Vector v1, Vector v2)
   {
      Vector add = new Vector();
      add.setX(v1.getX() + v2.getX());
      add.setY(v1.getX() + v2.getY());
      return add;
   }

   static Vector sub(Vector v1, Vector v2)
   {
      Vector sub = new Vector();
      sub.x = v1.x - v2.x; // since we are inside vector class, we don't need to use setter and getter.
      sub.y = v1.y - v2.y;
      return sub;
      // you can also use
      // return new Vector (v1.x - v2.x , v1.y - v2.y);
   }

   void read()
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter X Comp : ");
      x = in.nextDouble();
      System.out.print("Enter Y Comp : ");
      y = in.nextDouble();
   }
}
