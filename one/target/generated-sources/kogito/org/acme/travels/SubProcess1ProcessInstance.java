package org.acme.travels;

public class SubProcess1ProcessInstance extends org.kie.kogito.process.impl.AbstractProcessInstance<SubProcess1Model> {

    public SubProcess1ProcessInstance(org.acme.travels.SubProcess1Process process, SubProcess1Model value, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, processRuntime);
    }

    public SubProcess1ProcessInstance(org.acme.travels.SubProcess1Process process, SubProcess1Model value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, businessKey, processRuntime);
    }

    public SubProcess1ProcessInstance(org.acme.travels.SubProcess1Process process, SubProcess1Model value, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, processRuntime, wpi);
    }

    public SubProcess1ProcessInstance(org.acme.travels.SubProcess1Process process, SubProcess1Model value, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, wpi);
    }

    protected java.util.Map<String, Object> bind(SubProcess1Model variables) {
        return variables.toMap();
    }

    protected void unbind(SubProcess1Model variables, java.util.Map<String, Object> vmap) {
        variables.fromMap(this.id(), vmap);
    }
}
