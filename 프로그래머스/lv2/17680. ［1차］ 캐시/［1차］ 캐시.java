class Solution {
    String[] cache1;
    int[] cache2;
    public int solution(int cacheSize, String[] cities) {
        if(cacheSize==0) return cities.length*5;
        int answer = 0;
        cache1 = new String[cacheSize];
        for(int i=0; i<cacheSize; i++){
            cache1[i]= "";
        }
        cache2 = new int[cacheSize];
        for(int idx=0; idx<cities.length; idx++){
            if(isCashed(cities[idx])){
                answer += 1;
            }
            else {
                answer += 5;
            }
            doCashingLRU(cities[idx], idx+1);
            
        }
        return answer;
    }

    boolean isCashed(String city){
        for (int kdx = 0; kdx < cache1.length; kdx++) {
            if(cache1[kdx].equalsIgnoreCase(city)){
                return true;
            }
        }
        return false;
    }

    void doCashingLRU(String city, int priod){
        for (int cdx = 0; cdx < cache2.length; cdx++) {
            if(cache1[cdx].equalsIgnoreCase(city)){
                cache2[cdx] = priod;
                return;
            }
        }
        int mindx = 0;
        for (int cdx = 1; cdx < cache2.length; cdx++) {
   
            if(cache2[mindx]> cache2[cdx]){
                mindx = cdx;
            }
        }
        cache1[mindx] = city;
        cache2[mindx] = priod;
    }
}