import java.util.*;

public class HashMapDemo
{
    public static void main(String[] args)                   //   O/P
    {
        HashMap m=new HashMap();
        m.put("chiranjeevi",700);
        m.put("balaiah",800);
        m.put("venkatesh",200);
        m.put("nagarjuna",500);
        System.out.println(m);                         //{balaiah=800, chiranjeevi=700, venkatesh=200, nagarjuna=500}
        System.out.println(m.put("chiranjeevi",1000)); //700
        Set s=m.keySet();           //to get all keys
        System.out.println(s);                         //[balaiah, chiranjeevi, venkatesh, nagarjuna]                       
        Collection c=m.values();// to get all values
        System.out.println(c);                         //[800, 1000, 200, 500]
        Set s1=m.entrySet(); //to get all entry objects
        System.out.println(s1);                        //[balaiah=800, chiranjeevi=1000, venkatesh=200, nagarjuna=500]
        Iterator itr=s1.iterator();
        while(itr.hasNext())
        {
            Map.Entry m1=(Map.Entry)itr.next();
            System.out.println(m1.getKey()+"===="+m1.getValue());
            if(m1.getKey().equals("nagarjuna"))
            {
                m1.setValue(7000000);
            }
        } 
        System.out.println("======================================");
      
        System.out.println(m);
    }
    
}