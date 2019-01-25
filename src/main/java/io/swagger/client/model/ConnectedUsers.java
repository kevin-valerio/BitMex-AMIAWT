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

import java.math.BigDecimal;
import java.util.Objects;

/**
 * ConnectedUsers
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-31T16:00:32.015Z")
public class ConnectedUsers {
    @SerializedName("users")
    private BigDecimal users = null;

    @SerializedName("bots")
    private BigDecimal bots = null;

    public ConnectedUsers users(BigDecimal users) {
        this.users = users;
        return this;
    }

    /**
     * Get users
     *
     * @return users
     **/
    @ApiModelProperty(value = "")
    public BigDecimal getUsers() {
        return users;
    }

    public void setUsers(BigDecimal users) {
        this.users = users;
    }

    public ConnectedUsers bots(BigDecimal bots) {
        this.bots = bots;
        return this;
    }

    /**
     * Get bots
     *
     * @return bots
     **/
    @ApiModelProperty(value = "")
    public BigDecimal getBots() {
        return bots;
    }

    public void setBots(BigDecimal bots) {
        this.bots = bots;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConnectedUsers connectedUsers = (ConnectedUsers) o;
        return Objects.equals(this.users, connectedUsers.users) &&
                Objects.equals(this.bots, connectedUsers.bots);
    }

    @Override
    public int hashCode() {
        return Objects.hash(users, bots);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConnectedUsers {\n");

        sb.append("    users: ").append(toIndentedString(users)).append("\n");
        sb.append("    bots: ").append(toIndentedString(bots)).append("\n");
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

