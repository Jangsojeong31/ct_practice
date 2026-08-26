import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        List<String> cache = new ArrayList<>();
        
        if (cacheSize == 0) {
            return cities.length * 5;
        }
        
        for (String c : cities) {
            
            c = c.toLowerCase();
            
            if (cache.contains(c)) {
            // Cache Hit
                answer += 1;
                cache.remove(c);
                cache.add(c);
            } else {
            // Cahce Miss
                answer += 5;
                
                if (cache.size() == cacheSize) {
                    cache.remove(0);
                }
                
                cache.add(c);
            }
        }
        
        return answer;
    }
}