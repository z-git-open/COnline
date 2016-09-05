package Tree;

import common.TreeNode;

/*104. Maximum Depth of Binary Tree

Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Subscribe to see which companies asked this question

https://leetcode.com/problems/maximum-depth-of-binary-tree/
*/
public class _104_Max_Depth_of_Binary_Tree {

	public class Solution {
		public int maxDepth(TreeNode root) {
			// special
			if (root == null)
				return 0;
			// general flow
			return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
		}
	}
}
