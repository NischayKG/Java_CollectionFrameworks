import java.util.*;
class ListIteratorDemo
{
    public static void main(String arg[])
    {
        LinkedList ll=new LinkedList();
        ll.add("bala");
        ll.add("venki");
        ll.add("chiru");
        ll.add("nag");
        System.out.println(ll);
        ListIterator ltr=ll.listIterator();
        while(ltr.hasNext())
        {
            String str=(String)ltr.next();
            if(str.equals("venki"))
                ltr.remove();
            else if(str.equals("nag"))
                ltr.add("chetan");
            else if(str.equals("chiru"))
                ltr.set("charan");
        }
        System.out.println(ll);
    }
}