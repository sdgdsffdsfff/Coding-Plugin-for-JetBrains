/*
 * Copyright 2016 Coding
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
package org.coding.git.api;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * @author robin
 */
public class CodingNetAuthorization {
  private final long myId;
  @Nullable private final String myNote;
  @NotNull private final String myToken;
  @NotNull private final List<String> myScopes;

  public CodingNetAuthorization(long id, @NotNull String token, @NotNull List<String> scopes, @Nullable String note) {
    myId = id;
    myToken = token;
    myScopes = scopes;
    myNote = note;
  }

  @NotNull
  public String getToken() {
    return myToken;
  }

  @NotNull
  public List<String> getScopes() {
    return myScopes;
  }

  @Nullable
  public String getNote() {
    return myNote;
  }

  public long getId() {
    return myId;
  }
}
