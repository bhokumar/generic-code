package Algo;

public class TreeM {

	public static void main(String[] args) {
		TreeM t = new TreeM();
		Node n3 = t.new Node(null, null, "5");
		Node n4 = t.new Node(null, null, "3");
		Node n5 = t.new Node(null, null, "2");
		Node n6 = t.new Node(null, null, "9");
		Node n1 = t.new Node(n3, n4, "10");
		Node n2 = t.new Node(n5, n6, "1");
		Node n = t.new Node(n1, n2, "8");
		
		Node tt = t.bst(n, null, 0);
		
		System.out.println(tt);
	}
	
	
	private Node bst(Node root, Node parent, int st)
	{
		if(root == null )
			return null;
		
		if(parent != null )
		{
			if(st == 0 && (Integer.parseInt(root.val) > Integer.parseInt(parent.val)))
			{
				String dt = root.val;
				root.val = parent.val;
				parent.val = dt;
			}
			
			if(st == 1 && (Integer.parseInt(root.val) < Integer.parseInt(parent.val)))
			{
				String dt = root.val;
				root.val = parent.val;
				parent.val = dt;
			}
		}
		
		bst(root.left, root, 0);
		bst(root.right, root, 1);
		
		return root;
	}
	
	private class Node
	{
		Node left;
		Node right;
		String val;
		
		public Node(Node left, Node right, String val) {
			this.left = left;
			this.right = right;
			this.val = val;
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "val = " + val + ", left = " + left + ", right = " + right;
		}
	}

}
