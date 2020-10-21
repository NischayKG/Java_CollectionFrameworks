import java.util.*;
import java.util.io;

class CursorDemo
{
    public static void main(String arg[])
    {
        Vector vtr=new Vector();
        Enumeration enm=v.elements();
        Iterator itr=vtr.iterator();
        ListIterator ltr=vtr.listIterator();
        System.out.println(enm.getClass().getName());
        System.out.println(itr.getClass().getName());
        System.out.println(ltr.getClass().getName());
    }
}
