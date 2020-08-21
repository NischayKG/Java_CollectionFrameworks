import java.util.*;

public class WeekHashMapDemo
{
    public static void main(String args[])                   //   O/P
    {
        WeakHashMap m=new WeakHashMap();
      //HashMap m=new HashMap();
        Temp t=new Temp();
        m.put(t,"king");
        System.out.println(m);
        t=null;
        System.gc();
     //   Thread.sleep(5000);
        System.out.println(m);        
    }
}
class Temp
{
    public String toString()
    {
        return "temp";
    }
    public void finalize()
    {
        System.out.println("Finalize method called");
    }
}