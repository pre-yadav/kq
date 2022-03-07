package org.acme.travels;

import org.jbpm.process.core.datatype.impl.type.ObjectDataType;
import org.jbpm.ruleflow.core.RuleFlowProcessFactory;
import org.drools.core.util.KieFunctions;

@javax.enterprise.context.ApplicationScoped()
@javax.inject.Named("one")
@io.quarkus.runtime.Startup()
public class OneProcess extends org.kie.kogito.process.impl.AbstractProcess<org.acme.travels.OneModel> {

    @javax.inject.Inject()
    public OneProcess(org.kie.kogito.app.Application app) {
        super(app, java.util.Arrays.asList());
        activate();
    }

    public OneProcess() {
    }

    @Override()
    public org.acme.travels.OneProcessInstance createInstance(org.acme.travels.OneModel value) {
        return new org.acme.travels.OneProcessInstance(this, value, this.createProcessRuntime());
    }

    public org.acme.travels.OneProcessInstance createInstance(java.lang.String businessKey, org.acme.travels.OneModel value) {
        return new org.acme.travels.OneProcessInstance(this, value, businessKey, this.createProcessRuntime());
    }

    @Override()
    public org.acme.travels.OneModel createModel() {
        return new org.acme.travels.OneModel();
    }

    public org.acme.travels.OneProcessInstance createInstance(org.kie.kogito.Model value) {
        return this.createInstance((org.acme.travels.OneModel) value);
    }

    public org.acme.travels.OneProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.Model value) {
        return this.createInstance(businessKey, (org.acme.travels.OneModel) value);
    }

    public org.acme.travels.OneProcessInstance createInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new org.acme.travels.OneProcessInstance(this, this.createModel(), this.createProcessRuntime(), wpi);
    }

    public org.acme.travels.OneProcessInstance createReadOnlyInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new org.acme.travels.OneProcessInstance(this, this.createModel(), wpi);
    }

    public org.kie.api.definition.process.Process process() {
        RuleFlowProcessFactory factory = RuleFlowProcessFactory.createProcess("one");
        factory.name("one");
        factory.packageName("org.acme.travels");
        factory.dynamic(false);
        factory.version("1.0");
        factory.visibility("Public");
        factory.metaData("TargetNamespace", "http://www.omg.org/bpmn20");
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode1 = factory.endNode(1);
        endNode1.name("End");
        endNode1.terminate(false);
        endNode1.metaData("UniqueId", "_0C7EDAAB-8F70-4CF8-970E-8D9F8ADAED18");
        endNode1.metaData("x", 392);
        endNode1.metaData("width", 56);
        endNode1.metaData("y", 385);
        endNode1.metaData("height", 56);
        endNode1.done();
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode2 = factory.actionNode(2);
        actionNode2.name("Task");
        actionNode2.action(kcontext -> {
            System.out.println(" Call trigger ");
        });
        actionNode2.metaData("UniqueId", "_6010EF1E-7BA3-4414-91B9-94FD4424C077");
        actionNode2.metaData("elementname", "Task");
        actionNode2.metaData("NodeType", "ScriptTask");
        actionNode2.metaData("x", 223);
        actionNode2.metaData("width", 116);
        actionNode2.metaData("y", 385);
        actionNode2.metaData("height", 60);
        actionNode2.done();
        org.jbpm.ruleflow.core.factory.StartNodeFactory<?> startNode3 = factory.startNode(3);
        startNode3.name("Start");
        startNode3.interrupting(false);
        startNode3.metaData("UniqueId", "_C6961849-099E-4228-9EBD-31D37C339599");
        startNode3.metaData("x", 102);
        startNode3.metaData("width", 56);
        startNode3.metaData("y", 387);
        startNode3.metaData("height", 56);
        startNode3.done();
        factory.connection(2, 1, "_5DBFF2A3-59E2-4140-9C12-CC06C2EE4883");
        factory.connection(3, 2, "_637E691F-A27C-4218-A2EE-F08941A2AAFE");
        factory.validate();
        return factory.getProcess();
    }
}
