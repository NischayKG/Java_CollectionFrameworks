import java.util.*;

public class Collection_reverse_Demo
{
    public static void main(String args[])                   
    {
        ArrayList al=new ArrayList();
        al.add(10);
        al.add(5);
        al.add(15);
        al.add(7);
        //al.add(null); //N.P.E
        //al.add(new Integer(10)); //C.C.E
        System.out.println("Before Sorting :"+al);
        Collections.sort(al);
        System.out.println("After Sorting :"+al);
        Collections.reverse(al);         //used to reverse the list
        System.out.println("After Reversing :"+al);
    }
    
}