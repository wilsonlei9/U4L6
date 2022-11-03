public class StringLoops {
    // default constructor; no instance variables
    public StringLoops() {
    }

    /* Returns the number of times "character" appears in "searchString"

       This should be case sensitive!

       Examples:
       - if character = "a" and searchString = "Apples and bananas",
         this method returns 4 (it finds BOTH "A" and "a")
       - if character = "A" and searchString = "Apples and bananas",
         this method returns 1 (it finds BOTH "A" and "a")
       - if character = "!" and searchString = "Hello! Nice day!",
         this method returns 2
      */
    public int countCharacters(String character, String searchString) {
        int count = 0;
        for (int i = 0; i < searchString.length(); i++) {
            String s = searchString.charAt(i) + "";
            if (s.equals(character)) {
                count++;
            }
        }
        return count;
    }

    /* Returns the original string reversed

     Examples:
     - if origString = "hello!" this method returns "!olleh"
     - if origString = "Apples and bananas" this method returns "sananab dna selppA"
    */
    public String reverseString(String origString) {
        String newString = "";
        for (int i = origString.length() - 1; i >= 0; i--)
        {
            String character = origString.substring(i, i+1);
            System.out.print(character);
        }
        return newString;
    }

// --- FIVE NEW METHODS TO ADD & IMPLEMENT ARE BELOW ---

    /* Returns the original string reversed -- SECOND IMPLEMENTATION

     Examples:
     - if origString = "hello!" this method returns "!olleh"
     - if origString = "Apples and bananas" this method returns "sananab dna selppA"
    */
    public String reverseString2(String origString) {
        String s = "";
        for (int i = 0; i < origString.length(); i++)
        {
            String character = origString.substring(i, i+1);
            System.out.print(s + character);
        }
        return s;
    }

    /* Returns the number of vowels ("a", "e", "i", "o", "u") that appear in "origString";
    matches should NOT be case sensitive.

    (Note: you could do this by simply calling your countCharacters method 5 times in a
    row, one for each vowel, but that would lead to traversing the entire origString 5
    times -- it’s more efficient to only traverse the string once, so don’t use your
    countCharacters method for this!)

     Examples:
     - if origString = "Apples and bananas", this method returns 6: Apples and bananas
     - if origString = "Hello Joe", this method returns 4: Hello Joe
     - if origString = "Hmm.. pssh!", this method returns 0
     - if origString = "I", this method returns 1
     - if origString = "Supercalifragilisticexpialidocious", this method returns 16
    */
    public int countVowels(String origString)
    {
        int count = 0;
        for (int i = 0; i < origString.length(); i++)
        {

        }
        return 0;
    }

}


