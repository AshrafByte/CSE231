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
      
      String star = "*";
      for (int row = 0 ; row < 5 ; row++ )
      {
         System.out.println(star);
         star += "*";
      }
      /* another solution (normal nested loops) :
      for (int i = 1 ; i<=5 ; i++)
      {
         for (int j = 1 ; j<=i ; j++)
            System.out.print('*');
         System.out.println();
      }*/
   }
}
