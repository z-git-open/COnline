package Tree;

import common.TreeNode;

/*Invert a binary tree.

4
/   \
2     7
/ \   / \
1   3 6   9

to

4
/   \
7     2
/ \   / \
9   6 3   1
*/

public class _226_Invert_Binary_Tree {

	public TreeNode invertTree(TreeNode root) {
		// special
		if (root == null)
			return null;

		// general flow
		TreeNode left = root.left;
		TreeNode right = root.right;
		root.left = invertTree(right);
		root.right = invertTree(left);
		return root;
	}

}
