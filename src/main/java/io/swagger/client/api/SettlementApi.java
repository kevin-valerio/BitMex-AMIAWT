/*
 * BitMEX API
 * ## REST API for the BitMEX Trading Platform  [View Changelog](/app/apiChangelog)    #### Getting Started  Base URI: [https://www.bitmex.com/api/v1](/io.swagger.client.api/v1)  ##### Fetching Data  All REST endpoints are documented below. You can try out any query right from this interface.  Most table queries accept `count`, `start`, and `reverse` params. Set `reverse=true` to get rows newest-first.  Additional documentation regarding filters, timestamps, and authentication is available in [the main API documentation](/app/restAPI).  *All* table data is available via the [Websocket](/app/wsAPI). We highly recommend using the socket if you want to have the quickest possible data without being subject to ratelimits.  ##### Return Types  By default, all data is returned as io.swagger.client.JSON. Send `?_format=csv` to get CSV data or `?_format=xml` to get XML data.  ##### Trade Data Queries  *This is only a small subset of what is available, to get you started.*  Fill in the parameters and click the `Try it out!` button to try any of these queries.  * [Pricing Data](#!/Quote/Quote_get)  * [Trade Data](#!/Trade/Trade_get)  * [OrderBook Data](#!/OrderBook/OrderBook_getL2)  * [Settlement Data](#!/Settlement/Settlement_get)  * [Exchange Statistics](#!/Stats/Stats_history)  Every function of the BitMEX.com platform is exposed here and documented. Many more functions are available.  ##### Swagger Specification  [⇩ Download Swagger io.swagger.client.JSON](swagger.json)    ## All API Endpoints  Click to expand a section.
 *
 * OpenAPI spec version: 1.2.0
 * Contact: support@bitmex.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import com.google.gson.reflect.TypeToken;
import io.swagger.client.*;
import io.swagger.client.model.Settlement;
import org.threeten.bp.OffsetDateTime;

import java.io.IOException;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SettlementApi {
    private ApiClient apiClient;

    public SettlementApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SettlementApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for settlementGet
     *
     * @param symbol                  Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBU:monthly&#x60;. Timeframes are &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, and &#x60;biquarterly&#x60;. (optional)
     * @param filter                  Generic table filter. Send io.swagger.client.JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details. (optional)
     * @param columns                 Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. (optional)
     * @param count                   Number of results to fetch. (optional, default to 100)
     * @param start                   Starting point for results. (optional, default to 0)
     * @param reverse                 If true, will sort results newest first. (optional, default to false)
     * @param startTime               Starting date filter for results. (optional)
     * @param endTime                 Ending date filter for results. (optional)
     * @param progressListener        Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call settlementGetCall(String symbol, String filter, String columns, BigDecimal count, BigDecimal start, Boolean reverse, OffsetDateTime startTime, OffsetDateTime endTime, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/settlement";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (symbol != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("symbol", symbol));
        if (filter != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("filter", filter));
        if (columns != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("columns", columns));
        if (count != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("count", count));
        if (start != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("start", start));
        if (reverse != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("reverse", reverse));
        if (startTime != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("startTime", startTime));
        if (endTime != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("endTime", endTime));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
                "application/json", "application/xml", "text/xml", "application/javascript", "text/javascript"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
                "application/json", "application/x-www-form-urlencoded"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                            .build();
                }
            });
        }

        String[] localVarAuthNames = new String[]{};
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call settlementGetValidateBeforeCall(String symbol, String filter, String columns, BigDecimal count, BigDecimal start, Boolean reverse, OffsetDateTime startTime, OffsetDateTime endTime, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {


        com.squareup.okhttp.Call call = settlementGetCall(symbol, filter, columns, count, start, reverse, startTime, endTime, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get settlement history.
     *
     * @param symbol    Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBU:monthly&#x60;. Timeframes are &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, and &#x60;biquarterly&#x60;. (optional)
     * @param filter    Generic table filter. Send io.swagger.client.JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details. (optional)
     * @param columns   Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. (optional)
     * @param count     Number of results to fetch. (optional, default to 100)
     * @param start     Starting point for results. (optional, default to 0)
     * @param reverse   If true, will sort results newest first. (optional, default to false)
     * @param startTime Starting date filter for results. (optional)
     * @param endTime   Ending date filter for results. (optional)
     * @return List&lt;Settlement&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Settlement> settlementGet(String symbol, String filter, String columns, BigDecimal count, BigDecimal start, Boolean reverse, OffsetDateTime startTime, OffsetDateTime endTime) throws ApiException {
        ApiResponse<List<Settlement>> resp = settlementGetWithHttpInfo(symbol, filter, columns, count, start, reverse, startTime, endTime);
        return resp.getData();
    }

    /**
     * Get settlement history.
     *
     * @param symbol    Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBU:monthly&#x60;. Timeframes are &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, and &#x60;biquarterly&#x60;. (optional)
     * @param filter    Generic table filter. Send io.swagger.client.JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details. (optional)
     * @param columns   Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. (optional)
     * @param count     Number of results to fetch. (optional, default to 100)
     * @param start     Starting point for results. (optional, default to 0)
     * @param reverse   If true, will sort results newest first. (optional, default to false)
     * @param startTime Starting date filter for results. (optional)
     * @param endTime   Ending date filter for results. (optional)
     * @return io.swagger.client.ApiResponse&lt;List&lt;Settlement&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Settlement>> settlementGetWithHttpInfo(String symbol, String filter, String columns, BigDecimal count, BigDecimal start, Boolean reverse, OffsetDateTime startTime, OffsetDateTime endTime) throws ApiException {
        com.squareup.okhttp.Call call = settlementGetValidateBeforeCall(symbol, filter, columns, count, start, reverse, startTime, endTime, null, null);
        Type localVarReturnType = new TypeToken<List<Settlement>>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get settlement history. (asynchronously)
     *
     * @param symbol    Instrument symbol. Send a bare series (e.g. XBU) to get data for the nearest expiring contract in that series.  You can also send a timeframe, e.g. &#x60;XBU:monthly&#x60;. Timeframes are &#x60;daily&#x60;, &#x60;weekly&#x60;, &#x60;monthly&#x60;, &#x60;quarterly&#x60;, and &#x60;biquarterly&#x60;. (optional)
     * @param filter    Generic table filter. Send io.swagger.client.JSON key/value pairs, such as &#x60;{\&quot;key\&quot;: \&quot;value\&quot;}&#x60;. You can key on individual fields, and do more advanced querying on timestamps. See the [Timestamp Docs](https://www.bitmex.com/app/restAPI#Timestamp-Filters) for more details. (optional)
     * @param columns   Array of column names to fetch. If omitted, will return all columns.  Note that this method will always return item keys, even when not specified, so you may receive more columns that you expect. (optional)
     * @param count     Number of results to fetch. (optional, default to 100)
     * @param start     Starting point for results. (optional, default to 0)
     * @param reverse   If true, will sort results newest first. (optional, default to false)
     * @param startTime Starting date filter for results. (optional)
     * @param endTime   Ending date filter for results. (optional)
     * @param callback  The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call settlementGetAsync(String symbol, String filter, String columns, BigDecimal count, BigDecimal start, Boolean reverse, OffsetDateTime startTime, OffsetDateTime endTime, final ApiCallback<List<Settlement>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = settlementGetValidateBeforeCall(symbol, filter, columns, count, start, reverse, startTime, endTime, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Settlement>>() {
        }.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
