class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> results = new ArrayList<String>();
        gen(n,0,0,"",results);
        return results;
    }

    public void gen(int n,int left,int right,String result,List<String> results){
        if(left+right==2*n){
            results.add(result);
            result = "";
            return ;
        }
        if(left<n)
            gen(n,left+1,right,result+"(",results);
        if(right<left)
            gen(n,left,right+1,result+")",results);
    }
}