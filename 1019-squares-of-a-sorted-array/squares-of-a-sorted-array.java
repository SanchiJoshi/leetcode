/*class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            res[i] = nums[i]*nums[i];
        }
        Arrays.sort(res);
        return res;
    }
}

class Solution{
    public int[] sortedSquares(int[] nums){
        for(int i=0; i<nums.length; i++){
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}*/

class Solution{
    public int[] sortedSquares(int[] nums){
        int i=nums.length;
        while(i-- != 0){
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
}
}