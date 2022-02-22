class Solution {
public:
    char nextGreatestLetter(vector<char>& letters, char target) {
        
        if(letters[letters.size()-1]<=target) return letters[0];
        
        
        
        int l=0, h=letters.size()-1;
        while(l<h){
            int m = (l+h)/2;
            
            if(letters[m]>target){
                h=m;
            }
            else{
                l=++m;
            } 
        }
        return letters[l];
    }
};