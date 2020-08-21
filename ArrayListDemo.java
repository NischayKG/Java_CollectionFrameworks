import java.util.*;
class ArrayListDemo
{
    public static void main(String arg[])
    {
        ArrayList l=new ArrayList();
        l.add("A");
        l.add(10);
        l.add("A");
        l.add(null);
        System.out.println(l);
        l.remove(2);
        System.out.println(l);
        l.add(2,"M"); 
        l.add("N");
        System.out.println(l);

    }
}