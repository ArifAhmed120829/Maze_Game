package package_1;
import java.util.*;
//beecrowd problem no 1910

public class helpClotilde {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s,d,e,e1;
		ArrayList<ArrayList<Integer>> dlist = new ArrayList<>();
		ArrayList<Integer> l = new ArrayList<>();
		
		for(;;) {
			 s = in.nextInt();//3
			 d = in.nextInt();//8
			 e = in.nextInt();//2
			 
			 if(s==0 && d == 0 && e == 0) break;
			 
			 for(int i =0; i<e; i++) {
				 e1 = in.nextInt();//4,5
				 l.add(e1);
			 }
			 dlist.add(l);
			 System.out.println("Total "+dlist.size()+" List");
			 int x = 0;
			 System.out.println("Number of elements is " +dlist.get(x).size());
			 x++;
			 
			 
		}
	}

}
