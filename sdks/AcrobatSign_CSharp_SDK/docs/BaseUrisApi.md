# IO.Swagger.Api.BaseUrisApi

All URIs are relative to *http://localhost/api/rest/v6*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetBaseUris**](BaseUrisApi.md#getbaseuris) | **GET** /baseUris | Gets the base uri to access other APIs. In case other APIs are accessed from a different end point, it will be considered an invalid request.


<a name="getbaseuris"></a>
# **GetBaseUris**
> BaseUriInfo GetBaseUris (string authorization)

Gets the base uri to access other APIs. In case other APIs are accessed from a different end point, it will be considered an invalid request.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.baseUris;

namespace Example
{
    public class GetBaseUrisExample
    {
        public void main()
        {
            var apiInstance = new BaseUrisApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with any of the valid scopes<ul></ul>in the format <b>'Bearer {accessToken}'.

            try
            {
                // Gets the base uri to access other APIs. In case other APIs are accessed from a different end point, it will be considered an invalid request.
                BaseUriInfo result = apiInstance.GetBaseUris(authorization);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling BaseUrisApi.GetBaseUris: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with any of the valid scopes&lt;ul&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 

### Return type

[**BaseUriInfo**](BaseUriInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

