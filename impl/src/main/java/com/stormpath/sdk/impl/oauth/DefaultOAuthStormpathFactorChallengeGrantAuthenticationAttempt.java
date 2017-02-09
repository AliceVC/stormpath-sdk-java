/*
 * Copyright 2016 Stormpath, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.stormpath.sdk.impl.oauth;

import com.stormpath.sdk.impl.ds.InternalDataStore;
import com.stormpath.sdk.impl.resource.AbstractResource;
import com.stormpath.sdk.impl.resource.Property;
import com.stormpath.sdk.impl.resource.StringProperty;

import java.util.Map;

/**
 * @since 1.3.1
 */
public class DefaultOAuthStormpathFactorChallengeGrantAuthenticationAttempt extends AbstractResource implements OAuthStormpathFactorChallengeGrantAuthenticationAttempt {

    static final StringProperty GRANT_TYPE = new StringProperty("grant_type");
    static final StringProperty STATE = new StringProperty("state");
    static final StringProperty CHALLENGE = new StringProperty("challenge");
    static final StringProperty CODE = new StringProperty("code");

    private static final Map<String, Property> PROPERTY_DESCRIPTORS = createPropertyDescriptorMap(GRANT_TYPE, STATE, CHALLENGE, CODE);

    public DefaultOAuthStormpathFactorChallengeGrantAuthenticationAttempt(InternalDataStore dataStore) {
        super(dataStore);
    }

    public DefaultOAuthStormpathFactorChallengeGrantAuthenticationAttempt(InternalDataStore dataStore, Map<String, Object> properties) {
        super(dataStore, properties);
    }

    @Override
    public void setGrantType(String grantType) {
        setProperty(GRANT_TYPE, grantType);
    }

    @Override
    public void setState(String state) {
        setProperty(STATE, state);
    }

    @Override
    public void setChallenge(String challenge) {
        setProperty(CHALLENGE, challenge);
    }

    @Override
    public void setCode(String code) {
        setProperty(CODE, code);
    }

    public String getGrantType() {
        return getString(GRANT_TYPE);
    }

    public String getState() {
        return getString(STATE);
    }

    public String getChallenge() {
        return getString(CHALLENGE);
    }

    public String getCode() {
        return getString(CODE);
    }

    @Override
    public Map<String, Property> getPropertyDescriptors() {
        return PROPERTY_DESCRIPTORS;
    }
}
