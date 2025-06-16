class Solution {
    public int maximumDifference(int[] nums) {
        int max=-1;
        int diff=0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(nums[i] < nums[j]){
                    diff = nums[j] - nums[i];
                    if(max < diff){
                        max = diff;
                    }
                }
            }
        }
        return max;
    }
}