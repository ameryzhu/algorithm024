class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        dfs(n,k,0,new ArrayList<Integer>(),results);
        return results;
    }

    void dfs(int n, int k,int start,List<Integer> result,List<List<Integer>> results){
        if(result.size()==k){
            results.add(new ArrayList<Integer>(result));
        }
        for(int i = start; i < n; i ++){
            // if(!result.contains((i+1))){
                result.add(i+1);
                dfs(n,k,(i+1),result,results);
                result.remove(result.size()-1);
            // }else{
            //     continue;
            // }
        }
    }
}