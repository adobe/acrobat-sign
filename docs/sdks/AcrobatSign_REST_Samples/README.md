# Acrobat Sign REST API Sample

Sample Java clients of Acrobat Sign REST API that demonstrates how to use the API as well as some of its key capabilities. 

The samples are arranged according to the version of the Acrobat Sign REST API's that they use. For example, the samples for v6 REST API's are under v6 folder.

All sources are under the ***adobesign.api.rest.sample*** package (and sub packages) and are laid out as follows:

* **adobesign.api.rest.sample**

Contains individual sample clients each demonstrating a specific capability. Each client is named according to the capability it demonstrates. For example, the client GetUsersInAccount.java shows how to retrieve a list of users from the account of the user on whose behalf the API call is made (also called **API user** in this document).

* **adobesign.api.rest.sample.util**

Contains helper classes that encapsulate the REST calls required by the sample clients. Of particular note is RestApiUtils.java which contains methods that make the actual low-level REST API calls.

* **adobesign.api.rest.sample.requests**

Contains input files used by the sample clients. These include JSON objects that specify the input data and arguments required by some of the API calls.

## Getting Started

These instructions will help you run the samples provided here.

### Prerequisites

Before using the samples, you need to obtain either an OAuth access token or an integration key. Please refer to the AdobeSign API page (https://secure.echosign.com/account/echosignApi) for information on how to do this for your account.

You can provide this token or key as a value to the **OAUTH_ACCESS_TOKEN** constant in RestApiOAuthTokens.java, or you can provide a refresh token as a value to the **OAUTH_REFRESH_TOKEN** constant (in the same class) which will be used to refresh the OAuth access token.

If neither is provided then a new OAuth access token will be requested from AdobeSign based on credentials provided in the OAuthCredentials.json file.
Please refer to the AdobeSign OAuth page (https://secure.echosign.com/public/static/oauthDoc.jsp) for information on how to obtain OAuth credentials for your account.

### Using the Samples

Each sample client has a set of instructions (provided as class comments) that needs to be followed. In particular, look for "TODO" comments in the client code and in the JSON input files for values that needs to be updated before the client can work properly. Once the clients and support files are updated with appropriate values, they can be compiled and run. 

------------

The following steps outline one way this can be done using the command line on Windows.

Note that on Linux and Mac OS, the path separator for the  -cp and -sourcepath options is ":" (colon) instead of ";" (semicolon).

- Navigate to the top-most folder i.e., version of the interested Acrobat Sign REST API, say v6, (the one containing "adobesign" and "lib") so that it becomes the current directory.

- Compile the sources using the following command

> javac -sourcepath .;adobesign -cp lib/json_simple-1.1.jar adobesign/api/rest/sample/*.java

- To run a specific client, use the following command
>java -cp .;lib/json_simple-1.1.jar adobesign.api.rest.sample.{name of client class}

For example, to run DownloadAuditTrail, use

> java -cp .;lib/json_simple-1.1.jar adobesign.api.rest.sample.DownloadAuditTrail

You may also use an IDE of your choice. In that case, you will need to create a new project with sources taken from the adobesign folder and lib/json.jar set up as an input library.


### Output Path

The default output path used in the sample clients is the user temp directory. If needed, this can be changed by updating the method *adobesign.api.rest.sample.util.FileUtils.getDefaultOutputPath()*.

## Versions
This distribution contains sample clients built on different versions of AdobeSign REST API. Please refer the change log below to learn about the changes in subsequent versions in the section below.

### v3
1. The latest version of REST API samples encourages the use of OAuth access tokens instead of access tokens obtained by directly supplying user credentials or API keys. Steps to generate OAuth access and refresh tokens can be found in comments within the sample code and in the API documentation referenced above.

2. The use of "base URLs" is demonstrated. Base URLs are now needed to access the REST API properly.

3. The latest version also contains samples to use new REST APIs which are /views and /search.

### v4
Latest samples demonstrate the usage of signer set in the APIs while sending the agreement and fetching the agreement details. Using signer set feature, you can assign same signing step to multiple signers and whoever signs first out of them will be become the actual signer of the signing step.

### v5
Latest samples demonstrate the usage of signer set in the APIs while sending the agreement and fetching the agreement details. Using signer set feature, you can assign same signing step to multiple signers and whoever signs first out of them will be become the actual signer of the signing step.
### v6
The latest version of Acrobat Sign REST API which introduces lots of advance features like Draft, Reminder API's, Pagination, ETag, Suppress Email among others.