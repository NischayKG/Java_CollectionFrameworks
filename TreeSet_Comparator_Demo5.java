import java.util.*;
import java.lang.*;
import java.io.*;

class TreeSet_Comparator_Demo5
{
    public static void main(String arg[])
    {
        TreeSet t=new TreeSet(new MyComparator());
        t.add(new StringBuffer("P"));
        t.add(new StringBuffer("E"));
        t.add(new StringBuffer("Z"));
        t.add(new StringBuffer("A"));
        t.add(new StringBuffer("C"));
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
    }
}
