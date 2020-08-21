import java.util.*;

public class ArraysSortDemo
{
    public static void main(String args[])                   
    {
        int[] a={10,5,20,11,6};
        System.out.println("Before sorting :");
        for(int a1:a)
        {
            System.out.println(a1);
        }
        Arrays.sort(a);
        System.out.println("After Sorting :");
        for(int a1:a)
        {
            System.out.println(a1);
        }

        String[] s={"A","z","B"};
        System.out.println("Before sorting :");
        for(String a2:s)
        {
            System.out.println(a2);
        }
        Arrays.sort(s);
        System.out.println("After Sorting :");
        for(String a2:s)
        {
            System.out.println(a2);
        }

        Arrays.sort(s,new MyComparator());
        System.out.println("After Sorting by customized sorting :");
        for(String a3:s)
        {
            System.out.println(a3);
        }
        
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