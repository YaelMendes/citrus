/*
 * Copyright 2006-2017 the original author or authors.
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

package com.consol.citrus.dsl.endpoint.jdbc;

import com.consol.citrus.endpoint.EndpointBuilder;
import com.consol.citrus.jdbc.server.JdbcServer;

/**
 * Jdbc database server endpoint builder wrapper.
 *
 * @param <T>
 * @author Christoph Deppisch
 * @since 2.7.3
 */
public class JdbcDbServerEndpointBuilder<T extends EndpointBuilder<JdbcServer>> {

    private final T builder;

    /**
     * Default constructor using browser builder implementation.
     * @param builder
     */
    public JdbcDbServerEndpointBuilder(T builder) {
        this.builder = builder;
    }

    /**
     * Returns browser builder for further fluent api calls.
     * @return
     */
    public T server() {
        return builder;
    }
}
