package main;

import java.util.ArrayList;
import java.util.List;

public class Counter {

	
	public String finals="";
	
	public String counters(String s) {
		
		
		List<String> a = new ArrayList<String>();
		List<Integer> b =new ArrayList<Integer>();
		
		for (int i =0; i<s.length();i++) {
			int counter=0;
			boolean isProcessed=false;
			if(a.size()==0) {
				a.add(String.valueOf(s.charAt(i)));
				isProcessed=true;
				for(int m=0;m<s.length();m++) {
					if(s.charAt(i)==s.charAt(m)) {
						counter++;
					}
				}
				b.add(counter);
			}
			
			for(int j =0;j<a.size();j++) {
				if(String.valueOf(s.charAt(i)).matches(a.get(j))) {
					isProcessed=true;
				}
			}
			
			if(!isProcessed) {
				a.add(String.valueOf(s.charAt(i)));
				
				for(int m=0;m<s.length();m++) {
					if(s.charAt(i)==s.charAt(m)) {
						counter++;
					}
				}
				b.add(counter);
			}
		}
		for(int i=0;i<a.size();i++) {
			finals=finals+a.get(i)+b.get(i);
		}
		
		return finals;
	}
	
	
	public static void main (String args[]) {
		
		
		String s= "Monalissaaaaa";
		System.out.println(new Counter().counters(s));
		
	}
}
