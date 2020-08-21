import java.util.*;
class VectorDemo1
{
    public static void main(String args[])
    {
        Vector v=new Vector(10,5);
        System.out.println(v.capacity());
        for(int i=1;i<=10;i++)
        {
            v.addElement(i);
        }
        System.out.println(v);
        v.addElement("N");
        System.out.println(v.capacity());

        
    }
}