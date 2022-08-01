# IO.Swagger.model.megaSigns.MegaSignSecurityOption
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ExternalAuthenticationMethod** | **string** | The authentication method for the participants to have access to view and sign the document. | [optional] 
**ExternalPassword** | **string** | The secondary password that will be used to protect signing the document for internal signers. Note that Acrobat Sign will never show this password to anyone, so you will need to separately communicate it to any relevant parties. This password is applied only if password protection is specified for internal signers or all signers | [optional] 
**InternalAuthenticationMethod** | **string** | The authentication method for the participants to have access to view and sign the document. | [optional] 
**InternalPassword** | **string** | The secondary password that will be used to protect signing the document for external signers. Note that Acrobat Sign will never show this password to anyone, so you will need to separately communicate it to any relevant parties. This password is applied only if password protection is specified for external signers or all signers | [optional] 
**OpenPassword** | **string** | The secondary password that will be used to secure the PDF document. Note that AdobeSign will never show this password to anyone, so you will need to separately communicate it to any relevant parties | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

