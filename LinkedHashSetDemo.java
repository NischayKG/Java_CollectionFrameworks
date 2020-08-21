import java.util.*;
class LinkedHashSetDemo
{
    public static void main(String arg[])
    {
        LinkedHashSet lhs=new LinkedHashSet(); //default size = 16 & default field_ratio/Load_factor = 0.75
        System.out.println(lhs.size());
        lhs.add("B");
        lhs.add("C");
        lhs.add("D");
        lhs.add("Z");
        lhs.add(null);
        lhs.add(10);
        System.out.println(lhs.size());
        System.out.println(lhs.add("Z"));
        System.out.println(lhs);
    }

}