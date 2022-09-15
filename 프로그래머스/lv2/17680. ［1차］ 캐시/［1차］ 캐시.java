import java.util.LinkedHashMap;
import java.util.Map;

class Solution {

    public int solution(int cacheSize, String[] cities) {
        if(cacheSize==0) return cities.length*5;
        int answer = 0;
        Map cache = new LRU<String, Integer>(cacheSize);
        for(int idx=0; idx<cities.length; idx++){
            String key = cities[idx].toUpperCase();
            if(cache.containsKey(key)) {
                answer += 1;
            } else {
                answer += 5;
            }
            cache.put(key, idx+1);

        }
        return answer;
    }


}
class LRU<K,V> extends LinkedHashMap<K,V> {
    private final int maxSize;
    public LRU(int maxSize){
        super(maxSize, 0.75f, true);
        this.maxSize = maxSize;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > maxSize;
    }
}
