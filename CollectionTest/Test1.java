package CollectionTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		
		hashmap.put(11, "Value1");
		hashmap.put(22, "value2");
		hashmap.put(33,"value3");
		hashmap.put(44,"value4");
		hashmap.put(55,"value5");
		
		Set entrySet =hashmap.entrySet();
		
		Iterator it = entrySet.iterator();
		
		System.out.println("HashMap Key-Value Pairs: ");
		
		while(it.hasNext())
		{
			Map.Entry me=(Map.Entry)it.next();
			
			System.out.println("Key is: "+me.getKey() + " & " + " Value is: " +me.getValue());
			
		}
		
		
		

	}

}
