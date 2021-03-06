/*
 * Copyright 2015-2016 ArtisTech, Inc.
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
package com.artistech.utils;

/**
 * Exception for when a value is out of the acceptable range.
 *
 * Use in lat/lon
 *
 * @author matta
 */
public class ArgumentOutOfRangeException extends Exception {

    private final String _argument;

    /**
     * Constructor.
     *
     * @param argument
     * @param message
     */
    public ArgumentOutOfRangeException(String argument, String message) {
        super(message);
        _argument = argument;
    }

    /**
     * Get the argument that caused the exception.
     *
     * @return
     */
    public String getArgument() {
        return _argument;
    }
}
