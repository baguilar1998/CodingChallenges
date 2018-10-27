class TranposeMatrix {
    /**
     * @param A an m x n matrix
     * @return the tranpose of matrix A
     */
    public int[][] transpose(int[][] A) {
        int [][] transposed = new int [A[0].length][A.length];
        for(int i = 0 ; i < A.length; ++i){
            for(int j=0; j< A[i].length; ++j){
                transposed[j][i] = A[i][j];
            }
        }
        return transposed;
    }
}