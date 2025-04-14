class Solution {
    public boolean checkIfPangram(String sentence) {
        String uniqueAlphabet = "";
        boolean  isPangram = false;

        //Get Unique Alpahet
        for(char ch = 'a'; ch <= 'z'; ch++){
            if(sentence.indexOf(ch) !=-1){
				uniqueAlphabet=uniqueAlphabet+ch;
			}
        }

        //Confirm counyt
        if(uniqueAlphabet.length() == 26){
            isPangram = true;
        }


        return isPangram;
    }
}

// Trick was to check if all the alphabet letters appear in the sentence
// Bono Biggest Trick is to do that in simple code without declaring all alphabets manually
// and without comparing the sentence to a full alphabet string

// HOW I did it:
// Taking advantage of Java's char data type, I created a loop from 'a' to 'z'
// This way, I'm automatically covering all the letters without hardcoding them
// Then I used sentence.indexOf(ch) to check if each letter exists in the sentence
// If it exists, I add it to a string (uniqueAlphabet) — just to count unique letters found
// In the end, I check if uniqueAlphabet has 26 letters (meaning all letters are present)

