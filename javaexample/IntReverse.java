package leetcode;

public class IntReverse {
	public static void main(String[] args) {
		int num = 1;
		
		System.out.println(reverseNum(num));
		
	}
	
	static int reverseNum(int num) {		
		boolean neg = num <0;
		if(neg)
			num = num * -1;
		
		if(num ==0) {
			return 0;
		}
		
		long reverse = 0;		
		while(num > 0) {
			int remainder = num % 10;
			reverse  = reverse * 10 + remainder;            
			num = num/10;			
		}
		
		if(reverse > Integer.MAX_VALUE) {
			return  0;
		}
		return neg? (int)reverse*-1: (int)reverse;
		
	}

}
