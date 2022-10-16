class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int l=0, h=numbers.length-1;
        while(l<h){
            int sum = numbers[l] + numbers[h];
            if(sum==target){
                res[0]=l+1;
                res[1]=h+1;
                return res;
            }
            if(sum>target){
                h--;
            }else{
                l++;
            }                
        }
        return res;
    }
}