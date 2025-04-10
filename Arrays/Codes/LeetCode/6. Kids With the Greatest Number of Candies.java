class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        //Declare 
        List<Boolean> result = new ArrayList<Boolean>();

        //Know who has the highest candiy
        int highestCandy =  candies[0];

        for(int i =0; i < candies.length; i++){
            if(candies[i] > highestCandy){
                highestCandy = candies[i];
            }
        }


        //Give candies to the kids
        for(int i =0; i < candies.length; i++){

            int newKidCandy = candies[i] + extraCandies;

            
            if(newKidCandy >= highestCandy){
                result.add(true);
            }else{
                result.add(false);
            }

        }


        return result;
    }
}

//The trick of this excercise was to give extra candies to the kids and see if they would have the highest number of candies

//1st know what is the highest number of the candies our array has
//Then give extra candies to the each kid and see if their new candies will match or be greater than the highest number in the array
//
