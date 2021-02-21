class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        recursion(nums,new ArrayList<Integer>(),results);
        return results;
    }

    void recursion(int[]nums,List<Integer> result,List<List<Integer>>results){
        if(result.size()==nums.length){
            results.add(new ArrayList<Integer>(result));
            return ;
        }
        //decision tree, add or not add    
        for(int i = 0 ; i < nums.length; i ++){
            if(!result.contains(nums[i])){
                result.add(nums[i]);
                recursion(nums,result,results);
                result.remove(result.size()-1);
            }else{
                continue;
            }
            
        }
    }
}