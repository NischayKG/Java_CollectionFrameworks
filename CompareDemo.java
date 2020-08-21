import java.util.*;
class CompareDemo
{
    public static void main(String arg[])
    {
        System.out.println("A".compareTo("B"));
        System.out.println("Z".compareTo("A"));
        System.out.println("A".compareTo("A"));
        System.out.println("A".compareTo(null));
    }
}