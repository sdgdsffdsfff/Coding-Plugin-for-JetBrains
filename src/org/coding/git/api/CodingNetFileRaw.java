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

@SuppressWarnings("UnusedDeclaration")
class CodingNetFileRaw implements ICodingNetDataConstructor {
  @Nullable public String filename;

  @Nullable public Integer additions;
  @Nullable public Integer deletions;
  @Nullable public Integer changes;
  @Nullable public String status;
  @Nullable public String rawUrl;
  @Nullable public String blobUrl;
  @Nullable public String patch;

  @SuppressWarnings("ConstantConditions")
  @NotNull
  public CodingNetFile createFile() {
    return new CodingNetFile(filename, additions, deletions, changes, status, rawUrl, patch);
  }

  @SuppressWarnings("unchecked")
  @NotNull
  @Override
  public <T> T create(@NotNull Class<T> resultClass) {
    if (resultClass == CodingNetFile.class) {
      return (T)createFile();
    }

    throw new ClassCastException(this.getClass().getName() + ": bad class type: " + resultClass.getName());
  }
}
