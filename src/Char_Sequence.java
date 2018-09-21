public class Char_Sequence {
    private String character, current_string;
    private String word;
    private char current_char;
    private int size;

    //constructor receives a string as parameter
    public Char_Sequence(String word){
        this.word = word;
        this.size = word.length();
        this.character = "";
    }

    //checks which is the most recurring character in sequence
    public void CharMostFrequent() {
        //start running trough the string and saves the first character
        //update the current string with the current character
        for (int i = 0; i < size; i++) {
            current_char = word.charAt(i);
            current_string = "" + current_char;
            //while the the current position in the string +1 is smaller than the word length
            //and the current character is equals to the next character
            //updates the current string is updated
            while ((i+1) < size && (current_char == word.charAt(i + 1))) {
                current_string = current_string + word.charAt(++i);
            }
            //if the current string is greater than the final string (character variable from the constructor)
            //the final string is updated with the current string method
            if (current_string.length() >= character.length()) {
                character = current_string;
            }
        }
    }

    //Prints the string with the characters that occurs in sequence the most.
    public void result(){
        if (character.length() > 1){
            System.out.println("Most recurring characters in sequence is: " + this.character + ".");
        }else{
            System.out.println("There aren't recurring characters in sequence.");
        }
    }
}

