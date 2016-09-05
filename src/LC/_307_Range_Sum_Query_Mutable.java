package LC;

public class _307_Range_Sum_Query_Mutable {

	SegmentTreeNode root = null;
	
	public _307_Range_Sum_Query_Mutable(int[] nums) {
		root = buildSegmentTree(nums, 0, nums.length-1);
		
	}

	public void update(int i, int val) {
		updateSegmentTree(root, i, val);
	}

	public int sumRange(int i, int j) {
		return findSumRange(root, i, j);
	}
	
	SegmentTreeNode buildSegmentTree(int[] nums, int start, int end){
		//special
		if(start > end) return null;
		
		SegmentTreeNode root = new SegmentTreeNode(start, end);
		if(start == end) {
			root.sum = nums[start];
			return root;
		}
		int mid = (start + end)/2;
		root.left = buildSegmentTree(nums, start, mid);
		root.right = buildSegmentTree(nums, mid+1, end);
		int leftSum = (root.left == null)? 0 : root.left.sum;
		int rightSum = (root.right == null)? 0 : root.right.sum;
		root.sum = leftSum + rightSum;
		return root;
	}
	
	void updateSegmentTree(SegmentTreeNode root, int index, int value){
		//boundary check
		if(root == null || index < root.startIndex || root.endIndex < index) return;

		//special case
		if(root.startIndex == root.endIndex && root.endIndex == index){
			root.sum = value; return;
		}
		
		//general flow
		if(root.left != null && root.left.startIndex <= index && index <= root.left.endIndex)
			updateSegmentTree(root.left, index, value);
		if(root.right != null && root.right.startIndex <= index && index <= root.right.endIndex)
			updateSegmentTree(root.right, index, value);
		int leftSum = (root.left == null) ? 0 : root.left.sum;
		int rightSum = (root.right == null) ? 0: root.right.sum;
		root.sum = leftSum + rightSum;
	}
	
	int findSumRange(SegmentTreeNode root, int start, int end){
		//boundary check
		if(root == null || start > end) return 0;
		
		//special case
		if(root.startIndex == start && root.endIndex == end) return root.sum;
		
		//general flow
		if(root.left != null && end <= root.left.endIndex)
			return findSumRange(root.left, start, end);
		if(root.right != null && root.right.startIndex <= start)
			return findSumRange(root.right,start, end);
		return findSumRange(root.left, start, root.left.endIndex) + findSumRange(root.right, root.right.startIndex, end);
	}
	
	
	
	class SegmentTreeNode {
		public int startIndex;
		public int endIndex;
		public int sum;
		public SegmentTreeNode left = null;
		public SegmentTreeNode right = null;
		
		SegmentTreeNode(int start, int end){
			this.startIndex = start;
			this.endIndex = end;
		}
	}

}
