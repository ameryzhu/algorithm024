class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int maxCount = 0;
        int index = 0;
        for(int i = 0 ; i < nums.length; i ++){
            Integer count = map.get(nums[i]);
            if(count!=null){
                map.put(nums[i],++count);
                if(count>maxCount){
                    maxCount = count;
                    index = i;
                }
            }else{
                map.put(nums[i],1);
                if(maxCount==0){
                    maxCount = 1;
                    index = i;
                }
            }
        }
        return nums[index];
    }
}