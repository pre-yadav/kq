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

import org.kie.kogito.MapInput;
import org.kie.kogito.MapInputId;
import org.kie.kogito.MapOutput;
import java.util.Map;
import java.util.HashMap;
import org.kie.kogito.MappableToModel;
import org.kie.kogito.Model;

@org.kie.kogito.codegen.Generated(value = "kogito-codegen", reference = "timerscycle", name = "Timerscycle", hidden = false)
public class TimerscycleModel implements org.kie.kogito.Model, MapInput, MapInputId, MapOutput, MappableToModel<TimerscycleModelOutput> {

    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "delay")
    @javax.validation.Valid()
    private java.lang.String delay;

    public java.lang.String getDelay() {
        return delay;
    }

    public void setDelay(java.lang.String delay) {
        this.delay = delay;
    }

    @Override()
    public TimerscycleModelOutput toModel() {
        TimerscycleModelOutput result = new TimerscycleModelOutput();
        result.setId(getId());
        result.setDelay(getDelay());
        return result;
    }
}
