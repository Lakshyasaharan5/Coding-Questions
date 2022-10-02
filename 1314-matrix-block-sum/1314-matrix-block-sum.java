class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int[][] res = new int[mat.length][mat[0].length];
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[i].length; j++){
                int left_r = i-k>=0?i-k:0;
                int right_r = i+k<mat.length?i+k:mat.length-1;
                int left_c = j-k>=0?j-k:0;
                int right_c = j+k<mat[i].length?j+k:mat[i].length-1;
                // System.out.print(left_c+" ");
                // System.out.print(right_c+" ");
                int sum = 0;
                for(int m=left_r; m<=right_r; m++){
                    for(int n=left_c; n<=right_c; n++){
                        sum+=mat[m][n];
                    }
                }
                res[i][j] = sum;
            }
            System.out.println();
        }
        return res;
    }
}