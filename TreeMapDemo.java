import java.util.*;

public class TreeMapDemo
{
    public static void main(String args[])                   
    {
        TreeMap m=new TreeMap();
        m.put(100,"zzz");
        m.put(103,"yyy");
        m.put(101,"xxx");
        m.put(104,106);
        //m.put("FFFF","xxx");  C.C.E
        //m.put(null,"xxx");    N.P.E
        System.out.println(m);

    }
}