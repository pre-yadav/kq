package org.acme.travels;

public class AdhocProcessInstance extends org.kie.kogito.process.impl.AbstractProcessInstance<AdhocModel> {

    public AdhocProcessInstance(org.acme.travels.AdhocProcess process, AdhocModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, processRuntime);
    }

    public AdhocProcessInstance(org.acme.travels.AdhocProcess process, AdhocModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, businessKey, processRuntime);
    }

    public AdhocProcessInstance(org.acme.travels.AdhocProcess process, AdhocModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, processRuntime, wpi);
    }

    public AdhocProcessInstance(org.acme.travels.AdhocProcess process, AdhocModel value, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, wpi);
    }

    protected java.util.Map<String, Object> bind(AdhocModel variables) {
        return variables.toMap();
    }

    protected void unbind(AdhocModel variables, java.util.Map<String, Object> vmap) {
        variables.fromMap(this.id(), vmap);
    }
}
