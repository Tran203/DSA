class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        int sum = 0;

        //rows = customer
        //cols = wealth

        for(int customer =0; customer < accounts.length; customer++){
            for(int wealth = 0; wealth < accounts[customer].length; wealth++){
                //loop through the possible wealths and calculate their running sum
                 sum += accounts[customer][wealth];
            }

            //Save the richest net Worth
            if(sum > maxWealth){
                maxWealth =sum;
            }

            //clear sum
            sum = 0;
        }


        return maxWealth;
    }
}



//The Trick of the Excercese  was to calcute the sums of the columns in each row in a dynamic way
//E.G. Given this Matrix       1   2   3
//                             4   5   6
																
//**Our mission** is to calculate the sum of each row and then compare which row has the biggest sum
//Using the running sum from the previous excersise we can know that the sum for each of these rows is 
//Row 1 = 6
//Row 2 = 11

//From this we can see that the biggest sum is 11 so we need to return 11;                                
