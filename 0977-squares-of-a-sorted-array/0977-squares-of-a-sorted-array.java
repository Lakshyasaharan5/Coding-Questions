class Solution {
    public int[] sortedSquares(int[] nums) {
        int l=0, h=nums.length-1;
        int[] res = new int[nums.length];
        int k=nums.length-1;                    
        while(l<=h){
            if(Math.abs(nums[l]) > Math.abs(nums[h])){
                res[k--]=nums[l]*nums[l];
                l++;
            }else if(Math.abs(nums[l]) < Math.abs(nums[h])){
                res[k--] = nums[h]*nums[h];
                h--;
            }else if(Math.abs(nums[l]) == Math.abs(nums[h]) && l!=h){
                res[k--] = nums[l]*nums[l];
                res[k--] = nums[l]*nums[l];
                h--;
                l++;
            }else{
                res[k--] = nums[l]*nums[l];
                l++;
                h--;
            }
        }
        return res;
    }
}