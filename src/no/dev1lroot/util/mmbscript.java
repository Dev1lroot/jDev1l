package no.dev1lroot.util;

import java.io.*;

// Pocket implementering av MMBScript
public class mmbscript {

    // Returnerer all tekstdata fra filen
    public static String StrFromFile(String fileName) {
        String lines = null;
        String line;
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                lines = lines + line + "\n";
            }
            bufferedReader.close();
            return lines;
        } catch (FileNotFoundException ex) {
            String error = "\u001b[31mUnable to open file '" + fileName + "'";
            return error;
        } catch (IOException ex) {
            String error = "\u001b[31mError reading file '" + fileName + "'";
            return error;
        }
        
    }
}
