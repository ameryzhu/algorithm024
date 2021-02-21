class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int start = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]!=0){
                swap(nums,i,start++);
            }
        }
    }

    private void swap(int []nums,int from,int to){
        int temp = nums[to];
        nums[to] = nums[from];
        nums[from] = temp;
    }

}