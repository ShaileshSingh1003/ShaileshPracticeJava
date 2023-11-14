package main;

import java.util.ArrayList;
import java.util.List;

public class TestMCQ {
	
	/* Given an array A[] of n numbers and another number x, the task is to check whether or not there exist two elements in A[] whose sum is exactly x. */
	
	
	public boolean ifSumMatches(int[] a,int b) {
		int ab[] = null;
		for(int i =0;i<a.length;i++) {
			
			for(int j =0;j<a.length;j++) {
				
				if(a[i]+a[j]==b) {
					System.out.println(a[i]+" "+a[j]);
					return true;
				}
			}
		}
		
		
		return false;
	}
	
	
	public static void main (String args[]) {
		int a[] = { 1, 4, 45, 6, 10, -8 };
		int b=14;
		
		
		
		new TestMCQ().ifSumMatches(a,b);
	}

}
