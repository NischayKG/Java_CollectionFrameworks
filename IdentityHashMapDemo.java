import java.util.*;

public class IdentityHashMapDemo
{
    public static void main(String[] args)                   //   O/P
    {
        IdentityHashMap m=new IdentityHashMap();
        Integer i1=new Integer(10);
        Integer i2=new Integer(10);

        m.put(i1,"pavan");
        m.put(i2,"kalyan");

        System.out.println(m);
    }
}

