# IO.Swagger.Api.WebhooksApi

All URIs are relative to *http://localhost/api/rest/v6*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateWebhook**](WebhooksApi.md#createwebhook) | **POST** /webhooks | Creates a webhook.
[**DeleteWebhook**](WebhooksApi.md#deletewebhook) | **DELETE** /webhooks/{webhookId} | Deletes a webhook.
[**GetWebhookInfo**](WebhooksApi.md#getwebhookinfo) | **GET** /webhooks/{webhookId} | Retrieves the details of a webhook.
[**GetWebhooks**](WebhooksApi.md#getwebhooks) | **GET** /webhooks | Retrieves webhooks for a user.
[**UpdateWebhook**](WebhooksApi.md#updatewebhook) | **PUT** /webhooks/{webhookId} | Updates a webhook.
[**UpdateWebhookState**](WebhooksApi.md#updatewebhookstate) | **PUT** /webhooks/{webhookId}/state | Updates the state of a webhook identified by webhookId in the path.


<a name="createwebhook"></a>
# **CreateWebhook**
> WebhookCreationResponse CreateWebhook (string authorization, WebhookInfo webhookInfo, string xApiUser = null, string xOnBehalfOfUser = null)

Creates a webhook.

This is a primary endpoint which is used to create a new webhook. A webhook can only be created in ACTIVE state. Currently, webhooks are supported at four scopes - Account, Group, User and Resource. <br/> <br/> Before creating a webhook successfully at any of these scopes, Acrobat Sign <a href='https://www.adobe.io/apis/documentcloud/sign/docs.html#!adobeio/adobeio-documentation/master/sign/webhooks.md#verificationofintentofthewebhookurl'>verifies</a> that the webhook URL that is provided in the registration request really intends to receive notifications and is a valid URL. <br/>There is a defined mechanism for this validation where Acrobat Sign makes an HTTPS GET request to the webhook URL. This request has a custom HTTP header X-AdobeSign-ClientId. The value of this header is the client ID of the application that is requesting to create the webhook. To register a webhook successfully, the webhook URL must respond to this verification request with an HTTPS 2XX response code, and also it must send back the same client ID value in one of the following two ways:<ol><li>In a custom response header, X-AdobeSign-ClientId. This is the same header which was passed in the request, and can be echoed back in the response.</li><li> In the JSON response body of the response with the key of xAdobeSignClientId and its value being the same client ID that was sent in the request. </li></ol><p>On successful registration,  Acrobat Sign sends a success response (any HTTPS 2XX code) to your client app with the unique webhook identifier and a Location header, which contains the URL of the webhook resource created in Acrobat Sign.<br/> To learn more, please refer <a href='https://www.adobe.io/apis/documentcloud/sign/docs.html#!adobeio/adobeio-documentation/master/sign/webhooks.md'>Webhooks in Acrobat Sign Guide</a>.</p>

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.webhooks;

namespace Example
{
    public class CreateWebhookExample
    {
        public void main()
        {
            var apiInstance = new WebhooksApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('webhook_write')\" oncontextmenu=\"this.href=oauthDoc('webhook_write')\" target=\"oauthDoc\">webhook_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var webhookInfo = new WebhookInfo(); // WebhookInfo | Information about the webhook that you want to create
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 

            try
            {
                // Creates a webhook.
                WebhookCreationResponse result = apiInstance.CreateWebhook(authorization, webhookInfo, xApiUser, xOnBehalfOfUser);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling WebhooksApi.CreateWebhook: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;webhook_write&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;webhook_write&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;webhook_write&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **webhookInfo** | [**WebhookInfo**](WebhookInfo.md)| Information about the webhook that you want to create | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 

### Return type

[**WebhookCreationResponse**](WebhookCreationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="deletewebhook"></a>
# **DeleteWebhook**
> void DeleteWebhook (string authorization, string ifMatch, string webhookId, string xApiUser = null, string xOnBehalfOfUser = null)

Deletes a webhook.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.webhooks;

namespace Example
{
    public class DeleteWebhookExample
    {
        public void main()
        {
            var apiInstance = new WebhooksApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('webhook_retention')\" oncontextmenu=\"this.href=oauthDoc('webhook_retention')\" target=\"oauthDoc\">webhook_retention</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var ifMatch = ifMatch_example;  // string | The server will only update the resource if it matches the listed ETag otherwise error RESOURCE_MODIFIED(412) is returned.
            var webhookId = webhookId_example;  // string | The webhook identifier, as returned by the webhook creation API or retrieved from the API to fetch webhooks.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 

            try
            {
                // Deletes a webhook.
                apiInstance.DeleteWebhook(authorization, ifMatch, webhookId, xApiUser, xOnBehalfOfUser);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling WebhooksApi.DeleteWebhook: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;webhook_retention&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;webhook_retention&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;webhook_retention&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **ifMatch** | **string**| The server will only update the resource if it matches the listed ETag otherwise error RESOURCE_MODIFIED(412) is returned. | 
 **webhookId** | **string**| The webhook identifier, as returned by the webhook creation API or retrieved from the API to fetch webhooks. | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getwebhookinfo"></a>
# **GetWebhookInfo**
> WebhookInfo GetWebhookInfo (string authorization, string webhookId, string xApiUser = null, string xOnBehalfOfUser = null, string ifNoneMatch = null)

Retrieves the details of a webhook.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.webhooks;

namespace Example
{
    public class GetWebhookInfoExample
    {
        public void main()
        {
            var apiInstance = new WebhooksApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('webhook_read')\" oncontextmenu=\"this.href=oauthDoc('webhook_read')\" target=\"oauthDoc\">webhook_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var webhookId = webhookId_example;  // string | The webhook identifier, as returned by the webhook creation API or retrieved from the API to fetch webhooks.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 
            var ifNoneMatch = ifNoneMatch_example;  // string | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed. (optional) 

            try
            {
                // Retrieves the details of a webhook.
                WebhookInfo result = apiInstance.GetWebhookInfo(authorization, webhookId, xApiUser, xOnBehalfOfUser, ifNoneMatch);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling WebhooksApi.GetWebhookInfo: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;webhook_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;webhook_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;webhook_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **webhookId** | **string**| The webhook identifier, as returned by the webhook creation API or retrieved from the API to fetch webhooks. | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 
 **ifNoneMatch** | **string**| Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn&#39;t changed. | [optional] 

### Return type

[**WebhookInfo**](WebhookInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getwebhooks"></a>
# **GetWebhooks**
> UserWebhooks GetWebhooks (string authorization, string xApiUser = null, string xOnBehalfOfUser = null, bool? showInActiveWebhooks = null, string scope = null, string resourceType = null, string cursor = null, int? pageSize = null)

Retrieves webhooks for a user.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.webhooks;

namespace Example
{
    public class GetWebhooksExample
    {
        public void main()
        {
            var apiInstance = new WebhooksApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('webhook_read')\" oncontextmenu=\"this.href=oauthDoc('webhook_read')\" target=\"oauthDoc\">webhook_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 
            var showInActiveWebhooks = true;  // bool? | A query parameter to fetch all the inactive webhooks along with the active webhooks. (optional) 
            var scope = scope_example;  // string | Scope of webhook. The possible values are ACCOUNT, GROUP, USER or RESOURCE (optional) 
            var resourceType = resourceType_example;  // string | The type of resource on which webhook was created. The possible values are AGREEMENT, WIDGET, MEGASIGN and LIBRARY_DOCUMENT. (optional) 
            var cursor = cursor_example;  // string | Used to navigate through the pages. If not provided, returns the first page. (optional) 
            var pageSize = 56;  // int? | Number of intended items in the response page. If not provided, it is decided by the application settings. (optional) 

            try
            {
                // Retrieves webhooks for a user.
                UserWebhooks result = apiInstance.GetWebhooks(authorization, xApiUser, xOnBehalfOfUser, showInActiveWebhooks, scope, resourceType, cursor, pageSize);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling WebhooksApi.GetWebhooks: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;webhook_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;webhook_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;webhook_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 
 **showInActiveWebhooks** | **bool?**| A query parameter to fetch all the inactive webhooks along with the active webhooks. | [optional] 
 **scope** | **string**| Scope of webhook. The possible values are ACCOUNT, GROUP, USER or RESOURCE | [optional] 
 **resourceType** | **string**| The type of resource on which webhook was created. The possible values are AGREEMENT, WIDGET, MEGASIGN and LIBRARY_DOCUMENT. | [optional] 
 **cursor** | **string**| Used to navigate through the pages. If not provided, returns the first page. | [optional] 
 **pageSize** | **int?**| Number of intended items in the response page. If not provided, it is decided by the application settings. | [optional] 

### Return type

[**UserWebhooks**](UserWebhooks.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="updatewebhook"></a>
# **UpdateWebhook**
> void UpdateWebhook (string authorization, string ifMatch, string webhookId, WebhookInfo webhookInfo, string xApiUser = null, string xOnBehalfOfUser = null)

Updates a webhook.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.webhooks;

namespace Example
{
    public class UpdateWebhookExample
    {
        public void main()
        {
            var apiInstance = new WebhooksApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('webhook_write')\" oncontextmenu=\"this.href=oauthDoc('webhook_write')\" target=\"oauthDoc\">webhook_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var ifMatch = ifMatch_example;  // string | The server will only update the resource if it matches the listed ETag otherwise error RESOURCE_MODIFIED(412) is returned.
            var webhookId = webhookId_example;  // string | The webhook identifier, as returned by the webhook creation API or retrieved from the API to fetch webhooks.
            var webhookInfo = new WebhookInfo(); // WebhookInfo | Information necessary to update a webhook
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 

            try
            {
                // Updates a webhook.
                apiInstance.UpdateWebhook(authorization, ifMatch, webhookId, webhookInfo, xApiUser, xOnBehalfOfUser);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling WebhooksApi.UpdateWebhook: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;webhook_write&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;webhook_write&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;webhook_write&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **ifMatch** | **string**| The server will only update the resource if it matches the listed ETag otherwise error RESOURCE_MODIFIED(412) is returned. | 
 **webhookId** | **string**| The webhook identifier, as returned by the webhook creation API or retrieved from the API to fetch webhooks. | 
 **webhookInfo** | [**WebhookInfo**](WebhookInfo.md)| Information necessary to update a webhook | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="updatewebhookstate"></a>
# **UpdateWebhookState**
> void UpdateWebhookState (string authorization, string ifMatch, string webhookId, WebhookStateInfo webhookStateInfo, string xApiUser = null, string xOnBehalfOfUser = null)

Updates the state of a webhook identified by webhookId in the path.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.webhooks;

namespace Example
{
    public class UpdateWebhookStateExample
    {
        public void main()
        {
            var apiInstance = new WebhooksApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('webhook_write')\" oncontextmenu=\"this.href=oauthDoc('webhook_write')\" target=\"oauthDoc\">webhook_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var ifMatch = ifMatch_example;  // string | The server will only update the resource if it matches the listed ETag otherwise error RESOURCE_MODIFIED(412) is returned.
            var webhookId = webhookId_example;  // string | The webhook identifier, as returned by the webhook creation API or retrieved from the API to fetch webhooks.
            var webhookStateInfo = new WebhookStateInfo(); // WebhookStateInfo | 
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 

            try
            {
                // Updates the state of a webhook identified by webhookId in the path.
                apiInstance.UpdateWebhookState(authorization, ifMatch, webhookId, webhookStateInfo, xApiUser, xOnBehalfOfUser);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling WebhooksApi.UpdateWebhookState: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;webhook_write&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;webhook_write&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;webhook_write&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **ifMatch** | **string**| The server will only update the resource if it matches the listed ETag otherwise error RESOURCE_MODIFIED(412) is returned. | 
 **webhookId** | **string**| The webhook identifier, as returned by the webhook creation API or retrieved from the API to fetch webhooks. | 
 **webhookStateInfo** | [**WebhookStateInfo**](WebhookStateInfo.md)|  | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

