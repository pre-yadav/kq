package org.acme.travels;

public class TimersOnTaskProcessInstance extends org.kie.kogito.process.impl.AbstractProcessInstance<TimersOnTaskModel> {

    public TimersOnTaskProcessInstance(org.acme.travels.TimersOnTaskProcess process, TimersOnTaskModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, processRuntime);
    }

    public TimersOnTaskProcessInstance(org.acme.travels.TimersOnTaskProcess process, TimersOnTaskModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, businessKey, processRuntime);
    }

    public TimersOnTaskProcessInstance(org.acme.travels.TimersOnTaskProcess process, TimersOnTaskModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, processRuntime, wpi);
    }

    public TimersOnTaskProcessInstance(org.acme.travels.TimersOnTaskProcess process, TimersOnTaskModel value, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, wpi);
    }

    protected java.util.Map<String, Object> bind(TimersOnTaskModel variables) {
        return variables.toMap();
    }

    protected void unbind(TimersOnTaskModel variables, java.util.Map<String, Object> vmap) {
        variables.fromMap(this.id(), vmap);
    }
}
