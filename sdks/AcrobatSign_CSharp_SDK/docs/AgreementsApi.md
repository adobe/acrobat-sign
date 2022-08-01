# IO.Swagger.Api.AgreementsApi

All URIs are relative to *http://localhost/api/rest/v6*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AddTemplateFieldsToAgreement**](AgreementsApi.md#addtemplatefieldstoagreement) | **POST** /agreements/{agreementId}/formFields | Adds template fields to an agreement
[**CreateAgreement**](AgreementsApi.md#createagreement) | **POST** /agreements | Creates an agreement. Sends it out for signatures, and returns the agreementID in the response to the client.
[**CreateAgreementView**](AgreementsApi.md#createagreementview) | **POST** /agreements/{agreementId}/views | Retrieves the latest state view url of agreement.
[**CreateDelegatedParticipantSets**](AgreementsApi.md#createdelegatedparticipantsets) | **POST** /agreements/{agreementId}/members/participantSets/{participantSetId}/delegatedParticipantSets | Creates a participantSet to which the agreement is forwarded for taking appropriate action.
[**CreateReminderOnParticipant**](AgreementsApi.md#createreminderonparticipant) | **POST** /agreements/{agreementId}/reminders | Creates a reminder on the specified participants of an agreement identified by agreementId in the path.
[**CreateShareOnAgreement**](AgreementsApi.md#createshareonagreement) | **POST** /agreements/{agreementId}/members/share | Share an agreement with someone.
[**DeleteDocuments**](AgreementsApi.md#deletedocuments) | **DELETE** /agreements/{agreementId}/documents | Deletes all the documents of an agreement.
[**GetAgreementInfo**](AgreementsApi.md#getagreementinfo) | **GET** /agreements/{agreementId} | Retrieves the current status of an agreement.
[**GetAgreementNoteForApiUser**](AgreementsApi.md#getagreementnoteforapiuser) | **GET** /agreements/{agreementId}/me/note | Retrieves the latest note associated with an agreement.
[**GetAgreementReminder**](AgreementsApi.md#getagreementreminder) | **GET** /agreements/{agreementId}/reminders/{reminderId} | Retrieves a specific reminder associated with an agreement
[**GetAgreementReminders**](AgreementsApi.md#getagreementreminders) | **GET** /agreements/{agreementId}/reminders | Retrieves the reminders of an agreement, identified by agreementId in the path.
[**GetAgreementSecurityOptionsForParticipation**](AgreementsApi.md#getagreementsecurityoptionsforparticipation) | **GET** /agreements/{agreementId}/members/participantSets/{participantSetId}/participants/{participantId}/securityOptions | Retrieves the security options for a particular participant.
[**GetAgreements**](AgreementsApi.md#getagreements) | **GET** /agreements | Retrieves agreements for the user.
[**GetAllDocuments**](AgreementsApi.md#getalldocuments) | **GET** /agreements/{agreementId}/documents | Retrieves the IDs of the documents of an agreement identified by agreementId.
[**GetAllDocumentsImageUrls**](AgreementsApi.md#getalldocumentsimageurls) | **GET** /agreements/{agreementId}/documents/imageUrls | Retrieves image urls of all visible pages of all the documents associated with an agreement.
[**GetAllMembers**](AgreementsApi.md#getallmembers) | **GET** /agreements/{agreementId}/members | Retrieves information of members of the agreement.
[**GetAuditTrail**](AgreementsApi.md#getaudittrail) | **GET** /agreements/{agreementId}/auditTrail | Retrieves the audit trail of an agreement identified by agreementId.
[**GetCombinedDocument**](AgreementsApi.md#getcombineddocument) | **GET** /agreements/{agreementId}/combinedDocument | Retrieves a single combined PDF document for the documents associated with an agreement.
[**GetCombinedDocumentPagesInfo**](AgreementsApi.md#getcombineddocumentpagesinfo) | **GET** /agreements/{agreementId}/combinedDocument/pagesInfo | Retrieves info of all pages of a combined PDF document for the documents associated with an agreement.
[**GetCombinedDocumentUrl**](AgreementsApi.md#getcombineddocumenturl) | **GET** /agreements/{agreementId}/combinedDocument/url | Retrieves url of all visible pages of all the documents associated with an agreement.
[**GetDocument**](AgreementsApi.md#getdocument) | **GET** /agreements/{agreementId}/documents/{documentId} | Retrieves the file stream of a document of an agreement.
[**GetDocumentImageUrls**](AgreementsApi.md#getdocumentimageurls) | **GET** /agreements/{agreementId}/documents/{documentId}/imageUrls | Retrieves image urls of all visible pages of a document associated with an agreement.
[**GetEvents**](AgreementsApi.md#getevents) | **GET** /agreements/{agreementId}/events | Retrieves the events information for an agreement.
[**GetFormData**](AgreementsApi.md#getformdata) | **GET** /agreements/{agreementId}/formData | Retrieves data entered into the interactive form fields of the agreement.
[**GetFormFields**](AgreementsApi.md#getformfields) | **GET** /agreements/{agreementId}/formFields | Retrieves details of form fields of an agreement.
[**GetMergeInfo**](AgreementsApi.md#getmergeinfo) | **GET** /agreements/{agreementId}/formFields/mergeInfo | Retrieves the merge info stored with an agreement.
[**GetParticipantSet**](AgreementsApi.md#getparticipantset) | **GET** /agreements/{agreementId}/members/participantSets/{participantSetId} | Retrieves the participant set of an agreement identified by agreementId in the path.
[**GetSigningUrl**](AgreementsApi.md#getsigningurl) | **GET** /agreements/{agreementId}/signingUrls | Retrieves the URL for the e-sign page for the current signer(s) of an agreement.
[**RejectAgreementForParticipation**](AgreementsApi.md#rejectagreementforparticipation) | **PUT** /agreements/{agreementId}/members/participantSets/{participantSetId}/participants/{participantId}/reject | Rejects the agreement for a participant.
[**UpdateAgreement**](AgreementsApi.md#updateagreement) | **PUT** /agreements/{agreementId} | Updates the agreement in draft state, or update the expirationTime on an existing agreement that is already out for signature.
[**UpdateAgreementMergeInfo**](AgreementsApi.md#updateagreementmergeinfo) | **PUT** /agreements/{agreementId}/formFields/mergeInfo | Set the merge info for an agreement.
[**UpdateAgreementNoteForApiUser**](AgreementsApi.md#updateagreementnoteforapiuser) | **PUT** /agreements/{agreementId}/me/note | Updates the latest note associated with an agreement.
[**UpdateAgreementReminder**](AgreementsApi.md#updateagreementreminder) | **PUT** /agreements/{agreementId}/reminders/{reminderId} | Updates an existing reminder for an agreement
[**UpdateAgreementSecurityOptionsForParticipation**](AgreementsApi.md#updateagreementsecurityoptionsforparticipation) | **PUT** /agreements/{agreementId}/members/participantSets/{participantSetId}/participants/{participantId}/securityOptions | Updates the security options for a particular participant.
[**UpdateAgreementState**](AgreementsApi.md#updateagreementstate) | **PUT** /agreements/{agreementId}/state | Updates the state of an agreement identified by agreementId in the path.
[**UpdateAgreementVisibility**](AgreementsApi.md#updateagreementvisibility) | **PUT** /agreements/{agreementId}/me/visibility | Updates the visibility of an agreement.
[**UpdateFormFields**](AgreementsApi.md#updateformfields) | **PUT** /agreements/{agreementId}/formFields | Updates form fields of an agreement.  This will replace all fields in AUTHORING mode agreements, and will replace all fields except for text tag generated fields in DRAFT mode agreements.
[**UpdateParticipantSet**](AgreementsApi.md#updateparticipantset) | **PUT** /agreements/{agreementId}/members/participantSets/{participantSetId} | Updates the participant set of an agreement identified by agreementId in the path.


<a name="addtemplatefieldstoagreement"></a>
# **AddTemplateFieldsToAgreement**
> AgreementFormFields AddTemplateFieldsToAgreement (string authorization, string ifMatch, string agreementId, FormFieldPostInfo formFieldPostInfo, string xApiUser = null, string xOnBehalfOfUser = null)

Adds template fields to an agreement

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.agreements;

namespace Example
{
    public class AddTemplateFieldsToAgreementExample
    {
        public void main()
        {
            var apiInstance = new AgreementsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_write')\" oncontextmenu=\"this.href=oauthDoc('agreement_write')\" target=\"oauthDoc\">agreement_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var ifMatch = ifMatch_example;  // string | The server will only update the resource if it matches the listed ETag otherwise error RESOURCE_MODIFIED(412) is returned.
            var agreementId = agreementId_example;  // string | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
            var formFieldPostInfo = new FormFieldPostInfo(); // FormFieldPostInfo | List of form fields to add or replace
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 

            try
            {
                // Adds template fields to an agreement
                AgreementFormFields result = apiInstance.AddTemplateFieldsToAgreement(authorization, ifMatch, agreementId, formFieldPostInfo, xApiUser, xOnBehalfOfUser);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AgreementsApi.AddTemplateFieldsToAgreement: " + e.Message );
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
 **agreementId** | **string**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. | 
 **formFieldPostInfo** | [**FormFieldPostInfo**](FormFieldPostInfo.md)| List of form fields to add or replace | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 

### Return type

[**AgreementFormFields**](AgreementFormFields.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="createagreement"></a>
# **CreateAgreement**
> AgreementCreationResponse CreateAgreement (string authorization, AgreementCreationInfo agreementInfo, string xApiUser = null, string xOnBehalfOfUser = null)

Creates an agreement. Sends it out for signatures, and returns the agreementID in the response to the client.

This is a primary endpoint which is used to create a new agreement. An agreement can be created using transientDocument, libraryDocument or a URL. You can create an agreement in one of the 3 mentioned states: a) <b>DRAFT</b> - to incrementally build the agreement before sending out, b) <b>AUTHORING</b> - to add/edit form fields in the agreement, c) <b>IN_PROCESS</b> - to immediately send the agreement. You can use the PUT /agreements/{agreementId}/state endpoint to transition an agreement between the above mentioned states. An allowed transition would follow the following sequence: DRAFT -> AUTHORING -> IN_PROCESS -> CANCELLED.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.agreements;

namespace Example
{
    public class CreateAgreementExample
    {
        public void main()
        {
            var apiInstance = new AgreementsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_write')\" oncontextmenu=\"this.href=oauthDoc('agreement_write')\" target=\"oauthDoc\">agreement_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var agreementInfo = new AgreementCreationInfo(); // AgreementCreationInfo | Information about the agreement that you want to create.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 

            try
            {
                // Creates an agreement. Sends it out for signatures, and returns the agreementID in the response to the client.
                AgreementCreationResponse result = apiInstance.CreateAgreement(authorization, agreementInfo, xApiUser, xOnBehalfOfUser);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AgreementsApi.CreateAgreement: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_write&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_write&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_write&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **agreementInfo** | [**AgreementCreationInfo**](AgreementCreationInfo.md)| Information about the agreement that you want to create. | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 

### Return type

[**AgreementCreationResponse**](AgreementCreationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="createagreementview"></a>
# **CreateAgreementView**
> AgreementViews CreateAgreementView (string authorization, string agreementId, AgreementViewInfo agreementViewInfo, string xApiUser = null, string xOnBehalfOfUser = null)

Retrieves the latest state view url of agreement.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.agreements;

namespace Example
{
    public class CreateAgreementViewExample
    {
        public void main()
        {
            var apiInstance = new AgreementsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_read')\" oncontextmenu=\"this.href=oauthDoc('agreement_read')\" target=\"oauthDoc\">agreement_read</a> - agreement read is always required</li><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('user_login')\" oncontextmenu=\"this.href=oauthDoc('user_login')\" target=\"oauthDoc\">user_login</a> - Required additionally if the autoLoginUser parameter is set to true</li></ul>in the format <b>'Bearer {accessToken}'.
            var agreementId = agreementId_example;  // string | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
            var agreementViewInfo = new AgreementViewInfo(); // AgreementViewInfo | Name of the required view and its desired configuration.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 

            try
            {
                // Retrieves the latest state view url of agreement.
                AgreementViews result = apiInstance.CreateAgreementView(authorization, agreementId, agreementViewInfo, xApiUser, xOnBehalfOfUser);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AgreementsApi.CreateAgreementView: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_read&lt;/a&gt; - agreement read is always required&lt;/li&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;user_login&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;user_login&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;user_login&lt;/a&gt; - Required additionally if the autoLoginUser parameter is set to true&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **agreementId** | **string**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. | 
 **agreementViewInfo** | [**AgreementViewInfo**](AgreementViewInfo.md)| Name of the required view and its desired configuration. | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 

### Return type

[**AgreementViews**](AgreementViews.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="createdelegatedparticipantsets"></a>
# **CreateDelegatedParticipantSets**
> DelegationResponse CreateDelegatedParticipantSets (string authorization, string agreementId, string participantSetId, DelegatedParticipantSetInfo delegatedParticipantSetInfo, string xApiUser = null)

Creates a participantSet to which the agreement is forwarded for taking appropriate action.

Participants marked as delegator can call this API endpoint.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.agreements;

namespace Example
{
    public class CreateDelegatedParticipantSetsExample
    {
        public void main()
        {
            var apiInstance = new AgreementsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_write')\" oncontextmenu=\"this.href=oauthDoc('agreement_write')\" target=\"oauthDoc\">agreement_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var agreementId = agreementId_example;  // string | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
            var participantSetId = participantSetId_example;  // string | The participant set identifier
            var delegatedParticipantSetInfo = new DelegatedParticipantSetInfo(); // DelegatedParticipantSetInfo | Information about the delegate participant Set
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 

            try
            {
                // Creates a participantSet to which the agreement is forwarded for taking appropriate action.
                DelegationResponse result = apiInstance.CreateDelegatedParticipantSets(authorization, agreementId, participantSetId, delegatedParticipantSetInfo, xApiUser);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AgreementsApi.CreateDelegatedParticipantSets: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_write&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_write&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_write&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **agreementId** | **string**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. | 
 **participantSetId** | **string**| The participant set identifier | 
 **delegatedParticipantSetInfo** | [**DelegatedParticipantSetInfo**](DelegatedParticipantSetInfo.md)| Information about the delegate participant Set | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 

### Return type

[**DelegationResponse**](DelegationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="createreminderonparticipant"></a>
# **CreateReminderOnParticipant**
> ReminderCreationResult CreateReminderOnParticipant (string authorization, string agreementId, ReminderInfo reminderInfo, string xApiUser = null, string xOnBehalfOfUser = null)

Creates a reminder on the specified participants of an agreement identified by agreementId in the path.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.agreements;

namespace Example
{
    public class CreateReminderOnParticipantExample
    {
        public void main()
        {
            var apiInstance = new AgreementsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_write')\" oncontextmenu=\"this.href=oauthDoc('agreement_write')\" target=\"oauthDoc\">agreement_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var agreementId = agreementId_example;  // string | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
            var reminderInfo = new ReminderInfo(); // ReminderInfo | The information about a reminder associated with a recipient of an agreement.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 

            try
            {
                // Creates a reminder on the specified participants of an agreement identified by agreementId in the path.
                ReminderCreationResult result = apiInstance.CreateReminderOnParticipant(authorization, agreementId, reminderInfo, xApiUser, xOnBehalfOfUser);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AgreementsApi.CreateReminderOnParticipant: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_write&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_write&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_write&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **agreementId** | **string**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. | 
 **reminderInfo** | [**ReminderInfo**](ReminderInfo.md)| The information about a reminder associated with a recipient of an agreement. | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 

### Return type

[**ReminderCreationResult**](ReminderCreationResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="createshareonagreement"></a>
# **CreateShareOnAgreement**
> ShareCreationResponseList CreateShareOnAgreement (string authorization, string agreementId, ShareCreationInfoList shareCreationInfoList, string xApiUser = null, string xOnBehalfOfUser = null)

Share an agreement with someone.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.agreements;

namespace Example
{
    public class CreateShareOnAgreementExample
    {
        public void main()
        {
            var apiInstance = new AgreementsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_write')\" oncontextmenu=\"this.href=oauthDoc('agreement_write')\" target=\"oauthDoc\">agreement_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var agreementId = agreementId_example;  // string | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
            var shareCreationInfoList = new ShareCreationInfoList(); // ShareCreationInfoList | List of agreement share creation information objects.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 

            try
            {
                // Share an agreement with someone.
                ShareCreationResponseList result = apiInstance.CreateShareOnAgreement(authorization, agreementId, shareCreationInfoList, xApiUser, xOnBehalfOfUser);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AgreementsApi.CreateShareOnAgreement: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_write&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_write&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_write&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **agreementId** | **string**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. | 
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

<a name="deletedocuments"></a>
# **DeleteDocuments**
> void DeleteDocuments (string authorization, string ifMatch, string agreementId, string xApiUser = null, string xOnBehalfOfUser = null)

Deletes all the documents of an agreement.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.agreements;

namespace Example
{
    public class DeleteDocumentsExample
    {
        public void main()
        {
            var apiInstance = new AgreementsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_retention')\" oncontextmenu=\"this.href=oauthDoc('agreement_retention')\" target=\"oauthDoc\">agreement_retention</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var ifMatch = ifMatch_example;  // string | The server will only update the resource if it matches the listed ETag otherwise error RESOURCE_MODIFIED(412) is returned.
            var agreementId = agreementId_example;  // string | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 

            try
            {
                // Deletes all the documents of an agreement.
                apiInstance.DeleteDocuments(authorization, ifMatch, agreementId, xApiUser, xOnBehalfOfUser);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AgreementsApi.DeleteDocuments: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_retention&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_retention&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_retention&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **ifMatch** | **string**| The server will only update the resource if it matches the listed ETag otherwise error RESOURCE_MODIFIED(412) is returned. | 
 **agreementId** | **string**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. | 
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

<a name="getagreementinfo"></a>
# **GetAgreementInfo**
> AgreementInfo GetAgreementInfo (string authorization, string agreementId, string xApiUser = null, string xOnBehalfOfUser = null, string ifNoneMatch = null)

Retrieves the current status of an agreement.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.agreements;

namespace Example
{
    public class GetAgreementInfoExample
    {
        public void main()
        {
            var apiInstance = new AgreementsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_read')\" oncontextmenu=\"this.href=oauthDoc('agreement_read')\" target=\"oauthDoc\">agreement_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var agreementId = agreementId_example;  // string | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 
            var ifNoneMatch = ifNoneMatch_example;  // string | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed. (optional) 

            try
            {
                // Retrieves the current status of an agreement.
                AgreementInfo result = apiInstance.GetAgreementInfo(authorization, agreementId, xApiUser, xOnBehalfOfUser, ifNoneMatch);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AgreementsApi.GetAgreementInfo: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **agreementId** | **string**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 
 **ifNoneMatch** | **string**| Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn&#39;t changed. | [optional] 

### Return type

[**AgreementInfo**](AgreementInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getagreementnoteforapiuser"></a>
# **GetAgreementNoteForApiUser**
> Note GetAgreementNoteForApiUser (string authorization, string agreementId, string xApiUser = null, string xOnBehalfOfUser = null)

Retrieves the latest note associated with an agreement.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.agreements;

namespace Example
{
    public class GetAgreementNoteForApiUserExample
    {
        public void main()
        {
            var apiInstance = new AgreementsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_read')\" oncontextmenu=\"this.href=oauthDoc('agreement_read')\" target=\"oauthDoc\">agreement_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var agreementId = agreementId_example;  // string | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 

            try
            {
                // Retrieves the latest note associated with an agreement.
                Note result = apiInstance.GetAgreementNoteForApiUser(authorization, agreementId, xApiUser, xOnBehalfOfUser);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AgreementsApi.GetAgreementNoteForApiUser: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **agreementId** | **string**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. | 
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

<a name="getagreementreminder"></a>
# **GetAgreementReminder**
> ReminderInfo GetAgreementReminder (string authorization, string agreementId, string reminderId, string xApiUser = null, string xOnBehalfOfUser = null)

Retrieves a specific reminder associated with an agreement

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.agreements;

namespace Example
{
    public class GetAgreementReminderExample
    {
        public void main()
        {
            var apiInstance = new AgreementsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_read')\" oncontextmenu=\"this.href=oauthDoc('agreement_read')\" target=\"oauthDoc\">agreement_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var agreementId = agreementId_example;  // string | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
            var reminderId = reminderId_example;  // string | The reminder identifier
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 

            try
            {
                // Retrieves a specific reminder associated with an agreement
                ReminderInfo result = apiInstance.GetAgreementReminder(authorization, agreementId, reminderId, xApiUser, xOnBehalfOfUser);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AgreementsApi.GetAgreementReminder: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **agreementId** | **string**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. | 
 **reminderId** | **string**| The reminder identifier | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 

### Return type

[**ReminderInfo**](ReminderInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getagreementreminders"></a>
# **GetAgreementReminders**
> RemindersResponse GetAgreementReminders (string authorization, string agreementId, string xApiUser = null, string xOnBehalfOfUser = null, string status = null)

Retrieves the reminders of an agreement, identified by agreementId in the path.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.agreements;

namespace Example
{
    public class GetAgreementRemindersExample
    {
        public void main()
        {
            var apiInstance = new AgreementsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_read')\" oncontextmenu=\"this.href=oauthDoc('agreement_read')\" target=\"oauthDoc\">agreement_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var agreementId = agreementId_example;  // string | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 
            var status = status_example;  // string | A comma-separated list of reminder statuses of the reminders which should be returned in the response. Currently supported values are ACTIVE, CANCELLED, COMPLETE (optional) 

            try
            {
                // Retrieves the reminders of an agreement, identified by agreementId in the path.
                RemindersResponse result = apiInstance.GetAgreementReminders(authorization, agreementId, xApiUser, xOnBehalfOfUser, status);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AgreementsApi.GetAgreementReminders: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **agreementId** | **string**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 
 **status** | **string**| A comma-separated list of reminder statuses of the reminders which should be returned in the response. Currently supported values are ACTIVE, CANCELLED, COMPLETE | [optional] 

### Return type

[**RemindersResponse**](RemindersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getagreementsecurityoptionsforparticipation"></a>
# **GetAgreementSecurityOptionsForParticipation**
> ParticipantSecurityOption GetAgreementSecurityOptionsForParticipation (string authorization, string agreementId, string participantSetId, string participantId, string ifNoneMatch = null, string xApiUser = null)

Retrieves the security options for a particular participant.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.agreements;

namespace Example
{
    public class GetAgreementSecurityOptionsForParticipationExample
    {
        public void main()
        {
            var apiInstance = new AgreementsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_read')\" oncontextmenu=\"this.href=oauthDoc('agreement_read')\" target=\"oauthDoc\">agreement_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var agreementId = agreementId_example;  // string | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
            var participantSetId = participantSetId_example;  // string | The participant set identifier
            var participantId = participantId_example;  // string | The participant identifier
            var ifNoneMatch = ifNoneMatch_example;  // string | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed. (optional) 
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 

            try
            {
                // Retrieves the security options for a particular participant.
                ParticipantSecurityOption result = apiInstance.GetAgreementSecurityOptionsForParticipation(authorization, agreementId, participantSetId, participantId, ifNoneMatch, xApiUser);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AgreementsApi.GetAgreementSecurityOptionsForParticipation: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **agreementId** | **string**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. | 
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

<a name="getagreements"></a>
# **GetAgreements**
> UserAgreements GetAgreements (string authorization, string xApiUser = null, string xOnBehalfOfUser = null, string externalId = null, bool? showHiddenAgreements = null, string cursor = null, int? pageSize = null)

Retrieves agreements for the user.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.agreements;

namespace Example
{
    public class GetAgreementsExample
    {
        public void main()
        {
            var apiInstance = new AgreementsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_read')\" oncontextmenu=\"this.href=oauthDoc('agreement_read')\" target=\"oauthDoc\">agreement_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 
            var externalId = externalId_example;  // string | Case-sensitive ExternalID for which you would like to retrieve agreement information. ExternalId is passed in the call to the agreement creation API. (optional) 
            var showHiddenAgreements = true;  // bool? | A query parameter to fetch all the hidden agreements along with the visible agreements. Default value is false. (optional) 
            var cursor = cursor_example;  // string | Used to navigate through the pages. If not provided, returns the first page. (optional) 
            var pageSize = 56;  // int? | Number of intended items in the response page. If not provided, it is decided by the application settings. (optional) 

            try
            {
                // Retrieves agreements for the user.
                UserAgreements result = apiInstance.GetAgreements(authorization, xApiUser, xOnBehalfOfUser, externalId, showHiddenAgreements, cursor, pageSize);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AgreementsApi.GetAgreements: " + e.Message );
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
 **externalId** | **string**| Case-sensitive ExternalID for which you would like to retrieve agreement information. ExternalId is passed in the call to the agreement creation API. | [optional] 
 **showHiddenAgreements** | **bool?**| A query parameter to fetch all the hidden agreements along with the visible agreements. Default value is false. | [optional] 
 **cursor** | **string**| Used to navigate through the pages. If not provided, returns the first page. | [optional] 
 **pageSize** | **int?**| Number of intended items in the response page. If not provided, it is decided by the application settings. | [optional] 

### Return type

[**UserAgreements**](UserAgreements.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getalldocuments"></a>
# **GetAllDocuments**
> AgreementDocuments GetAllDocuments (string authorization, string agreementId, string xApiUser = null, string xOnBehalfOfUser = null, string ifNoneMatch = null, string versionId = null, string participantId = null, string supportingDocumentContentFormat = null)

Retrieves the IDs of the documents of an agreement identified by agreementId.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.agreements;

namespace Example
{
    public class GetAllDocumentsExample
    {
        public void main()
        {
            var apiInstance = new AgreementsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_read')\" oncontextmenu=\"this.href=oauthDoc('agreement_read')\" target=\"oauthDoc\">agreement_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var agreementId = agreementId_example;  // string | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 
            var ifNoneMatch = ifNoneMatch_example;  // string | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed. (optional) 
            var versionId = versionId_example;  // string | The version identifier of agreement as provided by the API which retrieves information of a specific agreement. If not provided then latest version will be used. (optional) 
            var participantId = participantId_example;  // string | The participant identifier to be used to retrieve documents. If not mentioned, the participation of api caller is used. (optional) 
            var supportingDocumentContentFormat = supportingDocumentContentFormat_example;  // string | Content format of the supported documents. It can have two possible values ORIGINAL or CONVERTED_PDF. Default value is CONVERTED_PDF. (optional) 

            try
            {
                // Retrieves the IDs of the documents of an agreement identified by agreementId.
                AgreementDocuments result = apiInstance.GetAllDocuments(authorization, agreementId, xApiUser, xOnBehalfOfUser, ifNoneMatch, versionId, participantId, supportingDocumentContentFormat);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AgreementsApi.GetAllDocuments: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **agreementId** | **string**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 
 **ifNoneMatch** | **string**| Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn&#39;t changed. | [optional] 
 **versionId** | **string**| The version identifier of agreement as provided by the API which retrieves information of a specific agreement. If not provided then latest version will be used. | [optional] 
 **participantId** | **string**| The participant identifier to be used to retrieve documents. If not mentioned, the participation of api caller is used. | [optional] 
 **supportingDocumentContentFormat** | **string**| Content format of the supported documents. It can have two possible values ORIGINAL or CONVERTED_PDF. Default value is CONVERTED_PDF. | [optional] 

### Return type

[**AgreementDocuments**](AgreementDocuments.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getalldocumentsimageurls"></a>
# **GetAllDocumentsImageUrls**
> DocumentsImageUrlsInfo GetAllDocumentsImageUrls (string authorization, string agreementId, string xApiUser = null, string xOnBehalfOfUser = null, string versionId = null, string participantId = null, string imageSizes = null, bool? includeSupportingDocumentsImageUrls = null, bool? showImageAvailabilityOnly = null)

Retrieves image urls of all visible pages of all the documents associated with an agreement.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.agreements;

namespace Example
{
    public class GetAllDocumentsImageUrlsExample
    {
        public void main()
        {
            var apiInstance = new AgreementsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_read')\" oncontextmenu=\"this.href=oauthDoc('agreement_read')\" target=\"oauthDoc\">agreement_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var agreementId = agreementId_example;  // string | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 
            var versionId = versionId_example;  // string | The version identifier of agreement as provided by the API which retrieves information of a specific agreement. If not provided then latest version will be used. (optional) 
            var participantId = participantId_example;  // string | The participant identifier to be used to retrieve documents. If not mentioned, the participation of api caller is used. (optional) 
            var imageSizes = imageSizes_example;  // string | A comma separated list of image sizes i.e. {FIXED_WIDTH_50px, FIXED_WIDTH_250px, FIXED_WIDTH_675px, ZOOM_50_PERCENT, ZOOM_75_PERCENT, ZOOM_100_PERCENT, ZOOM_125_PERCENT, ZOOM_150_PERCENT, ZOOM_200_PERCENT}. Default sizes returned are {FIXED_WIDTH_50px, FIXED_WIDTH_250px, FIXED_WIDTH_675px, ZOOM_100_PERCENT}.  (optional) 
            var includeSupportingDocumentsImageUrls = true;  // bool? | When set to true, returns image urls of supporting documents as well. Else, returns image urls of only the original documents. (optional) 
            var showImageAvailabilityOnly = true;  // bool? | When set to true, returns only image availability. Else, returns both image urls and its availability. (optional) 

            try
            {
                // Retrieves image urls of all visible pages of all the documents associated with an agreement.
                DocumentsImageUrlsInfo result = apiInstance.GetAllDocumentsImageUrls(authorization, agreementId, xApiUser, xOnBehalfOfUser, versionId, participantId, imageSizes, includeSupportingDocumentsImageUrls, showImageAvailabilityOnly);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AgreementsApi.GetAllDocumentsImageUrls: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **agreementId** | **string**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 
 **versionId** | **string**| The version identifier of agreement as provided by the API which retrieves information of a specific agreement. If not provided then latest version will be used. | [optional] 
 **participantId** | **string**| The participant identifier to be used to retrieve documents. If not mentioned, the participation of api caller is used. | [optional] 
 **imageSizes** | **string**| A comma separated list of image sizes i.e. {FIXED_WIDTH_50px, FIXED_WIDTH_250px, FIXED_WIDTH_675px, ZOOM_50_PERCENT, ZOOM_75_PERCENT, ZOOM_100_PERCENT, ZOOM_125_PERCENT, ZOOM_150_PERCENT, ZOOM_200_PERCENT}. Default sizes returned are {FIXED_WIDTH_50px, FIXED_WIDTH_250px, FIXED_WIDTH_675px, ZOOM_100_PERCENT}.  | [optional] 
 **includeSupportingDocumentsImageUrls** | **bool?**| When set to true, returns image urls of supporting documents as well. Else, returns image urls of only the original documents. | [optional] 
 **showImageAvailabilityOnly** | **bool?**| When set to true, returns only image availability. Else, returns both image urls and its availability. | [optional] 

### Return type

[**DocumentsImageUrlsInfo**](DocumentsImageUrlsInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getallmembers"></a>
# **GetAllMembers**
> MembersInfo GetAllMembers (string authorization, string agreementId, string xApiUser = null, string xOnBehalfOfUser = null, string ifNoneMatch = null, bool? includeNextParticipantSet = null)

Retrieves information of members of the agreement.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.agreements;

namespace Example
{
    public class GetAllMembersExample
    {
        public void main()
        {
            var apiInstance = new AgreementsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_read')\" oncontextmenu=\"this.href=oauthDoc('agreement_read')\" target=\"oauthDoc\">agreement_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var agreementId = agreementId_example;  // string | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 
            var ifNoneMatch = ifNoneMatch_example;  // string | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed. (optional) 
            var includeNextParticipantSet = true;  // bool? | A query parameter to fetch next active participation members. Default value is false. (optional) 

            try
            {
                // Retrieves information of members of the agreement.
                MembersInfo result = apiInstance.GetAllMembers(authorization, agreementId, xApiUser, xOnBehalfOfUser, ifNoneMatch, includeNextParticipantSet);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AgreementsApi.GetAllMembers: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **agreementId** | **string**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 
 **ifNoneMatch** | **string**| Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn&#39;t changed. | [optional] 
 **includeNextParticipantSet** | **bool?**| A query parameter to fetch next active participation members. Default value is false. | [optional] 

### Return type

[**MembersInfo**](MembersInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getaudittrail"></a>
# **GetAuditTrail**
> byte[] GetAuditTrail (string authorization, string agreementId, string xApiUser = null, string xOnBehalfOfUser = null, string ifNoneMatch = null)

Retrieves the audit trail of an agreement identified by agreementId.

PDF file stream containing audit trail information

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.agreements;

namespace Example
{
    public class GetAuditTrailExample
    {
        public void main()
        {
            var apiInstance = new AgreementsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_read')\" oncontextmenu=\"this.href=oauthDoc('agreement_read')\" target=\"oauthDoc\">agreement_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var agreementId = agreementId_example;  // string | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 
            var ifNoneMatch = ifNoneMatch_example;  // string | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed. (optional) 

            try
            {
                // Retrieves the audit trail of an agreement identified by agreementId.
                byte[] result = apiInstance.GetAuditTrail(authorization, agreementId, xApiUser, xOnBehalfOfUser, ifNoneMatch);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AgreementsApi.GetAuditTrail: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **agreementId** | **string**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. | 
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

<a name="getcombineddocument"></a>
# **GetCombinedDocument**
> byte[] GetCombinedDocument (string authorization, string agreementId, string xApiUser = null, string xOnBehalfOfUser = null, string ifNoneMatch = null, string versionId = null, string participantId = null, bool? attachSupportingDocuments = null, bool? attachAuditReport = null)

Retrieves a single combined PDF document for the documents associated with an agreement.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.agreements;

namespace Example
{
    public class GetCombinedDocumentExample
    {
        public void main()
        {
            var apiInstance = new AgreementsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_read')\" oncontextmenu=\"this.href=oauthDoc('agreement_read')\" target=\"oauthDoc\">agreement_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var agreementId = agreementId_example;  // string | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 
            var ifNoneMatch = ifNoneMatch_example;  // string | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed. (optional) 
            var versionId = versionId_example;  // string | The version identifier of agreement as provided by the API which retrieves information of a specific agreement. If not provided then latest version will be used. (optional) 
            var participantId = participantId_example;  // string | The participant identifier to be used to retrieve documents. If not mentioned, the participation of api caller is used. (optional) 
            var attachSupportingDocuments = true;  // bool? | When set to true, attach corresponding supporting documents to the signed agreement PDF. Default value of this parameter is true. (optional) 
            var attachAuditReport = true;  // bool? | When set to true, attach an audit report to the signed agreement PDF. Default value is false (optional) 

            try
            {
                // Retrieves a single combined PDF document for the documents associated with an agreement.
                byte[] result = apiInstance.GetCombinedDocument(authorization, agreementId, xApiUser, xOnBehalfOfUser, ifNoneMatch, versionId, participantId, attachSupportingDocuments, attachAuditReport);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AgreementsApi.GetCombinedDocument: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **agreementId** | **string**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 
 **ifNoneMatch** | **string**| Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn&#39;t changed. | [optional] 
 **versionId** | **string**| The version identifier of agreement as provided by the API which retrieves information of a specific agreement. If not provided then latest version will be used. | [optional] 
 **participantId** | **string**| The participant identifier to be used to retrieve documents. If not mentioned, the participation of api caller is used. | [optional] 
 **attachSupportingDocuments** | **bool?**| When set to true, attach corresponding supporting documents to the signed agreement PDF. Default value of this parameter is true. | [optional] 
 **attachAuditReport** | **bool?**| When set to true, attach an audit report to the signed agreement PDF. Default value is false | [optional] 

### Return type

**byte[]**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/pdf, application/pdf;encoding=base64

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getcombineddocumentpagesinfo"></a>
# **GetCombinedDocumentPagesInfo**
> CombinedDocumentPagesInfo GetCombinedDocumentPagesInfo (string authorization, string agreementId, string xApiUser = null, string xOnBehalfOfUser = null, string ifNoneMatch = null, bool? includeSupportingDocumentsPagesInfo = null)

Retrieves info of all pages of a combined PDF document for the documents associated with an agreement.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.agreements;

namespace Example
{
    public class GetCombinedDocumentPagesInfoExample
    {
        public void main()
        {
            var apiInstance = new AgreementsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_read')\" oncontextmenu=\"this.href=oauthDoc('agreement_read')\" target=\"oauthDoc\">agreement_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var agreementId = agreementId_example;  // string | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 
            var ifNoneMatch = ifNoneMatch_example;  // string | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed. (optional) 
            var includeSupportingDocumentsPagesInfo = true;  // bool? | When set to true, returns info of all pages of supporting documents as well. Else, return the info of pages of only the original document. (optional) 

            try
            {
                // Retrieves info of all pages of a combined PDF document for the documents associated with an agreement.
                CombinedDocumentPagesInfo result = apiInstance.GetCombinedDocumentPagesInfo(authorization, agreementId, xApiUser, xOnBehalfOfUser, ifNoneMatch, includeSupportingDocumentsPagesInfo);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AgreementsApi.GetCombinedDocumentPagesInfo: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **agreementId** | **string**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 
 **ifNoneMatch** | **string**| Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn&#39;t changed. | [optional] 
 **includeSupportingDocumentsPagesInfo** | **bool?**| When set to true, returns info of all pages of supporting documents as well. Else, return the info of pages of only the original document. | [optional] 

### Return type

[**CombinedDocumentPagesInfo**](CombinedDocumentPagesInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getcombineddocumenturl"></a>
# **GetCombinedDocumentUrl**
> DocumentUrl GetCombinedDocumentUrl (string authorization, string agreementId, string xApiUser = null, string xOnBehalfOfUser = null, string versionId = null, string participantId = null, bool? attachSupportingDocuments = null, bool? attachAuditReport = null)

Retrieves url of all visible pages of all the documents associated with an agreement.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.agreements;

namespace Example
{
    public class GetCombinedDocumentUrlExample
    {
        public void main()
        {
            var apiInstance = new AgreementsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_read')\" oncontextmenu=\"this.href=oauthDoc('agreement_read')\" target=\"oauthDoc\">agreement_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var agreementId = agreementId_example;  // string | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 
            var versionId = versionId_example;  // string | The version identifier of agreement as provided by the API which retrieves information of a specific agreement. If not provided then latest version will be used. (optional) 
            var participantId = participantId_example;  // string | The participant identifier to be used to retrieve documents. If not mentioned, the participation of api caller is used. (optional) 
            var attachSupportingDocuments = true;  // bool? | When set to true, attach corresponding supporting documents to the signed agreement PDF. Default value of this parameter is true. (optional) 
            var attachAuditReport = true;  // bool? | When set to true, attach an audit report to the signed agreement PDF. Default value is false (optional) 

            try
            {
                // Retrieves url of all visible pages of all the documents associated with an agreement.
                DocumentUrl result = apiInstance.GetCombinedDocumentUrl(authorization, agreementId, xApiUser, xOnBehalfOfUser, versionId, participantId, attachSupportingDocuments, attachAuditReport);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AgreementsApi.GetCombinedDocumentUrl: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **agreementId** | **string**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 
 **versionId** | **string**| The version identifier of agreement as provided by the API which retrieves information of a specific agreement. If not provided then latest version will be used. | [optional] 
 **participantId** | **string**| The participant identifier to be used to retrieve documents. If not mentioned, the participation of api caller is used. | [optional] 
 **attachSupportingDocuments** | **bool?**| When set to true, attach corresponding supporting documents to the signed agreement PDF. Default value of this parameter is true. | [optional] 
 **attachAuditReport** | **bool?**| When set to true, attach an audit report to the signed agreement PDF. Default value is false | [optional] 

### Return type

[**DocumentUrl**](DocumentUrl.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getdocument"></a>
# **GetDocument**
> byte[] GetDocument (string authorization, string agreementId, string documentId, string xApiUser = null, string xOnBehalfOfUser = null, string ifNoneMatch = null)

Retrieves the file stream of a document of an agreement.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.agreements;

namespace Example
{
    public class GetDocumentExample
    {
        public void main()
        {
            var apiInstance = new AgreementsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_read')\" oncontextmenu=\"this.href=oauthDoc('agreement_read')\" target=\"oauthDoc\">agreement_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var agreementId = agreementId_example;  // string | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
            var documentId = documentId_example;  // string | The document identifier, as retrieved from the API which fetches the documents of a specified agreement
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 
            var ifNoneMatch = ifNoneMatch_example;  // string | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed. (optional) 

            try
            {
                // Retrieves the file stream of a document of an agreement.
                byte[] result = apiInstance.GetDocument(authorization, agreementId, documentId, xApiUser, xOnBehalfOfUser, ifNoneMatch);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AgreementsApi.GetDocument: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **agreementId** | **string**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. | 
 **documentId** | **string**| The document identifier, as retrieved from the API which fetches the documents of a specified agreement | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 
 **ifNoneMatch** | **string**| Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn&#39;t changed. | [optional] 

### Return type

**byte[]**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*, *_/_*;encoding=base64

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getdocumentimageurls"></a>
# **GetDocumentImageUrls**
> AgreementDocumentImageUrlsInfo GetDocumentImageUrls (string authorization, string agreementId, string documentId, string xApiUser = null, string xOnBehalfOfUser = null, string imageSizes = null, bool? showImageAvailabilityOnly = null, int? startPage = null, int? endPage = null)

Retrieves image urls of all visible pages of a document associated with an agreement.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.agreements;

namespace Example
{
    public class GetDocumentImageUrlsExample
    {
        public void main()
        {
            var apiInstance = new AgreementsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_read')\" oncontextmenu=\"this.href=oauthDoc('agreement_read')\" target=\"oauthDoc\">agreement_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var agreementId = agreementId_example;  // string | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
            var documentId = documentId_example;  // string | The document identifier, as retrieved from the API which fetches the documents of a specified agreement
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 
            var imageSizes = imageSizes_example;  // string | A comma separated list of image sizes i.e. {FIXED_WIDTH_50px, FIXED_WIDTH_250px, FIXED_WIDTH_675px, ZOOM_50_PERCENT, ZOOM_75_PERCENT, ZOOM_100_PERCENT, ZOOM_125_PERCENT, ZOOM_150_PERCENT, ZOOM_200_PERCENT}. Default sizes returned are {FIXED_WIDTH_50px, FIXED_WIDTH_250px, FIXED_WIDTH_675px, ZOOM_100_PERCENT}.  (optional) 
            var showImageAvailabilityOnly = true;  // bool? | When set to true, returns only image availability. Else, returns both image urls and its availability. (optional) 
            var startPage = 56;  // int? | Start of page number range for which imageUrls are requested. Starting page number should be greater than 0. (optional) 
            var endPage = 56;  // int? | End of page number range for which imageUrls are requested. (optional) 

            try
            {
                // Retrieves image urls of all visible pages of a document associated with an agreement.
                AgreementDocumentImageUrlsInfo result = apiInstance.GetDocumentImageUrls(authorization, agreementId, documentId, xApiUser, xOnBehalfOfUser, imageSizes, showImageAvailabilityOnly, startPage, endPage);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AgreementsApi.GetDocumentImageUrls: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **agreementId** | **string**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. | 
 **documentId** | **string**| The document identifier, as retrieved from the API which fetches the documents of a specified agreement | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 
 **imageSizes** | **string**| A comma separated list of image sizes i.e. {FIXED_WIDTH_50px, FIXED_WIDTH_250px, FIXED_WIDTH_675px, ZOOM_50_PERCENT, ZOOM_75_PERCENT, ZOOM_100_PERCENT, ZOOM_125_PERCENT, ZOOM_150_PERCENT, ZOOM_200_PERCENT}. Default sizes returned are {FIXED_WIDTH_50px, FIXED_WIDTH_250px, FIXED_WIDTH_675px, ZOOM_100_PERCENT}.  | [optional] 
 **showImageAvailabilityOnly** | **bool?**| When set to true, returns only image availability. Else, returns both image urls and its availability. | [optional] 
 **startPage** | **int?**| Start of page number range for which imageUrls are requested. Starting page number should be greater than 0. | [optional] 
 **endPage** | **int?**| End of page number range for which imageUrls are requested. | [optional] 

### Return type

[**AgreementDocumentImageUrlsInfo**](AgreementDocumentImageUrlsInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getevents"></a>
# **GetEvents**
> AgreementEventList GetEvents (string authorization, string agreementId, string xApiUser = null, string xOnBehalfOfUser = null, string ifNoneMatch = null)

Retrieves the events information for an agreement.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.agreements;

namespace Example
{
    public class GetEventsExample
    {
        public void main()
        {
            var apiInstance = new AgreementsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_read')\" oncontextmenu=\"this.href=oauthDoc('agreement_read')\" target=\"oauthDoc\">agreement_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var agreementId = agreementId_example;  // string | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 
            var ifNoneMatch = ifNoneMatch_example;  // string | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed. (optional) 

            try
            {
                // Retrieves the events information for an agreement.
                AgreementEventList result = apiInstance.GetEvents(authorization, agreementId, xApiUser, xOnBehalfOfUser, ifNoneMatch);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AgreementsApi.GetEvents: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **agreementId** | **string**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 
 **ifNoneMatch** | **string**| Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn&#39;t changed. | [optional] 

### Return type

[**AgreementEventList**](AgreementEventList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getformdata"></a>
# **GetFormData**
> byte[] GetFormData (string authorization, string agreementId, string xApiUser = null, string xOnBehalfOfUser = null, string ifNoneMatch = null)

Retrieves data entered into the interactive form fields of the agreement.

This API can only be called by the creator of the agreement

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.agreements;

namespace Example
{
    public class GetFormDataExample
    {
        public void main()
        {
            var apiInstance = new AgreementsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_read')\" oncontextmenu=\"this.href=oauthDoc('agreement_read')\" target=\"oauthDoc\">agreement_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var agreementId = agreementId_example;  // string | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 
            var ifNoneMatch = ifNoneMatch_example;  // string | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed. (optional) 

            try
            {
                // Retrieves data entered into the interactive form fields of the agreement.
                byte[] result = apiInstance.GetFormData(authorization, agreementId, xApiUser, xOnBehalfOfUser, ifNoneMatch);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AgreementsApi.GetFormData: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **agreementId** | **string**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. | 
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

<a name="getformfields"></a>
# **GetFormFields**
> AgreementFormFields GetFormFields (string authorization, string agreementId, string xApiUser = null, string xOnBehalfOfUser = null, string ifNoneMatch = null, string participantEmail = null)

Retrieves details of form fields of an agreement.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.agreements;

namespace Example
{
    public class GetFormFieldsExample
    {
        public void main()
        {
            var apiInstance = new AgreementsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_read')\" oncontextmenu=\"this.href=oauthDoc('agreement_read')\" target=\"oauthDoc\">agreement_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var agreementId = agreementId_example;  // string | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 
            var ifNoneMatch = ifNoneMatch_example;  // string | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed. (optional) 
            var participantEmail = participantEmail_example;  // string | The email address of the participant to be used to retrieve its associated form fields. (optional) 

            try
            {
                // Retrieves details of form fields of an agreement.
                AgreementFormFields result = apiInstance.GetFormFields(authorization, agreementId, xApiUser, xOnBehalfOfUser, ifNoneMatch, participantEmail);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AgreementsApi.GetFormFields: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **agreementId** | **string**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 
 **ifNoneMatch** | **string**| Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn&#39;t changed. | [optional] 
 **participantEmail** | **string**| The email address of the participant to be used to retrieve its associated form fields. | [optional] 

### Return type

[**AgreementFormFields**](AgreementFormFields.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getmergeinfo"></a>
# **GetMergeInfo**
> FormFieldMergeInfo GetMergeInfo (string authorization, string agreementId, string xApiUser = null, string xOnBehalfOfUser = null)

Retrieves the merge info stored with an agreement.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.agreements;

namespace Example
{
    public class GetMergeInfoExample
    {
        public void main()
        {
            var apiInstance = new AgreementsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_read')\" oncontextmenu=\"this.href=oauthDoc('agreement_read')\" target=\"oauthDoc\">agreement_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var agreementId = agreementId_example;  // string | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 

            try
            {
                // Retrieves the merge info stored with an agreement.
                FormFieldMergeInfo result = apiInstance.GetMergeInfo(authorization, agreementId, xApiUser, xOnBehalfOfUser);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AgreementsApi.GetMergeInfo: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **agreementId** | **string**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 

### Return type

[**FormFieldMergeInfo**](FormFieldMergeInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getparticipantset"></a>
# **GetParticipantSet**
> DetailedParticipantSetInfo GetParticipantSet (string authorization, string agreementId, string participantSetId, string xApiUser = null, string xOnBehalfOfUser = null, string ifNoneMatch = null)

Retrieves the participant set of an agreement identified by agreementId in the path.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.agreements;

namespace Example
{
    public class GetParticipantSetExample
    {
        public void main()
        {
            var apiInstance = new AgreementsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_read')\" oncontextmenu=\"this.href=oauthDoc('agreement_read')\" target=\"oauthDoc\">agreement_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var agreementId = agreementId_example;  // string | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
            var participantSetId = participantSetId_example;  // string | The participant set identifier
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 
            var ifNoneMatch = ifNoneMatch_example;  // string | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed. (optional) 

            try
            {
                // Retrieves the participant set of an agreement identified by agreementId in the path.
                DetailedParticipantSetInfo result = apiInstance.GetParticipantSet(authorization, agreementId, participantSetId, xApiUser, xOnBehalfOfUser, ifNoneMatch);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AgreementsApi.GetParticipantSet: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **agreementId** | **string**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. | 
 **participantSetId** | **string**| The participant set identifier | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 
 **ifNoneMatch** | **string**| Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn&#39;t changed. | [optional] 

### Return type

[**DetailedParticipantSetInfo**](DetailedParticipantSetInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getsigningurl"></a>
# **GetSigningUrl**
> SigningUrlResponse GetSigningUrl (string authorization, string agreementId, string xApiUser = null, string ifNoneMatch = null)

Retrieves the URL for the e-sign page for the current signer(s) of an agreement.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.agreements;

namespace Example
{
    public class GetSigningUrlExample
    {
        public void main()
        {
            var apiInstance = new AgreementsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_write')\" oncontextmenu=\"this.href=oauthDoc('agreement_write')\" target=\"oauthDoc\">agreement_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var agreementId = agreementId_example;  // string | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var ifNoneMatch = ifNoneMatch_example;  // string | Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn't changed. (optional) 

            try
            {
                // Retrieves the URL for the e-sign page for the current signer(s) of an agreement.
                SigningUrlResponse result = apiInstance.GetSigningUrl(authorization, agreementId, xApiUser, ifNoneMatch);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AgreementsApi.GetSigningUrl: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_write&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_write&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_write&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **agreementId** | **string**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **ifNoneMatch** | **string**| Pass the value of the e-tag header obtained from the previous response to the same request to get a RESOURCE_NOT_MODIFIED(304) if the resource hasn&#39;t changed. | [optional] 

### Return type

[**SigningUrlResponse**](SigningUrlResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="rejectagreementforparticipation"></a>
# **RejectAgreementForParticipation**
> void RejectAgreementForParticipation (string authorization, string ifMatch, string agreementId, string participantSetId, string participantId, AgreementRejectionInfo agreementRejectionInfo, string xApiUser = null)

Rejects the agreement for a participant.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.agreements;

namespace Example
{
    public class RejectAgreementForParticipationExample
    {
        public void main()
        {
            var apiInstance = new AgreementsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_write')\" oncontextmenu=\"this.href=oauthDoc('agreement_write')\" target=\"oauthDoc\">agreement_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var ifMatch = ifMatch_example;  // string | The server will only update the resource if it matches the listed ETag otherwise error RESOURCE_MODIFIED(412) is returned.
            var agreementId = agreementId_example;  // string | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
            var participantSetId = participantSetId_example;  // string | The participant set identifier
            var participantId = participantId_example;  // string | The participant identifier
            var agreementRejectionInfo = new AgreementRejectionInfo(); // AgreementRejectionInfo | Participant rejection information required for rejecting the agreement
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 

            try
            {
                // Rejects the agreement for a participant.
                apiInstance.RejectAgreementForParticipation(authorization, ifMatch, agreementId, participantSetId, participantId, agreementRejectionInfo, xApiUser);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AgreementsApi.RejectAgreementForParticipation: " + e.Message );
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
 **agreementId** | **string**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. | 
 **participantSetId** | **string**| The participant set identifier | 
 **participantId** | **string**| The participant identifier | 
 **agreementRejectionInfo** | [**AgreementRejectionInfo**](AgreementRejectionInfo.md)| Participant rejection information required for rejecting the agreement | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="updateagreement"></a>
# **UpdateAgreement**
> void UpdateAgreement (string authorization, string ifMatch, string agreementId, AgreementInfo agreementInfo, string xApiUser = null, string xOnBehalfOfUser = null)

Updates the agreement in draft state, or update the expirationTime on an existing agreement that is already out for signature.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.agreements;

namespace Example
{
    public class UpdateAgreementExample
    {
        public void main()
        {
            var apiInstance = new AgreementsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_write')\" oncontextmenu=\"this.href=oauthDoc('agreement_write')\" target=\"oauthDoc\">agreement_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var ifMatch = ifMatch_example;  // string | The server will only update the resource if it matches the listed ETag otherwise error RESOURCE_MODIFIED(412) is returned.
            var agreementId = agreementId_example;  // string | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
            var agreementInfo = new AgreementInfo(); // AgreementInfo | Information necessary to update a modifiable agreement that is presently out for signature.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 

            try
            {
                // Updates the agreement in draft state, or update the expirationTime on an existing agreement that is already out for signature.
                apiInstance.UpdateAgreement(authorization, ifMatch, agreementId, agreementInfo, xApiUser, xOnBehalfOfUser);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AgreementsApi.UpdateAgreement: " + e.Message );
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
 **agreementId** | **string**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. | 
 **agreementInfo** | [**AgreementInfo**](AgreementInfo.md)| Information necessary to update a modifiable agreement that is presently out for signature. | 
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

<a name="updateagreementmergeinfo"></a>
# **UpdateAgreementMergeInfo**
> void UpdateAgreementMergeInfo (string authorization, string ifMatch, string agreementId, FormFieldMergeInfo formFieldMergeInfo, string xApiUser = null, string xOnBehalfOfUser = null)

Set the merge info for an agreement.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.agreements;

namespace Example
{
    public class UpdateAgreementMergeInfoExample
    {
        public void main()
        {
            var apiInstance = new AgreementsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_write')\" oncontextmenu=\"this.href=oauthDoc('agreement_write')\" target=\"oauthDoc\">agreement_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var ifMatch = ifMatch_example;  // string | The server will only update the resource if it matches the listed ETag otherwise error RESOURCE_MODIFIED(412) is returned.
            var agreementId = agreementId_example;  // string | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
            var formFieldMergeInfo = new FormFieldMergeInfo(); // FormFieldMergeInfo | A mapping indicating the default values to set for form fields
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 

            try
            {
                // Set the merge info for an agreement.
                apiInstance.UpdateAgreementMergeInfo(authorization, ifMatch, agreementId, formFieldMergeInfo, xApiUser, xOnBehalfOfUser);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AgreementsApi.UpdateAgreementMergeInfo: " + e.Message );
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
 **agreementId** | **string**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. | 
 **formFieldMergeInfo** | [**FormFieldMergeInfo**](FormFieldMergeInfo.md)| A mapping indicating the default values to set for form fields | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/pdf, text/csv

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="updateagreementnoteforapiuser"></a>
# **UpdateAgreementNoteForApiUser**
> void UpdateAgreementNoteForApiUser (string authorization, string agreementId, Note note, string xApiUser = null, string xOnBehalfOfUser = null)

Updates the latest note associated with an agreement.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.agreements;

namespace Example
{
    public class UpdateAgreementNoteForApiUserExample
    {
        public void main()
        {
            var apiInstance = new AgreementsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_write')\" oncontextmenu=\"this.href=oauthDoc('agreement_write')\" target=\"oauthDoc\">agreement_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var agreementId = agreementId_example;  // string | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
            var note = new Note(); // Note | The note to be associated with the agreement.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 

            try
            {
                // Updates the latest note associated with an agreement.
                apiInstance.UpdateAgreementNoteForApiUser(authorization, agreementId, note, xApiUser, xOnBehalfOfUser);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AgreementsApi.UpdateAgreementNoteForApiUser: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_write&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_write&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_write&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **agreementId** | **string**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. | 
 **note** | [**Note**](Note.md)| The note to be associated with the agreement. | 
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

<a name="updateagreementreminder"></a>
# **UpdateAgreementReminder**
> void UpdateAgreementReminder (string authorization, string agreementId, string reminderId, ReminderInfo reminderInfo, string xApiUser = null, string xOnBehalfOfUser = null)

Updates an existing reminder for an agreement

You can only update an ACTIVE reminder, and can only update the status to 'CANCELED', update reminderParticipantIds, or update note.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.agreements;

namespace Example
{
    public class UpdateAgreementReminderExample
    {
        public void main()
        {
            var apiInstance = new AgreementsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_write')\" oncontextmenu=\"this.href=oauthDoc('agreement_write')\" target=\"oauthDoc\">agreement_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var agreementId = agreementId_example;  // string | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
            var reminderId = reminderId_example;  // string | The reminder identifier
            var reminderInfo = new ReminderInfo(); // ReminderInfo | The information about a reminder associated with a recipient of an agreement.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 

            try
            {
                // Updates an existing reminder for an agreement
                apiInstance.UpdateAgreementReminder(authorization, agreementId, reminderId, reminderInfo, xApiUser, xOnBehalfOfUser);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AgreementsApi.UpdateAgreementReminder: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_write&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_write&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_write&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **agreementId** | **string**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. | 
 **reminderId** | **string**| The reminder identifier | 
 **reminderInfo** | [**ReminderInfo**](ReminderInfo.md)| The information about a reminder associated with a recipient of an agreement. | 
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

<a name="updateagreementsecurityoptionsforparticipation"></a>
# **UpdateAgreementSecurityOptionsForParticipation**
> void UpdateAgreementSecurityOptionsForParticipation (string authorization, string ifMatch, string agreementId, string participantSetId, string participantId, ParticipantSecurityOption participantSecurityOption, string xApiUser = null)

Updates the security options for a particular participant.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.agreements;

namespace Example
{
    public class UpdateAgreementSecurityOptionsForParticipationExample
    {
        public void main()
        {
            var apiInstance = new AgreementsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_write')\" oncontextmenu=\"this.href=oauthDoc('agreement_write')\" target=\"oauthDoc\">agreement_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var ifMatch = ifMatch_example;  // string | The server will only update the resource if it matches the listed ETag otherwise error RESOURCE_MODIFIED(412) is returned.
            var agreementId = agreementId_example;  // string | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
            var participantSetId = participantSetId_example;  // string | The participant set identifier
            var participantId = participantId_example;  // string | The participant identifier
            var participantSecurityOption = new ParticipantSecurityOption(); // ParticipantSecurityOption | Security options that apply to the participant
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 

            try
            {
                // Updates the security options for a particular participant.
                apiInstance.UpdateAgreementSecurityOptionsForParticipation(authorization, ifMatch, agreementId, participantSetId, participantId, participantSecurityOption, xApiUser);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AgreementsApi.UpdateAgreementSecurityOptionsForParticipation: " + e.Message );
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
 **agreementId** | **string**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. | 
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

<a name="updateagreementstate"></a>
# **UpdateAgreementState**
> void UpdateAgreementState (string authorization, string ifMatch, string agreementId, AgreementStateInfo agreementStateInfo, string xApiUser = null, string xOnBehalfOfUser = null)

Updates the state of an agreement identified by agreementId in the path.

This endpoint can be used by originator/sender of an agreement to transition between the states of agreement. An allowed transition would follow the following sequence: DRAFT -> AUTHORING -> IN_PROCESS -> CANCELLED.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.agreements;

namespace Example
{
    public class UpdateAgreementStateExample
    {
        public void main()
        {
            var apiInstance = new AgreementsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_write')\" oncontextmenu=\"this.href=oauthDoc('agreement_write')\" target=\"oauthDoc\">agreement_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var ifMatch = ifMatch_example;  // string | The server will only update the resource if it matches the listed ETag otherwise error RESOURCE_MODIFIED(412) is returned.
            var agreementId = agreementId_example;  // string | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
            var agreementStateInfo = new AgreementStateInfo(); // AgreementStateInfo | 
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 

            try
            {
                // Updates the state of an agreement identified by agreementId in the path.
                apiInstance.UpdateAgreementState(authorization, ifMatch, agreementId, agreementStateInfo, xApiUser, xOnBehalfOfUser);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AgreementsApi.UpdateAgreementState: " + e.Message );
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
 **agreementId** | **string**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. | 
 **agreementStateInfo** | [**AgreementStateInfo**](AgreementStateInfo.md)|  | 
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

<a name="updateagreementvisibility"></a>
# **UpdateAgreementVisibility**
> void UpdateAgreementVisibility (string authorization, string agreementId, VisibilityInfo visibilityInfo, string xApiUser = null, string xOnBehalfOfUser = null)

Updates the visibility of an agreement.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.agreements;

namespace Example
{
    public class UpdateAgreementVisibilityExample
    {
        public void main()
        {
            var apiInstance = new AgreementsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_write')\" oncontextmenu=\"this.href=oauthDoc('agreement_write')\" target=\"oauthDoc\">agreement_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var agreementId = agreementId_example;  // string | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
            var visibilityInfo = new VisibilityInfo(); // VisibilityInfo | Information to update visibility of agreement
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 

            try
            {
                // Updates the visibility of an agreement.
                apiInstance.UpdateAgreementVisibility(authorization, agreementId, visibilityInfo, xApiUser, xOnBehalfOfUser);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AgreementsApi.UpdateAgreementVisibility: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_write&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;agreement_write&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;agreement_write&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **agreementId** | **string**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. | 
 **visibilityInfo** | [**VisibilityInfo**](VisibilityInfo.md)| Information to update visibility of agreement | 
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

<a name="updateformfields"></a>
# **UpdateFormFields**
> AgreementFormFields UpdateFormFields (string authorization, string ifMatch, string agreementId, FormFieldPutInfo formFieldPutInfo, string xApiUser = null, string xOnBehalfOfUser = null)

Updates form fields of an agreement.  This will replace all fields in AUTHORING mode agreements, and will replace all fields except for text tag generated fields in DRAFT mode agreements.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.agreements;

namespace Example
{
    public class UpdateFormFieldsExample
    {
        public void main()
        {
            var apiInstance = new AgreementsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_write')\" oncontextmenu=\"this.href=oauthDoc('agreement_write')\" target=\"oauthDoc\">agreement_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var ifMatch = ifMatch_example;  // string | The server will only update the resource if it matches the listed ETag otherwise error RESOURCE_MODIFIED(412) is returned.
            var agreementId = agreementId_example;  // string | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
            var formFieldPutInfo = new FormFieldPutInfo(); // FormFieldPutInfo | List of form fields to add or replace
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 

            try
            {
                // Updates form fields of an agreement.  This will replace all fields in AUTHORING mode agreements, and will replace all fields except for text tag generated fields in DRAFT mode agreements.
                AgreementFormFields result = apiInstance.UpdateFormFields(authorization, ifMatch, agreementId, formFieldPutInfo, xApiUser, xOnBehalfOfUser);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AgreementsApi.UpdateFormFields: " + e.Message );
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
 **agreementId** | **string**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. | 
 **formFieldPutInfo** | [**FormFieldPutInfo**](FormFieldPutInfo.md)| List of form fields to add or replace | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 

### Return type

[**AgreementFormFields**](AgreementFormFields.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="updateparticipantset"></a>
# **UpdateParticipantSet**
> void UpdateParticipantSet (string authorization, string ifMatch, string agreementId, string participantSetId, DetailedParticipantSetInfo detailedParticipantSetInfo, string xApiUser = null, string xOnBehalfOfUser = null)

Updates the participant set of an agreement identified by agreementId in the path.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.agreements;

namespace Example
{
    public class UpdateParticipantSetExample
    {
        public void main()
        {
            var apiInstance = new AgreementsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('agreement_write')\" oncontextmenu=\"this.href=oauthDoc('agreement_write')\" target=\"oauthDoc\">agreement_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var ifMatch = ifMatch_example;  // string | The server will only update the resource if it matches the listed ETag otherwise error RESOURCE_MODIFIED(412) is returned.
            var agreementId = agreementId_example;  // string | The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements.
            var participantSetId = participantSetId_example;  // string | The participant set identifier
            var detailedParticipantSetInfo = new DetailedParticipantSetInfo(); // DetailedParticipantSetInfo | The new participant set info.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 

            try
            {
                // Updates the participant set of an agreement identified by agreementId in the path.
                apiInstance.UpdateParticipantSet(authorization, ifMatch, agreementId, participantSetId, detailedParticipantSetInfo, xApiUser, xOnBehalfOfUser);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AgreementsApi.UpdateParticipantSet: " + e.Message );
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
 **agreementId** | **string**| The agreement identifier, as returned by the agreement creation API or retrieved from the API to fetch agreements. | 
 **participantSetId** | **string**| The participant set identifier | 
 **detailedParticipantSetInfo** | [**DetailedParticipantSetInfo**](DetailedParticipantSetInfo.md)| The new participant set info. | 
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

