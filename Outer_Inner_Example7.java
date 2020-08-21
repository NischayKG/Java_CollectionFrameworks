import java.util.*;
class A
{
    class B
    {
        class C
        {
            public void m1()                        //Calline inner class method using outer class instance
            {
                System.out.println("Inner Most Class-C");
            }
        }
    }
}
class Outer_Inner_Example7               
{   
    public static void main(String[] args)  
    {
    /*
    A a=new A();
    A.B b=a.new B();
    A.B.C c=b.new C();
    */
      new A().new B().new C().m1();
    }
}