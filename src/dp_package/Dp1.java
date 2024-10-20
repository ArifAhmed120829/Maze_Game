package dp_package;

public class Dp1 {
// naive approach vs expected approach
	public static void main(String[] args) { // 8th fib = 21
		//naive approach - recursion
		int n  = 15;
		long st = System.nanoTime();
		System.out.println(rec(n));
		long sp = System.nanoTime();
		long ms = (sp - st) / 1000000;
		System.out.println(ms + " ms");
		
		
		

	}
	static int rec(int x) {
		if(x == 1) return 1;
		if(x==0) return 0;
		
		return rec(x-1) + rec(x-2);
		
	}

}
