package package_1;
import java.util.*;


public class main_code {
	static class solution{
		public int nearestExit(char[][] maze, int[] entrance) {
			return 0;
			
		}
	}

	public static void main(String[] args) {
		
		char[][] maze = {{'+','+','.','+'},{'.','.','.','+'},{'+','+','+','.'}};
		
		int[] entrance = {1,2};
				
		solution s = new solution();
		
		//number of steps in the shortest path from entrance to exit
		System.out.println(s.nearestExit(maze, entrance));
		
		
	}

}
