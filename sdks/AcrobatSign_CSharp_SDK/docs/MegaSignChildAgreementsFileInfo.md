# IO.Swagger.model.megaSigns.MegaSignChildAgreementsFileInfo
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ChildAgreementsInfoFileId** | **string** | id of the file containg information about the existing childAgreementsInfo associated with the megaSign. Will be ignored in POST call and in case of GET call, this is the only thing that will be returned. The content of the file can be fetched through GET /megaSigns/{megaSignId}/childAgreementsInfo/{childAgreementsInfoFileId} endpoint. | [optional] 
**FileType** | **string** | Input type through which participantSetsInfos will be provided. Whichever input type is provided, the values should be provided in its corresponding value object. Currently we are supporting CSV file format for providing megaSIgn child recipients. | [optional] 
**TransientDocumentId** | **string** | Transient id of the input file which contains participantSetsInfos. Currently only csv format is suppported. More details about CSV format &lt;a href&#x3D;&#39;https://www.adobe.com/go/documentcloud_megasigncsv&#39;&gt;here&lt;/a&gt;   | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

