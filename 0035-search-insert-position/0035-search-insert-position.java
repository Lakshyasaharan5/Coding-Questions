class Solution {
    public int searchInsert(int[] arr, int target) {
        int l = 0;
        int h = arr.length-1;
        while(l<h){
            int mid = l+(h-l)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]>target){
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        if(arr[l]>target || arr[l]==target){
            return l;
        }else{
            return l+1;
        }
    }
}