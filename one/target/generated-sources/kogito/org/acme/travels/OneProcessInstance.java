package org.acme.travels;

public class OneProcessInstance extends org.kie.kogito.process.impl.AbstractProcessInstance<OneModel> {

    public OneProcessInstance(org.acme.travels.OneProcess process, OneModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, processRuntime);
    }

    public OneProcessInstance(org.acme.travels.OneProcess process, OneModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, businessKey, processRuntime);
    }

    public OneProcessInstance(org.acme.travels.OneProcess process, OneModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, processRuntime, wpi);
    }

    public OneProcessInstance(org.acme.travels.OneProcess process, OneModel value, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, wpi);
    }

    protected java.util.Map<String, Object> bind(OneModel variables) {
        return variables.toMap();
    }

    protected void unbind(OneModel variables, java.util.Map<String, Object> vmap) {
        variables.fromMap(this.id(), vmap);
    }
}
