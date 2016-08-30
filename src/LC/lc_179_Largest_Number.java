package LC;

public class lc_179_Largest_Number {
	public String largestNumber(int[] nums) {
        //special 
        if(nums == null || nums.length ==0)
            return "";
            
        //general work flow
        mergeSort(nums, 0, nums.length-1);
        String result = "";
        for(int x : nums){
            result += x;
        }
        while(result.startsWith("0")) result = result.substring(0);
        return result;
    }
    
    void mergeSort(int[] nums, int left, int right){
        if(left >= right) return;
        int mid = left + (right - left)/2;
        mergeSort(nums, left, mid);
        mergeSort(nums, mid+1, right);
        merge(nums, left, mid, right);
    }
    
    void merge(int[] nums, int left, int mid, int right){
        int i = left; int j = mid+1;
        int[] sorted = new int[right-left+1];
        int sortedIdx = 0;
        while(i <= mid && j <= right){
            if(isFirstGreater(nums[i], nums[j])){
                sorted[sortedIdx++] = nums[i++];
            }
            else{
                sorted[sortedIdx++] = nums[j++];
            }
        }
        while(i <= mid) sorted[sortedIdx++] = nums[i++];
        while(j <= right) sorted[sortedIdx++] = nums[j++];
        copy(sorted, nums, left);
    }
    
    void copy(int[] sorted, int[] nums, int start){
        for(int x : sorted){
            nums[start++] = x;
        }
    }
    
    
    boolean isFirstGreater(int first, int second){
        String x = ""+first;
        String y = ""+second;
        int length = x.length() + y.length();
        String xy = x+y;
        String yx = y+x;
        for(int i = 0; i < length; i++){
            if(xy.charAt(i) - yx.charAt(i) > 0)
                return true;
            else if(xy.charAt(i) - yx.charAt(i) < 0)
                return false;
        }
        return true;
    }

}
