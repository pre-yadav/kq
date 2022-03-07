package org.acme.travels;

public class TimersProcessInstance extends org.kie.kogito.process.impl.AbstractProcessInstance<TimersModel> {

    public TimersProcessInstance(org.acme.travels.TimersProcess process, TimersModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, processRuntime);
    }

    public TimersProcessInstance(org.acme.travels.TimersProcess process, TimersModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, businessKey, processRuntime);
    }

    public TimersProcessInstance(org.acme.travels.TimersProcess process, TimersModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, processRuntime, wpi);
    }

    public TimersProcessInstance(org.acme.travels.TimersProcess process, TimersModel value, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, wpi);
    }

    protected java.util.Map<String, Object> bind(TimersModel variables) {
        return variables.toMap();
    }

    protected void unbind(TimersModel variables, java.util.Map<String, Object> vmap) {
        variables.fromMap(this.id(), vmap);
    }
}
