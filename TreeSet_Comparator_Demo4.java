import java.util.*;
import java.lang.*;
import java.io.*;

class TreeSet_Comparator_Demo4
{
    public static void main(String arg[])
    {
        TreeSet t=new TreeSet(new MyComparator());
        t.add("raju");
        t.add("subh");
        t.add("raja");
        t.add("ganp");
        t.add("rama");
        System.out.println(t);
    }
}

class MyComparator implements Comparator
{
    public int compare(Object obj1,Object obj2)
    {
        String s1=obj1.toString();
        String s2=obj2.toString();

        return s2.compareTo(s1);
  //    return -s1.compareTo(s2);   //same as above and give in reverse order of dictionary...
    }
}

