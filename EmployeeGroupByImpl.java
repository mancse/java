package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class EmployeeGroupByImpl {
	static class Employee{
		int id;
		String name;
		int age;
		public Employee(int id, String name, int age) {
			super();
			this.id = id;
			this.name = name;
			this.age = age;
		}
		public int getId() {
			return id;
		}
		public String getName() {
			return name;
		}
		public int getAge() {
			return age;
		}
	}
	public static void main(String args[]) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1,"Aman",30));
		empList.add(new Employee(2,"Anand",40));
		empList.add(new Employee(3,"Rina",35));
		empList.add(new Employee(4,"Rima",30));
		empList.add(new Employee(5,"Riya",35));
		empList.add(new Employee(6,"Riyan",30));
		empList.add(new Employee(7,"Aman",25));
		
		//Group employees based on age and list employees under each age group. 
		Map<Integer,List<Employee>> empMap = empList.stream().collect(Collectors.groupingBy(i->i.getAge()));
		empMap.forEach((key,val)->{
			System.out.println(" Age: "+key);
			val.stream().forEach(e -> System.out.println("id: "+e.id+" name: "+e.name));
			
		});
		
		System.out.println("Group by employee based on age in order: ");
		//Group employees based on age and list employees under each age group and also display result based ascending order of age
		Map<Integer,List<Employee>> orderedMap = empList.stream().collect(Collectors.groupingBy(i -> i.getAge(),TreeMap::new,Collectors.toList()));
		orderedMap.forEach((key,val)->{
			System.out.println(" Age: "+key);
			val.stream().forEach(e -> System.out.println("id: "+e.id+" name: "+e.name));
			
		});
		
	}
}
