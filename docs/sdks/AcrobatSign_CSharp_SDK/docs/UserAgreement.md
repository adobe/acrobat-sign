# IO.Swagger.model.agreements.UserAgreement
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DisplayDate** | **DateTime?** | The display date for the agreement. Format would be yyyy-MM-dd&#39;T&#39;HH:mm:ssZ. For example, e.g 2016-02-25T18:46:19Z represents UTC time | [optional] 
**DisplayParticipantSetInfos** | [**List&lt;DisplayParticipantSetInfo&gt;**](DisplayParticipantSetInfo.md) | The most relevant current user set for the agreement. It is typically the next signer if the agreement is from the current user, or the sender if received from another user | [optional] 
**Id** | **string** | The unique identifier of the agreement.If provided in POST, it will simply be ignored | [optional] 
**Esign** | **bool?** | True if this is an e-sign document | [optional] 
**Hidden** | **bool?** | True if agreement is hidden for the user | [optional] 
**LatestVersionId** | **string** | A version ID which uniquely identifies the current version of the agreement | [optional] 
**Name** | **string** | Name of the Agreement | [optional] 
**Status** | **string** | This is a server generated attribute which provides the detailed status of an agreement with respect to the apiCaller | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

