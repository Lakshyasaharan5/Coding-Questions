class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        if(s1.length() > s2.length()){
            return false;
        }
        if(s1.length()==1){
            return s2.contains(s1);
        }
        Map<Character, Integer> mp1 = new HashMap<Character, Integer>();
        int l=0, h=s1.length()-1;
        for(int i=l; i<=h; i++){
            if(mp1.containsKey(s1.charAt(i))){
                mp1.put(s1.charAt(i), mp1.get(s1.charAt(i))+1);
            }else{
                mp1.put(s1.charAt(i), 1);
            }
        }
        Map<Character, Integer> mp2 = new HashMap<Character, Integer>();
        for(int i=l; i<=h; i++){
            if(mp2.containsKey(s2.charAt(i))){
                mp2.put(s2.charAt(i), mp2.get(s2.charAt(i))+1);
            }else{
                mp2.put(s2.charAt(i), 1);
            }
        }
        while(l<s2.length() && h<s2.length()-1){
            if(mp1.equals(mp2)){
                return true;
            }
            if(s1.length()==2) {
            	if(mp2.get(s2.charAt(l))>1) {
                	mp2.put(s2.charAt(l), mp2.get(s2.charAt(l))-1);
                }else {
                	mp2.remove(s2.charAt(l));
                }            
                l++;
                if(mp2.containsKey(s2.charAt(l))){
                    mp2.put(s2.charAt(l), mp2.get(s2.charAt(l))+1);
                }else{
                    mp2.put(s2.charAt(l), 1);
                }
                if(mp2.get(s2.charAt(h))>1) {
                	mp2.put(s2.charAt(h), mp2.get(s2.charAt(h))-1);
                }else {
                	mp2.remove(s2.charAt(h));
                } 
                h++;
                if(mp2.containsKey(s2.charAt(h))){
                    mp2.put(s2.charAt(h), mp2.get(s2.charAt(h))+1);
                }else{
                    mp2.put(s2.charAt(h), 1);
                }
            }else {
            	if(mp2.get(s2.charAt(l))>1) {
                	mp2.put(s2.charAt(l), mp2.get(s2.charAt(l))-1);
                }else {
                	mp2.remove(s2.charAt(l));
                }            
                l++;
                h++;
                if(mp2.containsKey(s2.charAt(h))){
                    mp2.put(s2.charAt(h), mp2.get(s2.charAt(h))+1);
                }else{
                    mp2.put(s2.charAt(h), 1);
                }
            }
        }
        if(mp1.equals(mp2)){
                return true;
            }
        return false;
    }
}