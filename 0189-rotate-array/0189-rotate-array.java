class Solution {
    public void rotate(int[] nums, int k) {
        int rot = k%(nums.length);
        int[] res = new int[nums.length];
        if(rot!=0){
            int rot_index = nums.length - rot;
            int flag=0;
            for(int i=rot_index; i<res.length; i++){
                res[flag++] = nums[i];
            }
            for(int i=0; i<rot_index; i++){
                res[flag++] = nums[i];
            }
             for(int i=0; i<nums.length; i++){
            nums[i] = res[i];
        }
        }
       
        
    }
}