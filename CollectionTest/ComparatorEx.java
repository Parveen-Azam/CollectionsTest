package CollectionTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		     ArrayList<Employee> Arr = new ArrayList<Employee>();
			 Arr.add(new Employee(32," John", 3000, 10-2-2020));
		     Arr.add(new Employee(29, "kate", 2900, 2-12-2019));
			 Arr.add(new Employee(30,"Mary",4500, 3-12-2018));
			        System.out.println("Unsorted Data");
			        for (int i=0; i<Arr.size(); i++)
			        {
			              System.out.println(Arr.get(i));
			              Collections.sort(Arr, new Employee().new Sortbyroll());
			              System.out.println("nSorted data according to Employee Age");
			        }
	

    for (int i=0; i<Arr.size(); i++)
    {
          System.out.println(Arr.get(i));
          Collections.sort(Arr, new Employee().new Sortbyname());
          System.out.println("nSorted data according to Employee name");
    }
          for (int i=0; i<Arr.size(); i++)
          {
                  System.out.println(Arr.get(i));
          }

}


}
