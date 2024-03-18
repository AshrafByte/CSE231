/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Ex5;

/**
 *
 * @author A.Ashraf
 */
public class Main
{
   static int sum(int [] arr)
   {
      int sum = 0;
      // move through each element in the array arr and put it's value in the int variable 'element'.
      for (int element : arr)
         sum += element ;
      return sum;
   }
   // another way to cal the sum functon.
   static int sum_for_argument(int...n)
   {
      int sum = 0;
      // move through each element in the array n and put it's value in the int variable 'element'.
      for (int element : n)
         sum += element ;
      return sum;
   }
   
   public static void main(String[] args)
   {
      int []a = {1,2,3,4,5};
      int b[] = new int[5]; // the place of square bracket while declaring array doesn't matter.
      for (int i=0 ; i<5 ; i++)
         b[i] = i+1;
      System.out.println(sum(a));
      System.out.println(sum(b));
      System.out.println(sum_for_argument(1,2,3,4,5)); // it automatically takes all the arguments and puts them in an array.
   }
}
