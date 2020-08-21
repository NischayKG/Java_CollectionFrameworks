import java.util.*;
class Generic_Area_And_Non_Generic_area
{
    public static void main(String[] args)   //Generic Area
    {
        ArrayList<String> l=new ArrayList<String>();
        l.add("Durga");
        l.add("Guru");
    //  l.add(10);        // C:E
        m1(l);           //non-generic method calling
    //  l.add(10);        // C:E
        System.out.println(l);
    }
    public static void m1(ArrayList l)  //Non-Generic Area
    {
        l.add(10);
        l.add(6.6);
        l.add(true);
        l.add("hero");
    }
}
