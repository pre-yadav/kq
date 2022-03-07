package life.genny.kogito;

import org.jbpm.process.core.datatype.impl.type.ObjectDataType;
import org.jbpm.ruleflow.core.RuleFlowProcessFactory;
import org.drools.core.util.KieFunctions;

@javax.enterprise.context.ApplicationScoped()
@javax.inject.Named("one")
@io.quarkus.runtime.Startup()
public class OneProcess extends org.kie.kogito.process.impl.AbstractProcess<life.genny.kogito.OneModel> {

    @javax.inject.Inject()
    public OneProcess(org.kie.kogito.app.Application app) {
        super(app, java.util.Arrays.asList());
        activate();
    }

    public OneProcess() {
    }

    @Override()
    public life.genny.kogito.OneProcessInstance createInstance(life.genny.kogito.OneModel value) {
        return new life.genny.kogito.OneProcessInstance(this, value, this.createProcessRuntime());
    }

    public life.genny.kogito.OneProcessInstance createInstance(java.lang.String businessKey, life.genny.kogito.OneModel value) {
        return new life.genny.kogito.OneProcessInstance(this, value, businessKey, this.createProcessRuntime());
    }

    @Override()
    public life.genny.kogito.OneModel createModel() {
        return new life.genny.kogito.OneModel();
    }

    public life.genny.kogito.OneProcessInstance createInstance(org.kie.kogito.Model value) {
        return this.createInstance((life.genny.kogito.OneModel) value);
    }

    public life.genny.kogito.OneProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.Model value) {
        return this.createInstance(businessKey, (life.genny.kogito.OneModel) value);
    }

    public life.genny.kogito.OneProcessInstance createInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new life.genny.kogito.OneProcessInstance(this, this.createModel(), this.createProcessRuntime(), wpi);
    }

    public life.genny.kogito.OneProcessInstance createReadOnlyInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new life.genny.kogito.OneProcessInstance(this, this.createModel(), wpi);
    }

    public org.kie.api.definition.process.Process process() {
        RuleFlowProcessFactory factory = RuleFlowProcessFactory.createProcess("one");
        factory.variable("processId", new ObjectDataType("java.lang.String", life.genny.kogito.OneProcess.class.getClassLoader()), "customTags", "input");
        factory.name("one");
        factory.packageName("life.genny.kogito");
        factory.dynamic(false);
        factory.version("1.0");
        factory.visibility("Public");
        factory.metaData("TargetNamespace", "http://www.omg.org/bpmn20");
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode1 = factory.actionNode(1);
        actionNode1.name("Init task");
        actionNode1.action(kcontext -> {
            java.lang.String processId = (java.lang.String) kcontext.getVariable("processId");
            kcontext.setVariable("processId", kcontext.getProcessInstance().getStringId());
        });
        actionNode1.metaData("UniqueId", "_B245D584-8C4D-40B0-A1A3-15DD51CB2A5A");
        actionNode1.metaData("elementname", "Init task");
        actionNode1.metaData("NodeType", "ScriptTask");
        actionNode1.metaData("x", 211);
        actionNode1.metaData("width", 126);
        actionNode1.metaData("y", 207);
        actionNode1.metaData("height", 55);
        actionNode1.done();
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode2 = factory.actionNode(2);
        actionNode2.name("continue task");
        actionNode2.action(kcontext -> {
            System.out.println(" Conitnue task ");
        });
        actionNode2.metaData("UniqueId", "_1D205BB4-2211-4FB0-8CB1-5F3E5C748307");
        actionNode2.metaData("elementname", "continue task");
        actionNode2.metaData("NodeType", "ScriptTask");
        actionNode2.metaData("x", 200);
        actionNode2.metaData("width", 155);
        actionNode2.metaData("y", 417);
        actionNode2.metaData("height", 64);
        actionNode2.done();
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode3 = factory.endNode(3);
        endNode3.name("End");
        endNode3.terminate(false);
        endNode3.metaData("UniqueId", "_0C7EDAAB-8F70-4CF8-970E-8D9F8ADAED18");
        endNode3.metaData("x", 417);
        endNode3.metaData("width", 56);
        endNode3.metaData("y", 421);
        endNode3.metaData("height", 56);
        endNode3.done();
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode4 = factory.actionNode(4);
        actionNode4.name("Task");
        actionNode4.action(kcontext -> {
            java.lang.String processId = (java.lang.String) kcontext.getVariable("processId");
            System.out.println(" initialized vars " + processId);
        });
        actionNode4.metaData("UniqueId", "_6010EF1E-7BA3-4414-91B9-94FD4424C077");
        actionNode4.metaData("elementname", "Task");
        actionNode4.metaData("NodeType", "ScriptTask");
        actionNode4.metaData("x", 220);
        actionNode4.metaData("width", 116);
        actionNode4.metaData("y", 317);
        actionNode4.metaData("height", 60);
        actionNode4.done();
        org.jbpm.ruleflow.core.factory.StartNodeFactory<?> startNode5 = factory.startNode(5);
        startNode5.name("Start");
        startNode5.interrupting(false);
        startNode5.metaData("UniqueId", "_C6961849-099E-4228-9EBD-31D37C339599");
        startNode5.metaData("x", 108);
        startNode5.metaData("width", 56);
        startNode5.metaData("y", 208);
        startNode5.metaData("height", 56);
        startNode5.done();
        factory.connection(5, 1, "_637E691F-A27C-4218-A2EE-F08941A2AAFE");
        factory.connection(4, 2, "_3CFBABF3-63C8-4BEB-9DB5-A941307DDFD6");
        factory.connection(2, 3, "_5DBFF2A3-59E2-4140-9C12-CC06C2EE4883");
        factory.connection(1, 4, "_AB047D31-9745-4FA8-BC8A-D964F628A3BD");
        factory.validate();
        return factory.getProcess();
    }
}
