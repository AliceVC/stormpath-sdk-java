/*
* Copyright 2015 Stormpath, Inc.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.stormpath.sdk.oauth;

/**
 * Interface denoting a Password Grant-specific {@link OAuthRequestAuthenticator}. It is used to authenticate an account and
 * exchange its credentials for a valid OAuth 2.0 token. For example:
 * <pre>
 * Application app = obtainApplication();
 * OAuthPasswordGrantRequestAuthentication request = <b>OAuthRequests.OAUTH_PASSWORD_GRANT_REQUEST.builder()</b>
 *      .setLogin(username)
 *      .setPassword(password)
 *      .build();
 *
 * OAuthGrantRequestAuthenticationResult result = Authenticators.OAUTH_PASSWORD_GRANT_REQUEST_AUTHENTICATOR
 *      .forApplication(app)
 *      .authenticate(request);
 * </pre>
 *
 * @see OAuthRefreshTokenRequestAuthenticator
 * @see OAuthBearerRequestAuthenticator
 *
 * @since 1.0.RC7
 */
public interface OAuthPasswordGrantRequestAuthenticator extends OAuthRequestAuthenticator<OAuthGrantRequestAuthenticationResult> {

}
