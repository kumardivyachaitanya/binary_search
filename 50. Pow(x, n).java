class Solution {
    public double myPow(double x, int n) {
        if(n>=0){
            return positve(x,n);
        }
        else{
            return negative(x,n);
        }
    }
    private double positve(double x,int n){
        if(n==0){
            return 1;
        }
        double smalloutput=myPow(x,n/2);
        if(n%2==0){
            return smalloutput*smalloutput;
        }
        else{
            return x*smalloutput*smalloutput;
        }
    }
    private double negative(double x,int n){
        if(n==-1){
            return 1/x;
        }
        double smalloutput=myPow(x,n/2);
        if(n%2==0){
            return smalloutput*smalloutput;
        }
        else{
            return 1/x*smalloutput*smalloutput;
        }

    }

}

//diret approach
// double ans=Math.pow(x,n);
// return ans;
