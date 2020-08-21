import java.util.*;
class TreeSet_Comparator_Demo3
{
    public static void main(String arg[])
    {
        TreeSet t=new TreeSet(new MyComparator());
        t.add(10);
        t.add(0);
        t.add(15);
        t.add(20);
        t.add(5);
        System.out.println(t);
    }
}

class MyComparator implements Comparator
{
    public int compare(Object obj1,Object obj2)
    {
        Integer I1=(Integer)obj1;
        Integer I2=(Integer)obj2;
       
     /*   if(I1<I2)
            return +1;
        else if(I1>I2)
            return -1;
        else
            return 0;  */
        return I2.compareTo(I1);        // Descending order in ! line...instead of above if else...
        // return -I1.compareTo(I2);    //Descending order in ! line...instead of above if else...
        //return I1.compareTo(I2);        //This will return in ascending order...in a manual fashion...
        //return -I2.compareTo(I1);        //This will return in ascending order...in a manual fashion...
    }
}