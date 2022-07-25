# IO.Swagger.Api.MegaSignsApi

All URIs are relative to *http://localhost/api/rest/v6*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateMegaSign**](MegaSignsApi.md#createmegasign) | **POST** /megaSigns | Send an agreement out for signature to multiple recipients. Each recipient will receive and sign their own copy of the agreement.
[**GetChildAgreementsInfoFile**](MegaSignsApi.md#getchildagreementsinfofile) | **GET** /megaSigns/{megaSignId}/childAgreementsInfo/{childAgreementsInfoFileId} | Retrieves the file stream of the original childAgreementsInfoFile that was uploaded by sender while creating the MegaSign.
[**GetEvents**](MegaSignsApi.md#getevents) | **GET** /megaSigns/{megaSignId}/events | Retrieves the events information for the MegaSign parent agreement.
[**GetMegaSignChildAgreements**](MegaSignsApi.md#getmegasignchildagreements) | **GET** /megaSigns/{megaSignId}/agreements | Get all the child agreements of the specified MegaSign parent agreement.
[**GetMegaSignCombinedDocument**](MegaSignsApi.md#getmegasigncombineddocument) | **GET** /megaSigns/{megaSignId}/combinedDocument | Retrieves a single combined PDF document for the documents associated with the MegaSign parent agreement.
[**GetMegaSignFormData**](MegaSignsApi.md#getmegasignformdata) | **GET** /megaSigns/{megaSignId}/formData | Retrieves data entered by recipients into interactive form fields at the time they signed the child agreements of the specified MegaSign agreement
[**GetMegaSignInfo**](MegaSignsApi.md#getmegasigninfo) | **GET** /megaSigns/{megaSignId} | Get detailed information of the specified MegaSign parent agreement.
[**GetMegaSignView**](MegaSignsApi.md#getmegasignview) | **POST** /megaSigns/{megaSignId}/views | Retrieves the requested views of mega sign agreement.
[**GetMegaSigns**](MegaSignsApi.md#getmegasigns) | **GET** /megaSigns | Retrieves MegaSign parent agreements for a user.
[**UpdateMegaSignState**](MegaSignsApi.md#updatemegasignstate) | **PUT** /megaSigns/{megaSignId}/state | Updates the state of a MegaSign identified by MegaSignId in the path.


<a name="createmegasign"></a>
# **CreateMegaSign**
> MegaSignCreationResponse CreateMegaSign (string authorization, MegaSignCreationInfo megaSignInfo, string xApiUser = null, string xOnBehalfOfUser = null)

Send an agreement out for signature to multiple recipients. Each recipient will receive and sign their own copy of the agreement.

This is a primary endpoint which is used to create a new megaSign. A megaSign can be created using transientDocument, libraryDocument or a URL. You can create a megaSign in <b>IN_PROCESS</b> - Create a megaSign in this state to immediately send it. You can use the PUT/megaSigns/{megaSignId}/state endpoint to transition the state of megaSign. An allowed transition would follow the following sequence: IN_PROCESS -> CANCELLED.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.megaSigns;

namespace Example
{
    public class CreateMegaSignExample
    {
        public void main()
        {
            var apiInstance = new MegaSignsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_write')\" oncontextmenu=\"this.href=oauthDoc('agreement_write')\" target=\"oauthDoc\">agreement_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var megaSignInfo = new MegaSignCreationInfo(); // MegaSignCreationInfo | Information about the MegaSign that you want to send.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 

            try
            {
                // Send an agreement out for signature to multiple recipients. Each recipient will receive and sign their own copy of the agreement.
                MegaSignCreationResponse result = apiInstance.CreateMegaSign(authorization, megaSignInfo, xApiUser, xOnBehalfOfUser);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling MegaSignsApi.CreateMegaSign: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_write&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_write&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_write&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **megaSignInfo** | [**MegaSignCreationInfo**](MegaSignCreationInfo.md)| Information about the MegaSign that you want to send. | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 

### Return type

[**MegaSignCreationResponse**](MegaSignCreationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getchildagreementsinfofile"></a>
# **GetChildAgreementsInfoFile**
> byte[] GetChildAgreementsInfoFile (string authorization, string megaSignId, string childAgreementsInfoFileId, string xApiUser = null, string xOnBehalfOfUser = null, string ifNoneMatch = null)

Retrieves the file stream of the original childAgreementsInfoFile that was uploaded by sender while creating the MegaSign.

CSV file stream containing form data information

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.megaSigns;

namespace Example
{
    public class GetChildAgreementsInfoFileExample
    {
        public void main()
        {
            var apiInstance = new MegaSignsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_read')\" oncontextmenu=\"this.href=oauthDoc('agreement_read')\" target=\"oauthDoc\">agreement_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var megaSignId = megaSignId_example;  // string | The identifier of the MegaSign parent agreement, as returned by the megaSign creation API or retrieved from the API to fetch megaSign agreements
            var childAgreementsInfoFileId = childAgreementsInfoFileId_example;  // string | The identifier of the childAgreementsInfoFile that has been uploaded by sender while creating the megaSign or retrieved from the API to fetch megaSignInfo 
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 
            var ifNoneMatch = ifNoneMatch_example;  // string | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed. (optional) 

            try
            {
                // Retrieves the file stream of the original childAgreementsInfoFile that was uploaded by sender while creating the MegaSign.
                byte[] result = apiInstance.GetChildAgreementsInfoFile(authorization, megaSignId, childAgreementsInfoFileId, xApiUser, xOnBehalfOfUser, ifNoneMatch);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling MegaSignsApi.GetChildAgreementsInfoFile: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **megaSignId** | **string**| The identifier of the MegaSign parent agreement, as returned by the megaSign creation API or retrieved from the API to fetch megaSign agreements | 
 **childAgreementsInfoFileId** | **string**| The identifier of the childAgreementsInfoFile that has been uploaded by sender while creating the megaSign or retrieved from the API to fetch megaSignInfo  | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 
 **ifNoneMatch** | **string**| Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn&#39;t changed. | [optional] 

### Return type

**byte[]**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getevents"></a>
# **GetEvents**
> MegasignEventList GetEvents (string authorization, string megaSignId, string xApiUser = null, string xOnBehalfOfUser = null, string ifNoneMatch = null)

Retrieves the events information for the MegaSign parent agreement.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.megaSigns;

namespace Example
{
    public class GetEventsExample
    {
        public void main()
        {
            var apiInstance = new MegaSignsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_read')\" oncontextmenu=\"this.href=oauthDoc('agreement_read')\" target=\"oauthDoc\">agreement_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var megaSignId = megaSignId_example;  // string | The identifier of the MegaSign parent agreement, as returned by the megaSign creation API or retrieved from the API to fetch megaSign agreements
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 
            var ifNoneMatch = ifNoneMatch_example;  // string | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed. (optional) 

            try
            {
                // Retrieves the events information for the MegaSign parent agreement.
                MegasignEventList result = apiInstance.GetEvents(authorization, megaSignId, xApiUser, xOnBehalfOfUser, ifNoneMatch);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling MegaSignsApi.GetEvents: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **megaSignId** | **string**| The identifier of the MegaSign parent agreement, as returned by the megaSign creation API or retrieved from the API to fetch megaSign agreements | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 
 **ifNoneMatch** | **string**| Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn&#39;t changed. | [optional] 

### Return type

[**MegasignEventList**](MegasignEventList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getmegasignchildagreements"></a>
# **GetMegaSignChildAgreements**
> MegaSignChildAgreements GetMegaSignChildAgreements (string authorization, string megaSignId, string xApiUser = null, string xOnBehalfOfUser = null, string cursor = null, int? pageSize = null)

Get all the child agreements of the specified MegaSign parent agreement.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.megaSigns;

namespace Example
{
    public class GetMegaSignChildAgreementsExample
    {
        public void main()
        {
            var apiInstance = new MegaSignsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_read')\" oncontextmenu=\"this.href=oauthDoc('agreement_read')\" target=\"oauthDoc\">agreement_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var megaSignId = megaSignId_example;  // string | The identifier of the MegaSign parent agreement, as returned by the megaSign creation API or retrieved from the API to fetch megaSign agreements
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 
            var cursor = cursor_example;  // string | Used to navigate through the pages. If not provided, returns the first page. (optional) 
            var pageSize = 56;  // int? | Number of intended items in the response page. If not provided, it is decided by the application settings. (optional) 

            try
            {
                // Get all the child agreements of the specified MegaSign parent agreement.
                MegaSignChildAgreements result = apiInstance.GetMegaSignChildAgreements(authorization, megaSignId, xApiUser, xOnBehalfOfUser, cursor, pageSize);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling MegaSignsApi.GetMegaSignChildAgreements: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **megaSignId** | **string**| The identifier of the MegaSign parent agreement, as returned by the megaSign creation API or retrieved from the API to fetch megaSign agreements | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 
 **cursor** | **string**| Used to navigate through the pages. If not provided, returns the first page. | [optional] 
 **pageSize** | **int?**| Number of intended items in the response page. If not provided, it is decided by the application settings. | [optional] 

### Return type

[**MegaSignChildAgreements**](MegaSignChildAgreements.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getmegasigncombineddocument"></a>
# **GetMegaSignCombinedDocument**
> byte[] GetMegaSignCombinedDocument (string authorization, string megaSignId, string xApiUser = null, string xOnBehalfOfUser = null, string ifNoneMatch = null, bool? attachAuditReport = null)

Retrieves a single combined PDF document for the documents associated with the MegaSign parent agreement.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.megaSigns;

namespace Example
{
    public class GetMegaSignCombinedDocumentExample
    {
        public void main()
        {
            var apiInstance = new MegaSignsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_read')\" oncontextmenu=\"this.href=oauthDoc('agreement_read')\" target=\"oauthDoc\">agreement_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var megaSignId = megaSignId_example;  // string | The identifier of the MegaSign parent agreement, as returned by the megaSign creation API or retrieved from the API to fetch megaSign agreements
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 
            var ifNoneMatch = ifNoneMatch_example;  // string | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed. (optional) 
            var attachAuditReport = true;  // bool? | When set to true attach an audit report to the MegaSign document PDF. Default value will be false. (optional) 

            try
            {
                // Retrieves a single combined PDF document for the documents associated with the MegaSign parent agreement.
                byte[] result = apiInstance.GetMegaSignCombinedDocument(authorization, megaSignId, xApiUser, xOnBehalfOfUser, ifNoneMatch, attachAuditReport);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling MegaSignsApi.GetMegaSignCombinedDocument: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **megaSignId** | **string**| The identifier of the MegaSign parent agreement, as returned by the megaSign creation API or retrieved from the API to fetch megaSign agreements | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 
 **ifNoneMatch** | **string**| Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn&#39;t changed. | [optional] 
 **attachAuditReport** | **bool?**| When set to true attach an audit report to the MegaSign document PDF. Default value will be false. | [optional] 

### Return type

**byte[]**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/pdf, application/pdf;encoding=base64

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getmegasignformdata"></a>
# **GetMegaSignFormData**
> byte[] GetMegaSignFormData (string authorization, string megaSignId, string xApiUser = null, string xOnBehalfOfUser = null)

Retrieves data entered by recipients into interactive form fields at the time they signed the child agreements of the specified MegaSign agreement

CSV file stream containing form data information

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.megaSigns;

namespace Example
{
    public class GetMegaSignFormDataExample
    {
        public void main()
        {
            var apiInstance = new MegaSignsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_read')\" oncontextmenu=\"this.href=oauthDoc('agreement_read')\" target=\"oauthDoc\">agreement_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var megaSignId = megaSignId_example;  // string | The identifier of the MegaSign parent agreement, as returned by the megaSign creation API or retrieved from the API to fetch megaSign agreements
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 

            try
            {
                // Retrieves data entered by recipients into interactive form fields at the time they signed the child agreements of the specified MegaSign agreement
                byte[] result = apiInstance.GetMegaSignFormData(authorization, megaSignId, xApiUser, xOnBehalfOfUser);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling MegaSignsApi.GetMegaSignFormData: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **megaSignId** | **string**| The identifier of the MegaSign parent agreement, as returned by the megaSign creation API or retrieved from the API to fetch megaSign agreements | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 

### Return type

**byte[]**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getmegasigninfo"></a>
# **GetMegaSignInfo**
> MegaSignCreationInfo GetMegaSignInfo (string authorization, string megaSignId, string xApiUser = null, string xOnBehalfOfUser = null, string ifNoneMatch = null)

Get detailed information of the specified MegaSign parent agreement.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.megaSigns;

namespace Example
{
    public class GetMegaSignInfoExample
    {
        public void main()
        {
            var apiInstance = new MegaSignsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_read')\" oncontextmenu=\"this.href=oauthDoc('agreement_read')\" target=\"oauthDoc\">agreement_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var megaSignId = megaSignId_example;  // string | The identifier of the MegaSign parent agreement, as returned by the megaSign creation API or retrieved from the API to fetch megaSign agreements
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 
            var ifNoneMatch = ifNoneMatch_example;  // string | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed. (optional) 

            try
            {
                // Get detailed information of the specified MegaSign parent agreement.
                MegaSignCreationInfo result = apiInstance.GetMegaSignInfo(authorization, megaSignId, xApiUser, xOnBehalfOfUser, ifNoneMatch);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling MegaSignsApi.GetMegaSignInfo: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **megaSignId** | **string**| The identifier of the MegaSign parent agreement, as returned by the megaSign creation API or retrieved from the API to fetch megaSign agreements | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 
 **ifNoneMatch** | **string**| Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn&#39;t changed. | [optional] 

### Return type

[**MegaSignCreationInfo**](MegaSignCreationInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getmegasignview"></a>
# **GetMegaSignView**
> MegaSignViewResponse GetMegaSignView (string authorization, string megaSignId, MegaSignViewInfo megaSignViewInfo, string xApiUser = null, string xOnBehalfOfUser = null)

Retrieves the requested views of mega sign agreement.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.megaSigns;

namespace Example
{
    public class GetMegaSignViewExample
    {
        public void main()
        {
            var apiInstance = new MegaSignsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_read')\" oncontextmenu=\"this.href=oauthDoc('agreement_read')\" target=\"oauthDoc\">agreement_read</a> - agreement read is always required</li><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('user_login')\" oncontextmenu=\"this.href=oauthDoc('user_login')\" target=\"oauthDoc\">user_login</a> - Required additionally if the autoLoginUser parameter is set to true</li></ul>in the format <b>'Bearer {accessToken}'.
            var megaSignId = megaSignId_example;  // string | The identifier of the MegaSign parent agreement, as returned by the megaSign creation API or retrieved from the API to fetch megaSign agreements
            var megaSignViewInfo = new MegaSignViewInfo(); // MegaSignViewInfo | Name of the required view and its desired configuration.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 

            try
            {
                // Retrieves the requested views of mega sign agreement.
                MegaSignViewResponse result = apiInstance.GetMegaSignView(authorization, megaSignId, megaSignViewInfo, xApiUser, xOnBehalfOfUser);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling MegaSignsApi.GetMegaSignView: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_read&lt;/a&gt; - agreement read is always required&lt;/li&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;user_login&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;user_login&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;user_login&lt;/a&gt; - Required additionally if the autoLoginUser parameter is set to true&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **megaSignId** | **string**| The identifier of the MegaSign parent agreement, as returned by the megaSign creation API or retrieved from the API to fetch megaSign agreements | 
 **megaSignViewInfo** | [**MegaSignViewInfo**](MegaSignViewInfo.md)| Name of the required view and its desired configuration. | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 

### Return type

[**MegaSignViewResponse**](MegaSignViewResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getmegasigns"></a>
# **GetMegaSigns**
> MegaSigns GetMegaSigns (string authorization, string xApiUser = null, string xOnBehalfOfUser = null, string cursor = null, int? pageSize = null)

Retrieves MegaSign parent agreements for a user.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.megaSigns;

namespace Example
{
    public class GetMegaSignsExample
    {
        public void main()
        {
            var apiInstance = new MegaSignsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_read')\" oncontextmenu=\"this.href=oauthDoc('agreement_read')\" target=\"oauthDoc\">agreement_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 
            var cursor = cursor_example;  // string | Used to navigate through the pages. If not provided, returns the first page. (optional) 
            var pageSize = 56;  // int? | Number of intended items in the response page. If not provided, it is decided by the application settings. (optional) 

            try
            {
                // Retrieves MegaSign parent agreements for a user.
                MegaSigns result = apiInstance.GetMegaSigns(authorization, xApiUser, xOnBehalfOfUser, cursor, pageSize);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling MegaSignsApi.GetMegaSigns: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 
 **cursor** | **string**| Used to navigate through the pages. If not provided, returns the first page. | [optional] 
 **pageSize** | **int?**| Number of intended items in the response page. If not provided, it is decided by the application settings. | [optional] 

### Return type

[**MegaSigns**](MegaSigns.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="updatemegasignstate"></a>
# **UpdateMegaSignState**
> void UpdateMegaSignState (string authorization, string ifMatch, string megaSignId, MegaSignStateInfo megaSignStateInfo, string xApiUser = null, string xOnBehalfOfUser = null)

Updates the state of a MegaSign identified by MegaSignId in the path.

This endpoint can be used by creator of the MegaSign to transition between the states of megaSign. An allowed transition would follow the following sequence :  IN_PROCESS->CANCELLED.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.megaSigns;

namespace Example
{
    public class UpdateMegaSignStateExample
    {
        public void main()
        {
            var apiInstance = new MegaSignsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_write')\" oncontextmenu=\"this.href=oauthDoc('agreement_write')\" target=\"oauthDoc\">agreement_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var ifMatch = ifMatch_example;  // string | The server will only update the resource if it matches the listed ETag otherwise error RESOURCE_MODIFIED(412) is returned.
            var megaSignId = megaSignId_example;  // string | The identifier of the MegaSign parent agreement, as returned by the megaSign creation API or retrieved from the API to fetch megaSign agreements
            var megaSignStateInfo = new MegaSignStateInfo(); // MegaSignStateInfo | MegaSign state update information object.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 

            try
            {
                // Updates the state of a MegaSign identified by MegaSignId in the path.
                apiInstance.UpdateMegaSignState(authorization, ifMatch, megaSignId, megaSignStateInfo, xApiUser, xOnBehalfOfUser);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling MegaSignsApi.UpdateMegaSignState: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_write&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_write&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_write&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **ifMatch** | **string**| The server will only update the resource if it matches the listed ETag otherwise error RESOURCE_MODIFIED(412) is returned. | 
 **megaSignId** | **string**| The identifier of the MegaSign parent agreement, as returned by the megaSign creation API or retrieved from the API to fetch megaSign agreements | 
 **megaSignStateInfo** | [**MegaSignStateInfo**](MegaSignStateInfo.md)| MegaSign state update information object. | 
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

