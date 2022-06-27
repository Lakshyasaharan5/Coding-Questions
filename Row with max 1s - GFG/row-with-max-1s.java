// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int m = Integer.parseInt(inputLine[1]);
            int[][] arr = new int[n][m];
            inputLine = br.readLine().trim().split(" ");
        
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = Integer.parseInt(inputLine[i * m + j]);
                }
            }
            int ans = new Solution().rowWithMax1s(arr, n, m);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        int row = 0;
        int ones_starting_position = m-1;
        int res = 1001;
        boolean ones_present = false;
        while(row<n){
            for(int i=0; i<=ones_starting_position; i++){
                if(arr[row][i] == 1){
                    ones_present = true;
                    if(i<ones_starting_position){
                        ones_starting_position = i;
                        res=row;
                        break;
                    }else if (i == ones_starting_position){
                        ones_starting_position = i;
                        if(res>row){
                        res=row;
                        }
                        break;
                    }
                }
            }
            row++;
        }
        
        if(!ones_present){
            return -1;
        }
        
        return res;
    }
}