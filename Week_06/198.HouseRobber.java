class Solution {
    public int rob(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        if(nums.length == 2){
            return Math.max(nums[0],nums[1]);
        }
        int []money = new int[nums.length+1];
        money[0] = nums[0];
        money[1] = Math.max(nums[0], nums[1]);
        for(int i = 0; i <= nums.length-3 ; i ++){
            money[i+2] = Math.max(money[i+1] , money[i] + nums[i+2]);
        }
        return money[nums.length-1];
class Solution {
    public int rob(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        if(nums.length == 2){
            return Math.max(nums[0],nums[1]);
        }
        int []money = new int[nums.length+1];
        money[0] = nums[0];
        money[1] = Math.max(nums[0], nums[1]);
        for(int i = 0; i <= nums.length-3 ; i ++){
            money[i+2] = Math.max(money[i+1] , money[i] + nums[i+2]);
        }
        return money[nums.length-1];
    }
}
