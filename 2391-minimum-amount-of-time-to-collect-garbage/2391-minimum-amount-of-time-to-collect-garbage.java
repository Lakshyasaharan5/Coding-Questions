class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int metal_truck = 0;     // i=2 j=3 mt=7 m=4 pt=1 p=1 gt=1 g=1
        int paper_truck = 0;
        int glass_truck = 0;
        int m_maxIndex=0, g_maxIndex=0, p_maxIndex=0;
        
        for(int i=garbage.length-1; i>=0; i--){
            for(int j=0; j<garbage[i].length(); j++){
                if(garbage[i].charAt(j) == 'M' && i>=m_maxIndex){
                    m_maxIndex=i;
                }else if(garbage[i].charAt(j) == 'P' && i>=p_maxIndex){
                    p_maxIndex=i;
                }else if(garbage[i].charAt(j) == 'G' && i>=g_maxIndex){
                    g_maxIndex=i;
                }
            }                     
        } 
        
        for(int i=0; i<garbage.length; i++){            
            for(int j=0; j<garbage[i].length(); j++){
                if(garbage[i].charAt(j) == 'M'){
                    metal_truck++;
                }else if(garbage[i].charAt(j) == 'P'){
                    paper_truck++;
                }else{
                    glass_truck++;
                }
            }
        }
        
        for(int j=0; j<p_maxIndex; j++){
            paper_truck += travel[j];
        }
        for(int j=0; j<g_maxIndex; j++){
            glass_truck += travel[j];
        }
        for(int j=0; j<m_maxIndex; j++){
            metal_truck += travel[j];
        }
        
        return metal_truck + glass_truck + paper_truck;
    }
}