package BearishTrade;

import java.util.TreeMap;

public class Employee implements Comparable<Employee>{

	
	
	 private String age;
	 private String Name;
	 private String Designation;
	
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDesignation() {
		return Designation;
	}
	
	public void setDesignation(String designation,TreeMap List,Employee E) {
		Designation = designation;
		addToList(List,E);
	}
	
	public void addToList(TreeMap List,Employee E) {
		List.put(E.getAge(), E);
	}
	@Override
	public int compareTo(Employee employee) {
		
		return this.age.compareToIgnoreCase(employee.getAge());
	}
	
	
}
