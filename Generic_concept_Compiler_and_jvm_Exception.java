import java.util.*;
class Generic_concept_Compiler_and_jvm_Exception
{                                             //Read the below line to get the worth of this program
    public static void main(String[] args)   //At compile time at the end from RHS, <String> i.e generic will be removed and at run time hence, no error will be there...
    {
        ArrayList l=new ArrayList<String>();
        l.add("Durga");
        l.add("Guru");
        l.add(10);  
        l.add(true);
        System.out.println(l);
    }
} 