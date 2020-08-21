import java.util.*;
class StackDemo
{
    public static void main(String srr[])
    {
        Stack s=new Stack();
        s.add("A");
        s.add("B");
        s.add("C");
        System.out.println(s);
        System.out.println(s.search("A"));
        System.out.println(s.search("Z"));

    }
}