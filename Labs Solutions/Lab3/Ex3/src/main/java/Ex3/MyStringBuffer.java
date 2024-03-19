/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex3;

/**
 *
 * @author A.Ashraf
 */
public class MyStringBuffer
{
   // String class by default is immutable, so we need to store it in an array of char since arrays are mutable.
   private char[] buffer;

   MyStringBuffer(String str)
   {  // you can also use buffer = s.toCharArray()
      int size = str.length();
      buffer = new char[size];
      for (int i = 0; i < size; i++)
         buffer[i] = str.charAt(i);
   }

   String getString()
   {
      return new String(buffer);
   }
   
   void print()
   {
      System.out.println(buffer);
      // or you can print each char using 'for(char ch : buffer) System.out.print(ch) ;'
      // or use new String(buffer)
   }

   int length()
   {
      return buffer.length;
   }

   int indexOf(char c)
   {
      for (int i = 0; i < length(); i++)
         if (buffer[i] == c)
            return i ;
      
      return -1;
   }

   void erase(int index, int length)
   {
      // check if index is in the range of buffer array
      if (  index >= buffer.length || index < 0 )
         return;
      
      if (index + length > buffer.length) // if the region is outside the buffer region , erase all chars starting from 'index' to the end of the string.
            length = buffer.length - index ;
      
      // you can use 'this.length()'
      int newSize = buffer.length - length; // length()--> array size before erasing , length --> nymber of chars that will be erased.
      char[] tempBuffer = new char[newSize];
      int i_buffer = 0 , i_temp = 0;
      while (i_buffer < buffer.length)
      {
         if (i_buffer == index) // if i == index -> skip the region starting from index to index + length (the region that will be erased).
            i_buffer += length;
         else
            tempBuffer[i_temp++] = buffer[i_buffer++];
      }
      buffer = tempBuffer;
   } 
   
   //another code for erase method (now you have two implementatin, one that use array of char and the other use string)
   /* void erase(int index, int length)
   {
      //check if index is in the range of buffer
      if (  index >= buffer.length || index < 0 )
         return;
      if (index + length > buffer.length) 
         length = buffer.length - index ;
   
      String tempBuffer = "";
      int iBuffer = 0;
      while (iBuffer < buffer.length)
      {
         if (iBuffer == index)
            iBuffer += length;
         else
            tempBuffer += buffer[iBuffer++];
      }
      buffer = tempBuffer.toCharArray();
   } */
   
   
   /* how this insert function work ?
      for example : buffer = "15" , str = "123" , index = 1.
      1) newSize = 2 + 3 = 5 .
   `  newBuffer array :-
      index : 0  1  2  3  4
      value : '' '' '' '' ''
      2) lowerlimit = 1 , upperlimit = 1 + 3 - 1 = 3
      3) iterate through the indexes of StrNew.
      4) for the indexes that are outside the insertion range (in this example we will insert starting from index 1 to index 3 which is 3 chars)
      insert the orginal string (buffer) chars
      index :  0   1   2   3   4
      value : '1' ' ' ' ' ' ' '5'
      5) for indexes inside the range (from 1 to 3) insert str chars.
      index :  0   1   2   3   4
      value : '1' '2' '3' '4' '5'
      note that tempBuffer[1] = str[0] , tempBuffer[2] = str[1] , tempBuffer[i] = str[i - index] inside the insertion region only. 
      
   */
   
   void insert(int index, String str)
   {
      if (buffer.length == 0) // if buffer is empty, assign buffer to str.
      {
         buffer = str.toCharArray();
         return;
      }
      // check if index is in the range of buffer, if not you can choose to return without doing anything or if index is >= buffer length, you can insert at the end of buffer.
      if ( index >= buffer.length || index < 0)
         return;
      
      int newSize = str.length() + length(); // length() -> buffer length , you can use 'buffer.length'
      char[] tempBuffer = new char[newSize];
      
      int lowerLimit = index;
      int upperLimit = index + str.length() - 1;
      int i_buffer = 0; 
      for (int i_temp = 0; i_temp < newSize; i_temp++)
      {
         boolean isInsideRange = (i_temp >= lowerLimit) && (i_temp <= upperLimit);
         if (isInsideRange) // is true when i_temp is inside the inserting range which is from index to index + str.length()-1.
            tempBuffer[i_temp] = str.charAt(i_temp - index);
         else
            tempBuffer[i_temp] = buffer[i_buffer++];
      }
      buffer = tempBuffer;
   }
   // You could also use System.arraycopy() and str.getChars() method to impelement both insert and erase methods.
   // getChars(int srcBeginIndex, int srcEndIndex, char[] destination, int dstBeginIndex)
   // arraycopy (Object src, int srcPos, Object dest, int destPos, int length)
   /*
        System.arraycopy(buffer, 0, tempBuffer, 0, index);
        str.getChars(0, str.length(), tempBuffer, index);
        System.arraycopy(buffer, index, tempBuffer, index + str.length(), buffer.length - index);
   */
   
 // another implementation
 /* void insert(int index, String str)
   {
      String tempBuffer = "";
      if (index < 0)
            return;
      if (index > buffer.length - 1)
      {
         tempBuffer = new String(buffer) + str; // copy constrcutor will take the array of char buffer and convert it to string.
         buffer = tempBuffer.toCharArray();
         return;
      }
   
      for (int i_buffer = 0; i_buffer < buffer.length ; i_buffer++)
      {
         if (i_buffer == index)
            tempBuffer += str;
     
         tempBuffer += buffer[i_buffer];
      }
      buffer = tempBuffer.toCharArray();
   } */
}
// the implementation of insert and erase with array is relatively faster than the implementation with string.
// toCharArray cost more time since it copy the content of the string, but anyway the difference in the speed is small.
// I tried to help you get familiar with the array of char, but you should better use the implementation with string since it is easier.
