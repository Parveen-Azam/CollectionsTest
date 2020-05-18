package CollectionTest;

import java.util.ArrayList;
import java.util.Collections;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String>arraylist =new ArrayList<String>();
		
		arraylist.add("22");
		arraylist.add("88");
		arraylist.add("66");
		arraylist.add("32");
		arraylist.add("11");
		
		System.out.println("Before Sorting :");
		for(String str: arraylist)
		{
			System.out.println(str);
		}

		Collections.sort(arraylist, Collections.reverseOrder());
		
		System.out.println("ArrayList in Descending order: ");
		
		for(String str: arraylist)
		{
			System.out.println(str);
		}
		
	}

}
