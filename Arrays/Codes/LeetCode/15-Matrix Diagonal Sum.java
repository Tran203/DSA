class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int answer =0;

        //Getting Matrix Diagonals
        for(int i =0; i < n; i++){
            answer += mat[i][i]; //Main Diagonal
            answer += mat[i][n-1-i]; //Anti Diagonal
        }

        // If n is odd, subtract the center element
        if (n % 2 == 1) {
            int center = mat[n / 2][n / 2];
            answer -= center;// Remove the duplicate center element
        }

        return answer;
    }
}


//The trick of the excerise is to calcalate the sum of the diagonals but excluding the centre elements
//So we calcalute the sum of all the diagonals in the matrix
//IF the matrix length is odd we then subtract the center element from One Diagonal since it appears in both diagonals
