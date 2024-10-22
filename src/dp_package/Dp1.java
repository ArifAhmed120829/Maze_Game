package dp_package;

public class Dp1 {
// naive approach vs expected approach
	public static void main(String[] args) { // 8th fib = 21
		//naive approach - recursion
		int n  = 25;
		long st = System.nanoTime();
		System.out.println(rec(n));
		long sp = System.nanoTime();
		long ms = (sp - st) / 1000000;
		System.out.println(ms + " ms");
		long st2 = System.nanoTime();
		bua(n);//bottom up approach
		long sp2 = System.nanoTime();
		long ms2 = (sp2 - st2) / 1000000;
		System.out.println(ms2 + " ms");
		
		//one is 2 ms and another is 0 ms

		
		

	}
	private static void bua(int n) {
		
		int x = 0;
		int y = 1;
		
		for(int i = 1; i<n; i++) {
			int temp = x + y;
			x = y;
			y = temp;
		}
		System.out.println(y);
}
	static int rec(int x) {
		if(x == 1) return 1;
		if(x==0) return 0;
		
		return rec(x-1) + rec(x-2);
		
	}

}
