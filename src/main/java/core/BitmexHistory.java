package core;

public class BitmexHistory {
    /*test*/

    private static String API_NAME = "";
    private static String API_KEY = "";

    public BitmexHistory() {
        SecretReader secretReader = new SecretReader("secrets.keys");
        API_NAME = secretReader.getApiName();
        API_KEY = secretReader.getApiKey();

    }
}
