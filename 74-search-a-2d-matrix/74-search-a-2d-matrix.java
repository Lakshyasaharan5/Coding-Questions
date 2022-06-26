class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0;
        while(i<matrix.length){
            if(matrix[i][matrix[0].length-1] >= target){
                break;
            }else{
                i++;
            }
        }
        if(i>=matrix.length){
            return false;
        }
        int l=0, h=matrix[0].length-1;
        while(l<=h){
            int mid = ((h+l)/2);
            if(matrix[i][mid] == target){
                return true;
            }
            if(matrix[i][mid] > target){
                h = mid-1;
            }else{
                l = mid+1;
            }
        }
        return false;
    }
}