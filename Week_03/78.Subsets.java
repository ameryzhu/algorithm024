class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        backtracing(nums,new ArrayList<Integer>(),results,0);
        return results;
    }

    public void backtracing(int[]nums,List<Integer> result,List<List<Integer>> results,int start){
        if(start==(nums.length)){
            results.add(new ArrayList<Integer>(result));
            return ;
        }
        backtracing(nums,result,results,(start+1));
        result.add(nums[start]);
        backtracing(nums,result,results,(start+1));
        result.remove(result.size()-1);
    }
}