import java.util.*;
class HashSetDemo
{
    public static void main(String arg[])
    {
        HashSet h=new HashSet(); //default size = 16 & default field_ratio/Load_factor = 0.75
        System.out.println(h.size());
        h.add("B");
        h.add("C");
        h.add("D");
        h.add("Z");
        h.add(null);
        h.add(10);
        System.out.println(h.size());
        System.out.println(h.add("Z"));
        System.out.println(h);
    }

}