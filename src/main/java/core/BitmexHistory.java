package core;

import io.swagger.client.api.StatsApi;
import io.swagger.client.model.Wallet;

public class BitmexHistory {
    /*test*/

    private static String API_NAME = "";
    private static String API_KEY = "";
    private final StatsApi api = new StatsApi();

    public BitmexHistory() {
        SecretReader secretReader = new SecretReader("secrets.keys");
        API_NAME = secretReader.getApiName();
        API_KEY = secretReader.getApiKey();

        Wallet wallet = new Wallet();
        wallet.getAmount();


    }
}
