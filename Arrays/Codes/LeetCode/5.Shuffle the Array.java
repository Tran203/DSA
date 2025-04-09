class Solution {
    public int[] shuffle(int[] nums, int n) {
        //Cut at n
        int[] shuffle = new int[nums.length];

        //Find the midpoint
        for(int i = 0; i < n; i++){
            //Split and Populate the shuffled value
            shuffle[2*i] = nums[i]; //Takes values fr
            shuffle[(2*i) + 1] = nums[i + n];
        }

        return shuffle;
    }
}

//The trick of this excerise is to swap the array based on the midpoint
//First we must determine the mid point which is n
//Then Split the array into two arrays
//Then we add values from both the arrays

//E.G An array nums = {1,2,3,4,5,6} where n = 3
//We split the array at n 
//Our new left array {1,2,3} . Our right array {4,5,6}

//The bigest trick combine these arrays into one array based on the logic that : the firt element must be from left the second element must be from right
//e. {1[left],4[right]}
