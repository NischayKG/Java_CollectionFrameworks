import java.util.*;

public class CollectionSortDemo
{
    public static void main(String args[])                   
    {
        ArrayList al=new ArrayList();
        al.add("Z");
        al.add("A");
        al.add("K");
        al.add("N");
        //al.add(null); //N.P.E
        //al.add(new Integer(10)); //C.C.E
        System.out.println("Before Sorting :"+al);
        Collections.sort(al);
        System.out.println("After Sorting :"+al);
    }
}