/*
 * Copyright Terracotta, Inc.
 * Copyright IBM Corp. 2024, 2025
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

package org.ehcache.core.spi.store.heap;

/**
 * This exception is thrown when {@link SizeOfEngine} reaches one of the limits defined in configuration while sizing
 * the object on heap.
 */
@Deprecated
public class LimitExceededException extends Exception {

  private static final long serialVersionUID = -4689090295854830331L;

  /**
   * Creates an exception with the provided message
   *
   * @param message information about the exception
   */
  public LimitExceededException(String message) {
    super(message);
  }

}
