
# AgreementInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ccs** | [**List&lt;AgreementCcInfo&gt;**](AgreementCcInfo.md) | A list of one or more CCs that will be copied in the agreement transaction. The CCs will each receive an email at the beginning of the transaction and also when the final document is signed. The email addresses will also receive a copy of the document, attached as a PDF file. Should not be provided in offline agreement creation. |  [optional]
**createdDate** | [**Date**](Date.md) | Date when agreement was created. This is a server generated attributed and can not be provided in POST/PUT calls. Format would be yyyy-MM-dd&#39;T&#39;HH:mm:ssZ. For example, e.g 2016-02-25T18:46:19Z represents UTC time |  [optional]
**deviceInfo** | [**OfflineDeviceInfo**](OfflineDeviceInfo.md) | Device info of the offline device. It should only be provided in case of offline agreement creation. |  [optional]
**documentVisibilityEnabled** | **Boolean** | If set to true, enable limited document visibility. Should not be provided in offline agreement creation. |  [optional]
**emailOption** | [**EmailOption**](EmailOption.md) | Email configurations for the agreement. Should not be provided in offline agreement creation or when updating a non draft agreement. |  [optional]
**expirationTime** | [**Date**](Date.md) | Time after which Agreement expires and needs to be signed before it. Format should be yyyy-MM-dd&#39;T&#39;HH:mm:ssZ. For example, e.g 2016-02-25T18:46:19Z represents UTC time. Should not be provided in offline agreement creation. |  [optional]
**externalId** | [**ExternalId**](ExternalId.md) | An arbitrary value from your system, which can be specified at sending time and then later returned or queried. Should not be provided in offline agreement creation. |  [optional]
**fileInfos** | [**List&lt;FileInfo&gt;**](FileInfo.md) | A list of one or more files (or references to files) that will be sent out for signature. If more than one file is provided, they will be combined into one PDF before being sent out. Note: Only one of the four parameters in every FileInfo object must be specified |  [optional]
**firstReminderDelay** | **Integer** | Integer which specifies the delay in hours before sending the first reminder.&lt;br&gt;This is an optional field. The minimum value allowed is 1 hour and the maximum value can’t be more than the difference of agreement creation and expiry time of the agreement in hours.&lt;br&gt;If this is not specified but the reminder frequency is specified, then the first reminder will be sent based on frequency.&lt;br&gt;i.e. if the reminder is created with frequency specified as daily, the firstReminderDelay will be 24 hours. Should not be provided in offline agreement creation. |  [optional]
**formFieldLayerTemplates** | [**List&lt;FileInfo&gt;**](FileInfo.md) | Specifies the form field layer template or source of form fields to apply on the files in this transaction. If specified, the FileInfo for this parameter must refer to a form field layer template via libraryDocumentId or libraryDocumentName, or if specified via transientDocumentId or documentURL, it must be of a supported file type. Note: Only one of the four parameters in every FileInfo object must be specified |  [optional]
**id** | **String** | The unique identifier of the agreement.If provided in POST, it will simply be ignored |  [optional]
**locale** | **String** | The locale associated with this agreement - specifies the language for the signing page and emails, for example en_US or fr_FR. If none specified, defaults to the language configured for the agreement sender |  [optional]
**mergeFieldInfo** | [**List&lt;MergefieldInfo&gt;**](MergefieldInfo.md) | Optional default values for fields to merge into the document. The values will be presented to the signers for editable fields; for read-only fields the provided values will not be editable during the signing process. Merging data into fields is currently not supported when used with libraryDocumentId or libraryDocumentName. Only file and url are currently supported |  [optional]
**message** | **String** | An optional message to the participants, describing what is being sent or why their signature is required |  [optional]
**name** | **String** | The name of the agreement that will be used to identify it, in emails, website and other places |  [optional]
**participantSetsInfo** | [**List&lt;ParticipantSetInfo&gt;**](ParticipantSetInfo.md) | A list of one or more participant set. A participant set may have one or more participant. If any member of the participant set takes the action that has been assigned to the set(Sign/Approve/Acknowledge etc ), the action is considered as the action taken by whole participation set. For regular (non-MegaSign) documents, there is no limit on the number of electronic signatures in a single document. Written signatures are limited to four per document |  [optional]
**postSignOption** | [**PostSignOption**](PostSignOption.md) | URL and associated properties for the success page the user will be taken to after completing the signing process. Should not be provided in offline agreement creation. |  [optional]
**reminderFrequency** | [**ReminderFrequencyEnum**](#ReminderFrequencyEnum) | Optional parameter that sets how often you want to send reminders to the participants. If it is not specified, the default frequency set for the account will be used. Should not be provided in offline agreement creation. If provided in PUT as a different value than the current one, an error will be thrown. |  [optional]
**securityOption** | [**SecurityOption**](SecurityOption.md) | Optional secondary security parameters for the agreement. Should not be provided in offline agreement creation. |  [optional]
**senderEmail** | **String** | Email of agreement sender. Only provided in GET. Can not be provided in POST/PUT request. If provided in POST/PUT, it will be ignored |  [optional]
**signatureType** | [**SignatureTypeEnum**](#SignatureTypeEnum) | Specifies the type of signature you would like to request - written or e-signature. The possible values are &lt;br&gt; ESIGN : Agreement needs to be signed electronically &lt;br&gt;, WRITTEN : Agreement will be signed using handwritten signature and signed document will be uploaded into the system |  [optional]
**state** | [**StateEnum**](#StateEnum) | The state in which the agreement should land. The state field can only be provided in POST calls, will never get returned in GET /agreements/{ID} and will be ignored if provided in PUT /agreements/{ID} call. The eventual status of the agreement can be obtained from GET /agreements/ID |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | This is a server generated attribute which provides the detailed status of an agreement. |  [optional]
**vaultingInfo** | [**VaultingInfo**](VaultingInfo.md) | Vaulting properties that allows Acrobat Sign to securely store documents with a vault provider |  [optional]
**workflowId** | **String** | The identifier of custom workflow which defines the routing path of an agreement. Should not be provided in offline agreement creation. |  [optional]


<a name="ReminderFrequencyEnum"></a>
## Enum: ReminderFrequencyEnum
Name | Value
---- | -----
DAILY_UNTIL_SIGNED | &quot;DAILY_UNTIL_SIGNED&quot;
WEEKDAILY_UNTIL_SIGNED | &quot;WEEKDAILY_UNTIL_SIGNED&quot;
EVERY_OTHER_DAY_UNTIL_SIGNED | &quot;EVERY_OTHER_DAY_UNTIL_SIGNED&quot;
EVERY_THIRD_DAY_UNTIL_SIGNED | &quot;EVERY_THIRD_DAY_UNTIL_SIGNED&quot;
EVERY_FIFTH_DAY_UNTIL_SIGNED | &quot;EVERY_FIFTH_DAY_UNTIL_SIGNED&quot;
WEEKLY_UNTIL_SIGNED | &quot;WEEKLY_UNTIL_SIGNED&quot;
ONCE | &quot;ONCE&quot;


<a name="SignatureTypeEnum"></a>
## Enum: SignatureTypeEnum
Name | Value
---- | -----
ESIGN | &quot;ESIGN&quot;
WRITTEN | &quot;WRITTEN&quot;


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
AUTHORING | &quot;AUTHORING&quot;
DRAFT | &quot;DRAFT&quot;
IN_PROCESS | &quot;IN_PROCESS&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
OUT_FOR_SIGNATURE | &quot;OUT_FOR_SIGNATURE&quot;
OUT_FOR_DELIVERY | &quot;OUT_FOR_DELIVERY&quot;
OUT_FOR_ACCEPTANCE | &quot;OUT_FOR_ACCEPTANCE&quot;
OUT_FOR_FORM_FILLING | &quot;OUT_FOR_FORM_FILLING&quot;
OUT_FOR_APPROVAL | &quot;OUT_FOR_APPROVAL&quot;
AUTHORING | &quot;AUTHORING&quot;
CANCELLED | &quot;CANCELLED&quot;
SIGNED | &quot;SIGNED&quot;
APPROVED | &quot;APPROVED&quot;
DELIVERED | &quot;DELIVERED&quot;
ACCEPTED | &quot;ACCEPTED&quot;
FORM_FILLED | &quot;FORM_FILLED&quot;
EXPIRED | &quot;EXPIRED&quot;
ARCHIVED | &quot;ARCHIVED&quot;
PREFILL | &quot;PREFILL&quot;
WIDGET_WAITING_FOR_VERIFICATION | &quot;WIDGET_WAITING_FOR_VERIFICATION&quot;
DRAFT | &quot;DRAFT&quot;
DOCUMENTS_NOT_YET_PROCESSED | &quot;DOCUMENTS_NOT_YET_PROCESSED&quot;
WAITING_FOR_FAXIN | &quot;WAITING_FOR_FAXIN&quot;
WAITING_FOR_VERIFICATION | &quot;WAITING_FOR_VERIFICATION&quot;



