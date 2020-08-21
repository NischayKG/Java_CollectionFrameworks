import java.util.*;
class Outer_Inner_Example5
{
    int x=10;
    static int y=20;
    class Inner1
    {
        public void m1()                        //Calline inner class method using outer class instance
        {
            System.out.println("x="+x+" y="+y);
        }
    }
    public static void main(String[] args)  
    {
        
        new Outer_Inner_Example5().new Inner1().m1();
    }

}