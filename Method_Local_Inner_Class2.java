import java.util.*;

class Test
{
    public void m1()
    {   
        final int x=10;   //If not final then we might be getting compile time error
        class Inner
        {
            public void m2()
            {
                System.out.println("X= :"+x);
            }
        }
        Inner i=new Inner();
        i.m2();
    }
}
class Method_Local_Inner_Class2
{
    public static void main(String arr[])
    {
        Test t=new Test();
        t.m1();
    }
}