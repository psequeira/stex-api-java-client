package com.baeldung.petstore.client.api;

import com.pseq.stex.client.invoker.ApiClient;

import java.math.BigDecimal;
import com.pseq.stex.client.model.DeletedOrdersResponse;
import com.pseq.stex.client.model.OrderResponse;
import com.pseq.stex.client.model.OrdersResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-05-02T20:38:18.888Z[GMT]")@Component("com.baeldung.petstore.client.api.TradingApi")
public class TradingApi {
    private ApiClient apiClient;

    public TradingApi() {
        this(new ApiClient());
    }

    @Autowired
    public TradingApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Cancel order
     * 
     * <p><b>200</b> - Orders cancelling results
     * @param orderId The orderId parameter
     * @return DeletedOrdersResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DeletedOrdersResponse tradingOrderOrderIdDelete(Integer orderId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'orderId' is set
        if (orderId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'orderId' when calling tradingOrderOrderIdDelete");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("orderId", orderId);
        String path = UriComponentsBuilder.fromPath("/trading/order/{orderId}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<DeletedOrdersResponse> returnType = new ParameterizedTypeReference<DeletedOrdersResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get a single order
     * Get information about the given order 
     * <p><b>200</b> - Active order
     * @param orderId The orderId parameter
     * @return OrderResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public OrderResponse tradingOrderOrderIdGet(Integer orderId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'orderId' is set
        if (orderId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'orderId' when calling tradingOrderOrderIdGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("orderId", orderId);
        String path = UriComponentsBuilder.fromPath("/trading/order/{orderId}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<OrderResponse> returnType = new ParameterizedTypeReference<OrderResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Delete active orders for given currency pair
     * Puts an request to delete all active (processing or pending) of the given currency pair orders to orders processing queue
     * <p><b>200</b> - Orders cancelling results
     * @param currencyPairId The currencyPairId parameter
     * @return DeletedOrdersResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DeletedOrdersResponse tradingOrdersCurrencyPairIdDelete(Integer currencyPairId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'currencyPairId' is set
        if (currencyPairId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'currencyPairId' when calling tradingOrdersCurrencyPairIdDelete");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("currencyPairId", currencyPairId);
        String path = UriComponentsBuilder.fromPath("/trading/orders/{currencyPairId}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<DeletedOrdersResponse> returnType = new ParameterizedTypeReference<DeletedOrdersResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List your currently open orders for given currency pair
     * List of your currently open orders for certain currency pair.
     * <p><b>200</b> - List of active orders
     * @param currencyPairId The currencyPairId parameter
     * @return OrdersResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public OrdersResponse tradingOrdersCurrencyPairIdGet(Integer currencyPairId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'currencyPairId' is set
        if (currencyPairId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'currencyPairId' when calling tradingOrdersCurrencyPairIdGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("currencyPairId", currencyPairId);
        String path = UriComponentsBuilder.fromPath("/trading/orders/{currencyPairId}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<OrdersResponse> returnType = new ParameterizedTypeReference<OrdersResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Create new order and put it to the orders processing queue
     * 
     * <p><b>200</b> - Success order create
     * @param currencyPairId The currencyPairId parameter
     * @param type The type parameter
     * @param amount The amount parameter
     * @param price The price parameter
     * @param triggerPrice The triggerPrice parameter
     * @return OrderResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public OrderResponse tradingOrdersCurrencyPairIdPost(Integer currencyPairId, String type, BigDecimal amount, BigDecimal price, BigDecimal triggerPrice) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'currencyPairId' is set
        if (currencyPairId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'currencyPairId' when calling tradingOrdersCurrencyPairIdPost");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("currencyPairId", currencyPairId);
        String path = UriComponentsBuilder.fromPath("/trading/orders/{currencyPairId}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        if (type != null)
            formParams.add("type", type);
        if (amount != null)
            formParams.add("amount", amount);
        if (price != null)
            formParams.add("price", price);
        if (triggerPrice != null)
            formParams.add("trigger_price", triggerPrice);

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<OrderResponse> returnType = new ParameterizedTypeReference<OrderResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Delete all active orders
     * Puts an request to delete all active (processing or pending) orders to orders processing queue
     * <p><b>200</b> - Orders cancelling results
     * @return DeletedOrdersResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DeletedOrdersResponse tradingOrdersDelete() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/trading/orders").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<DeletedOrdersResponse> returnType = new ParameterizedTypeReference<DeletedOrdersResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List your currently open orders
     * List of your currently open orders.
     * <p><b>200</b> - List of active orders
     * @return OrdersResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public OrdersResponse tradingOrdersGet() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/trading/orders").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<OrdersResponse> returnType = new ParameterizedTypeReference<OrdersResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
