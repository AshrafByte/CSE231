/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Ex1;

/**
 *
 * @author A.Ashraf
 */
public class Main
{

   // since this functions are considered methods for class Main, we need to create an instance of class Main to use it if we didn't use static keyword.
   void area_perimeter_rectangle(float length, float width)
   {
      System.out.println("Perimeter of the rectangle = " + (2 * length + 2 * width));
      System.out.println("area of rectangle = " + length * width);
   }

   // using static keyword with a function allow us to call it in main class without creating instance(object) of Main class to use it.
   static void area_perimeter_square(float length)
   {
      System.out.println("Perimeter of the square = " + 4 * length);
      System.out.println("area of the square = " + length * length);
   }

   static void area_perimeter_circle(float radius)
   {
      System.out.println("Perimeter of the circle = " + 2 * Math.PI * radius);
      System.out.println("area of the circle = " + Math.PI * radius * radius);
   }

   public static void main(String[] args)
   {
      Main obj = new Main();
      obj.area_perimeter_rectangle(4, 5.5f);  // this is an example where we used non static function inside a static function (main) by making instance of the Main class
      area_perimeter_square(10);
      area_perimeter_circle(3.2f);
   }
}
