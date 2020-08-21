import java.util.*;

public class CollectionSortDemo_customized_sorting
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
        Collections.sort(al,new MyComparator());
        System.out.println("After Sorting :"+al);
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