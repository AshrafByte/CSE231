/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Ex1;

/**
 *
 * @author A.Ashraf
 */
abstract class A  // (1) class A should be abstract since it contains abstract method.
{
   public void f1()
   {
      System.out.println("A.f1 called");
   }

   public final void f2()
   {
      System.out.println("A.f2 called");
   }

   public abstract void f3(); // (1) abstract method can only exists inside abstract class.
   // notes:- 
   // 1- abstract methods cannot be private.
   // 2- abstract methods cannot be static.
   // 3- constructor cannot be abstract (you cannot use abstract keyword with constructor).
}

class B extends A // (2) inheritied class cannot override final method.
{

   public void f1()
   {
      super.f1();
      System.out.println("B.f1 called");
   }

   /*public void f2() // (2)
   {
      super.f2();
      System.out.println("B.f2 called");
   }*/

    public void f3() 
   {
      System.out.println("B.f3 called");
   }
   // note: make sure that the overridden method has same access modifier or higher. (public > protected > package private > private)
   // for example, if f3 method access modifier in class A changed to protected.
   // then the overridden f3 method can have public or protected access modifiers, but it cannot have package private or private access modifiers 
}

// (3) concreate class that inherits abstract class should provide implementation for the abstract methods inside the abstract class (override).
// to solve this error, you can either override f3 method or changes class C to be abstract class.
abstract class C extends A 
{                          

   public void f1()
   {
      super.f1();
      System.out.println("C.f1 called");
   }
}

// note : since D inherit abstract class C that inherit abstract class A , then D should override all abstract methonds inside both A and C classes.
abstract class D extends C 
{

   public void f3()
   {
      System.out.println("D.f3 called");
   }
}

// (4) final classes cannot be inherited.
// to fix this error you can either remove final keyword from class E or delete class F.
/*final*/ class E extends D 
{
}

class F extends E // (4) final classes cannot be inherited.
{
   // note: since class D provided implementation for class A f3 abstract method, class F doesn't have to override f3.
   public void f3()
   {
      super.f3();
      System.out.println("F.f3 called");
   }
}
// extra
class m {}
abstract class n extends m // abstract class can inherit concreate class
{
   int x ; // abstract class can have data field , and you can't use abstract keyword with data fields
   static void f4 (){} // abstract class can have static method
   /*abstract static void f5(){}*/  // SYNTAX ERROR 
} 

public class Main
{

   public static void main(String[] args)
   {
      A[] ps = new A[3];
      /*ps[0] = new A();*/  // abstract classes cannot be instantiated
      ps[0] = new B();
      /*ps[2] = new C();*/  // abstract classes cannot be instantiated.
      /*ps[3] = new D();*/  // abstract classes cannot be instantiated.
      ps[1] = new E();
      ps[2] = new F();
      for (int i = 0; i < ps.length; i++)
      {
         ps[i].f1();
         ps[i].f2();
         ps[i].f3();
         System.out.println("");
      }
   }
}
// output : 
/*
   A.f1 called
   B.f1 called
   A.f2 called
   B.f3 called

   A.f1 called
   C.f1 called
   A.f2 called
   D.f3 called

   A.f1 called
   C.f1 called
   A.f2 called
   D.f3 called
   F.f3 called
*/
