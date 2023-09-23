class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;
        int l=0;
        int r=n-1;
        while(l<r){
            int mid=l+(r-l)/2;
            if(arr[mid]<arr[mid+1]){
                l=mid+1;
            }
            else{
                r=mid;
            }
        }
        return l;
   
    }
}
//approach-1

// int index=0;
        // int high=0;
        // for(int i=0;i<arr.length-1;i++){
        //     high=Math.max(high,arr[i]);

        // }
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==high){
        //         index=i;
        //     }
        // }
        // return index;
