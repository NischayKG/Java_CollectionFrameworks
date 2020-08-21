import java.util.*;
import static java.util.Arrays.*;

public class Array_to_List_conversion_Demo
{
    public static void main(String args[])                   
    {
        String[] s={"A","Z","B"};
        List l=Arrays.asList(s);
        System.out.println(l);
        s[0]="N";
        System.out.println(l);
        l.set(1,"L");
        for(String s1:s)
            System.out.println(s1);
        //l.set(1,new Integer(10));   //Array_Store_Exception
        //l.add("xxx");               //Unsupported_Operation_Exception  
        //l.remove(2);                //Unsupported_Operation_Exception 
        
    }
}