class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int i = 0;
        if(nums == null || nums.length < 2 || k == 0)
            return false;
        HashSet<Integer> hset = new HashSet<Integer>();
        for(int j = 0; j < nums.length; j++) {
            if(!hset.add(nums[j])){
                return true;
            }
            if(hset.size() >= k+1){
                hset.remove(nums[i++]);
            }
        }
        return false;
    }
}