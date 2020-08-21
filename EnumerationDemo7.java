enum Beer
{

    KF(70),KO(80),RC(90),FO;
    int price;
    Beer(int price) 
    {
        this.price=price;
    }
    Beer()
    {
        this.price=100;
    }
    
    public int getPrice()
    {
        return price;
    }
}
class EnumerationDemo7
{
    public static void main(String[] arr)
    {
        Beer b[]=Beer.values();
        for(Beer b1:b)
        {
           System.out.print(b1+"...."+b1.ordinal()+"...");
           System.out.println(""+b1.getPrice());
        }
    }
}