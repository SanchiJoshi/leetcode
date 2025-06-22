/*class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2]; 
        for(int i=0; i< numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                if(numbers[i]+numbers[j] == target){
                    res[0] = i+1;
                    res[1] = j+1;
                    return res;
                }
            }
        }
        return res;
    }
}
*/

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right= numbers.length-1;
        while (numbers[left]+numbers[right]!=target){
            if (numbers[left]+numbers[right]<target){
                left++;
            }else{
                right--;
                }
            }
        return new int[] {left+1, right+1};
    }
}