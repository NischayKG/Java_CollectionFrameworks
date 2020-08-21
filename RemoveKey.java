import java.util.*; 
class RemoveKey 
{ 
  public static void main(String[] args) 
  { 
    HashMap <Integer,Integer> hmap = new HashMap<Integer,Integer>();
    Scanner in = new Scanner(System.in);
    Integer n = in.nextInt();
    int key[] = new int[n];
    int value[] = new int[n];
    for(int i=0;i<n;i++)
      key[i] = in.nextInt();
    for(int i=0;i<n;i++)
    {
      value[i] = in.nextInt();
      hmap.put(key[i], value[i]);
    }
    Integer keyToBeRemoved = in.nextInt();
    Iterator<Map.Entry<Integer, Integer> > 
      iterator = hmap.entrySet().iterator(); 
    while (iterator.hasNext()) 
    { 
      Map.Entry<Integer, Integer> entry = iterator.next(); 
      if (keyToBeRemoved == entry.getKey()) 
      { 
        iterator.remove(); 
      } 
    } 
    System.out.print("{");
    iterator = hmap.entrySet().iterator(); 
    for(int i=0;i<n-2;i++)
    {
      Map.Entry<Integer, Integer> entry = iterator.next(); 
      System.out.print(entry.getKey()+": "+entry.getValue()+", ");
    }
    if(n>1)
    {
      Map.Entry<Integer, Integer> entry = iterator.next(); 
      System.out.print(entry.getKey()+": "+entry.getValue());
    }
    System.out.println("}");
  } 
}