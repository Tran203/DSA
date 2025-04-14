class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        //
        int[]  result = new int[nums.length];
        int numsSmaller = 0;

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if((j != i) && (nums[j] < nums[i])){
                    numsSmaller++;
                }
            }

            //update result
            result[i] = numsSmaller;
            
            //clear numsSmaller
            numsSmaller =0;

        }


        return result;
    }
}


//The trick of this Excerise was to iterate throuh the array two times
// //1st time: we loop for each value of the index
//2nd time: we loop for each value of the index but excluding the value at 1st loop index

//E.G , given an array of 1, 2 , 3
//1st time at index[0] = 1
//2nd time we exclude the fist index so we have index[1] = 2 , and index[2] =3

//Then using the twon conditions given we 1st check that the loops are not at the same index then whe look for all the values that are lessor than the value of the loop at the 1st time index

