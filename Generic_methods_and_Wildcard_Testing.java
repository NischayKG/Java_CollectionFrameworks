import java.util.*;
class Generic_methods_and_Wildcard_Testing
{
    public static void main(String[] args)
    {
        ArrayList<?> l1=new ArrayList<String>();                  //ok
   //   ArrayList<? extends Number> l2=new ArrayList<String>();   //Invalid as String is not child of number
        ArrayList<? extends Number> l3=new ArrayList<Integer>();  //ok as Integer=child of number
  //    ArrayList<?> l3=new ArrayList<? extends Number>();        //Invalid as without bound ...
  
        System.out.println("ok");
    }
}