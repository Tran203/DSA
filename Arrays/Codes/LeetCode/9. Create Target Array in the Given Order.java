class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] target = new int[nums.length];

        for(int i=0; i < nums.length; i++){
            list.add(index[i], nums[i]);
        }

        for(int i = 0; i< list.size(); i++){
            target[i] = list.get(i);
        }

        return target;

    }
}

// Question was poorly structured 
// The trick of this exercise was to create an array, and populate the array with this logic:
// At the index, it is the value of index[i], and we insert the value of nums[i] there
// So basically:
// index[i] tells us where to insert
// nums[i] tells us what value to insert
// For example: if nums[i] = 5 and index[i] = 2, then we insert 5 at position 2 in the array
// Note when the array must shift elements if needed to make space at that index
// This is why using a List (like ArrayList) helps, because it allows shifting and inserting
