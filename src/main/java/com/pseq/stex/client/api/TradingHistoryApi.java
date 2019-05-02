package com.pseq.stex.client.api;

import com.pseq.stex.client.invoker.ApiClient;

import com.pseq.stex.client.model.OrderDetailsResponse;
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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-05-02T20:38:18.888Z[GMT]")@Component("com.baeldung.petstore.client.api.TradingHistoryApi")
public class TradingHistoryApi {
    private ApiClient apiClient;

    public TradingHistoryApi() {
        this(new ApiClient());
    }

    @Autowired
    public TradingHistoryApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get past orders
     * Get the list of closed (finished, partial or cancelled) orders
     * <p><b>200</b> - List of orders
     * @param currencyPairId The currencyPairId parameter
     * @param orderStatus The orderStatus parameter
     * @param timeStart Datetime in iso format.
     * @param timeEnd Datetime in iso format.
     * @param limit The limit parameter
     * @param offset The offset parameter
     * @return OrdersResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public OrdersResponse reportsOrdersGet(Integer currencyPairId, String orderStatus, String timeStart, String timeEnd, Integer limit, Integer offset) throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/reports/orders").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "currencyPairId", currencyPairId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "orderStatus", orderStatus));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "timeStart", timeStart));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "timeEnd", timeEnd));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<OrdersResponse> returnType = new ParameterizedTypeReference<OrdersResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get specified order details
     * Get trades and fees information for given order
     * <p><b>200</b> - Lists of order trades and fees
     * @param orderId The orderId parameter
     * @return OrderDetailsResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public OrderDetailsResponse reportsOrdersOrderIdGet(Integer orderId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'orderId' is set
        if (orderId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'orderId' when calling reportsOrdersOrderIdGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("orderId", orderId);
        String path = UriComponentsBuilder.fromPath("/reports/orders/{orderId}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<OrderDetailsResponse> returnType = new ParameterizedTypeReference<OrderDetailsResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
