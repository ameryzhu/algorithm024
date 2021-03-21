class Solution {
    public int climbStairs(int n) {
        int num1 = 1;
        int num2 = 2;
        if(n<=2){
            return n;
        }
        int result = 0;
        for(int i = 0;i<n-2;i++){
            result = num1+num2;
            num1 = num2;
            num2 = result;
        }
        return result;
    }
}
