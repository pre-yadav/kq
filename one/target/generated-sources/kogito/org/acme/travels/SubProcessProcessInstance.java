package org.acme.travels;

public class SubProcessProcessInstance extends org.kie.kogito.process.impl.AbstractProcessInstance<SubProcessModel> {

    public SubProcessProcessInstance(org.acme.travels.SubProcessProcess process, SubProcessModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, processRuntime);
    }

    public SubProcessProcessInstance(org.acme.travels.SubProcessProcess process, SubProcessModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, businessKey, processRuntime);
    }

    public SubProcessProcessInstance(org.acme.travels.SubProcessProcess process, SubProcessModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, processRuntime, wpi);
    }

    public SubProcessProcessInstance(org.acme.travels.SubProcessProcess process, SubProcessModel value, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, wpi);
    }

    protected java.util.Map<String, Object> bind(SubProcessModel variables) {
        return variables.toMap();
    }

    protected void unbind(SubProcessModel variables, java.util.Map<String, Object> vmap) {
        variables.fromMap(this.id(), vmap);
    }
}
