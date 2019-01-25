package core;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SecretReader {
    private final String secretFile;

    public SecretReader(String secretFile) {
        this.secretFile = secretFile;
    }

    private String read() {

        /*
            Format : secret.keys
           "
                myApiName
                myApiSecret
            "
         */

        String line;
        StringBuilder lines = new StringBuilder();
        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader =
                    new FileReader(secretFile);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                lines.append(line).append("\n");
            }

            // Always close files.
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '" +
                            secretFile + "'");
        } catch (IOException ex) {
            System.out.println(
                    "Error reading file '"
                            + secretFile + "'");
            ex.printStackTrace();
        }

        return lines.toString();

    }

    public String getApiKey() {
        return read().split("\n")[1];
    }

    public String getApiName() {
        return read().split("\n")[0];
    }

}