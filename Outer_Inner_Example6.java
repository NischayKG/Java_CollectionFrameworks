import java.util.*;
class Outer_Inner_Example6
{
    int x=10;
    class Inner1
    {   int x=100;
        public void m1()                        //Calline inner class method using outer class instance
        {
            int x=1000;
            System.out.println("x of method="+x);
            System.out.println("x of InnerClass="+this.x);    //can aslo be written as Sopln(Inner.this.x)
            System.out.println("x of OuterClass="+Outer_Inner_Example6.this.x);
        }
    }
    public static void main(String[] args)  
    {
        
        new Outer_Inner_Example6().new Inner1().m1();
    }

}