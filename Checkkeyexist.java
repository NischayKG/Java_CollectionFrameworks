import java.util.*; 
class Checkkeyexist 
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
           value[i]=in.nextInt();
           hmap.put(key[i], value[i]);
        }

		Integer search_key= in.nextInt();
		Iterator<Map.Entry<Integer, Integer> > 
		iterator = hmap.entrySet().iterator(); 
		boolean Iskeyexist = false; 
		while (iterator.hasNext()) { 
            Map.Entry<Integer, Integer> entry = iterator.next(); 
			if (search_key == entry.getKey()) { 
				Iskeyexist = true; 
			} 
		} 
        if(Iskeyexist)
		  System.out.println("True");
        else
          System.out.println("False");
	} 
}
