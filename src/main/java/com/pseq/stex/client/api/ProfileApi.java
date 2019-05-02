package com.pseq.stex.client.api;

import com.pseq.stex.client.invoker.ApiClient;

import java.math.BigDecimal;
import com.pseq.stex.client.model.DepositResponse;
import com.pseq.stex.client.model.DepositsResponse;
import com.pseq.stex.client.model.OperationStatus;
import com.pseq.stex.client.model.UserResponse;
import com.pseq.stex.client.model.WalletAddressResponse;
import com.pseq.stex.client.model.WalletResponse;
import com.pseq.stex.client.model.WalletWithAddressResponse;
import com.pseq.stex.client.model.WalletsResponse;
import com.pseq.stex.client.model.WithdrawalResponse;
import com.pseq.stex.client.model.WithdrawalsResponse;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-05-02T20:38:18.888Z[GMT]")@Component("com.baeldung.petstore.client.api.ProfileApi")
public class ProfileApi {
    private ApiClient apiClient;

    public ProfileApi() {
        this(new ApiClient());
    }

    @Autowired
    public ProfileApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get a list of deposits made by user
     * Returns a list of deposits the user has made to the exchange according to the filters and parameters passed in the request. Allows to filter deposits by currency, date range etc.
     * <p><b>200</b> - Array of user deposits
     * @param currencyId the ID of the currency to filter results by
     * @param sort Sort direction. Results are always ordered by date. You may adjust the order direction here
     * @param timeStart Timestamp in millisecond
     * @param timeEnd Timestamp in millisecond
     * @param limit The limit parameter
     * @param offset The offset parameter
     * @return DepositsResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DepositsResponse profileDepositsGet(Integer currencyId, String sort, String timeStart, String timeEnd, Integer limit, Integer offset) throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/profile/deposits").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "currencyId", currencyId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort", sort));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "timeStart", timeStart));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "timeEnd", timeEnd));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<DepositsResponse> returnType = new ParameterizedTypeReference<DepositsResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get deposit by id
     * 
     * <p><b>200</b> - Single deposit
     * @param id The id parameter
     * @return DepositResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DepositResponse profileDepositsIdGet(String id) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling profileDepositsIdGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/profile/deposits/{id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<DepositResponse> returnType = new ParameterizedTypeReference<DepositResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Account information
     * Get general information about the current user
     * <p><b>200</b> - User information
     * @return UserResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UserResponse profileInfoGet() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/profile/info").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<UserResponse> returnType = new ParameterizedTypeReference<UserResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get deposit address for given wallet
     * 
     * <p><b>200</b> - Crypto address for deposit
     * @param walletId The walletId parameter
     * @return WalletAddressResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public WalletAddressResponse profileWalletsAddressWalletIdGet(String walletId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'walletId' is set
        if (walletId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'walletId' when calling profileWalletsAddressWalletIdGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("walletId", walletId);
        String path = UriComponentsBuilder.fromPath("/profile/wallets/address/{walletId}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<WalletAddressResponse> returnType = new ParameterizedTypeReference<WalletAddressResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Create new deposit address
     * This method allows to generate deposit address if no address was previously generated. It is also allowed to re-generate new address for some currencies.
     * <p><b>200</b> - Generted deposit address
     * @param walletId The walletId parameter
     * @return WalletAddressResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public WalletAddressResponse profileWalletsAddressWalletIdPost(String walletId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'walletId' is set
        if (walletId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'walletId' when calling profileWalletsAddressWalletIdPost");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("walletId", walletId);
        String path = UriComponentsBuilder.fromPath("/profile/wallets/address/{walletId}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<WalletAddressResponse> returnType = new ParameterizedTypeReference<WalletAddressResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Create a wallet for given currency
     * 
     * <p><b>200</b> - Wallet information
     * @param currencyId The currencyId parameter
     * @return WalletResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public WalletResponse profileWalletsCurrencyIdPost(Integer currencyId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'currencyId' is set
        if (currencyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'currencyId' when calling profileWalletsCurrencyIdPost");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("currencyId", currencyId);
        String path = UriComponentsBuilder.fromPath("/profile/wallets/{currencyId}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<WalletResponse> returnType = new ParameterizedTypeReference<WalletResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get a list of user wallets
     * 
     * <p><b>200</b> - Array of user wallets
     * @param sort Sort direction.
     * @param sortBy Sort direction.
     * @return WalletsResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public WalletsResponse profileWalletsGet(String sort, String sortBy) throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/profile/wallets").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort", sort));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sortBy", sortBy));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<WalletsResponse> returnType = new ParameterizedTypeReference<WalletsResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Single wallet information
     * 
     * <p><b>200</b> - Wallet information
     * @param walletId The walletId parameter
     * @return WalletWithAddressResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public WalletWithAddressResponse profileWalletsWalletIdGet(Integer walletId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'walletId' is set
        if (walletId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'walletId' when calling profileWalletsWalletIdGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("walletId", walletId);
        String path = UriComponentsBuilder.fromPath("/profile/wallets/{walletId}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<WalletWithAddressResponse> returnType = new ParameterizedTypeReference<WalletWithAddressResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Create withdrawal request
     * 
     * <p><b>200</b> - Withdrawal
     * @param currencyId The currencyId parameter
     * @param amount The amount parameter
     * @param address The address parameter
     * @param additionalAddress The additionalAddress parameter
     * @return WithdrawalResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public WithdrawalResponse profileWithdrawPost(Integer currencyId, BigDecimal amount, String address, String additionalAddress) throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/profile/withdraw").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        if (currencyId != null)
            formParams.add("currency_id", currencyId);
        if (amount != null)
            formParams.add("amount", amount);
        if (address != null)
            formParams.add("address", address);
        if (additionalAddress != null)
            formParams.add("additional_address", additionalAddress);

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<WithdrawalResponse> returnType = new ParameterizedTypeReference<WithdrawalResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Cancel unconfirmed withdrawal
     * 
     * <p><b>200</b> - Operation Status
     * @param withdrawalId The withdrawalId parameter
     * @return OperationStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public OperationStatus profileWithdrawWithdrawalIdDelete(String withdrawalId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'withdrawalId' is set
        if (withdrawalId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'withdrawalId' when calling profileWithdrawWithdrawalIdDelete");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("withdrawalId", withdrawalId);
        String path = UriComponentsBuilder.fromPath("/profile/withdraw/{withdrawalId}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<OperationStatus> returnType = new ParameterizedTypeReference<OperationStatus>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get a list of withdrawals made by user
     * 
     * <p><b>200</b> - Array of withdrawals
     * @param currencyId The currencyId parameter
     * @param sort Sort direction. Results are always ordered by date. You may adjust the order direction here
     * @param timeStart Timestamp
     * @param timeEnd Timestamp
     * @param limit The limit parameter
     * @param offset The offset parameter
     * @return WithdrawalsResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public WithdrawalsResponse profileWithdrawalsGet(Integer currencyId, String sort, Integer timeStart, Integer timeEnd, Integer limit, Integer offset) throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/profile/withdrawals").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "currency_id", currencyId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort", sort));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "timeStart", timeStart));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "timeEnd", timeEnd));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<WithdrawalsResponse> returnType = new ParameterizedTypeReference<WithdrawalsResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get withdrawal by id
     * 
     * <p><b>200</b> - Single withdrawal
     * @param id The id parameter
     * @return WithdrawalResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public WithdrawalResponse profileWithdrawalsIdGet(String id) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling profileWithdrawalsIdGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/profile/withdrawals/{id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<WithdrawalResponse> returnType = new ParameterizedTypeReference<WithdrawalResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
