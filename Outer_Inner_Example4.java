import java.util.*;
class Outer1
{
    class Inner1
    {
        public void m1()                        //Calline inner class method using outer class instance
        {
            System.out.println("Inner Class");
        }
    }
}
class Outer_Inner_Example4               
{   
    public static void main(String[] args)  
    {
        Outer1 o=new Outer1();
        Outer1.Inner1 i=o.new Inner1();
        i.m1();
    }
}