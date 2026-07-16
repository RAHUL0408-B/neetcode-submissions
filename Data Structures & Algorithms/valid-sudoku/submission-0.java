class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String>seen = new HashSet<>();

        for(int r = 0; r<9;r++){
            for(int c = 0 ; c<9;c++){
                char value = board[r][c];
                if(value == '.'){
                    continue;
                }
                if(!seen.add(value + "is row" + r)||
                !seen.add(value + "is col" + c)||
                !seen.add(value + "is box" + r/3+"."+c/3)){
                    return false;
                }
            }
        }return true;
    }
}
