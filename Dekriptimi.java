package course.training;

public class Dekriptimi {
    public static String Decrpyt(String cipherText,String textBook)
    {
        String[] cipherTextArray = cipherText.split(", ");
        char[] shkronjat = new char[cipherTextArray.length];
        for (int i=0;i< cipherTextArray.length;i++){
            int firstIndexOfCharInWordInTextBook = Integer.valueOf(cipherTextArray[i]);
            if (firstIndexOfCharInWordInTextBook == -1) {
                shkronjat[i] = ' ';
            } else {
                shkronjat[i] = textBook.charAt(firstIndexOfCharInWordInTextBook);
            }
        }

        return String.valueOf(shkronjat);
    }
}
