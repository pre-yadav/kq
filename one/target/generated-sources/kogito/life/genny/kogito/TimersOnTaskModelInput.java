/*
 * Copyright 2020 Red Hat, Inc. and/or its affiliates.
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
package life.genny.kogito;

import org.kie.kogito.MapInput;
import org.kie.kogito.MapInputId;
import org.kie.kogito.MapOutput;
import java.util.Map;
import java.util.HashMap;
import org.kie.kogito.MappableToModel;
import org.kie.kogito.Model;

@org.kie.kogito.codegen.Generated(value = "kogito-codegen", reference = "timersOnTask", name = "TimersOnTask", hidden = true)
public class TimersOnTaskModelInput implements Model, MapInput, MapInputId, MapOutput, MappableToModel<TimersOnTaskModel> {

    @org.kie.kogito.codegen.VariableInfo(tags = "input")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "delay2")
    @javax.validation.Valid()
    private java.lang.String delay2;

    public java.lang.String getDelay2() {
        return delay2;
    }

    public void setDelay2(java.lang.String delay2) {
        this.delay2 = delay2;
    }

    @Override()
    public TimersOnTaskModel toModel() {
        TimersOnTaskModel result = new TimersOnTaskModel();
        result.setDelay2(getDelay2());
        return result;
    }
}