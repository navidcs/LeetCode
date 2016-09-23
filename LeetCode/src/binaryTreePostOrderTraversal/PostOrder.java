package binaryTreePostOrderTraversal;

import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

public class PostOrder {

	public List<Integer> postOrder(TreeNode root) {
		List<Integer> al = new ArrayList<Integer>();
		Stack<TreeNode> s = new Stack<TreeNode>();
		TreeNode mark = new TreeNode(Integer.MIN_VALUE);
		TreeNode temp = root;
		while (temp != null) {
			s.push(temp);
			temp = temp.left;
		}
		while (!s.empty()) {
			if (s.peek() != mark) {
				temp = s.peek().right;
				s.push(mark);
				while (temp != null) {
					s.push(temp);
					temp = temp.left;
				}
			} else {
				s.pop();
				al.add(s.pop().val);

			}

		}

		return al;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
