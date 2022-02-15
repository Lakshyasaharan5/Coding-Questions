class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        
        int curr=0, overall_sum = INT_MIN;
        
        for(int i=0; i<nums.size(); i++){
            curr += nums[i];
            
            overall_sum = curr > overall_sum ? curr : overall_sum;
            
            if(curr<0){
                curr = 0;
            }
            
        }
        
        
        return overall_sum;
        
    }
};