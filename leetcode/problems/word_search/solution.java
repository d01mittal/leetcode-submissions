class Solution {
    public boolean combo(char board[][], String word, int n, int m, int i, int j, int ind){
        if(ind==word.length())
        return true;
        if(i<0||j<0||i>=n||j>=m||board[i][j]!=word.charAt(ind)||board[i][j]=='!')
        return false;
        char ch=board[i][j];
        board[i][j]='!';
        boolean top=combo(board,word,n,m,i-1,j,ind+1);
        boolean bottom=combo(board,word,n,m,i+1,j,ind+1);
        boolean right=combo(board,word,n,m,i,j+1,ind+1);
        boolean left=combo(board,word,n,m,i,j-1,ind+1);
        board[i][j]=ch;
        return top||bottom||left||right;
    }
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]==word.charAt(0)){
                    if(combo(board,word,n,m,i,j,0))
                    return true;
                }
            }
        }
        return false;
    }
}