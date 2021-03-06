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


package io.swagger.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * InstrumentInterval
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-31T16:00:32.015Z")
public class InstrumentInterval {
    @SerializedName("intervals")
    private List<String> intervals = new ArrayList<String>();

    @SerializedName("symbols")
    private List<String> symbols = new ArrayList<String>();

    public InstrumentInterval intervals(List<String> intervals) {
        this.intervals = intervals;
        return this;
    }

    public InstrumentInterval addIntervalsItem(String intervalsItem) {
        this.intervals.add(intervalsItem);
        return this;
    }

    /**
     * Get intervals
     *
     * @return intervals
     **/
    @ApiModelProperty(required = true, value = "")
    public List<String> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<String> intervals) {
        this.intervals = intervals;
    }

    public InstrumentInterval symbols(List<String> symbols) {
        this.symbols = symbols;
        return this;
    }

    public InstrumentInterval addSymbolsItem(String symbolsItem) {
        this.symbols.add(symbolsItem);
        return this;
    }

    /**
     * Get symbols
     *
     * @return symbols
     **/
    @ApiModelProperty(required = true, value = "")
    public List<String> getSymbols() {
        return symbols;
    }

    public void setSymbols(List<String> symbols) {
        this.symbols = symbols;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InstrumentInterval instrumentInterval = (InstrumentInterval) o;
        return Objects.equals(this.intervals, instrumentInterval.intervals) &&
                Objects.equals(this.symbols, instrumentInterval.symbols);
    }

    @Override
    public int hashCode() {
        return Objects.hash(intervals, symbols);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstrumentInterval {\n");

        sb.append("    intervals: ").append(toIndentedString(intervals)).append("\n");
        sb.append("    symbols: ").append(toIndentedString(symbols)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

