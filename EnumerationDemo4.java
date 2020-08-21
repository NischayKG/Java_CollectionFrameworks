enum Beer
{
    KF,KO,RC,FO;
}
class EnumerationDemo4
{
    public static void main(String[] arr)
    {
        Beer b[]=Beer.values();
        for(Beer b1:b)
        {
            System.out.println(b1+"...."+b1.ordinal());
        }
    }
}