enum Beer
{
    KF,KO,RC,FO;
}
class EnumerationDemo3
{
    public static void main(String[] arr)
    {
        Beer b=Beer.KF;
        switch(b)
        {
            case KF:
            System.out.println("It is KF");
            break;
            case KO:
            System.out.println("It is KO");
            break;
            case RC:
            System.out.println("It is RC");
            break;
            case FO:
            System.out.println("It is FO");
            break;

           /* case Mahua:
            System.out.println("It is Mahua");         //C:E as mahua not an ENUM object 
            break;  */
        }

    }
}