package minimumDepthOfBinaryTree;

public class Solution {
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
	}

	public int minDepth(TreeNode root) {
		if (root == null)
			return -1;
		return 1 + Math.min(minDepth(root.right), minDepth(root.left));
	        
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		TreeNode t = s.new TreeNode (3);
		t.left = s.new TreeNode (1);
		t.left.right =  s.new TreeNode (2);
		t.right = s.new TreeNode (12);

		t.right.left =  s.new TreeNode (2);
		t.right.right =  s.new TreeNode (2);

		t.left.left =  s.new TreeNode (2);
		System.out.println(s.minDepth(t));
		

	}

}
