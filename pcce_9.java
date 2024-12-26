// [PCCE 기출문제] 9번 / 이웃한 칸
// 2024.12.26
// solve

class Solution {
    public int solution(String[][] board, int h, int w) {
    int answer = 0;
    
    int bsize = board.length;
        
    // 왼쪽
    if(w != 0){
        if(board[h][w-1].equals(board[h][w]) == true) {
            answer += 1;
        }
    }

    // 오른쪽
    if(w != (bsize - 1)){
        if(board[h][w+1].equals(board[h][w])) {answer += 1;}
    }
    // 위
    if(h != 0){
        if(board[h-1][w].equals(board[h][w])){ answer += 1;}
    }

    // 아래
    if(h != (bsize - 1)){
        if(board[h+1][w].equals(board[h][w])){ answer += 1;}
    }
        
    return answer;
    }
}