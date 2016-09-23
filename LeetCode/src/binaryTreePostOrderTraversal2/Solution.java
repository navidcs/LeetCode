package binaryTreePostOrderTraversal2;
import java.util.List;
import java.util.ArrayList;

public class Solution {
	List<Integer> list = new ArrayList<Integer>();
    public List<Integer> postorderTraversal(TreeNode root) {
		postorderTraversalH(root);
	
        return list;
    }
    
    public void postorderTraversalH(TreeNode root) {
    	if (root.left != null) 
    		postorderTraversalH(root.left);
    	if (root.right != null) 
    		postorderTraversalH(root.right);
		
    	list.add(root.val);
		System.out.println(root.val + " is added");
    }
    
    public static void main(String[] args){
    	
    	TreeNode treeNode = new TreeNode(7);
    	TreeNode treeNodeR = new TreeNode(17);
    	TreeNode treeNodeL = new TreeNode(4);
    	treeNode.right = treeNodeR;
    	treeNode.left = treeNodeL;
    	Solution solution = new Solution();
    	solution.postorderTraversal(treeNode);
    	for (int i = 0; i < solution.list.size(); i++) {
    		System.out.println(solution.list.get(i));
//			System.out.println(list.ge);
		}
    	
    }


}
