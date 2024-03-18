/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package solution;

/**
 *
 * @author A.Ashraf
 */
public class Solution {

    static double vector_average (Vector v[])
   {
      int size = v.length;
      double sum = 0;
      for (Vector element : v) // or you can use "for (int i=0;i<size;i++) sum += v[i].magnitude".
         sum += element.magnitude();
      return sum/size;
   }
   
   public static void main(String[] args)
   {
      
      Vector v1 = new Vector();
      System.out.println("Vector 1 = ");
      v1.print();
      
      Vector v2 = new Vector(5,10);
      System.out.println("Vector 2 = ");
      v2.print();
      
      v1.setX(10);
      v1.setY(20);
      System.out.println("Vector 1 = ");
      System.out.println(v1.getX() + "i " + v1.getY() + "j");
      System.out.println(v1.magnitude() +" [" + v1.angle() + "]");
      System.out.println();
      
      Vector v3 = v2.add(v1);
      System.out.println("Vector 3 = ");
      v3.print();
      
      System.out.println("Vector 4 = ");
      Vector v4 = v2.sub(v1);
      v4.print();
      
      Vector [] v = {v1,v2,v3,v4}; 
      System.out.println("Average magnitude of the vectors = " + vector_average(v));
   }
   
   
}
// you can write Vector class here, but it is better to create a new java file for every class.
// if you will write vector class here (in the same file), make sure to NOT use public keyword (access modifier) since this will confuse JVM which class is the main class. 


