import java.util.*;
class Employee implements Comparable
{
    String name;
    int eid;
    Employee(String name,int eid)
    {
        this.name=name;
        this.eid=eid;
    }
    public String toString() // Overriding toString method
    {
        return name+"--"+eid;
    }
    public int compareTo(Object obj2)
    {
        int eid1=this.eid;
        Employee e2=(Employee)obj2;
        int eid2=e2.eid;
        if(eid1<eid2)
            return -1;
        else if(eid1>eid2)
            return 1;
        else
            return 0;
    }
}
class ComparableComparator_natural_and_customized_in_ProgDefinedClass_Demo
{
    public static void  main(String arr[])
    {
        Employee e1=new Employee("nag",100);
        Employee e2=new Employee("bas",200);
        Employee e3=new Employee("chiru",50);
        Employee e4=new Employee("venki",150);
        Employee e5=new Employee("nag",100);
        TreeSet t=new TreeSet();
        t.add(e1);
        t.add(e2);
        t.add(e3);
        t.add(e4);
        t.add(e5);
        System.out.println(t);

        TreeSet t1=new TreeSet(new MyComparator());
        t1.add(e1);
        t1.add(e2);
        t1.add(e3);
        t1.add(e4);
        t1.add(e5);
        System.out.println(t1);   
        
    }
}
class MyComparator implements Comparator   //class defined to attain sorting based on our need i.e name
{
    public int compare(Object obj1,Object obj2)
    {
        Employee e1=(Employee)obj1;
        Employee e2=(Employee)obj2;
        String str1=e1.name;
        String str2=e2.name;
        return str1.compareTo(str2);
    }
}