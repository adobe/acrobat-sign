# IO.Swagger.Api.WidgetsApi

All URIs are relative to *http://localhost/api/rest/v6*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateShareOnWidget**](WidgetsApi.md#createshareonwidget) | **POST** /widgets/{widgetId}/members/share | Share a widget with someone.
[**CreateWidget**](WidgetsApi.md#createwidget) | **POST** /widgets | Creates a widget and and returns the widgetId in the response to the client.
[**GetAllWidgetMembers**](WidgetsApi.md#getallwidgetmembers) | **GET** /widgets/{widgetId}/members | Retrieves detailed member info along with IDs for different types of participants.
[**GetEvents**](WidgetsApi.md#getevents) | **GET** /widgets/{widgetId}/events | Retrieves the events information for a widget.
[**GetParticipantSet**](WidgetsApi.md#getparticipantset) | **GET** /widgets/{widgetId}/members/participantSets/{participantSetId} | Retrieves the participant set of a widget identified by widgetId in the path.
[**GetWidgetAgreements**](WidgetsApi.md#getwidgetagreements) | **GET** /widgets/{widgetId}/agreements | Retrieves agreements for the widget.
[**GetWidgetAllDocumentsImageUrls**](WidgetsApi.md#getwidgetalldocumentsimageurls) | **GET** /widgets/{widgetId}/documents/imageUrls | Retrieves image urls of all visible pages of a document associated with a widget.
[**GetWidgetAuditTrail**](WidgetsApi.md#getwidgetaudittrail) | **GET** /widgets/{widgetId}/auditTrail | Retrieves the audit trail of a widget identified by widgetId.
[**GetWidgetCombinedDocument**](WidgetsApi.md#getwidgetcombineddocument) | **GET** /widgets/{widgetId}/combinedDocument | Retrieves a single combined PDF document for the documents associated with a widget.
[**GetWidgetDocumentInfo**](WidgetsApi.md#getwidgetdocumentinfo) | **GET** /widgets/{widgetId}/documents/{documentId} | Retrieves the file stream of a document of a widget.
[**GetWidgetDocuments**](WidgetsApi.md#getwidgetdocuments) | **GET** /widgets/{widgetId}/documents | Retrieves the IDs of the documents associated with widget.
[**GetWidgetFormData**](WidgetsApi.md#getwidgetformdata) | **GET** /widgets/{widgetId}/formData | Retrieves data entered by the user into interactive form fields at the time they signed the widget
[**GetWidgetInfo**](WidgetsApi.md#getwidgetinfo) | **GET** /widgets/{widgetId} | Retrieves the details of a widget.
[**GetWidgetNoteForApiUser**](WidgetsApi.md#getwidgetnoteforapiuser) | **GET** /widgets/{widgetId}/me/note | Retrieves the latest note of a widget for the API user.
[**GetWidgetSecurityOptionsForParticipation**](WidgetsApi.md#getwidgetsecurityoptionsforparticipation) | **GET** /widgets/{widgetId}/members/participantSets/{participantSetId}/participants/{participantId}/securityOptions | Retrieves the security options for a particular participant.
[**GetWidgetView**](WidgetsApi.md#getwidgetview) | **POST** /widgets/{widgetId}/views | Retrieves the requested views for a widget.
[**GetWidgets**](WidgetsApi.md#getwidgets) | **GET** /widgets | Retrieves widgets for a user.
[**UpdateWidget**](WidgetsApi.md#updatewidget) | **PUT** /widgets/{widgetId} | Updates a widget.
[**UpdateWidgetNoteForApiUser**](WidgetsApi.md#updatewidgetnoteforapiuser) | **PUT** /widgets/{widgetId}/me/note | Updates the latest note of a widget for the API user.
[**UpdateWidgetSecurityOptionsForParticipation**](WidgetsApi.md#updatewidgetsecurityoptionsforparticipation) | **PUT** /widgets/{widgetId}/members/participantSets/{participantSetId}/participants/{participantId}/securityOptions | Updates the security options for a particular participant.
[**UpdateWidgetState**](WidgetsApi.md#updatewidgetstate) | **PUT** /widgets/{widgetId}/state | Updates the state of a widget identified by widgetId in the path.
[**UpdateWidgetVisibility**](WidgetsApi.md#updatewidgetvisibility) | **PUT** /widgets/{widgetId}/me/visibility | Updates the visibility of widget.


<a name="createshareonwidget"></a>
# **CreateShareOnWidget**
> ShareCreationResponseList CreateShareOnWidget (string authorization, string widgetId, ShareCreationInfoList shareCreationInfoList, string xApiUser = null, string xOnBehalfOfUser = null)

Share a widget with someone.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.widgets;

namespace Example
{
    public class CreateShareOnWidgetExample
    {
        public void main()
        {
            var apiInstance = new WidgetsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('widget_write')\" oncontextmenu=\"this.href=oauthDoc('widget_write')\" target=\"oauthDoc\">widget_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var widgetId = widgetId_example;  // string | The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets.
            var shareCreationInfoList = new ShareCreationInfoList(); // ShareCreationInfoList | List of agreement share creation information objects.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 

            try
            {
                // Share a widget with someone.
                ShareCreationResponseList result = apiInstance.CreateShareOnWidget(authorization, widgetId, shareCreationInfoList, xApiUser, xOnBehalfOfUser);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling WidgetsApi.CreateShareOnWidget: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_write&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_write&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;widget_write&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **widgetId** | **string**| The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets. | 
 **shareCreationInfoList** | [**ShareCreationInfoList**](ShareCreationInfoList.md)| List of agreement share creation information objects. | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 

### Return type

[**ShareCreationResponseList**](ShareCreationResponseList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="createwidget"></a>
# **CreateWidget**
> WidgetCreationResponse CreateWidget (string authorization, WidgetCreationInfoV6 widgetInfo, string xApiUser = null, string xOnBehalfOfUser = null)

Creates a widget and and returns the widgetId in the response to the client.

This is a primary endpoint which is used to create a new widget. You can create a widget in one of the 3 mentioned states: a) <b>DRAFT</b> - to incrementally build the widget, b) <b>AUTHORING</b> - to add/edit form fields in the widget, c) <b>ACTIVE</b> - to immediately host the widget. You can use the PUT /widgets/{widgetId}/state endpoint to transition a widget between the above mentioned states. An allowed transition would follow the any of the following sequences: DRAFT->AUTHORING->ACTIVE, ACTIVE<->INACTIVE, DRAFT->CANCELLED.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.widgets;

namespace Example
{
    public class CreateWidgetExample
    {
        public void main()
        {
            var apiInstance = new WidgetsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('widget_write')\" oncontextmenu=\"this.href=oauthDoc('widget_write')\" target=\"oauthDoc\">widget_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var widgetInfo = new WidgetCreationInfoV6(); // WidgetCreationInfoV6 | Information about the widget that you want to create.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 

            try
            {
                // Creates a widget and and returns the widgetId in the response to the client.
                WidgetCreationResponse result = apiInstance.CreateWidget(authorization, widgetInfo, xApiUser, xOnBehalfOfUser);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling WidgetsApi.CreateWidget: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_write&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_write&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;widget_write&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **widgetInfo** | [**WidgetCreationInfoV6**](WidgetCreationInfoV6.md)| Information about the widget that you want to create. | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 

### Return type

[**WidgetCreationResponse**](WidgetCreationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getallwidgetmembers"></a>
# **GetAllWidgetMembers**
> WidgetMembersInfo GetAllWidgetMembers (string authorization, string widgetId, string xApiUser = null, string xOnBehalfOfUser = null, string ifNoneMatch = null)

Retrieves detailed member info along with IDs for different types of participants.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.widgets;

namespace Example
{
    public class GetAllWidgetMembersExample
    {
        public void main()
        {
            var apiInstance = new WidgetsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('widget_read')\" oncontextmenu=\"this.href=oauthDoc('widget_read')\" target=\"oauthDoc\">widget_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var widgetId = widgetId_example;  // string | The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 
            var ifNoneMatch = ifNoneMatch_example;  // string | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed. (optional) 

            try
            {
                // Retrieves detailed member info along with IDs for different types of participants.
                WidgetMembersInfo result = apiInstance.GetAllWidgetMembers(authorization, widgetId, xApiUser, xOnBehalfOfUser, ifNoneMatch);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling WidgetsApi.GetAllWidgetMembers: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;widget_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **widgetId** | **string**| The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets. | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 
 **ifNoneMatch** | **string**| Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn&#39;t changed. | [optional] 

### Return type

[**WidgetMembersInfo**](WidgetMembersInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getevents"></a>
# **GetEvents**
> WidgetEventList GetEvents (string authorization, string widgetId, string xApiUser = null, string xOnBehalfOfUser = null, string ifNoneMatch = null)

Retrieves the events information for a widget.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.widgets;

namespace Example
{
    public class GetEventsExample
    {
        public void main()
        {
            var apiInstance = new WidgetsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('widget_read')\" oncontextmenu=\"this.href=oauthDoc('widget_read')\" target=\"oauthDoc\">widget_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var widgetId = widgetId_example;  // string | The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 
            var ifNoneMatch = ifNoneMatch_example;  // string | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed. (optional) 

            try
            {
                // Retrieves the events information for a widget.
                WidgetEventList result = apiInstance.GetEvents(authorization, widgetId, xApiUser, xOnBehalfOfUser, ifNoneMatch);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling WidgetsApi.GetEvents: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;widget_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **widgetId** | **string**| The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets. | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 
 **ifNoneMatch** | **string**| Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn&#39;t changed. | [optional] 

### Return type

[**WidgetEventList**](WidgetEventList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getparticipantset"></a>
# **GetParticipantSet**
> DetailedWidgetParticipantSetInfo GetParticipantSet (string authorization, string widgetId, string participantSetId, string xApiUser = null, string xOnBehalfOfUser = null, string ifNoneMatch = null)

Retrieves the participant set of a widget identified by widgetId in the path.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.widgets;

namespace Example
{
    public class GetParticipantSetExample
    {
        public void main()
        {
            var apiInstance = new WidgetsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('widget_read')\" oncontextmenu=\"this.href=oauthDoc('widget_read')\" target=\"oauthDoc\">widget_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var widgetId = widgetId_example;  // string | The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets.
            var participantSetId = participantSetId_example;  // string | The participant set identifier
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 
            var ifNoneMatch = ifNoneMatch_example;  // string | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed. (optional) 

            try
            {
                // Retrieves the participant set of a widget identified by widgetId in the path.
                DetailedWidgetParticipantSetInfo result = apiInstance.GetParticipantSet(authorization, widgetId, participantSetId, xApiUser, xOnBehalfOfUser, ifNoneMatch);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling WidgetsApi.GetParticipantSet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;widget_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **widgetId** | **string**| The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets. | 
 **participantSetId** | **string**| The participant set identifier | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 
 **ifNoneMatch** | **string**| Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn&#39;t changed. | [optional] 

### Return type

[**DetailedWidgetParticipantSetInfo**](DetailedWidgetParticipantSetInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getwidgetagreements"></a>
# **GetWidgetAgreements**
> WidgetAgreements GetWidgetAgreements (string authorization, string widgetId, string xApiUser = null, string xOnBehalfOfUser = null, bool? showHiddenAgreements = null, string cursor = null, int? pageSize = null)

Retrieves agreements for the widget.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.widgets;

namespace Example
{
    public class GetWidgetAgreementsExample
    {
        public void main()
        {
            var apiInstance = new WidgetsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('widget_read')\" oncontextmenu=\"this.href=oauthDoc('widget_read')\" target=\"oauthDoc\">widget_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var widgetId = widgetId_example;  // string | The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 
            var showHiddenAgreements = true;  // bool? | A query parameter to fetch all the hidden agreements along with the visible agreements. Default value is false. (optional) 
            var cursor = cursor_example;  // string | Used to navigate through the pages. If not provided, returns the first page. (optional) 
            var pageSize = 56;  // int? | Number of intended items in the response page. If not provided, it is decided by the application settings. (optional) 

            try
            {
                // Retrieves agreements for the widget.
                WidgetAgreements result = apiInstance.GetWidgetAgreements(authorization, widgetId, xApiUser, xOnBehalfOfUser, showHiddenAgreements, cursor, pageSize);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling WidgetsApi.GetWidgetAgreements: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;widget_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **widgetId** | **string**| The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets. | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 
 **showHiddenAgreements** | **bool?**| A query parameter to fetch all the hidden agreements along with the visible agreements. Default value is false. | [optional] 
 **cursor** | **string**| Used to navigate through the pages. If not provided, returns the first page. | [optional] 
 **pageSize** | **int?**| Number of intended items in the response page. If not provided, it is decided by the application settings. | [optional] 

### Return type

[**WidgetAgreements**](WidgetAgreements.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getwidgetalldocumentsimageurls"></a>
# **GetWidgetAllDocumentsImageUrls**
> WidgetDocumentsImageUrlsInfo GetWidgetAllDocumentsImageUrls (string authorization, string widgetId, string xApiUser = null, string xOnBehalfOfUser = null, string ifNoneMatch = null, string imageSizes = null, bool? showImageAvailabilityOnly = null)

Retrieves image urls of all visible pages of a document associated with a widget.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.widgets;

namespace Example
{
    public class GetWidgetAllDocumentsImageUrlsExample
    {
        public void main()
        {
            var apiInstance = new WidgetsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('widget_read')\" oncontextmenu=\"this.href=oauthDoc('widget_read')\" target=\"oauthDoc\">widget_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var widgetId = widgetId_example;  // string | The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 
            var ifNoneMatch = ifNoneMatch_example;  // string | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed. (optional) 
            var imageSizes = imageSizes_example;  // string | A comma separated list of image sizes i.e. {FIXED_WIDTH_50px, FIXED_WIDTH_250px, FIXED_WIDTH_675px, ZOOM_50_PERCENT, ZOOM_75_PERCENT, ZOOM_100_PERCENT, ZOOM_125_PERCENT, ZOOM_150_PERCENT, ZOOM_200_PERCENT}. Default sizes returned are {FIXED_WIDTH_50px, FIXED_WIDTH_250px, FIXED_WIDTH_675px, ZOOM_100_PERCENT}.  (optional) 
            var showImageAvailabilityOnly = true;  // bool? | When set to true, returns only image availability. Else, returns both image urls and its availability. (optional) 

            try
            {
                // Retrieves image urls of all visible pages of a document associated with a widget.
                WidgetDocumentsImageUrlsInfo result = apiInstance.GetWidgetAllDocumentsImageUrls(authorization, widgetId, xApiUser, xOnBehalfOfUser, ifNoneMatch, imageSizes, showImageAvailabilityOnly);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling WidgetsApi.GetWidgetAllDocumentsImageUrls: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;widget_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **widgetId** | **string**| The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets. | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 
 **ifNoneMatch** | **string**| Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn&#39;t changed. | [optional] 
 **imageSizes** | **string**| A comma separated list of image sizes i.e. {FIXED_WIDTH_50px, FIXED_WIDTH_250px, FIXED_WIDTH_675px, ZOOM_50_PERCENT, ZOOM_75_PERCENT, ZOOM_100_PERCENT, ZOOM_125_PERCENT, ZOOM_150_PERCENT, ZOOM_200_PERCENT}. Default sizes returned are {FIXED_WIDTH_50px, FIXED_WIDTH_250px, FIXED_WIDTH_675px, ZOOM_100_PERCENT}.  | [optional] 
 **showImageAvailabilityOnly** | **bool?**| When set to true, returns only image availability. Else, returns both image urls and its availability. | [optional] 

### Return type

[**WidgetDocumentsImageUrlsInfo**](WidgetDocumentsImageUrlsInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getwidgetaudittrail"></a>
# **GetWidgetAuditTrail**
> byte[] GetWidgetAuditTrail (string authorization, string widgetId, string xApiUser = null, string xOnBehalfOfUser = null, string ifNoneMatch = null)

Retrieves the audit trail of a widget identified by widgetId.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.widgets;

namespace Example
{
    public class GetWidgetAuditTrailExample
    {
        public void main()
        {
            var apiInstance = new WidgetsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('widget_read')\" oncontextmenu=\"this.href=oauthDoc('widget_read')\" target=\"oauthDoc\">widget_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var widgetId = widgetId_example;  // string | The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 
            var ifNoneMatch = ifNoneMatch_example;  // string | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed. (optional) 

            try
            {
                // Retrieves the audit trail of a widget identified by widgetId.
                byte[] result = apiInstance.GetWidgetAuditTrail(authorization, widgetId, xApiUser, xOnBehalfOfUser, ifNoneMatch);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling WidgetsApi.GetWidgetAuditTrail: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;widget_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **widgetId** | **string**| The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets. | 
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

<a name="getwidgetcombineddocument"></a>
# **GetWidgetCombinedDocument**
> byte[] GetWidgetCombinedDocument (string authorization, string widgetId, string xApiUser = null, string xOnBehalfOfUser = null, string ifNoneMatch = null, string versionId = null, string participantId = null, bool? attachAuditReport = null)

Retrieves a single combined PDF document for the documents associated with a widget.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.widgets;

namespace Example
{
    public class GetWidgetCombinedDocumentExample
    {
        public void main()
        {
            var apiInstance = new WidgetsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('widget_read')\" oncontextmenu=\"this.href=oauthDoc('widget_read')\" target=\"oauthDoc\">widget_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var widgetId = widgetId_example;  // string | The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 
            var ifNoneMatch = ifNoneMatch_example;  // string | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed. (optional) 
            var versionId = versionId_example;  // string | The version identifier of widget as provided by the API which retrieves information of a specific widget. If not provided then latest version will be used. (optional) 
            var participantId = participantId_example;  // string | The ID of the participant to be used to retrieve documents. If not mentioned, the participation of api caller is used. (optional) 
            var attachAuditReport = true;  // bool? | When set to YES, attach an audit report to the signed Widget PDF. Default value is false (optional) 

            try
            {
                // Retrieves a single combined PDF document for the documents associated with a widget.
                byte[] result = apiInstance.GetWidgetCombinedDocument(authorization, widgetId, xApiUser, xOnBehalfOfUser, ifNoneMatch, versionId, participantId, attachAuditReport);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling WidgetsApi.GetWidgetCombinedDocument: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;widget_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **widgetId** | **string**| The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets. | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 
 **ifNoneMatch** | **string**| Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn&#39;t changed. | [optional] 
 **versionId** | **string**| The version identifier of widget as provided by the API which retrieves information of a specific widget. If not provided then latest version will be used. | [optional] 
 **participantId** | **string**| The ID of the participant to be used to retrieve documents. If not mentioned, the participation of api caller is used. | [optional] 
 **attachAuditReport** | **bool?**| When set to YES, attach an audit report to the signed Widget PDF. Default value is false | [optional] 

### Return type

**byte[]**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/pdf, application/pdf;encoding=base64

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getwidgetdocumentinfo"></a>
# **GetWidgetDocumentInfo**
> byte[] GetWidgetDocumentInfo (string authorization, string widgetId, string documentId, string xApiUser = null, string xOnBehalfOfUser = null, string ifNoneMatch = null)

Retrieves the file stream of a document of a widget.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.widgets;

namespace Example
{
    public class GetWidgetDocumentInfoExample
    {
        public void main()
        {
            var apiInstance = new WidgetsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('widget_read')\" oncontextmenu=\"this.href=oauthDoc('widget_read')\" target=\"oauthDoc\">widget_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var widgetId = widgetId_example;  // string | The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets.
            var documentId = documentId_example;  // string | The document identifier, as retrieved from the API which fetches the documents of a specified widget
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 
            var ifNoneMatch = ifNoneMatch_example;  // string | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed. (optional) 

            try
            {
                // Retrieves the file stream of a document of a widget.
                byte[] result = apiInstance.GetWidgetDocumentInfo(authorization, widgetId, documentId, xApiUser, xOnBehalfOfUser, ifNoneMatch);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling WidgetsApi.GetWidgetDocumentInfo: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;widget_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **widgetId** | **string**| The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets. | 
 **documentId** | **string**| The document identifier, as retrieved from the API which fetches the documents of a specified widget | 
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

<a name="getwidgetdocuments"></a>
# **GetWidgetDocuments**
> WidgetDocuments GetWidgetDocuments (string authorization, string widgetId, string xApiUser = null, string xOnBehalfOfUser = null, string ifNoneMatch = null, string versionId = null, string participantId = null)

Retrieves the IDs of the documents associated with widget.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.widgets;

namespace Example
{
    public class GetWidgetDocumentsExample
    {
        public void main()
        {
            var apiInstance = new WidgetsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('widget_read')\" oncontextmenu=\"this.href=oauthDoc('widget_read')\" target=\"oauthDoc\">widget_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var widgetId = widgetId_example;  // string | The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 
            var ifNoneMatch = ifNoneMatch_example;  // string | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed. (optional) 
            var versionId = versionId_example;  // string | The version identifier of widget as provided by the API which retrieves information of a specific widget. If not provided then latest version will be used. (optional) 
            var participantId = participantId_example;  // string | The ID of the participant to be used to retrieve documents. If not mentioned, the participation of api caller is used. (optional) 

            try
            {
                // Retrieves the IDs of the documents associated with widget.
                WidgetDocuments result = apiInstance.GetWidgetDocuments(authorization, widgetId, xApiUser, xOnBehalfOfUser, ifNoneMatch, versionId, participantId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling WidgetsApi.GetWidgetDocuments: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;widget_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **widgetId** | **string**| The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets. | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 
 **ifNoneMatch** | **string**| Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn&#39;t changed. | [optional] 
 **versionId** | **string**| The version identifier of widget as provided by the API which retrieves information of a specific widget. If not provided then latest version will be used. | [optional] 
 **participantId** | **string**| The ID of the participant to be used to retrieve documents. If not mentioned, the participation of api caller is used. | [optional] 

### Return type

[**WidgetDocuments**](WidgetDocuments.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getwidgetformdata"></a>
# **GetWidgetFormData**
> byte[] GetWidgetFormData (string authorization, string widgetId, string xApiUser = null, string xOnBehalfOfUser = null)

Retrieves data entered by the user into interactive form fields at the time they signed the widget

CSV file stream containing form data information

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.widgets;

namespace Example
{
    public class GetWidgetFormDataExample
    {
        public void main()
        {
            var apiInstance = new WidgetsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('widget_read')\" oncontextmenu=\"this.href=oauthDoc('widget_read')\" target=\"oauthDoc\">widget_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var widgetId = widgetId_example;  // string | The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 

            try
            {
                // Retrieves data entered by the user into interactive form fields at the time they signed the widget
                byte[] result = apiInstance.GetWidgetFormData(authorization, widgetId, xApiUser, xOnBehalfOfUser);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling WidgetsApi.GetWidgetFormData: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;widget_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **widgetId** | **string**| The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets. | 
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

<a name="getwidgetinfo"></a>
# **GetWidgetInfo**
> WidgetCreationInfoV6 GetWidgetInfo (string authorization, string widgetId, string xApiUser = null, string xOnBehalfOfUser = null, string ifNoneMatch = null)

Retrieves the details of a widget.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.widgets;

namespace Example
{
    public class GetWidgetInfoExample
    {
        public void main()
        {
            var apiInstance = new WidgetsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('widget_read')\" oncontextmenu=\"this.href=oauthDoc('widget_read')\" target=\"oauthDoc\">widget_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var widgetId = widgetId_example;  // string | The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 
            var ifNoneMatch = ifNoneMatch_example;  // string | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed. (optional) 

            try
            {
                // Retrieves the details of a widget.
                WidgetCreationInfoV6 result = apiInstance.GetWidgetInfo(authorization, widgetId, xApiUser, xOnBehalfOfUser, ifNoneMatch);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling WidgetsApi.GetWidgetInfo: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;widget_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **widgetId** | **string**| The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets. | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 
 **ifNoneMatch** | **string**| Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn&#39;t changed. | [optional] 

### Return type

[**WidgetCreationInfoV6**](WidgetCreationInfoV6.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getwidgetnoteforapiuser"></a>
# **GetWidgetNoteForApiUser**
> Note GetWidgetNoteForApiUser (string authorization, string widgetId, string xApiUser = null, string xOnBehalfOfUser = null)

Retrieves the latest note of a widget for the API user.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.widgets;

namespace Example
{
    public class GetWidgetNoteForApiUserExample
    {
        public void main()
        {
            var apiInstance = new WidgetsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('widget_read')\" oncontextmenu=\"this.href=oauthDoc('widget_read')\" target=\"oauthDoc\">widget_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var widgetId = widgetId_example;  // string | The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 

            try
            {
                // Retrieves the latest note of a widget for the API user.
                Note result = apiInstance.GetWidgetNoteForApiUser(authorization, widgetId, xApiUser, xOnBehalfOfUser);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling WidgetsApi.GetWidgetNoteForApiUser: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;widget_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **widgetId** | **string**| The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets. | 
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

<a name="getwidgetsecurityoptionsforparticipation"></a>
# **GetWidgetSecurityOptionsForParticipation**
> ParticipantSecurityOption GetWidgetSecurityOptionsForParticipation (string authorization, string widgetId, string participantSetId, string participantId, string ifNoneMatch = null, string xApiUser = null)

Retrieves the security options for a particular participant.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.widgets;

namespace Example
{
    public class GetWidgetSecurityOptionsForParticipationExample
    {
        public void main()
        {
            var apiInstance = new WidgetsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('widget_read')\" oncontextmenu=\"this.href=oauthDoc('widget_read')\" target=\"oauthDoc\">widget_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var widgetId = widgetId_example;  // string | The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets.
            var participantSetId = participantSetId_example;  // string | The participant set identifier
            var participantId = participantId_example;  // string | The participant identifier
            var ifNoneMatch = ifNoneMatch_example;  // string | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed. (optional) 
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 

            try
            {
                // Retrieves the security options for a particular participant.
                ParticipantSecurityOption result = apiInstance.GetWidgetSecurityOptionsForParticipation(authorization, widgetId, participantSetId, participantId, ifNoneMatch, xApiUser);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling WidgetsApi.GetWidgetSecurityOptionsForParticipation: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;widget_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **widgetId** | **string**| The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets. | 
 **participantSetId** | **string**| The participant set identifier | 
 **participantId** | **string**| The participant identifier | 
 **ifNoneMatch** | **string**| Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn&#39;t changed. | [optional] 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 

### Return type

[**ParticipantSecurityOption**](ParticipantSecurityOption.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getwidgetview"></a>
# **GetWidgetView**
> WidgetViews GetWidgetView (string authorization, string widgetId, WidgetViewInfo widgetViewInfo, string xApiUser = null, string xOnBehalfOfUser = null)

Retrieves the requested views for a widget.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.widgets;

namespace Example
{
    public class GetWidgetViewExample
    {
        public void main()
        {
            var apiInstance = new WidgetsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('widget_read')\" oncontextmenu=\"this.href=oauthDoc('widget_read')\" target=\"oauthDoc\">widget_read</a> - widget read is always required</li><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('user_login')\" oncontextmenu=\"this.href=oauthDoc('user_login')\" target=\"oauthDoc\">user_login</a> - Required additionally if the autoLoginUser parameter is set to true</li></ul>in the format <b>'Bearer {accessToken}'.
            var widgetId = widgetId_example;  // string | The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets.
            var widgetViewInfo = new WidgetViewInfo(); // WidgetViewInfo | Name of the required view and its desired configuration.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 

            try
            {
                // Retrieves the requested views for a widget.
                WidgetViews result = apiInstance.GetWidgetView(authorization, widgetId, widgetViewInfo, xApiUser, xOnBehalfOfUser);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling WidgetsApi.GetWidgetView: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;widget_read&lt;/a&gt; - widget read is always required&lt;/li&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;user_login&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;user_login&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;user_login&lt;/a&gt; - Required additionally if the autoLoginUser parameter is set to true&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **widgetId** | **string**| The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets. | 
 **widgetViewInfo** | [**WidgetViewInfo**](WidgetViewInfo.md)| Name of the required view and its desired configuration. | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 

### Return type

[**WidgetViews**](WidgetViews.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getwidgets"></a>
# **GetWidgets**
> UserWidgets GetWidgets (string authorization, string xApiUser = null, string xOnBehalfOfUser = null, bool? showHiddenWidgets = null, string cursor = null, int? pageSize = null)

Retrieves widgets for a user.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.widgets;

namespace Example
{
    public class GetWidgetsExample
    {
        public void main()
        {
            var apiInstance = new WidgetsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('widget_read')\" oncontextmenu=\"this.href=oauthDoc('widget_read')\" target=\"oauthDoc\">widget_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 
            var showHiddenWidgets = true;  // bool? | A query parameter to fetch all the hidden widgets along with the visible widgets. Default value is false. (optional) 
            var cursor = cursor_example;  // string | Used to navigate through the pages. If not provided, returns the first page. (optional) 
            var pageSize = 56;  // int? | Number of intended items in the response page. If not provided, it is decided by the application settings. (optional) 

            try
            {
                // Retrieves widgets for a user.
                UserWidgets result = apiInstance.GetWidgets(authorization, xApiUser, xOnBehalfOfUser, showHiddenWidgets, cursor, pageSize);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling WidgetsApi.GetWidgets: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;widget_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 
 **showHiddenWidgets** | **bool?**| A query parameter to fetch all the hidden widgets along with the visible widgets. Default value is false. | [optional] 
 **cursor** | **string**| Used to navigate through the pages. If not provided, returns the first page. | [optional] 
 **pageSize** | **int?**| Number of intended items in the response page. If not provided, it is decided by the application settings. | [optional] 

### Return type

[**UserWidgets**](UserWidgets.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="updatewidget"></a>
# **UpdateWidget**
> void UpdateWidget (string authorization, string ifMatch, string widgetId, WidgetInfo widgetInfo, string xApiUser = null, string xOnBehalfOfUser = null)

Updates a widget.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.widgets;

namespace Example
{
    public class UpdateWidgetExample
    {
        public void main()
        {
            var apiInstance = new WidgetsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('widget_write')\" oncontextmenu=\"this.href=oauthDoc('widget_write')\" target=\"oauthDoc\">widget_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var ifMatch = ifMatch_example;  // string | The server will only update the resource if it matches the listed ETag otherwise error RESOURCE_MODIFIED(412) is returned.
            var widgetId = widgetId_example;  // string | The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets.
            var widgetInfo = new WidgetInfo(); // WidgetInfo | Widget update information object.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 

            try
            {
                // Updates a widget.
                apiInstance.UpdateWidget(authorization, ifMatch, widgetId, widgetInfo, xApiUser, xOnBehalfOfUser);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling WidgetsApi.UpdateWidget: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_write&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_write&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;widget_write&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **ifMatch** | **string**| The server will only update the resource if it matches the listed ETag otherwise error RESOURCE_MODIFIED(412) is returned. | 
 **widgetId** | **string**| The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets. | 
 **widgetInfo** | [**WidgetInfo**](WidgetInfo.md)| Widget update information object. | 
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

<a name="updatewidgetnoteforapiuser"></a>
# **UpdateWidgetNoteForApiUser**
> void UpdateWidgetNoteForApiUser (string authorization, string widgetId, Note note, string xApiUser = null, string xOnBehalfOfUser = null)

Updates the latest note of a widget for the API user.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.widgets;

namespace Example
{
    public class UpdateWidgetNoteForApiUserExample
    {
        public void main()
        {
            var apiInstance = new WidgetsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('widget_write')\" oncontextmenu=\"this.href=oauthDoc('widget_write')\" target=\"oauthDoc\">widget_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var widgetId = widgetId_example;  // string | The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets.
            var note = new Note(); // Note | The note to be associated with the widget.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 

            try
            {
                // Updates the latest note of a widget for the API user.
                apiInstance.UpdateWidgetNoteForApiUser(authorization, widgetId, note, xApiUser, xOnBehalfOfUser);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling WidgetsApi.UpdateWidgetNoteForApiUser: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_write&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_write&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;widget_write&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **widgetId** | **string**| The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets. | 
 **note** | [**Note**](Note.md)| The note to be associated with the widget. | 
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

<a name="updatewidgetsecurityoptionsforparticipation"></a>
# **UpdateWidgetSecurityOptionsForParticipation**
> void UpdateWidgetSecurityOptionsForParticipation (string authorization, string ifMatch, string widgetId, string participantSetId, string participantId, ParticipantSecurityOption participantSecurityOption, string xApiUser = null)

Updates the security options for a particular participant.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.widgets;

namespace Example
{
    public class UpdateWidgetSecurityOptionsForParticipationExample
    {
        public void main()
        {
            var apiInstance = new WidgetsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('widget_write')\" oncontextmenu=\"this.href=oauthDoc('widget_write')\" target=\"oauthDoc\">widget_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var ifMatch = ifMatch_example;  // string | The server will only update the resource if it matches the listed ETag otherwise error RESOURCE_MODIFIED(412) is returned.
            var widgetId = widgetId_example;  // string | The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets.
            var participantSetId = participantSetId_example;  // string | The participant set identifier
            var participantId = participantId_example;  // string | The participant identifier
            var participantSecurityOption = new ParticipantSecurityOption(); // ParticipantSecurityOption | Security options that apply to the participant
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 

            try
            {
                // Updates the security options for a particular participant.
                apiInstance.UpdateWidgetSecurityOptionsForParticipation(authorization, ifMatch, widgetId, participantSetId, participantId, participantSecurityOption, xApiUser);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling WidgetsApi.UpdateWidgetSecurityOptionsForParticipation: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_write&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_write&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;widget_write&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **ifMatch** | **string**| The server will only update the resource if it matches the listed ETag otherwise error RESOURCE_MODIFIED(412) is returned. | 
 **widgetId** | **string**| The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets. | 
 **participantSetId** | **string**| The participant set identifier | 
 **participantId** | **string**| The participant identifier | 
 **participantSecurityOption** | [**ParticipantSecurityOption**](ParticipantSecurityOption.md)| Security options that apply to the participant | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="updatewidgetstate"></a>
# **UpdateWidgetState**
> void UpdateWidgetState (string authorization, string ifMatch, string widgetId, WidgetStateInfo widgetStateInfo, string xApiUser = null, string xOnBehalfOfUser = null)

Updates the state of a widget identified by widgetId in the path.

This endpoint can be used by creator of the widget to transition between the states of widget. An allowed transition would follow any of the following sequence :  DRAFT->AUTHORING->ACTIVE, ACTIVE<->INACTIVE, DRAFT->CANCELLED.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.widgets;

namespace Example
{
    public class UpdateWidgetStateExample
    {
        public void main()
        {
            var apiInstance = new WidgetsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('widget_write')\" oncontextmenu=\"this.href=oauthDoc('widget_write')\" target=\"oauthDoc\">widget_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var ifMatch = ifMatch_example;  // string | The server will only update the resource if it matches the listed ETag otherwise error RESOURCE_MODIFIED(412) is returned.
            var widgetId = widgetId_example;  // string | The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets.
            var widgetStateInfo = new WidgetStateInfo(); // WidgetStateInfo | 
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 

            try
            {
                // Updates the state of a widget identified by widgetId in the path.
                apiInstance.UpdateWidgetState(authorization, ifMatch, widgetId, widgetStateInfo, xApiUser, xOnBehalfOfUser);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling WidgetsApi.UpdateWidgetState: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_write&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_write&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;widget_write&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **ifMatch** | **string**| The server will only update the resource if it matches the listed ETag otherwise error RESOURCE_MODIFIED(412) is returned. | 
 **widgetId** | **string**| The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets. | 
 **widgetStateInfo** | [**WidgetStateInfo**](WidgetStateInfo.md)|  | 
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

<a name="updatewidgetvisibility"></a>
# **UpdateWidgetVisibility**
> void UpdateWidgetVisibility (string authorization, string widgetId, VisibilityInfo visibilityInfo, string xApiUser = null, string xOnBehalfOfUser = null)

Updates the visibility of widget.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.widgets;

namespace Example
{
    public class UpdateWidgetVisibilityExample
    {
        public void main()
        {
            var apiInstance = new WidgetsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('widget_write')\" oncontextmenu=\"this.href=oauthDoc('widget_write')\" target=\"oauthDoc\">widget_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var widgetId = widgetId_example;  // string | The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets.
            var visibilityInfo = new VisibilityInfo(); // VisibilityInfo | Information to update visibility of widget
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 

            try
            {
                // Updates the visibility of widget.
                apiInstance.UpdateWidgetVisibility(authorization, widgetId, visibilityInfo, xApiUser, xOnBehalfOfUser);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling WidgetsApi.UpdateWidgetVisibility: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_write&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;widget_write&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;widget_write&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **widgetId** | **string**| The widget identifier, as returned by the widget creation API or retrieved from the API to fetch widgets. | 
 **visibilityInfo** | [**VisibilityInfo**](VisibilityInfo.md)| Information to update visibility of widget | 
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

