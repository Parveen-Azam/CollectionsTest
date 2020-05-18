package CollectionTest;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;


public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashMap<Integer, String>hmap = new HashMap<Integer, String>();
		
		hmap.put(54,"A");
		hmap.put(88,"Z");
		hmap.put(04,"F");
		hmap.put(23,"H");
		hmap.put(0,"W");
		hmap.put(7,"P");
		
		System.out.println("Before Sorting:");
		
		Set set=hmap.entrySet();
		Iterator iterator=set.iterator();
		
		while(iterator.hasNext())
		{
			Map.Entry me = (Map.Entry)iterator.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
			
		}
		
		Map<Integer, String> map=new TreeMap<Integer, String>(hmap);
		System.out.println("After Sorting: ");
		 
		Set set2 = map.entrySet();
		
		Iterator iterator2=set2.iterator();
		
		while(iterator2.hasNext())
		{
			Map.Entry me2=(Map.Entry)iterator2.next();
			System.out.print(me2.getKey() + ": ");
			System.out.println(me2.getValue());
			
			
		}
		
		
		
	}

}
