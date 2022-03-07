package org.acme.travels;

import org.jbpm.process.core.datatype.impl.type.ObjectDataType;
import org.jbpm.ruleflow.core.RuleFlowProcessFactory;
import org.drools.core.util.KieFunctions;

@javax.enterprise.context.ApplicationScoped()
@javax.inject.Named("timerscycle")
@io.quarkus.runtime.Startup()
public class TimerscycleProcess extends org.kie.kogito.process.impl.AbstractProcess<org.acme.travels.TimerscycleModel> {

    @javax.inject.Inject()
    public TimerscycleProcess(org.kie.kogito.app.Application app) {
        super(app, java.util.Arrays.asList());
        activate();
    }

    public TimerscycleProcess() {
    }

    @Override()
    public org.acme.travels.TimerscycleProcessInstance createInstance(org.acme.travels.TimerscycleModel value) {
        return new org.acme.travels.TimerscycleProcessInstance(this, value, this.createProcessRuntime());
    }

    public org.acme.travels.TimerscycleProcessInstance createInstance(java.lang.String businessKey, org.acme.travels.TimerscycleModel value) {
        return new org.acme.travels.TimerscycleProcessInstance(this, value, businessKey, this.createProcessRuntime());
    }

    @Override()
    public org.acme.travels.TimerscycleModel createModel() {
        return new org.acme.travels.TimerscycleModel();
    }

    public org.acme.travels.TimerscycleProcessInstance createInstance(org.kie.kogito.Model value) {
        return this.createInstance((org.acme.travels.TimerscycleModel) value);
    }

    public org.acme.travels.TimerscycleProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.Model value) {
        return this.createInstance(businessKey, (org.acme.travels.TimerscycleModel) value);
    }

    public org.acme.travels.TimerscycleProcessInstance createInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new org.acme.travels.TimerscycleProcessInstance(this, this.createModel(), this.createProcessRuntime(), wpi);
    }

    public org.acme.travels.TimerscycleProcessInstance createReadOnlyInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new org.acme.travels.TimerscycleProcessInstance(this, this.createModel(), wpi);
    }

    public org.kie.api.definition.process.Process process() {
        RuleFlowProcessFactory factory = RuleFlowProcessFactory.createProcess("timerscycle");
        factory.variable("delay", new ObjectDataType("java.lang.String", org.acme.travels.TimerscycleProcess.class.getClassLoader()), "customTags", null);
        factory.name("timerscycle");
        factory.packageName("org.acme.travels");
        factory.dynamic(false);
        factory.version("1.0");
        factory.visibility("Public");
        factory.metaData("TargetNamespace", "http://www.omg.org/bpmn20");
        org.jbpm.ruleflow.core.factory.StartNodeFactory<?> startNode1 = factory.startNode(1);
        startNode1.name("StartProcess");
        startNode1.interrupting(false);
        startNode1.metaData("UniqueId", "_4C312388-40C9-4EC7-A144-821ADA8D8796");
        startNode1.metaData("elementname", "StartProcess");
        startNode1.metaData("x", 353);
        startNode1.metaData("width", 56);
        startNode1.metaData("y", 217);
        startNode1.metaData("height", 56);
        startNode1.done();
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode2 = factory.actionNode(2);
        actionNode2.name("Before Timer");
        actionNode2.action(kcontext -> {
            java.lang.String delay = (java.lang.String) kcontext.getVariable("delay");
            System.out.println("Before timer... waiting for " + delay);
        });
        actionNode2.metaData("UniqueId", "_770C528A-8014-4A75-8310-4B40796CE71D");
        actionNode2.metaData("elementname", "Before Timer");
        actionNode2.metaData("NodeType", "ScriptTask");
        actionNode2.metaData("x", 489);
        actionNode2.metaData("width", 154);
        actionNode2.metaData("y", 194);
        actionNode2.metaData("height", 102);
        actionNode2.done();
        org.jbpm.ruleflow.core.factory.TimerNodeFactory<?> timerNode3 = factory.timerNode(3);
        timerNode3.name("Timer");
        timerNode3.type(2);
        timerNode3.delay("#{delay}");
        timerNode3.metaData("UniqueId", "_8B258D65-8436-4ABA-926C-3A991D015B42");
        timerNode3.metaData("EventType", "Timer");
        timerNode3.metaData("x", 723);
        timerNode3.metaData("width", 56);
        timerNode3.metaData("y", 217);
        timerNode3.metaData("height", 56);
        timerNode3.done();
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode4 = factory.endNode(4);
        endNode4.name("End");
        endNode4.terminate(false);
        endNode4.metaData("UniqueId", "_34529CC5-68D1-4CB9-93D9-AA2B9D3ADC7A");
        endNode4.metaData("elementname", "End");
        endNode4.metaData("x", 1093);
        endNode4.metaData("width", 56);
        endNode4.metaData("y", 217);
        endNode4.metaData("height", 56);
        endNode4.done();
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode5 = factory.actionNode(5);
        actionNode5.name("After Timer");
        actionNode5.action(kcontext -> {
            System.out.println("After timer");
        });
        actionNode5.metaData("UniqueId", "_F3CD0EE0-F79B-4F31-BA07-33226B01EB12");
        actionNode5.metaData("elementname", "After Timer");
        actionNode5.metaData("NodeType", "ScriptTask");
        actionNode5.metaData("x", 859);
        actionNode5.metaData("width", 154);
        actionNode5.metaData("y", 194);
        actionNode5.metaData("height", 102);
        actionNode5.done();
        factory.connection(1, 2, "_0E4A7451-B1FD-4809-B1E8-CDDB0D763961");
        factory.connection(2, 3, "_260F2503-DC90-421E-ADA3-F7CA589F32C2");
        factory.connection(5, 4, "_132DCC86-10F3-4E9F-A885-98206C8400F4");
        factory.connection(3, 5, "_B2AE1E45-B08B-44D1-980B-D7AAD7F75F2F");
        factory.validate();
        return factory.getProcess();
    }
}
