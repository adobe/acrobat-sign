# IO.Swagger.Api.LibraryDocumentsApi

All URIs are relative to *http://localhost/api/rest/v6*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateLibraryDocument**](LibraryDocumentsApi.md#createlibrarydocument) | **POST** /libraryDocuments | Creates a template that is placed in the library of the user for reuse.
[**CreateLibraryDocumentView**](LibraryDocumentsApi.md#createlibrarydocumentview) | **POST** /libraryDocuments/{libraryDocumentId}/views | Retrieves the latest state view url of a library document.
[**GetCombinedDocument**](LibraryDocumentsApi.md#getcombineddocument) | **GET** /libraryDocuments/{libraryDocumentId}/combinedDocument | Retrieves the combined document associated with a library document.
[**GetDocuments**](LibraryDocumentsApi.md#getdocuments) | **GET** /libraryDocuments/{libraryDocumentId}/documents | Retrieves the IDs of the documents associated with library document.
[**GetEvents**](LibraryDocumentsApi.md#getevents) | **GET** /libraryDocuments/{libraryDocumentId}/events | Retrieves the events information for a library document.
[**GetFormData**](LibraryDocumentsApi.md#getformdata) | **GET** /libraryDocuments/{libraryDocumentId}/formData | Retrieves data entered into the interactive form fields of the library document.
[**GetLibraryDocument**](LibraryDocumentsApi.md#getlibrarydocument) | **GET** /libraryDocuments/{libraryDocumentId}/documents/{documentId} | Retrieves the file stream of a document of library document.
[**GetLibraryDocumentAuditTrail**](LibraryDocumentsApi.md#getlibrarydocumentaudittrail) | **GET** /libraryDocuments/{libraryDocumentId}/auditTrail | Retrieves the audit trail associated with a library document.
[**GetLibraryDocumentImageUrls**](LibraryDocumentsApi.md#getlibrarydocumentimageurls) | **GET** /libraryDocuments/{libraryDocumentId}/documents/{documentId}/imageUrls | Retrieves image urls of all visible pages of a document associated with a library document.
[**GetLibraryDocumentInfo**](LibraryDocumentsApi.md#getlibrarydocumentinfo) | **GET** /libraryDocuments/{libraryDocumentId} | Retrieves the details of a library document.
[**GetLibraryDocumentNoteForApiUser**](LibraryDocumentsApi.md#getlibrarydocumentnoteforapiuser) | **GET** /libraryDocuments/{libraryDocumentId}/me/note | Retrieves the latest note of a library document for the API user.
[**GetLibraryDocuments**](LibraryDocumentsApi.md#getlibrarydocuments) | **GET** /libraryDocuments | Retrieves library documents for a user.
[**UpdateLibraryDocument**](LibraryDocumentsApi.md#updatelibrarydocument) | **PUT** /libraryDocuments/{libraryDocumentId} | Updates the library document.
[**UpdateLibraryDocumentNoteForApiUser**](LibraryDocumentsApi.md#updatelibrarydocumentnoteforapiuser) | **PUT** /libraryDocuments/{libraryDocumentId}/me/note | Updates the latest note of a library document for the API user.
[**UpdateLibraryDocumentState**](LibraryDocumentsApi.md#updatelibrarydocumentstate) | **PUT** /libraryDocuments/{libraryDocumentId}/state | Updates the library document&#39;s state.
[**UpdateLibraryDocumentVisibility**](LibraryDocumentsApi.md#updatelibrarydocumentvisibility) | **PUT** /libraryDocuments/{libraryDocumentId}/me/visibility | Updates the visibility of library document.


<a name="createlibrarydocument"></a>
# **CreateLibraryDocument**
> LibraryDocumentCreationResponse CreateLibraryDocument (string authorization, LibraryDocumentCreationInfoV6 libraryDocumentInfo, string xApiUser = null, string xOnBehalfOfUser = null)

Creates a template that is placed in the library of the user for reuse.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.libraryDocuments;

namespace Example
{
    public class CreateLibraryDocumentExample
    {
        public void main()
        {
            var apiInstance = new LibraryDocumentsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('library_write')\" oncontextmenu=\"this.href=oauthDoc('library_write')\" target=\"oauthDoc\">library_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var libraryDocumentInfo = new LibraryDocumentCreationInfoV6(); // LibraryDocumentCreationInfoV6 | Information about the library document that you want to create.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 

            try
            {
                // Creates a template that is placed in the library of the user for reuse.
                LibraryDocumentCreationResponse result = apiInstance.CreateLibraryDocument(authorization, libraryDocumentInfo, xApiUser, xOnBehalfOfUser);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling LibraryDocumentsApi.CreateLibraryDocument: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_write&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_write&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;library_write&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **libraryDocumentInfo** | [**LibraryDocumentCreationInfoV6**](LibraryDocumentCreationInfoV6.md)| Information about the library document that you want to create. | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 

### Return type

[**LibraryDocumentCreationResponse**](LibraryDocumentCreationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="createlibrarydocumentview"></a>
# **CreateLibraryDocumentView**
> LibraryDocumentViewResponse CreateLibraryDocumentView (string authorization, string libraryDocumentId, LibraryViewInfo libraryViewInfo, string xApiUser = null, string xOnBehalfOfUser = null, string ifNoneMatch = null)

Retrieves the latest state view url of a library document.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.libraryDocuments;

namespace Example
{
    public class CreateLibraryDocumentViewExample
    {
        public void main()
        {
            var apiInstance = new LibraryDocumentsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('library_read')\" oncontextmenu=\"this.href=oauthDoc('library_read')\" target=\"oauthDoc\">library_read</a> - library document read is always required</li><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('user_login')\" oncontextmenu=\"this.href=oauthDoc('user_login')\" target=\"oauthDoc\">user_login</a> - Required additionally if the autoLoginUser parameter is set to true</li></ul>in the format <b>'Bearer {accessToken}'.
            var libraryDocumentId = libraryDocumentId_example;  // string | The document identifier, as retrieved from the API to fetch library documents.
            var libraryViewInfo = new LibraryViewInfo(); // LibraryViewInfo | Name of the required view and its desired configuration.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 
            var ifNoneMatch = ifNoneMatch_example;  // string | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed. (optional) 

            try
            {
                // Retrieves the latest state view url of a library document.
                LibraryDocumentViewResponse result = apiInstance.CreateLibraryDocumentView(authorization, libraryDocumentId, libraryViewInfo, xApiUser, xOnBehalfOfUser, ifNoneMatch);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling LibraryDocumentsApi.CreateLibraryDocumentView: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;library_read&lt;/a&gt; - library document read is always required&lt;/li&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;user_login&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;user_login&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;user_login&lt;/a&gt; - Required additionally if the autoLoginUser parameter is set to true&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **libraryDocumentId** | **string**| The document identifier, as retrieved from the API to fetch library documents. | 
 **libraryViewInfo** | [**LibraryViewInfo**](LibraryViewInfo.md)| Name of the required view and its desired configuration. | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 
 **ifNoneMatch** | **string**| Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn&#39;t changed. | [optional] 

### Return type

[**LibraryDocumentViewResponse**](LibraryDocumentViewResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getcombineddocument"></a>
# **GetCombinedDocument**
> byte[] GetCombinedDocument (string authorization, string libraryDocumentId, string xApiUser = null, string xOnBehalfOfUser = null, string ifNoneMatch = null, bool? attachAuditReport = null)

Retrieves the combined document associated with a library document.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.libraryDocuments;

namespace Example
{
    public class GetCombinedDocumentExample
    {
        public void main()
        {
            var apiInstance = new LibraryDocumentsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('library_read')\" oncontextmenu=\"this.href=oauthDoc('library_read')\" target=\"oauthDoc\">library_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var libraryDocumentId = libraryDocumentId_example;  // string | The document identifier, as retrieved from the API to fetch library documents.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 
            var ifNoneMatch = ifNoneMatch_example;  // string | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed. (optional) 
            var attachAuditReport = true;  // bool? | When set to YES attach an audit report to the library document PDF. Default value will be false. (optional) 

            try
            {
                // Retrieves the combined document associated with a library document.
                byte[] result = apiInstance.GetCombinedDocument(authorization, libraryDocumentId, xApiUser, xOnBehalfOfUser, ifNoneMatch, attachAuditReport);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling LibraryDocumentsApi.GetCombinedDocument: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;library_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **libraryDocumentId** | **string**| The document identifier, as retrieved from the API to fetch library documents. | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 
 **ifNoneMatch** | **string**| Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn&#39;t changed. | [optional] 
 **attachAuditReport** | **bool?**| When set to YES attach an audit report to the library document PDF. Default value will be false. | [optional] 

### Return type

**byte[]**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/pdf, application/pdf;encoding=base64

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getdocuments"></a>
# **GetDocuments**
> Documents GetDocuments (string authorization, string libraryDocumentId, string xApiUser = null, string xOnBehalfOfUser = null, string ifNoneMatch = null, string versionId = null)

Retrieves the IDs of the documents associated with library document.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.libraryDocuments;

namespace Example
{
    public class GetDocumentsExample
    {
        public void main()
        {
            var apiInstance = new LibraryDocumentsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('library_read')\" oncontextmenu=\"this.href=oauthDoc('library_read')\" target=\"oauthDoc\">library_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var libraryDocumentId = libraryDocumentId_example;  // string | The document identifier, as retrieved from the API to fetch library documents.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 
            var ifNoneMatch = ifNoneMatch_example;  // string | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed. (optional) 
            var versionId = versionId_example;  // string | The version identifier of library_document as provided by the API which retrieves information of a specific library document. If not provided then latest version will be used. (optional) 

            try
            {
                // Retrieves the IDs of the documents associated with library document.
                Documents result = apiInstance.GetDocuments(authorization, libraryDocumentId, xApiUser, xOnBehalfOfUser, ifNoneMatch, versionId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling LibraryDocumentsApi.GetDocuments: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;library_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **libraryDocumentId** | **string**| The document identifier, as retrieved from the API to fetch library documents. | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 
 **ifNoneMatch** | **string**| Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn&#39;t changed. | [optional] 
 **versionId** | **string**| The version identifier of library_document as provided by the API which retrieves information of a specific library document. If not provided then latest version will be used. | [optional] 

### Return type

[**Documents**](Documents.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getevents"></a>
# **GetEvents**
> LibraryDocumentEventList GetEvents (string authorization, string libraryDocumentId, string xApiUser = null, string xOnBehalfOfUser = null, string ifNoneMatch = null)

Retrieves the events information for a library document.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.libraryDocuments;

namespace Example
{
    public class GetEventsExample
    {
        public void main()
        {
            var apiInstance = new LibraryDocumentsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('library_read')\" oncontextmenu=\"this.href=oauthDoc('library_read')\" target=\"oauthDoc\">library_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var libraryDocumentId = libraryDocumentId_example;  // string | The document identifier, as retrieved from the API to fetch library documents.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 
            var ifNoneMatch = ifNoneMatch_example;  // string | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed. (optional) 

            try
            {
                // Retrieves the events information for a library document.
                LibraryDocumentEventList result = apiInstance.GetEvents(authorization, libraryDocumentId, xApiUser, xOnBehalfOfUser, ifNoneMatch);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling LibraryDocumentsApi.GetEvents: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;library_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **libraryDocumentId** | **string**| The document identifier, as retrieved from the API to fetch library documents. | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 
 **ifNoneMatch** | **string**| Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn&#39;t changed. | [optional] 

### Return type

[**LibraryDocumentEventList**](LibraryDocumentEventList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getformdata"></a>
# **GetFormData**
> byte[] GetFormData (string authorization, string libraryDocumentId, string xApiUser = null, string xOnBehalfOfUser = null, string ifNoneMatch = null)

Retrieves data entered into the interactive form fields of the library document.

This API can only be called by the creator of the library document

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.libraryDocuments;

namespace Example
{
    public class GetFormDataExample
    {
        public void main()
        {
            var apiInstance = new LibraryDocumentsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('library_read')\" oncontextmenu=\"this.href=oauthDoc('library_read')\" target=\"oauthDoc\">library_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var libraryDocumentId = libraryDocumentId_example;  // string | The document identifier, as retrieved from the API to fetch library documents.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 
            var ifNoneMatch = ifNoneMatch_example;  // string | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed. (optional) 

            try
            {
                // Retrieves data entered into the interactive form fields of the library document.
                byte[] result = apiInstance.GetFormData(authorization, libraryDocumentId, xApiUser, xOnBehalfOfUser, ifNoneMatch);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling LibraryDocumentsApi.GetFormData: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;library_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **libraryDocumentId** | **string**| The document identifier, as retrieved from the API to fetch library documents. | 
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

<a name="getlibrarydocument"></a>
# **GetLibraryDocument**
> byte[] GetLibraryDocument (string authorization, string libraryDocumentId, string documentId, string xApiUser = null, string xOnBehalfOfUser = null, string ifNoneMatch = null)

Retrieves the file stream of a document of library document.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.libraryDocuments;

namespace Example
{
    public class GetLibraryDocumentExample
    {
        public void main()
        {
            var apiInstance = new LibraryDocumentsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('library_read')\" oncontextmenu=\"this.href=oauthDoc('library_read')\" target=\"oauthDoc\">library_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var libraryDocumentId = libraryDocumentId_example;  // string | The document identifier, as retrieved from the API to fetch library documents.
            var documentId = documentId_example;  // string | The document identifier, as retrieved from the API which fetches the documents of a specified library document
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 
            var ifNoneMatch = ifNoneMatch_example;  // string | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed. (optional) 

            try
            {
                // Retrieves the file stream of a document of library document.
                byte[] result = apiInstance.GetLibraryDocument(authorization, libraryDocumentId, documentId, xApiUser, xOnBehalfOfUser, ifNoneMatch);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling LibraryDocumentsApi.GetLibraryDocument: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;library_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **libraryDocumentId** | **string**| The document identifier, as retrieved from the API to fetch library documents. | 
 **documentId** | **string**| The document identifier, as retrieved from the API which fetches the documents of a specified library document | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 
 **ifNoneMatch** | **string**| Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn&#39;t changed. | [optional] 

### Return type

**byte[]**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/pdf, application/pdf;encoding=base64

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getlibrarydocumentaudittrail"></a>
# **GetLibraryDocumentAuditTrail**
> byte[] GetLibraryDocumentAuditTrail (string authorization, string libraryDocumentId, string xApiUser = null, string xOnBehalfOfUser = null, string ifNoneMatch = null)

Retrieves the audit trail associated with a library document.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.libraryDocuments;

namespace Example
{
    public class GetLibraryDocumentAuditTrailExample
    {
        public void main()
        {
            var apiInstance = new LibraryDocumentsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('library_read')\" oncontextmenu=\"this.href=oauthDoc('library_read')\" target=\"oauthDoc\">library_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var libraryDocumentId = libraryDocumentId_example;  // string | The document identifier, as retrieved from the API to fetch library documents.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 
            var ifNoneMatch = ifNoneMatch_example;  // string | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed. (optional) 

            try
            {
                // Retrieves the audit trail associated with a library document.
                byte[] result = apiInstance.GetLibraryDocumentAuditTrail(authorization, libraryDocumentId, xApiUser, xOnBehalfOfUser, ifNoneMatch);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling LibraryDocumentsApi.GetLibraryDocumentAuditTrail: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;library_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **libraryDocumentId** | **string**| The document identifier, as retrieved from the API to fetch library documents. | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 
 **ifNoneMatch** | **string**| Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn&#39;t changed. | [optional] 

### Return type

**byte[]**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/pdf, application/pdf;encoding=base64

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getlibrarydocumentimageurls"></a>
# **GetLibraryDocumentImageUrls**
> DocumentImageUrlsInfo GetLibraryDocumentImageUrls (string authorization, string libraryDocumentId, string documentId, string xApiUser = null, string xOnBehalfOfUser = null, string ifNoneMatch = null, string imageSizes = null, int? startPage = null, int? endPage = null)

Retrieves image urls of all visible pages of a document associated with a library document.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.libraryDocuments;

namespace Example
{
    public class GetLibraryDocumentImageUrlsExample
    {
        public void main()
        {
            var apiInstance = new LibraryDocumentsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('library_read')\" oncontextmenu=\"this.href=oauthDoc('library_read')\" target=\"oauthDoc\">library_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var libraryDocumentId = libraryDocumentId_example;  // string | The document identifier, as retrieved from the API to fetch library documents.
            var documentId = documentId_example;  // string | The document identifier, as retrieved from the API which fetches the documents of a specified library document
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 
            var ifNoneMatch = ifNoneMatch_example;  // string | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed. (optional) 
            var imageSizes = imageSizes_example;  // string | A comma separated list of image sizes i.e. {FIXED_WIDTH_50px, FIXED_WIDTH_250px, FIXED_WIDTH_675px, ZOOM_50_PERCENT, ZOOM_75_PERCENT, ZOOM_100_PERCENT, ZOOM_125_PERCENT, ZOOM_150_PERCENT, ZOOM_200_PERCENT}. Default sizes returned are {FIXED_WIDTH_50px, FIXED_WIDTH_250px, FIXED_WIDTH_675px, ZOOM_100_PERCENT}.  (optional) 
            var startPage = 56;  // int? | Start of page number range for which imageUrls are requested. Starting page number should be greater than 0. (optional) 
            var endPage = 56;  // int? | End of page number range for which imageUrls are requested. (optional) 

            try
            {
                // Retrieves image urls of all visible pages of a document associated with a library document.
                DocumentImageUrlsInfo result = apiInstance.GetLibraryDocumentImageUrls(authorization, libraryDocumentId, documentId, xApiUser, xOnBehalfOfUser, ifNoneMatch, imageSizes, startPage, endPage);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling LibraryDocumentsApi.GetLibraryDocumentImageUrls: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;library_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **libraryDocumentId** | **string**| The document identifier, as retrieved from the API to fetch library documents. | 
 **documentId** | **string**| The document identifier, as retrieved from the API which fetches the documents of a specified library document | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 
 **ifNoneMatch** | **string**| Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn&#39;t changed. | [optional] 
 **imageSizes** | **string**| A comma separated list of image sizes i.e. {FIXED_WIDTH_50px, FIXED_WIDTH_250px, FIXED_WIDTH_675px, ZOOM_50_PERCENT, ZOOM_75_PERCENT, ZOOM_100_PERCENT, ZOOM_125_PERCENT, ZOOM_150_PERCENT, ZOOM_200_PERCENT}. Default sizes returned are {FIXED_WIDTH_50px, FIXED_WIDTH_250px, FIXED_WIDTH_675px, ZOOM_100_PERCENT}.  | [optional] 
 **startPage** | **int?**| Start of page number range for which imageUrls are requested. Starting page number should be greater than 0. | [optional] 
 **endPage** | **int?**| End of page number range for which imageUrls are requested. | [optional] 

### Return type

[**DocumentImageUrlsInfo**](DocumentImageUrlsInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getlibrarydocumentinfo"></a>
# **GetLibraryDocumentInfo**
> LibraryDocumentCreationInfoV6 GetLibraryDocumentInfo (string authorization, string libraryDocumentId, string xApiUser = null, string xOnBehalfOfUser = null, string ifNoneMatch = null)

Retrieves the details of a library document.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.libraryDocuments;

namespace Example
{
    public class GetLibraryDocumentInfoExample
    {
        public void main()
        {
            var apiInstance = new LibraryDocumentsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('library_read')\" oncontextmenu=\"this.href=oauthDoc('library_read')\" target=\"oauthDoc\">library_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var libraryDocumentId = libraryDocumentId_example;  // string | The document identifier, as retrieved from the API to fetch library documents.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 
            var ifNoneMatch = ifNoneMatch_example;  // string | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed. (optional) 

            try
            {
                // Retrieves the details of a library document.
                LibraryDocumentCreationInfoV6 result = apiInstance.GetLibraryDocumentInfo(authorization, libraryDocumentId, xApiUser, xOnBehalfOfUser, ifNoneMatch);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling LibraryDocumentsApi.GetLibraryDocumentInfo: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;library_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **libraryDocumentId** | **string**| The document identifier, as retrieved from the API to fetch library documents. | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 
 **ifNoneMatch** | **string**| Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn&#39;t changed. | [optional] 

### Return type

[**LibraryDocumentCreationInfoV6**](LibraryDocumentCreationInfoV6.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getlibrarydocumentnoteforapiuser"></a>
# **GetLibraryDocumentNoteForApiUser**
> Note GetLibraryDocumentNoteForApiUser (string authorization, string libraryDocumentId, string xApiUser = null, string xOnBehalfOfUser = null)

Retrieves the latest note of a library document for the API user.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.libraryDocuments;

namespace Example
{
    public class GetLibraryDocumentNoteForApiUserExample
    {
        public void main()
        {
            var apiInstance = new LibraryDocumentsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('library_read')\" oncontextmenu=\"this.href=oauthDoc('library_read')\" target=\"oauthDoc\">library_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var libraryDocumentId = libraryDocumentId_example;  // string | The document identifier, as retrieved from the API to fetch library documents.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 

            try
            {
                // Retrieves the latest note of a library document for the API user.
                Note result = apiInstance.GetLibraryDocumentNoteForApiUser(authorization, libraryDocumentId, xApiUser, xOnBehalfOfUser);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling LibraryDocumentsApi.GetLibraryDocumentNoteForApiUser: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;library_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **libraryDocumentId** | **string**| The document identifier, as retrieved from the API to fetch library documents. | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 

### Return type

[**Note**](Note.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getlibrarydocuments"></a>
# **GetLibraryDocuments**
> LibraryDocuments GetLibraryDocuments (string authorization, string xApiUser = null, string xOnBehalfOfUser = null, bool? showHiddenLibraryDocuments = null, string cursor = null, int? pageSize = null)

Retrieves library documents for a user.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.libraryDocuments;

namespace Example
{
    public class GetLibraryDocumentsExample
    {
        public void main()
        {
            var apiInstance = new LibraryDocumentsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('library_read')\" oncontextmenu=\"this.href=oauthDoc('library_read')\" target=\"oauthDoc\">library_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 
            var showHiddenLibraryDocuments = true;  // bool? | A query parameter to fetch all the hidden library documents along with the visible library documents. Default value is false. (optional) 
            var cursor = cursor_example;  // string | Used to navigate through the pages. If not provided, returns the first page. (optional) 
            var pageSize = 56;  // int? | Number of intended items in the response page. If not provided, it is decided by the application settings. (optional) 

            try
            {
                // Retrieves library documents for a user.
                LibraryDocuments result = apiInstance.GetLibraryDocuments(authorization, xApiUser, xOnBehalfOfUser, showHiddenLibraryDocuments, cursor, pageSize);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling LibraryDocumentsApi.GetLibraryDocuments: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;library_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 
 **showHiddenLibraryDocuments** | **bool?**| A query parameter to fetch all the hidden library documents along with the visible library documents. Default value is false. | [optional] 
 **cursor** | **string**| Used to navigate through the pages. If not provided, returns the first page. | [optional] 
 **pageSize** | **int?**| Number of intended items in the response page. If not provided, it is decided by the application settings. | [optional] 

### Return type

[**LibraryDocuments**](LibraryDocuments.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="updatelibrarydocument"></a>
# **UpdateLibraryDocument**
> void UpdateLibraryDocument (string authorization, string ifMatch, string libraryDocumentId, LibraryDocumentInfo libraryDocumentInfo, string xApiUser = null, string xOnBehalfOfUser = null)

Updates the library document.

Currently status, name, sharingMode and templateTypes of the library document can only be updated.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.libraryDocuments;

namespace Example
{
    public class UpdateLibraryDocumentExample
    {
        public void main()
        {
            var apiInstance = new LibraryDocumentsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('library_write')\" oncontextmenu=\"this.href=oauthDoc('library_write')\" target=\"oauthDoc\">library_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var ifMatch = ifMatch_example;  // string | The server will only update the resource if it matches the listed ETag otherwise error RESOURCE_MODIFIED(412) is returned.
            var libraryDocumentId = libraryDocumentId_example;  // string | The document identifier, as retrieved from the API to fetch library documents.
            var libraryDocumentInfo = new LibraryDocumentInfo(); // LibraryDocumentInfo | Information about the library document that you want to create.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 

            try
            {
                // Updates the library document.
                apiInstance.UpdateLibraryDocument(authorization, ifMatch, libraryDocumentId, libraryDocumentInfo, xApiUser, xOnBehalfOfUser);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling LibraryDocumentsApi.UpdateLibraryDocument: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_write&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_write&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;library_write&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **ifMatch** | **string**| The server will only update the resource if it matches the listed ETag otherwise error RESOURCE_MODIFIED(412) is returned. | 
 **libraryDocumentId** | **string**| The document identifier, as retrieved from the API to fetch library documents. | 
 **libraryDocumentInfo** | [**LibraryDocumentInfo**](LibraryDocumentInfo.md)| Information about the library document that you want to create. | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="updatelibrarydocumentnoteforapiuser"></a>
# **UpdateLibraryDocumentNoteForApiUser**
> void UpdateLibraryDocumentNoteForApiUser (string authorization, string libraryDocumentId, Note note, string xApiUser = null, string xOnBehalfOfUser = null)

Updates the latest note of a library document for the API user.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.libraryDocuments;

namespace Example
{
    public class UpdateLibraryDocumentNoteForApiUserExample
    {
        public void main()
        {
            var apiInstance = new LibraryDocumentsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('library_write')\" oncontextmenu=\"this.href=oauthDoc('library_write')\" target=\"oauthDoc\">library_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var libraryDocumentId = libraryDocumentId_example;  // string | The document identifier, as retrieved from the API to fetch library documents.
            var note = new Note(); // Note | The note to be associated with the library document.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 

            try
            {
                // Updates the latest note of a library document for the API user.
                apiInstance.UpdateLibraryDocumentNoteForApiUser(authorization, libraryDocumentId, note, xApiUser, xOnBehalfOfUser);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling LibraryDocumentsApi.UpdateLibraryDocumentNoteForApiUser: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_write&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_write&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;library_write&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **libraryDocumentId** | **string**| The document identifier, as retrieved from the API to fetch library documents. | 
 **note** | [**Note**](Note.md)| The note to be associated with the library document. | 
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

<a name="updatelibrarydocumentstate"></a>
# **UpdateLibraryDocumentState**
> void UpdateLibraryDocumentState (string authorization, string ifMatch, string libraryDocumentId, LibraryDocumentStateInfo libraryDocumentStateInfo, string xApiUser = null, string xOnBehalfOfUser = null)

Updates the library document's state.

Currently state can be changed from AUTHORING to ACTIVE.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.libraryDocuments;

namespace Example
{
    public class UpdateLibraryDocumentStateExample
    {
        public void main()
        {
            var apiInstance = new LibraryDocumentsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('library_write')\" oncontextmenu=\"this.href=oauthDoc('library_write')\" target=\"oauthDoc\">library_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var ifMatch = ifMatch_example;  // string | The server will only update the resource if it matches the listed ETag otherwise error RESOURCE_MODIFIED(412) is returned.
            var libraryDocumentId = libraryDocumentId_example;  // string | The document identifier, as retrieved from the API to fetch library documents.
            var libraryDocumentStateInfo = new LibraryDocumentStateInfo(); // LibraryDocumentStateInfo | Information about the state of library document to which you want to update
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 

            try
            {
                // Updates the library document's state.
                apiInstance.UpdateLibraryDocumentState(authorization, ifMatch, libraryDocumentId, libraryDocumentStateInfo, xApiUser, xOnBehalfOfUser);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling LibraryDocumentsApi.UpdateLibraryDocumentState: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_write&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_write&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;library_write&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **ifMatch** | **string**| The server will only update the resource if it matches the listed ETag otherwise error RESOURCE_MODIFIED(412) is returned. | 
 **libraryDocumentId** | **string**| The document identifier, as retrieved from the API to fetch library documents. | 
 **libraryDocumentStateInfo** | [**LibraryDocumentStateInfo**](LibraryDocumentStateInfo.md)| Information about the state of library document to which you want to update | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="updatelibrarydocumentvisibility"></a>
# **UpdateLibraryDocumentVisibility**
> void UpdateLibraryDocumentVisibility (string authorization, string libraryDocumentId, VisibilityInfo visibilityInfo, string xApiUser = null, string xOnBehalfOfUser = null)

Updates the visibility of library document.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.libraryDocuments;

namespace Example
{
    public class UpdateLibraryDocumentVisibilityExample
    {
        public void main()
        {
            var apiInstance = new LibraryDocumentsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('library_write')\" oncontextmenu=\"this.href=oauthDoc('library_write')\" target=\"oauthDoc\">library_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var libraryDocumentId = libraryDocumentId_example;  // string | The document identifier, as retrieved from the API to fetch library documents.
            var visibilityInfo = new VisibilityInfo(); // VisibilityInfo | Information to update visibility of agreement
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 

            try
            {
                // Updates the visibility of library document.
                apiInstance.UpdateLibraryDocumentVisibility(authorization, libraryDocumentId, visibilityInfo, xApiUser, xOnBehalfOfUser);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling LibraryDocumentsApi.UpdateLibraryDocumentVisibility: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_write&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;library_write&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;library_write&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **libraryDocumentId** | **string**| The document identifier, as retrieved from the API to fetch library documents. | 
 **visibilityInfo** | [**VisibilityInfo**](VisibilityInfo.md)| Information to update visibility of agreement | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

