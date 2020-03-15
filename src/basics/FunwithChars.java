package basics;

public class FunwithChars {

    //that will cover all ASCII chars
    //although only the bottom 128 is is really what I'm after here
    private static int TOTAL_CHARACTERS = 256;

    // 'A' is represented by 65
    // spot 65 in this array represents 'A'
    // the value stored in the spot 65 of this array is the number of 'A's in the string
    private int[] trackerOfCountsOfCharacters = new int[TOTAL_CHARACTERS];

    private void countLetter(char letter){
        trackerOfCountsOfCharacters[letter]++;
    }

}
