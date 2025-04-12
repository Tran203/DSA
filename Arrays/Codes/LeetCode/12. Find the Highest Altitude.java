class Solution {
    public int largestAltitude(int[] gain) {
        int highest = 0;
        int altitude = 0;

        for(int i =0; i < gain.length; i++){
            altitude += gain[i];

            if(altitude > highest){
                highest = altitude;
            }

            
        }

        return highest;
    }
}

// The trick was to simulate the biker's journey by tracking the altitude at every step.
// We start at 0 (since the biker starts at altitude 0).
// Then, as we loop through the `gain` array, we keep a running total of the altitude and we check if that current altitude is higher than our previously recorded highest altitude (`highest`).
// If it is, we update the `highest`.

