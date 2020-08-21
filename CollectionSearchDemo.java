import java.util.*;

public class CollectionSearchDemo
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
     // Collections.reverse(al);         //used to reverse the list
        System.out.println("After Sorting :"+al);
        System.out.println(Collections.binarySearch(al,"Z"));
        System.out.println(Collections.binarySearch(al,"J"));
    }
}