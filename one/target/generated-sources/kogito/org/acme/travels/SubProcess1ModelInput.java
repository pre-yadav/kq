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
package org.acme.travels;

import org.kie.kogito.MapInput;
import org.kie.kogito.MapInputId;
import org.kie.kogito.MapOutput;
import java.util.Map;
import java.util.HashMap;
import org.kie.kogito.MappableToModel;
import org.kie.kogito.Model;

@org.kie.kogito.codegen.Generated(value = "kogito-codegen", reference = "subProcess1", name = "SubProcess1", hidden = true)
public class SubProcess1ModelInput implements Model, MapInput, MapInputId, MapOutput, MappableToModel<SubProcess1Model> {

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "type2")
    @javax.validation.Valid()
    private java.lang.String type2;

    public java.lang.String getType2() {
        return type2;
    }

    public void setType2(java.lang.String type2) {
        this.type2 = type2;
    }

    @Override()
    public SubProcess1Model toModel() {
        SubProcess1Model result = new SubProcess1Model();
        result.setType2(getType2());
        return result;
    }
}