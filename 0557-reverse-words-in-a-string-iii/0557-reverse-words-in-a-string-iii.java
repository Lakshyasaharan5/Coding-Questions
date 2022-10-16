class Solution {
    public String reverseWords(String s) {
        String[] strArray = s.split(" ");
        for(int i=0; i<strArray.length; i++){
            strArray[i] = reverse(strArray[i].toCharArray());
            
        }
        StringBuffer res = new StringBuffer();
        for(int i=0; i<strArray.length; i++){
            if(i==strArray.length-1){
                res.append(strArray[i]);
            }else{
                res.append(strArray[i]+" ");   
            }            
        }
        System.out.println(res);
        return res.toString();
    }
    
    public static String reverse(char[] s){
        int l=0, h=s.length-1;
        while(l<=h){
            char temp = s[l];
            s[l] = s[h];
            s[h] = temp;
            l++;
            h--;
        }
        
        return String.valueOf(s);
    }
}