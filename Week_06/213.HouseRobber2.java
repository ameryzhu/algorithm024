class Solution {
    public int rob(int[] nums) {
        if( nums.length == 1 ){
            return nums[0];
        }
        if(nums.length == 2){
            return Math.max(nums[0],nums[1]);
        }
        int a = robFromIndex(nums,0,nums.length - 2);
        int b = robFromIndex(nums,1,nums.length -1);
        return Math.max(a,b);
    }

    public int robFromIndex(int []nums,int start,int end){
        int dp[] = new int[end-start+2];
        dp[start] = nums[start];
        dp[start+1] = Math.max(nums[start],nums[start+1]);
        for(int i = start+2; i <= end; i ++){
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        return dp[end];
    }
}
