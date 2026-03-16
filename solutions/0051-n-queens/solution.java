class Solution {
    public List<List<String>> solveNQueens(int n) {
       List<String> board = new ArrayList<>();
for (int i = 0; i < n; i++) {
    board.add(".".repeat(n));
}
        List<List<String>> ans  = new ArrayList<>();
        nQueens(0,n,board,ans);
        return ans;
    }

    void nQueens(int row,int n,List<String>board,List<List<String>>ans){
        if(row==n){
            ans.add(new ArrayList<>(board));
            return;
        }
        for(int j=0;j<n;j++){
            if(isSafe(row, j, n, board)){
                char[] arr = board.get(row).toCharArray();
                arr[j] = 'Q';
                board.set(row, new String(arr));

                nQueens(row + 1, n, board, ans);

                arr[j] = '.';
                board.set(row, new String(arr));
            }
        }
    }

    boolean isSafe(int row,int col,int n,List<String>board){
       

        for(int i=0;i<row;i++){
            if (board.get(i).charAt(col) == 'Q'){
                return false;
            }
        }

        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
             if (board.get(i).charAt(j) == 'Q'){
                return false;
            }
        }
        for(int i=row-1,j=col+1;i>=0 && j<n;i--,j++){
             if (board.get(i).charAt(j) == 'Q'){
                return false;
            }
        }
        return true;
    }
}
