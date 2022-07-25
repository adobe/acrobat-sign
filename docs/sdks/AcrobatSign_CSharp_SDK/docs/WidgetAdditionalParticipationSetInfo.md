# IO.Swagger.model.widgets.WidgetAdditionalParticipationSetInfo
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MemberInfos** | [**List&lt;ParticipantSetMemberInfo&gt;**](ParticipantSetMemberInfo.md) | Array of ParticipantInfo objects, containing participant-specific data (email, e.g.) for all the additional participants in the widget | [optional] 
**Order** | **int?** | Index indicating position at which signing group needs to sign. Additional participant to sign at first place is assigned a index of 1. Widget participant should not have any order specified. Widget participant should not have any email address and and can not have phone authentication applied. Different signingOrder specified in input should form a valid consecutive increasing sequence of integers. Otherwise signingOrder will be considered invalid | [optional] 
**Role** | **string** | Role assumed by all participants in the set (signer, approver, etc.) Widget First Participant will only have roles - Signer, Approver, Acceptor and Form Filler | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

