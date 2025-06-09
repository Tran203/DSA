class Solution {
    public int[] getConcatenation(int[] nums) {
        
        //Declare
        int[] ans = new int[2*nums.length];

        for(int i = 0; i < nums.length; i++){
            ans[i] = nums[i];// copy to current
            ans[i + nums.length] = nums[i]; // copy to the second half(second array)
        }

        return ans;
    }
}

//Trick of the Trade
//1.need to output array that’s twice the size of the input
