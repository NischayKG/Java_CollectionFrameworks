enum EnumerationDemo5
{
    Star,Guppy,Gold; 
    public static void main(String[] arr)
    {
        System.out.println("Enum main");
        EnumerationDemo5 f[]=EnumerationDemo5.values();
        for(EnumerationDemo5 f1:f)
        {
            System.out.println(f1+"...."+f1.ordinal());
        }
    }
}