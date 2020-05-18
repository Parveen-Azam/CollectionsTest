package CollectionTest;

import java.util.HashSet;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // Create a HashSet
	     HashSet<String> hset = new HashSet<String>();
	 
	     //add elements to HashSet
	     hset.add("Element1");
	     hset.add("Element2");
	     hset.add("Element3");
	     hset.add("Element4");
	     hset.add("Element5");
	     hset.add("Element6");
	     hset.add("Element7");
	     hset.add("Element8");
	     hset.add("Element9");
	     hset.add("Element10");
	   
	     // Displaying HashSet elements
	     System.out.println("HashSet contains: "+ hset);
	 
	     // Creating an Array
	     String[] array = new String[hset.size()];
	     hset.toArray(array);
	 
	     // Displaying Array elements
	     System.out.println("Array elements: ");
	     for(String temp : array){
	        System.out.println(temp);
	     }

	}

}
