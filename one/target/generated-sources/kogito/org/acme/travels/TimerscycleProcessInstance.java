package org.acme.travels;

public class TimerscycleProcessInstance extends org.kie.kogito.process.impl.AbstractProcessInstance<TimerscycleModel> {

    public TimerscycleProcessInstance(org.acme.travels.TimerscycleProcess process, TimerscycleModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, processRuntime);
    }

    public TimerscycleProcessInstance(org.acme.travels.TimerscycleProcess process, TimerscycleModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, businessKey, processRuntime);
    }

    public TimerscycleProcessInstance(org.acme.travels.TimerscycleProcess process, TimerscycleModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, processRuntime, wpi);
    }

    public TimerscycleProcessInstance(org.acme.travels.TimerscycleProcess process, TimerscycleModel value, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, wpi);
    }

    protected java.util.Map<String, Object> bind(TimerscycleModel variables) {
        return variables.toMap();
    }

    protected void unbind(TimerscycleModel variables, java.util.Map<String, Object> vmap) {
        variables.fromMap(this.id(), vmap);
    }
}
