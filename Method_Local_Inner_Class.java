import java.util.*;

class Test
{
    public void m1()
    {
        class Inner
        {
            public void sum(int x,int y)
            {
                System.out.println("X+Y is :"+x+y);
            }
        }
        Inner i=new Inner();
        i.sum(10,20);
        i.sum(1,2);
    }
}
class Method_Local_Inner_Class
{
    public static void main(String arr[])
    {
        Test t=new Test();
        t.m1();
    }
}