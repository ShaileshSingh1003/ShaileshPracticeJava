package BearishTrade;


import java.util.Arrays;
import java.util.List;

public class Test2 {

	public static void allPossibleWords(int Number1,int Number2, int Number3) {
		
		String result="";
		
		List<List<Character>> abc= Arrays.asList(
				Arrays.asList(),
				Arrays.asList(),
				Arrays.asList('A','B','C'),
				Arrays.asList('D','E','F'),
				Arrays.asList('G','H','I'),
				Arrays.asList('J','K','L'),
				Arrays.asList('M','N','O'),
				Arrays.asList('P','Q','R','S'),
				Arrays.asList('T','U','V'),
				Arrays.asList('W','X','Y','Z')
				);
		
		
		for (char c : abc.get(Number3)) {
			result="";
			result = c + result;
			for (char d : abc.get(Number2)) {
				result = d + result;
				for (char e : abc.get(Number1)) {
					result = e + result;
					System.out.println(result);
					result=result.substring(1);
				}
				result=result.substring(1);
			}
			
		}
		
	}
	
	
	public static void main(String agrs[]) {
		allPossibleWords(2,6,2);
	}
}
