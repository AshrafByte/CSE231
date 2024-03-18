/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Ex4;

/**
 *
 * @author A.Ashraf
 */
public class Main
{

   public static void main(String[] args)
   {
      MyStringBuffer msb = new MyStringBuffer("12345");
      msb.print();

      System.out.println("msb length = " + msb.length());

      System.out.println("index of '3' in msb is " + msb.indexOf('3'));

      msb = msb.erase(1, 3);
      msb.print();

      msb = msb.insert(1, "234");
      msb.print();
      System.out.println(msb.getString());
   }
}
