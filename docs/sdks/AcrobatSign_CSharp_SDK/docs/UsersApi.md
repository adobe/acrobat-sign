# IO.Swagger.Api.UsersApi

All URIs are relative to *http://localhost/api/rest/v6*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetGroupsOfUser**](UsersApi.md#getgroupsofuser) | **GET** /users/{userId}/groups | Retrieves the groups of the user.
[**GetUserDetail**](UsersApi.md#getuserdetail) | **GET** /users/{userId} | Retrieves detailed information about the user in the caller account.
[**GetUserViews**](UsersApi.md#getuserviews) | **POST** /users/{userId}/views | Retrieves the URL of manage, account settings and user profile page.
[**GetUsers**](UsersApi.md#getusers) | **GET** /users | Retrieves all the users in an account.
[**ModifyUser**](UsersApi.md#modifyuser) | **PUT** /users/{userId} | Update an user.
[**ModifyUserState**](UsersApi.md#modifyuserstate) | **PUT** /users/{userId}/state | Activate/Deactivate a given user.
[**UpdateGroupsOfUser**](UsersApi.md#updategroupsofuser) | **PUT** /users/{userId}/groups | Updates the groups of the user.


<a name="getgroupsofuser"></a>
# **GetGroupsOfUser**
> UserGroupsInfo GetGroupsOfUser (string authorization, string userId, string xApiUser = null)

Retrieves the groups of the user.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.users;

namespace Example
{
    public class GetGroupsOfUserExample
    {
        public void main()
        {
            var apiInstance = new UsersApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('user_read')\" oncontextmenu=\"this.href=oauthDoc('user_read')\" target=\"oauthDoc\">user_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var userId = userId_example;  // string | The user identifier, as returned by the user creation API or retrieved from the API to fetch users. To get the details for the token owner, UserId can be replaced by \"me\" without quotes.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 

            try
            {
                // Retrieves the groups of the user.
                UserGroupsInfo result = apiInstance.GetGroupsOfUser(authorization, userId, xApiUser);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UsersApi.GetGroupsOfUser: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;user_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;user_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;user_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **userId** | **string**| The user identifier, as returned by the user creation API or retrieved from the API to fetch users. To get the details for the token owner, UserId can be replaced by \&quot;me\&quot; without quotes. | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 

### Return type

[**UserGroupsInfo**](UserGroupsInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getuserdetail"></a>
# **GetUserDetail**
> DetailedUserInfo GetUserDetail (string authorization, string userId, string xApiUser = null)

Retrieves detailed information about the user in the caller account.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.users;

namespace Example
{
    public class GetUserDetailExample
    {
        public void main()
        {
            var apiInstance = new UsersApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('user_read')\" oncontextmenu=\"this.href=oauthDoc('user_read')\" target=\"oauthDoc\">user_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var userId = userId_example;  // string | The user identifier, as returned by the user creation API or retrieved from the API to fetch users. To get the details for the token owner, UserId can be replaced by \"me\" without quotes.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 

            try
            {
                // Retrieves detailed information about the user in the caller account.
                DetailedUserInfo result = apiInstance.GetUserDetail(authorization, userId, xApiUser);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UsersApi.GetUserDetail: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;user_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;user_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;user_read&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **userId** | **string**| The user identifier, as returned by the user creation API or retrieved from the API to fetch users. To get the details for the token owner, UserId can be replaced by \&quot;me\&quot; without quotes. | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 

### Return type

[**DetailedUserInfo**](DetailedUserInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getuserviews"></a>
# **GetUserViews**
> UserViewResponse GetUserViews (string authorization, string userId, UserViewInfo userViewInfo, string xApiUser = null, string xOnBehalfOfUser = null)

Retrieves the URL of manage, account settings and user profile page.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.users;

namespace Example
{
    public class GetUserViewsExample
    {
        public void main()
        {
            var apiInstance = new UsersApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('user_read')\" oncontextmenu=\"this.href=oauthDoc('user_read')\" target=\"oauthDoc\">user_read</a> - user read is always required</li><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('user_login')\" oncontextmenu=\"this.href=oauthDoc('user_login')\" target=\"oauthDoc\">user_login</a> - Required additionally if the autoLoginUser parameter is set to true</li></ul>in the format <b>'Bearer {accessToken}'.
            var userId = userId_example;  // string | The user identifier, as returned by the user creation API or retrieved from the API to fetch users. To get the details for the token owner, UserId can be replaced by \"me\" without quotes.
            var userViewInfo = new UserViewInfo(); // UserViewInfo | Name of the required view and its desired configuration.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var xOnBehalfOfUser = xOnBehalfOfUser_example;  // string | The userId or email in the format <b>userid:{userId} OR email:{email}.</b> of the user that has shared his/her account (optional) 

            try
            {
                // Retrieves the URL of manage, account settings and user profile page.
                UserViewResponse result = apiInstance.GetUserViews(authorization, userId, userViewInfo, xApiUser, xOnBehalfOfUser);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UsersApi.GetUserViews: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;user_read&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;user_read&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;user_read&lt;/a&gt; - user read is always required&lt;/li&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;user_login&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;user_login&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;user_login&lt;/a&gt; - Required additionally if the autoLoginUser parameter is set to true&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **userId** | **string**| The user identifier, as returned by the user creation API or retrieved from the API to fetch users. To get the details for the token owner, UserId can be replaced by \&quot;me\&quot; without quotes. | 
 **userViewInfo** | [**UserViewInfo**](UserViewInfo.md)| Name of the required view and its desired configuration. | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 
 **xOnBehalfOfUser** | **string**| The userId or email in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; of the user that has shared his/her account | [optional] 

### Return type

[**UserViewResponse**](UserViewResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getusers"></a>
# **GetUsers**
> UsersInfo GetUsers (string authorization, string xApiUser = null, string cursor = null, int? pageSize = null)

Retrieves all the users in an account.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.users;

namespace Example
{
    public class GetUsersExample
    {
        public void main()
        {
            var apiInstance = new UsersApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('user_read')\" oncontextmenu=\"this.href=oauthDoc('user_read')\" target=\"oauthDoc\">user_read</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 
            var cursor = cursor_example;  // string | Used to navigate through the pages. If not provided, returns the first page. (optional) 
            var pageSize = 56;  // int? | Number of intended items in the response page. If not provided, it is decided by the application settings. (optional) 

            try
            {
                // Retrieves all the users in an account.
                UsersInfo result = apiInstance.GetUsers(authorization, xApiUser, cursor, pageSize);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UsersApi.GetUsers: " + e.Message );
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

[**UsersInfo**](UsersInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="modifyuser"></a>
# **ModifyUser**
> void ModifyUser (string authorization, string userId, DetailedUserInfo detailedUserInfo, string xApiUser = null)

Update an user.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.users;

namespace Example
{
    public class ModifyUserExample
    {
        public void main()
        {
            var apiInstance = new UsersApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('user_write')\" oncontextmenu=\"this.href=oauthDoc('user_write')\" target=\"oauthDoc\">user_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var userId = userId_example;  // string | The user identifier, as provided by GET /users or POST /users
            var detailedUserInfo = new DetailedUserInfo(); // DetailedUserInfo | Information necessary to update a user.
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 

            try
            {
                // Update an user.
                apiInstance.ModifyUser(authorization, userId, detailedUserInfo, xApiUser);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UsersApi.ModifyUser: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;user_write&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;user_write&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;user_write&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **userId** | **string**| The user identifier, as provided by GET /users or POST /users | 
 **detailedUserInfo** | [**DetailedUserInfo**](DetailedUserInfo.md)| Information necessary to update a user. | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="modifyuserstate"></a>
# **ModifyUserState**
> UserStatusUpdateResponse ModifyUserState (string authorization, string userId, UserStateInfo userStateInfo, string xApiUser = null)

Activate/Deactivate a given user.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.users;

namespace Example
{
    public class ModifyUserStateExample
    {
        public void main()
        {
            var apiInstance = new UsersApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('user_write')\" oncontextmenu=\"this.href=oauthDoc('user_write')\" target=\"oauthDoc\">user_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var userId = userId_example;  // string | The user identifier, as returned by the user creation API or retrieved from the API to fetch users. To update the details for the token owner, UserId can be replaced by \"me\" without quotes.
            var userStateInfo = new UserStateInfo(); // UserStateInfo | 
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 

            try
            {
                // Activate/Deactivate a given user.
                UserStatusUpdateResponse result = apiInstance.ModifyUserState(authorization, userId, userStateInfo, xApiUser);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UsersApi.ModifyUserState: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;user_write&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;user_write&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;user_write&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **userId** | **string**| The user identifier, as returned by the user creation API or retrieved from the API to fetch users. To update the details for the token owner, UserId can be replaced by \&quot;me\&quot; without quotes. | 
 **userStateInfo** | [**UserStateInfo**](UserStateInfo.md)|  | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 

### Return type

[**UserStatusUpdateResponse**](UserStatusUpdateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="updategroupsofuser"></a>
# **UpdateGroupsOfUser**
> void UpdateGroupsOfUser (string authorization, string userId, UserGroupsInfo userGroupsInfo, string xApiUser = null)

Updates the groups of the user.

### Example
```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.model.users;

namespace Example
{
    public class UpdateGroupsOfUserExample
    {
        public void main()
        {
            var apiInstance = new UsersApi();
            var authorization = authorization_example;  // string | An <a href=\"#\" onclick=\"this.href=oauthDoc()\" oncontextmenu=\"this.href=oauthDoc()\" target=\"oauthDoc\">OAuth Access Token</a> with scopes:<ul><li style='list-style-type: square'><a href=\"#\" onclick=\"this.href=oauthDoc('user_write')\" oncontextmenu=\"this.href=oauthDoc('user_write')\" target=\"oauthDoc\">user_write</a></li></ul>in the format <b>'Bearer {accessToken}'.
            var userId = userId_example;  // string | The user identifier, as returned by the user creation API or retrieved from the API to fetch users. To update the details for the token owner, UserId can be replaced by \"me\" without quotes.
            var userGroupsInfo = new UserGroupsInfo(); // UserGroupsInfo | 
            var xApiUser = xApiUser_example;  // string | The userId or email of API caller using the account or group token in the format <b>userid:{userId} OR email:{email}.</b> If it is not specified, then the caller is inferred from the token. (optional) 

            try
            {
                // Updates the groups of the user.
                apiInstance.UpdateGroupsOfUser(authorization, userId, userGroupsInfo, xApiUser);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UsersApi.UpdateGroupsOfUser: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **string**| An &lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc()\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;OAuth Access Token&lt;/a&gt; with scopes:&lt;ul&gt;&lt;li style&#x3D;&#39;list-style-type: square&#39;&gt;&lt;a href&#x3D;\&quot;#\&quot; onclick&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;user_write&#39;)\&quot; oncontextmenu&#x3D;\&quot;this.href&#x3D;oauthDoc(&#39;user_write&#39;)\&quot; target&#x3D;\&quot;oauthDoc\&quot;&gt;user_write&lt;/a&gt;&lt;/li&gt;&lt;/ul&gt;in the format &lt;b&gt;&#39;Bearer {accessToken}&#39;. | 
 **userId** | **string**| The user identifier, as returned by the user creation API or retrieved from the API to fetch users. To update the details for the token owner, UserId can be replaced by \&quot;me\&quot; without quotes. | 
 **userGroupsInfo** | [**UserGroupsInfo**](UserGroupsInfo.md)|  | 
 **xApiUser** | **string**| The userId or email of API caller using the account or group token in the format &lt;b&gt;userid:{userId} OR email:{email}.&lt;/b&gt; If it is not specified, then the caller is inferred from the token. | [optional] 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

