package Algo;



public class Algosss {

	public static void main(String[] args) {
		Algosss algosss = new Algosss();
		TreeNode t = algosss.new TreeNode("t");
		TreeNode t1 = algosss.new TreeNode("t1");
		TreeNode t2 = algosss.new TreeNode("t2");
		TreeNode t3 = algosss.new TreeNode("t3");
		TreeNode t4 = algosss.new TreeNode("t4");
		TreeNode t5 = algosss.new TreeNode("t5");
		TreeNode t6 = algosss.new TreeNode("t6");
		t.left = t1;
		t.right = t2;
		t1.left = t3;
		t1.right = t4;
		t2.left = t5;
		t5.right = t6;
		
		TreeNode t7 = algosss.new TreeNode("t");
		Algosss a = new Algosss();
		System.out.println(a.lowestCommonAncestor(t, t7, t6));

	}

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		
	    if(root==null)
	        return null;
	 
	    if(root==p || root==q)
	        return root;
	 
	    TreeNode l = lowestCommonAncestor(root.left, p, q);
	    TreeNode r = lowestCommonAncestor(root.right, p, q);
	 
	    System.out.println(l + ", fg, " + r + ", fg, " + root);
	    if(l!=null&&r!=null){
	        return root;
	    }else if(l==null&&r==null){
	        return null;
	    }else{
	        return l==null?r:l;
	    }
	}
	
	private class TreeNode{
		TreeNode left;
		TreeNode right;
		
		String name;
		public TreeNode(String name) {
			this.name = name;
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return name;
		}
	}
}
