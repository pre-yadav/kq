/*
 * Copyright 2019 Red Hat, Inc. and/or its affiliates.
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
package org.acme.travels;

import java.util.Map;
import org.kie.kogito.UserTask;
import org.kie.kogito.UserTaskParam.ParamType;
import org.kie.kogito.UserTaskParam;

@UserTask(taskName = "profile", processName = "adhoc")
public class Adhoc_3_TaskInput {

    public static Adhoc_3_TaskInput fromMap(Map<String, Object> params) {
        Adhoc_3_TaskInput item = new Adhoc_3_TaskInput();
        item.name = (java.lang.String) params.get("name");
        return item;
    }

    @UserTaskParam(value = ParamType.INPUT)
    private java.lang.String name;

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }
}
// Task input for user task 'Create profile' in process 'adhoc'
