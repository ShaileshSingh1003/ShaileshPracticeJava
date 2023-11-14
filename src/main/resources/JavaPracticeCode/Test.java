package BearishTrade;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static boolean isPrimeNumber(int Num){

		Boolean flag=true;
		for(int b=Num-1;b>1;b--){
		if(Num%b ==0){
		flag=false;
		}
		}
		return flag;
		}

		public static void fibSeries(int Num){
		ArrayList<Integer> Fib = new ArrayList<Integer>();
		Fib.add(1);
		Fib.add(2);
		int Counter =2;
		Boolean bool = false;
		while (bool ==false){
		Fib.add(Fib.get(Fib.size()-1)+Fib.get(Fib.size()-2));
		
		
		if(isPrimeNumber(Fib.get(Fib.size()-1)) == true){
		Counter+=1;
		}
		if(Counter>=Num){
		bool=true;
		}}
		for (int c=0;c<Fib.size();c++){
		System.out.println(Fib.get(c));
		}}
		
		
		public static void main (String args[]) {
			fibSeries(7);
		}
}



