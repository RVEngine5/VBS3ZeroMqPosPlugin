/*
 * Copyright 2015 ArtisTech, Inc.
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
package com.artistech.vbs3;

/**
 *
 * @author matta
 */
public class JettyBean {

    private static String server;
    
    /**
     * Static Constructor
     */
    static {
        server = "localhost:8888";
    }

    /**
     * Get the server URL
     * @return 
     */
    public String getServer() {
        return server;
    }

    /**
     * Set the server URL
     * @param value 
     */
    public void setServer(String value) {
        server = value;
    }
}
