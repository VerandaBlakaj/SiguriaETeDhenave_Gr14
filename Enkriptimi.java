import java.util.Random;

public class Enkriptimi {
    public final String Encrypt(String plaintext, String textBook) {
        textBook = textBook.toLowerCase();
        plaintext = plaintext.toLowerCase();

        String[] textDocument = textBook.split(" ");
        char[] plaintextArray = plaintext.toCharArray();
        String ciphertexti = "";
        Random rand = new Random();
        for (int i = 0; (i < plaintext.length()); i++) {
            String tempciphertexti = "";
            String space = (i == plaintext.length() - 1 ? "" : ", ");
            if (plaintext.charAt(i) == ' ') {
            	ciphertexti += "-1" + space;
            	continue;
            }
            for (int j = 0; (j < textDocument.length); j++) {
                String word = textDocument[j];
                if (word.startsWith(Character.toString(plaintextArray[i]))){
                	tempciphertexti += j + " ";
                }
            }
            String[] tempArray = tempciphertexti.split(" ");
            int indexOfWordInTextDocument = rand.nextInt((tempArray.length));
            ciphertexti += this.countLettersToIndex(textDocument, Integer.valueOf(tempArray[indexOfWordInTextDocument])) + space;
        }
        
        return ciphertexti;
    }
    
    private int countLettersToIndex(String[] splittedTextBook, int index) {
    	int result = 0;
    	for (int i = 0; i < index; i += 1) {
    		result += splittedTextBook[i].length() + 1; 
    	}
    	return result - (splittedTextBook.length - 1 == index ? -1 : 0);
    }
}
