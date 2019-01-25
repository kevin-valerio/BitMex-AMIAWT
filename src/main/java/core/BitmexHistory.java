package core;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.Configuration;
import io.swagger.client.api.UserApi;
import io.swagger.client.model.Transaction;

import java.util.List;

public class BitmexHistory {
    /*test*/

    private static String API_NAME = "";
    private static String API_KEY = "";

    public BitmexHistory() {
        SecretReader secretReader = new SecretReader("secrets.keys");
        API_NAME = secretReader.getApiName();
        API_KEY = secretReader.getApiKey();
    }

    List<Transaction> getAccountHistory() throws ApiException {
        ApiClient defaultApiClient = Configuration.getDefaultApiClient();
        defaultApiClient.setApiKey("x", API_KEY);

        //        defaultApiClient.setAccessToken(API_KEY);

        UserApi api = new UserApi(defaultApiClient);
        return api.userGetWalletHistory("XBT");
    }
}
