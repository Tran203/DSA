class Solution {
    public int[] runningSum(int[] nums) {
        //
        int[] runningSum = new int[nums.length];
         

        //loop the array
        for (int i = 0; i < nums.length; i++) {
            //loop through the possible values
            int sum = 0;
            for(int j = 0; j <= i; j++){
                sum += nums[j];
            }
            runningSum[i] = sum;
        }

        return runningSum;
    }
}

//The trick of this execersice was to collect and calulate the sums for the previus index
//Given Array as  nums = [1,2,3,4]
//when you loop through each index you must then know the values of the previous indexes
//E.G lets say we are now at index 2 where the value is 3. Your code need to know that the previous values of the previous indexes were 1 and 2. 
//So your second job is to calculate the sum of 1 + 2 + 3, and save that sum value at the current index you are at . Remember we are at index 2!!!
//so in that way in your runningSum array at index 2 will be made up by this synaxt
//runningSum[2] = [1 + 2 + 3] 
