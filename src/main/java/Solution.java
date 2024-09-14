class Solution {
    public int longestSubarray(int[] nums) {
        int max = nums[0];
        int count = 1;
        int res  = 1;
        
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > max) {
                max = nums[i];
                count = 1;
                res = 1;
            }else if(nums[i] == max && nums[i] == nums[i - 1]) {
                count++;
                res = Math.max(count, res);
            }else if(nums[i] == max){
                count = 1;
            }else {
                count = 0;
            }
            
        }

        return res;
    }
}