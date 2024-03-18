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
   public static void main(String[] args)
   {

      Vector v1 = new Vector(10, 10);

      Vector v2 = new Vector();
      v2.read();

      Vector v3 = new Vector();
      v3 = Vector.sub(v1, v2);
      v3.print();
      v3 = Vector.add(v1, v2);
      v3.print();
   }
}
