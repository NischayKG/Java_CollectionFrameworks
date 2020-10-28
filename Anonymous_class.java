import java.util.*;
import java.io.*;
class popcorn
{
    public void taste()
    {
        System.out.println("Salty");
    }
}
class Anonymous_class
{
    public static void main(String srr[])
    {
        popcorn p1=new popcorn()
        {
            public void taste()
            {
                System.out.println("spicy");
            }
        };
        p1.taste();
        System.out.println("The name of p1 class is "+p1.getClass().getName());

        popcorn p2=new popcorn();
        p2.taste();
        System.out.println("The name of p2 class is "+p2.getClass().getName());

        popcorn p3=new popcorn()
        {
            public void taste()
            {
                System.out.println("sweet");
            }
        };
        p3.taste();
        System.out.println("The name of p3 class is "+p3.getClass().getName());

    }
}
