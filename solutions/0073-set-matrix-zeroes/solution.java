class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;  int col = matrix[0].length;
        int [] rowArray = new int[row];
        int [] colArray = new int[col];
        Arrays.fill(rowArray, 1);
        Arrays.fill(colArray, 1);
        for(int i=0; i< row; i++){
            for(int j =0; j<col ; j++){
                if(matrix[i][j] == 0){
                    rowArray[i] = colArray[j] = 0;
                }
            }
        }
            for(int i=0; i<row; i++){
                for(int j=0; j<col; j++){
                    if(rowArray[i] == 0 || colArray[j] == 0){
                        matrix[i][j] = 0;
                    }
                }
            }
    }
}
