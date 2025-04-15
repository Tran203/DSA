class Solution {
    public int[][] transpose(int[][] matrix) {
        //Dimensions
        int rows = matrix.length;
        int cols = matrix[0].length;

        //Temp Array
        int[][] transposed =  new int[cols][rows];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                transposed[j][i] = matrix[i][j];
            }
        }

        return transposed;
    }
}

//The trick of this exercise is to 'Realize that rows become columns, and columns become rows'
