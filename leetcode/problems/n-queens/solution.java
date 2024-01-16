class Solution {
    public static boolean possible(int row, int col, char board[][]){
        int duprow=row;
        int dupcol=col;
        while(row>=0&&col>=0){
            if(board[row][col]=='Q')
            return false;
            row--;
            col--;
        }
        row=duprow;
        col=dupcol;
        while(col>=0){
            if(board[row][col]=='Q')
            return false;
            col--;
        }
        col=dupcol;
        while(col>=0&&row<board.length){
            if(board[row][col]=='Q')
            return false;
            col--;
            row++;
        }
        return true;
    }
    public static void construct(char board[][],List< List< String > > ans){
        ArrayList<String> store=new ArrayList<>();
        for(int i=0;i<board.length;i++){
            String str="";
            for(int j=0;j<board.length;j++){
                if(board[i][j]=='Q')
                str+='Q';
                else
                str+='.';
            }
            store.add(str);
        }
        ans.add(store);
    }
    public static void Queen(int col,char board[][],List< List< String > > ans){
        if(col==board.length){
            construct(board,ans);
            return;
        }
        for(int row=0;row<board.length;row++){
            if(possible(row,col,board)){
                board[row][col]='Q';
                Queen(col+1, board, ans);
                board[row][col]='.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        char board[][]=new char[n][n];
        List< List< String > > ans=new ArrayList<List<String>>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
            board[i][j]='.';
        }
        Queen(0,board,ans);
        return ans;
    }
}