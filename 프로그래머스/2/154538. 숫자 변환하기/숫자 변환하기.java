import java.util.HashSet;

class Solution {
    public int solution(int x, int y, int n) {
        int count = 0;
        
        HashSet<Integer> curr = new HashSet<>(), next = null;
        
        curr.add(x);
        
        while(!curr.isEmpty()) {
            if (curr.contains(y)) {
                return count;
            }
            
            next = new HashSet<>();
            
            for (int c : curr) {
                if (c + n <= y) next.add(c + n);
                if (c * 2 <= y) next.add(c * 2);
                if (c * 3 <= y) next.add(c * 3);
            }
            
            curr = next;
            count++;
        }
        
        return -1;
    }
}