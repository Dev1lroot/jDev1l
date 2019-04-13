package no.dev1lroot.util;

import java.io.*;
import no.dev1lroot.lib.Colors;

// Pocket implementering av MMBScript
public class MMBScript {

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
            String error = Colors.fgColor.Red+"Unable to open file '" + fileName + "'";
            return error;
        } catch (IOException ex) {
            String error = Colors.fgColor.Red+"Error reading file '" + fileName + "'";
            return error;
        }
        
    }
}
