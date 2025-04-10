class Solution {
    public int numIdenticalPairs(int[] nums) {
       //
       int numGoodPairs = 0;

       for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j  < nums.length; j++){
                if((nums[i] == nums[j]) && (i < j)){
                    numGoodPairs++;
                }
            }
       } 

       return numGoodPairs;
    }
}

//The Trick of this excersie was to interate through the array two times :
//1st time: we loop for each value of the index
//2nd time: we loop for each value of the index but excluding the value at 1st loop index

//E.G , given an array of 1, 2 , 3
//1st time at index[0] = 1
//2nd time we exclude the fist index so we have index[1] = 2 , and index[2] =3

//We then create pairs between the 1st time value and each of the 2nd time value
//e.g (1,2) and (1,3)

//We then use the conditions given from the senario to identify if these are good pairs
