package BearishTrade;


import java.util.Map.Entry;

import java.util.TreeMap;

public class Test3 {
	
	static TreeMap<Integer, Employee> hmp = new TreeMap<Integer,Employee>();
	
	public static void main(String agrs[]) {
		
		
	
	Employee E1 =new Employee();
	E1.setAge("28");
	E1.setName("Rahul");
	E1.setDesignation("QA Engineer",hmp,E1);
	
	
	
	Employee E2 =new Employee();
	E2.setAge("26");
	E2.setName("Shailesh");
	E2.setDesignation("QA Engineer",hmp,E2);
	
	Employee E3 =new Employee();
	E3.setAge("25");
	E3.setName("Sumit");
	E3.setDesignation("QA Engineer",hmp,E3);
	
	for(Entry<Integer, Employee> entry:hmp.entrySet()) {
		int key=entry.getKey();  
        Employee b=entry.getValue();  
        System.out.println(key+" Details:");  
        System.out.println(b.getName()+" "+b.getDesignation()+" "+b.getAge()); 
	}
	
	
}
}
