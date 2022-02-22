class Solution {
public:
    int peakIndexInMountainArray(vector<int>& arr) {
        
        int l=0, h=arr.size()-1;
        
        while(l<=h){
            int m = (l+h)/2;
            if(arr[m]>arr[m-1] && arr[m]>arr[m+1]) return m;
            if(arr[m]>arr[m-1] && arr[m+1]>arr[m]){
                l=m+1;
            }
            else{
                h=m;
            }
        }
        
        return l;
    }
};