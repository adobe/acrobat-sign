# IO.Swagger.Api.GroupsApi

All URIs are relative to *http://localhost/api/rest/v6*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetGroupDetails**](GroupsApi.md#getgroupdetails) | **GET** /groups/{groupId} | Retrieves detailed information about the group.
[**GetGroups**](GroupsApi.md#getgroups) | **GET** /groups | Retrieves all the groups in an account.
[**GetUsersInGroup**](GroupsApi.md#getusersingroup) | **GET** /groups/{groupId}/users | Retrieves all the users in a group.


<a name="getgroupdetails"></a>
# **GetGroupDetails**
> DetailedGroupInfo GetGroupDetails (string authorization, string groupId, string xApiUser = null)

Retrieves detailed information about the group.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.groups;

namespace Example
{
    public class GetGroupDetailsExample
    {
        public void main()
        {
            var apiInstance = new GroupsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('user_read')\" oncontextmenu=\"this.href=oauthDoc('user_read')\" target=\"oauthDoc\">user_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var groupId = groupId_example;  // string | The group identifier, as returned by the group creation API or retrieved from the API to fetch groups
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 

            try
            {
                // Retrieves detailed information about the group.
                DetailedGroupInfo result = apiInstance.GetGroupDetails(authorization, groupId, xApiUser);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling GroupsApi.GetGroupDetails: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;user_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;user_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;user_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **groupId** | **string**| The group identifier, as returned by the group creation API or retrieved from the API to fetch groups | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 

### Return type

[**DetailedGroupInfo**](DetailedGroupInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getgroups"></a>
# **GetGroups**
> GroupsInfo GetGroups (string authorization, string xApiUser = null, string cursor = null, int? pageSize = null)

Retrieves all the groups in an account.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.groups;

namespace Example
{
    public class GetGroupsExample
    {
        public void main()
        {
            var apiInstance = new GroupsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('user_read')\" oncontextmenu=\"this.href=oauthDoc('user_read')\" target=\"oauthDoc\">user_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var cursor = cursor_example;  // string | Used to navigate through the pages. If not provided, returns the first page. (optional) 
            var pageSize = 56;  // int? | Number of intended items in the response page. If not provided, it is decided by the application settings. (optional) 

            try
            {
                // Retrieves all the groups in an account.
                GroupsInfo result = apiInstance.GetGroups(authorization, xApiUser, cursor, pageSize);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling GroupsApi.GetGroups: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;user_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;user_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;user_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **cursor** | **string**| Used to navigate through the pages. If not provided, returns the first page. | [optional] 
 **pageSize** | **int?**| Number of intended items in the response page. If not provided, it is decided by the application settings. | [optional] 

### Return type

[**GroupsInfo**](GroupsInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getusersingroup"></a>
# **GetUsersInGroup**
> GroupUsersInfo GetUsersInGroup (string authorization, string groupId, string xApiUser = null, string cursor = null, int? pageSize = null)

Retrieves all the users in a group.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.groups;

namespace Example
{
    public class GetUsersInGroupExample
    {
        public void main()
        {
            var apiInstance = new GroupsApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('user_read')\" oncontextmenu=\"this.href=oauthDoc('user_read')\" target=\"oauthDoc\">user_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var groupId = groupId_example;  // string | The group identifier, as returned by the group creation API or retrieved from the API to fetch groups
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var cursor = cursor_example;  // string | Used to navigate through the pages. If not provided, returns the first page. (optional) 
            var pageSize = 56;  // int? | Number of intended items in the response page. If not provided, it is decided by the application settings. (optional) 

            try
            {
                // Retrieves all the users in a group.
                GroupUsersInfo result = apiInstance.GetUsersInGroup(authorization, groupId, xApiUser, cursor, pageSize);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling GroupsApi.GetUsersInGroup: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;user_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;user_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;user_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **groupId** | **string**| The group identifier, as returned by the group creation API or retrieved from the API to fetch groups | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **cursor** | **string**| Used to navigate through the pages. If not provided, returns the first page. | [optional] 
 **pageSize** | **int?**| Number of intended items in the response page. If not provided, it is decided by the application settings. | [optional] 

### Return type

[**GroupUsersInfo**](GroupUsersInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

