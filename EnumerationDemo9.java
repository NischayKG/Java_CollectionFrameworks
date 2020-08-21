enum Color
{
    Red
    {
        public void info()
        {
            System.out.println("Dangerous Color");
        }
    },Blue,Green;
    public void info()
    {
        System.out.println("Univ. Color");
    }

}
class EnumerationDemo9
{
    public static void main(String[] arr)
    {
        Color b[]=Color.values();
        for(Color b1:b)
        {
            b1.info();
        }
    }
}