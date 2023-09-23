class Solution {
    public int countNegatives(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int r=n-1;
        int c=0;
        int count=0;
        while(r>=0&&c<m){
            if(grid[r][c]<0){
                r--;
                count+=m-c;
            }
            else{
                c++;
            }
            
        }
        return count;



        //Tc-o(m*n);
        // int count=0;
        // for(int i=0;i<grid.length;i++){
        //     for(int j=0;j<grid[0].length;j++){
        //         if(grid[i][j]<0){
        //             count++;
        //         }
        //     }
        // }
        // return count;
    }
}
