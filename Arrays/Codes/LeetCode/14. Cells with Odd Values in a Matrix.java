class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] matrix  = new int[m][n];
        int numOdd = 0;

        //Populating the Empty Matrix
        for(int indicesRow = 0; indicesRow < indices.length; indicesRow++){
           int rowToChange = indices[indicesRow][0];
           int colToChange = indices[indicesRow][1];

           //Update the rows
           for (int col = 0; col < n; col++) {
                matrix[rowToChange][col]++;
            }

            //Update Cols
           for (int row = 0; row < m; row++) {
                matrix[row][colToChange]++;
            }

        }
              

        //Count Odd
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] % 2 != 0){
                    numOdd++;
                }
            }
        }

        return numOdd;
    }
}


//The question descition was confusing
//The trick of this excersie, was using the given arra(indices), update the array you would created Using these conditions


// Example: If indices = [0,1]
//  → We increment every value in row 0 and every value in column 1.

//1. Create and initialize the matrix.
//2. Loop through each index pair to apply row & column increments.
//3. Lastly find all the odd numbers present in matrix
