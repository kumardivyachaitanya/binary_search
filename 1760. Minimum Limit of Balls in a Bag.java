class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int s=1;
        int e=Integer.MAX_VALUE;
        int ans=0;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(check(nums,mid,maxOperations)==true){
                ans=mid;
                e=mid-1;

            }
            else{
                s=mid+1;
            }
        }
        return ans;
    }
    private boolean check(int []n,int mid,int maxOperations){
        for(int i=0;i<n.length;i++){
            maxOperations-=(n[i]/mid);
            if(n[i]%mid==0){
                maxOperations++;
            }
        }
        return maxOperations>=0;
    }

}
