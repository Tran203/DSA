class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        
        int count = 0;
        int index = 0;
        
        if(ruleKey.equals("color")){
                index = 1;
        }else if(ruleKey.equals("name")){
                index = 2;
        }

        for(int i =0; i< items.size(); i++){
            //
            List<String> innerList = items.get(i);
            String value = innerList.get(index);


            if(value.equals(ruleValue)){
                count++;
            }
        }

        return count;

    }
}


// The trick was to iterate the 2D List and then, using the specified condition, check for matches.
// The logic is:
//   - ruleKey tells us which index to check in each item (0 = type, 1 = color, 2 = name).
//   - ruleValue is the value we want to match at that index.
// So if the value at that index in an item equals the ruleValue, it's considered a match.
