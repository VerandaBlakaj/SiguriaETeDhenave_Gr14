import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;
public class MainMetoda {

    public static void main(String[] args) throws IOException {
    	
    	//String dsParameter = args[0];
        //String bealeParameter = args[1];
        String decryptorEncrypt = args[0];
        String fileName = args[1];
        String plainText = args[2];
        String pathText = "";
        File file = new File(fileName);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line = null;
        while ((line = br.readLine()) != null) {
            pathText += line;
        }
        if(decryptorEncrypt.equals("encrypt")) {
        	Enkriptimi e = new Enkriptimi();
        	String s = e.Encrypt(plainText, pathText);
        	System.out.println("Enkriptimi: " + s.toUpperCase());
        }
        
        if(decryptorEncrypt.equals("decrypt")) {
        	Dekriptimi d = new Dekriptimi();
        	String s = d.Decrpyt(plainText, pathText);
        	System.out.println("Dekriptimi: " + s);
        }

    }
}