import java.util.*;
class Outer_Inner_Example3               
{   class Inner
    {
        public void m2()                        //Calline inner class method using outer class instance
        {
            System.out.println("Inner Class");
        }
    }
    public void m1()
    {
        Inner i=new Inner();
        i.m2();   
    }
    public static void main(String[] args)  
    {
        Outer_Inner_Example3  o=new Outer_Inner_Example3();
        o.m1();
    }
}