class Solution {
    public int findNumbers(int[] nums) {
        int evenNums = 0;

        for(int i =0; i < nums.length; i++){
            int count = String.valueOf(nums[i]).length();


            //calc
            if(count % 2 == 0){
                evenNums++;
            }
        }

        return evenNums;
        
    }
}



//The key trick is to figure out how many digits each number in the array has.
//Once you know that, check if the digit count is even.

//You can count digits easily by converting the number to a string and checking the length.
