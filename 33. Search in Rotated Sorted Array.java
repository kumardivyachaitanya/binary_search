class Solution {
    public int search(int[] nums, int target) {
        return mbs(nums,target,0,nums.length-1);
    }
    private int mbs(int[]arr,int target,int left,int right){
        if(left>right){
            return -1;

        }

        int mid=left+(right-left)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[left]<=arr[mid]){
            if(arr[left]<=target&&target<=arr[mid]){
                return mbs(arr,target,left,mid-1);
            }
            else{
                return mbs(arr,target,mid+1,right);
            }
        }
        else{
            if(arr[mid]<=target&&target<=arr[right]){
                return mbs(arr,target,mid+1,right);
            }
            else{
                return mbs(arr,target,left,mid-1);
            }
        }

    }
}

// approach-1
// int ans=0;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]==target){
//                 ans=i;
//                 break;
//             }
//             else{
//                 ans=-1;
//             }
//         }
//         return ans;
