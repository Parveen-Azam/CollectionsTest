package CollectionTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Employee{
	
	int age, salary,Jdate;
    String name;
    public Employee()
    {
    	
    }
    public Employee(int age, String name, int salary, int Jdate) {
            this.age=age;
            this.name = name;
            this.salary=salary;
            this.Jdate=Jdate;
            
    }
    public String toString() {
           return this.age + " " + this.name + " " + this.salary + " " + this.Jdate;
          }
    }
    class Sortbyroll implements Comparable<Employee> {
     
		public int compareTo(Employee a, Employee b) {
			
			return a.age - b.age;
		}
   }
   class Sortbyname implements Comparator<Employee> {
          public int compare(Employee a, Employee b) {
         return a.name.compareTo(b.name);
  }
          class Sortbysalary implements Comparator<Employee> {
              public int compare(Employee a, Employee b) {
             return a.salary - b.salary;
}

          }}


