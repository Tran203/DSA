class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        //LOGIC
        for(int imageRow =0; imageRow < image.length;imageRow++){
            flipHorizontal(image[imageRow]);
            invertHorizonta(image[imageRow]);

        }

        return image;

    }

     static void invertHorizonta(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1){
                arr[i] = 0;
            }else{
                arr[i] = 1;
            }
        }
     }

    static void flipHorizontal(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end);

            start++;
            end--;
        }
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

// The trick of this problem is to first reverse (flip) each row of the matrix (horizontally),
// and then invert the values (0 becomes 1, and 1 becomes 0).


// HOW I SOLVED IT:
// - I created two helper methods: `flipHorizontal` to reverse each row, and `invertHorizonta` to invert each value in the row.
// - Inside the main method, I loop through every row of the matrix.
// - For each row, I first flipped it, then inverted it.


// FLIP:
// The `flipHorizontal` method swaps values from start to end of the row using a two-pointer approach.

// INVERT:
// The `invertHorizonta` method goes through each element of the row and flips its value (0 -> 1, 1 -> 0).
