class Solution {
    public void moveZeroes(int[] nums) {
        int l=0, h=0;
        while(h<nums.length-1 && l<nums.length){            
            while(l<nums.length && nums[l]!=0)
                l++;
            h=l;
            while(h<nums.length && nums[h]==0)
                h++;
            if(h<nums.length && l<nums.length){
                int temp = nums[l];
                nums[l] = nums[h];
                nums[h] = temp;    
            }
            
        }
    }
}