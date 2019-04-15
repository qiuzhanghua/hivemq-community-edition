/*
 * Copyright 2019 dc-square GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hivemq.extensions.services.auth;

import com.hivemq.annotations.Immutable;
import com.hivemq.annotations.NotNull;
import com.hivemq.extension.sdk.api.services.auth.provider.AuthorizerProvider;

import java.util.Map;

/**
 * @author Lukas Brandl
 * @author Florian Limpöck
 * @since 4.0.0
 */
public interface Authorizers {

    /**
     * Calls the get method of all registered AuthorizerProviders.
     *
     * @return a priority ordered map of instantiated Authorizers with their extension id
     */
    @Immutable
    @NotNull Map<@NotNull String, @NotNull AuthorizerProvider> getAuthorizerProviderMap();

    /**
     * @return true if any {@link AuthorizerProvider} have been
     * registered, false otherwise.
     */
    boolean areAuthorizersAvailable();


    void addAuthorizerProvider(final @NotNull AuthorizerProvider authorizerProvider);
}