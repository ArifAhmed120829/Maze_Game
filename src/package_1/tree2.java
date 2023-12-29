package package_1;

public class tree2 {
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data = data;
		}
	}
	static class linked{
		Node head;
		Node root;
		
		void push(int d) {
			head = traverse(head,d);
		}
		Node traverse(Node head, int val) {
			if(head != null && root == null) root = head;
			if(head == null) return new Node(val);
			else if(head.data>=val) head.left = traverse(head.left,val);
			else if(head.data<=val) head.right = traverse(head.right,val);
			return head;
		}
	}
	public static void main(String[] args) {
		int[] arr = {2,1,3,0,1};
		linked ll = new linked();
		for(int val:arr) ll.push(val);
		show(ll.root);

	}
	//In order
	/*
	private static void show(Node root) {
		if(root != null) {
			show(root.left);
			System.out.println(root.data);
			show(root.right);
		}
		
	}*/
	//Pre-order
	
		private static void show(Node root) {
			if(root != null) {
				System.out.println(root.data);
				show(root.left);
				show(root.right);
			}
			
		}//
	//Post-order
	/*
	private static void show(Node root) {
		if(root != null) {
			show(root.left);
			show(root.right);
			System.out.println(root.data);
		}
		
	}
	*/

}
