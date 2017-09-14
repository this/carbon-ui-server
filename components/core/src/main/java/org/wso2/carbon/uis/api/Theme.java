/*
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.uis.api;

import java.util.Objects;

/**
 * Represents a theme in a web app.
 *
 * @since 0.8.0
 */
public class Theme {

    private final String name;
    private final String path;

    /**
     * Creates a new theme which can be located in the specified path.
     *
     * @param name name of the theme
     * @param path path to the theme
     */
    public Theme(String name, String path) {
        this.name = name;
        this.path = path;
    }

    /**
     * Returns the name of this theme.
     *
     * @return name of this theme
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the path of this theme.
     * @return path of this theme
     */
    public String getPath() {
        return path;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Theme)) {
            return false;
        }
        Theme theme = (Theme) obj;
        return Objects.equals(name, theme.name) && Objects.equals(path, theme.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, path);
    }

    @Override
    public String toString() {
        return "Theme{name='" + name + "', path='" + path + "'}";
    }
}
