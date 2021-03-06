/*
 * stex.com rest API description
 * This is API you can use to connect your application to stex.com exchange and utilize all available features. All requests should go to the https://api3.stex.com followed by the one of the endpoint described below. The enpoints placed inside the /public section do not require authentication, all others requests should be authenticated with credentials you can get in your profile at https://app.stex.com/en/profile We also have a web-socket API present that has a number of advantages and is recommended way to connect to get the updates of the trading information To test API using this tool, please specify https://apidocs.stex.com/oauth2-redirect.html as Redirect URL in your API v3 client at https://app.stex.com/en/profile/settings 
 *
 * OpenAPI spec version: v3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.baeldung.petstore.client.api;

import java.math.BigDecimal;

import com.pseq.stex.client.api.TradingApi;
import com.pseq.stex.client.model.DeletedOrdersResponse;
import com.pseq.stex.client.model.OrderResponse;
import com.pseq.stex.client.model.OrdersResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TradingApi
 */
@Ignore
public class TradingApiTest {

    private final TradingApi api = new TradingApi();

    /**
     * Cancel order
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void tradingOrderOrderIdDeleteTest() {
        Integer orderId = null;
        DeletedOrdersResponse response = api.tradingOrderOrderIdDelete(orderId);

        // TODO: test validations
    }
    /**
     * Get a single order
     *
     * Get information about the given order 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void tradingOrderOrderIdGetTest() {
        Integer orderId = null;
        OrderResponse response = api.tradingOrderOrderIdGet(orderId);

        // TODO: test validations
    }
    /**
     * Delete active orders for given currency pair
     *
     * Puts an request to delete all active (processing or pending) of the given currency pair orders to orders processing queue
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void tradingOrdersCurrencyPairIdDeleteTest() {
        Integer currencyPairId = null;
        DeletedOrdersResponse response = api.tradingOrdersCurrencyPairIdDelete(currencyPairId);

        // TODO: test validations
    }
    /**
     * List your currently open orders for given currency pair
     *
     * List of your currently open orders for certain currency pair.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void tradingOrdersCurrencyPairIdGetTest() {
        Integer currencyPairId = null;
        OrdersResponse response = api.tradingOrdersCurrencyPairIdGet(currencyPairId);

        // TODO: test validations
    }
    /**
     * Create new order and put it to the orders processing queue
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void tradingOrdersCurrencyPairIdPostTest() {
        Integer currencyPairId = null;
        String type = null;
        BigDecimal amount = null;
        BigDecimal price = null;
        BigDecimal triggerPrice = null;
        OrderResponse response = api.tradingOrdersCurrencyPairIdPost(currencyPairId, type, amount, price, triggerPrice);

        // TODO: test validations
    }
    /**
     * Delete all active orders
     *
     * Puts an request to delete all active (processing or pending) orders to orders processing queue
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void tradingOrdersDeleteTest() {
        DeletedOrdersResponse response = api.tradingOrdersDelete();

        // TODO: test validations
    }
    /**
     * List your currently open orders
     *
     * List of your currently open orders.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void tradingOrdersGetTest() {
        OrdersResponse response = api.tradingOrdersGet();

        // TODO: test validations
    }
}
