class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max=0;
        int sum=0;
        for(int val:weights){
            sum+=val;
            max=Math.max(max,val);
        }
        if(days==weights.length){
            return max;
        }
        int low=max;
        int high=sum;
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(ispossible(weights,mid,days)==true){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;

    }
    private boolean ispossible(int []wt,int mid,int days){
        int d=1;
        int sum=0;
        for(int i=0;i<wt.length;i++){
            sum+=wt[i];
            if(sum>mid){
                d++;
                sum=wt[i];
            }
        }
        return d<=days;



    }
}
