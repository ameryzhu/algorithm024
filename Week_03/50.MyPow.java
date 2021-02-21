class Solution {
    public double myPow(double x, int n) {
        if(n==0){
            return 1;
        }
        double value = myPow(x,n/2);
        if(n>0){
            if(n%2==0){
                return value*value;
            }else{
                return x*value*value;
            }            
        }else{
            if(n%2==0){
                return value*value;
            }else{
                return (1.0/x)*value*value;
            } 
        }
    }
}