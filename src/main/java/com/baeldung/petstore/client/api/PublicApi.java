package com.baeldung.petstore.client.api;

import com.pseq.stex.client.invoker.ApiClient;

import com.pseq.stex.client.model.CandlesResponse;
import com.pseq.stex.client.model.CurrenciesResponse;
import com.pseq.stex.client.model.CurrencyPairGroupsResponse;
import com.pseq.stex.client.model.CurrencyPairResponse;
import com.pseq.stex.client.model.CurrencyPairsResponse;
import com.pseq.stex.client.model.CurrencyResponse;
import com.pseq.stex.client.model.MarketResponse;
import com.pseq.stex.client.model.OrderbookResponse;
import com.pseq.stex.client.model.ServerTimeResponse;
import com.pseq.stex.client.model.TickerResponse;
import com.pseq.stex.client.model.TickersResponse;
import com.pseq.stex.client.model.TradesResponse;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-05-02T20:38:18.888Z[GMT]")@Component("com.baeldung.petstore.client.api.PublicApi")
public class PublicApi {
    private ApiClient apiClient;

    public PublicApi() {
        this(new ApiClient());
    }

    @Autowired
    public PublicApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * A list of candles for given currency pair
     * Provides a list of candles for the chart. Candles are always ordered in descending order (the latest are first)
     * <p><b>200</b> - List of candles
     * @param currencyPairId A currency pair ID you want to get candles for
     * @param candlesType Candle size 1 stays for 1 minute, 5 - 5 minutes and so on. 1D - stays for 1 day
     * @param timeStart Timestamp in second. Should be less then timeEnd
     * @param timeEnd Timestamp in second. Should be greater then timeStart
     * @param limit The limit parameter
     * @param offset The offset parameter
     * @return CandlesResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CandlesResponse publicChartCurrencyPairIdCandlesTypeGet(String currencyPairId, String candlesType, Integer timeStart, Integer timeEnd, Integer limit, Integer offset) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'currencyPairId' is set
        if (currencyPairId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'currencyPairId' when calling publicChartCurrencyPairIdCandlesTypeGet");
        }
        // verify the required parameter 'candlesType' is set
        if (candlesType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'candlesType' when calling publicChartCurrencyPairIdCandlesTypeGet");
        }
        // verify the required parameter 'timeStart' is set
        if (timeStart == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'timeStart' when calling publicChartCurrencyPairIdCandlesTypeGet");
        }
        // verify the required parameter 'timeEnd' is set
        if (timeEnd == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'timeEnd' when calling publicChartCurrencyPairIdCandlesTypeGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("currencyPairId", currencyPairId);
        uriVariables.put("candlesType", candlesType);
        String path = UriComponentsBuilder.fromPath("/public/chart/{currencyPairId}/{candlesType}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "timeStart", timeStart));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "timeEnd", timeEnd));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<CandlesResponse> returnType = new ParameterizedTypeReference<CandlesResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get currency info
     * 
     * <p><b>200</b> - Currency configuration
     * @param currencyId The currencyId parameter
     * @return CurrencyResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CurrencyResponse publicCurrenciesCurrencyIdGet(Integer currencyId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'currencyId' is set
        if (currencyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'currencyId' when calling publicCurrenciesCurrencyIdGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("currencyId", currencyId);
        String path = UriComponentsBuilder.fromPath("/public/currencies/{currencyId}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<CurrencyResponse> returnType = new ParameterizedTypeReference<CurrencyResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Available Currencies
     * Get list of avialable currencies. 
     * <p><b>200</b> - An array of currencies
     * @return CurrenciesResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CurrenciesResponse publicCurrenciesGet() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/public/currencies").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<CurrenciesResponse> returnType = new ParameterizedTypeReference<CurrenciesResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get currency pair information
     * 
     * <p><b>200</b> - Currency Pair
     * @param currencyPairId The currencyPairId parameter
     * @return CurrencyPairResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CurrencyPairResponse publicCurrencyPairsCurrencyPairIdGet(Integer currencyPairId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'currencyPairId' is set
        if (currencyPairId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'currencyPairId' when calling publicCurrencyPairsCurrencyPairIdGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("currencyPairId", currencyPairId);
        String path = UriComponentsBuilder.fromPath("/public/currency_pairs/{currencyPairId}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<CurrencyPairResponse> returnType = new ParameterizedTypeReference<CurrencyPairResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Available currency pairs for a given group
     * Returns a list of avialable currency pairs in the given currency pair group 
     * <p><b>200</b> - An array of currency pairs
     * @param currencyPairGroupId The currencyPairGroupId parameter
     * @return CurrencyPairsResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CurrencyPairsResponse publicCurrencyPairsGroupCurrencyPairGroupIdGet(Integer currencyPairGroupId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'currencyPairGroupId' is set
        if (currencyPairGroupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'currencyPairGroupId' when calling publicCurrencyPairsGroupCurrencyPairGroupIdGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("currencyPairGroupId", currencyPairGroupId);
        String path = UriComponentsBuilder.fromPath("/public/currency_pairs/group/{currencyPairGroupId}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<CurrencyPairsResponse> returnType = new ParameterizedTypeReference<CurrencyPairsResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Available currency pairs
     * Returns a list of avialable currency pairs in the given market if {code} is one of the values returned by /public/markets. Returns all available currency pairs if ALL passed as a {code} 
     * <p><b>200</b> - An array of currency pairs
     * @param code The code parameter
     * @return CurrencyPairsResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CurrencyPairsResponse publicCurrencyPairsListCodeGet(String code) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'code' when calling publicCurrencyPairsListCodeGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("code", code);
        String path = UriComponentsBuilder.fromPath("/public/currency_pairs/list/{code}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<CurrencyPairsResponse> returnType = new ParameterizedTypeReference<CurrencyPairsResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Available markets
     * Get list of all avialable markets 
     * <p><b>200</b> - An array of markets
     * @return MarketResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MarketResponse publicMarketsGet() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/public/markets").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<MarketResponse> returnType = new ParameterizedTypeReference<MarketResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Orderbook for given currency pair
     * 
     * <p><b>200</b> - Orderbook for currency pair
     * @param currencyPairId The currencyPairId parameter
     * @param limitBids Return only top N bids. Returns all if set to 0
     * @param limitAsks Return only top N asks. Returns all if set to 0 or absent
     * @return OrderbookResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public OrderbookResponse publicOrderbookCurrencyPairIdGet(Integer currencyPairId, Integer limitBids, Integer limitAsks) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'currencyPairId' is set
        if (currencyPairId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'currencyPairId' when calling publicOrderbookCurrencyPairIdGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("currencyPairId", currencyPairId);
        String path = UriComponentsBuilder.fromPath("/public/orderbook/{currencyPairId}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit_bids", limitBids));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit_asks", limitAsks));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<OrderbookResponse> returnType = new ParameterizedTypeReference<OrderbookResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Available currency pairs groups (as displayed at stex trading page)
     * Get list of all avialable currency pairs groups 
     * <p><b>200</b> - An array of currency pairs groups
     * @return CurrencyPairGroupsResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CurrencyPairGroupsResponse publicPairsGroupsGet() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/public/pairs-groups").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<CurrencyPairGroupsResponse> returnType = new ParameterizedTypeReference<CurrencyPairGroupsResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Test API is working and get server time
     * 
     * <p><b>200</b> - Server time
     * @return ServerTimeResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ServerTimeResponse publicPingGet() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/public/ping").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<ServerTimeResponse> returnType = new ParameterizedTypeReference<ServerTimeResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Ticker for currency pair
     * Returns last 24H information about currency pair ticker 
     * <p><b>200</b> - Ticker for given currency pair
     * @param currencyPairId The currencyPairId parameter
     * @return TickerResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TickerResponse publicTickerCurrencyPairIdGet(String currencyPairId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'currencyPairId' is set
        if (currencyPairId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'currencyPairId' when calling publicTickerCurrencyPairIdGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("currencyPairId", currencyPairId);
        String path = UriComponentsBuilder.fromPath("/public/ticker/{currencyPairId}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<TickerResponse> returnType = new ParameterizedTypeReference<TickerResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Tickers list for all currency pairs
     * Returns last 24H information about every currency pair. 
     * <p><b>200</b> - An array of currency pair tickers
     * @return List&lt;TickersResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<TickersResponse> publicTickerGet() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/public/ticker").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<TickersResponse>> returnType = new ParameterizedTypeReference<List<TickersResponse>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Trades for given currency pair
     * 
     * <p><b>200</b> - An array of trades
     * @param currencyPairId The currencyPairId parameter
     * @param sort Direction of the sort - ASCending or DESCending by trade timestamp
     * @param from The timestamp in millisecond
     * @param till The timestamp in millisecond
     * @param limit The limit parameter
     * @param offset The offset parameter
     * @return TradesResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TradesResponse publicTradesCurrencyPairIdGet(String currencyPairId, String sort, Integer from, Integer till, Integer limit, Integer offset) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'currencyPairId' is set
        if (currencyPairId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'currencyPairId' when calling publicTradesCurrencyPairIdGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("currencyPairId", currencyPairId);
        String path = UriComponentsBuilder.fromPath("/public/trades/{currencyPairId}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort", sort));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "till", till));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<TradesResponse> returnType = new ParameterizedTypeReference<TradesResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
