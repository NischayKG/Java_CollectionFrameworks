import java.util.*;
class Outer_Inner_Example2                 
{   class Inner
    {
        public void m1()
        {
            System.out.println("Inner Class");
        }
    }    
    public static void main(String[] args)  
    {
        Outer_Inner_Example2  o=new Outer_Inner_Example2 ();
        Outer_Inner_Example2 .Inner i=o.new Inner();
        i.m1();
        /* Above code can be in 2 Lines also... View below
           Outer_Inner_Example2.Inner i=new outer_Inner_Example2().new Inner();
           i.m1(); */

        /* Above code can be in 1 Lines also... View below
           new outer_Inner_Example2().new Inner().m1(); */

    }
}