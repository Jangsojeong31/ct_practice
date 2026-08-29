import java.util.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = 0;
        
        int row = park.length;
        int col = park[0].length;
        
        // 돗자리 크기를 하나씩 확인
        for (int mat : mats) {
            // 공원 전체를 탐색하면서
            // 돗자리의 왼쪽 위 시작점을 찾음
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    
                    // 현재 위치에서 mat * mat 크기의 
                    // 돗자리를 놓을 수 있는지 확인
                    if (canPlace(i, j, mat, park)) {
                        answer = Math.max(answer, mat);
                    }
                }
            }
        }
        
        return answer == 0 ? -1 : answer;
    }
    
    public boolean canPlace(int r, int c, int mat, String[][] park) {
        // 공원 범위를 벗어나는 경우
        if (r + mat > park.length || c + mat > park[0].length) {
            return false;
        }
        
        // mat * mat 영역 확인
        for (int i = r; i < r + mat; i++) {
            for (int j = c; j < c + mat; j++) {
                // 빈공간(-1)이 아니면 돗자리를 놓을 수 없음
                if (!park[i][j].equals("-1")) {
                    return false;
                }
            }
        }
        
        return true;
    }
}