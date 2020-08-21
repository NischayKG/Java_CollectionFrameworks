enum Beer
{

    KF,KO,RC,FO;
    Beer()
    {
        System.out.println("Constructor");
    }
}
class EnumerationDemo6
{
    public static void main(String[] arr)
    {
        Beer b=Beer.KF; 
        System.out.println("In main");
        
    }
}