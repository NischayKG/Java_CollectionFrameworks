import java.util.*;
interface Vehicle
{
    public int getNoOfWheels();
    class Default
    {
        public int getNoOfWheels()
        {
            return 2;
        }
    }
}
class Bus implements Vehicle
{
    public int getNoOfWheels()
    {
        return 6;
    }
}

class Default_and_Customized_Interface
{
    public static void main(String[] arf)
    {
        Vehicle.Default d=new Vehicle.Default();
        System.out.println(d.getNoOfWheels());
        Bus b=new Bus();
        System.out.println(b.getNoOfWheels());
    } 
    
}