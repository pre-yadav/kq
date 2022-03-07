package org.acme.travels;

import org.jbpm.process.core.datatype.impl.type.ObjectDataType;
import org.jbpm.ruleflow.core.RuleFlowProcessFactory;
import org.drools.core.util.KieFunctions;

@javax.enterprise.context.ApplicationScoped()
@javax.inject.Named("adhoc")
@io.quarkus.runtime.Startup()
public class AdhocProcess extends org.kie.kogito.process.impl.AbstractProcess<org.acme.travels.AdhocModel> {

    @javax.inject.Inject()
    public AdhocProcess(org.kie.kogito.app.Application app) {
        super(app, java.util.Arrays.asList());
        activate();
    }

    public AdhocProcess() {
    }

    @Override()
    public org.acme.travels.AdhocProcessInstance createInstance(org.acme.travels.AdhocModel value) {
        return new org.acme.travels.AdhocProcessInstance(this, value, this.createProcessRuntime());
    }

    public org.acme.travels.AdhocProcessInstance createInstance(java.lang.String businessKey, org.acme.travels.AdhocModel value) {
        return new org.acme.travels.AdhocProcessInstance(this, value, businessKey, this.createProcessRuntime());
    }

    @Override()
    public org.acme.travels.AdhocModel createModel() {
        return new org.acme.travels.AdhocModel();
    }

    public org.acme.travels.AdhocProcessInstance createInstance(org.kie.kogito.Model value) {
        return this.createInstance((org.acme.travels.AdhocModel) value);
    }

    public org.acme.travels.AdhocProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.Model value) {
        return this.createInstance(businessKey, (org.acme.travels.AdhocModel) value);
    }

    public org.acme.travels.AdhocProcessInstance createInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new org.acme.travels.AdhocProcessInstance(this, this.createModel(), this.createProcessRuntime(), wpi);
    }

    public org.acme.travels.AdhocProcessInstance createReadOnlyInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new org.acme.travels.AdhocProcessInstance(this, this.createModel(), wpi);
    }

    public org.kie.api.definition.process.Process process() {
        RuleFlowProcessFactory factory = RuleFlowProcessFactory.createProcess("adhoc");
        factory.variable("name", new ObjectDataType("java.lang.String", org.acme.travels.AdhocProcess.class.getClassLoader()), "customTags", null);
        factory.name("adhoc");
        factory.packageName("org.acme.travels");
        factory.dynamic(true);
        factory.version("1.0");
        factory.visibility("Public");
        factory.metaData("TargetNamespace", "http://www.omg.org/bpmn20");
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode1 = factory.actionNode(1);
        actionNode1.name("Task1");
        actionNode1.action(kcontext -> {
            java.lang.String name = (java.lang.String) kcontext.getVariable("name");
            System.out.println("task1 " + name);
        });
        actionNode1.metaData("UniqueId", "_94CEC217-2E43-4A35-8D5F-8C2BF946D44F");
        actionNode1.metaData("elementname", "Task1");
        actionNode1.metaData("NodeType", "ScriptTask");
        actionNode1.metaData("x", 593);
        actionNode1.metaData("width", 154);
        actionNode1.metaData("y", 169);
        actionNode1.metaData("height", 102);
        actionNode1.done();
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode2 = factory.endNode(2);
        endNode2.name("End");
        endNode2.terminate(false);
        endNode2.metaData("UniqueId", "_7228FBA6-D426-4504-8E1F-6F496364FEBF");
        endNode2.metaData("x", 873);
        endNode2.metaData("width", 56);
        endNode2.metaData("y", 383);
        endNode2.metaData("height", 56);
        endNode2.done();
        org.jbpm.ruleflow.core.factory.StartNodeFactory<?> startNode3 = factory.startNode(3);
        startNode3.name("Start");
        startNode3.interrupting(true);
        startNode3.metaData("UniqueId", "_90E6C06F-6401-43F9-8193-CBC604B49592");
        startNode3.metaData("x", 488);
        startNode3.metaData("width", 56);
        startNode3.metaData("y", 104);
        startNode3.metaData("height", 56);
        startNode3.done();
        org.jbpm.ruleflow.core.factory.DynamicNodeFactory<?> compositeContextNode4 = factory.dynamicNode(4);
        compositeContextNode4.name("Internship readiness");
        compositeContextNode4.metaData("UniqueId", "_BB922565-00C9-4497-872E-3C22E8449398");
        compositeContextNode4.metaData("elementname", "Internship readiness");
        compositeContextNode4.metaData("x", 224);
        compositeContextNode4.metaData("width", 584);
        compositeContextNode4.metaData("y", 310);
        compositeContextNode4.metaData("height", 199);
        compositeContextNode4.language(null);
        compositeContextNode4.autoComplete(true);
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode5 = compositeContextNode4.endNode(5);
        endNode5.name("End");
        endNode5.terminate(false);
        endNode5.metaData("UniqueId", "_3FE478BA-435F-4396-A779-EA85F105AFD6");
        endNode5.metaData("x", 520);
        endNode5.metaData("width", 56);
        endNode5.metaData("y", 72);
        endNode5.metaData("height", 56);
        endNode5.done();
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode6 = compositeContextNode4.actionNode(6);
        actionNode6.name("Create Internship");
        actionNode6.action(kcontext -> {
            java.lang.String name = (java.lang.String) kcontext.getVariable("name");
            System.out.println("intern created " + name);
        });
        actionNode6.metaData("UniqueId", "_1BBEA0C6-4D3A-4CAB-B70B-27B8568E5A05");
        actionNode6.metaData("elementname", "Create Internship");
        actionNode6.metaData("NodeType", "ScriptTask");
        actionNode6.metaData("x", 287);
        actionNode6.metaData("width", 154);
        actionNode6.metaData("y", 50);
        actionNode6.metaData("height", 102);
        actionNode6.done();
        compositeContextNode4.connection(6, 5, "_4088BAFF-8535-4F56-B8CD-4D5BC5ED997E");
        compositeContextNode4.done();
        factory.connection(3, 1, "_792EDD2C-B369-47F9-B1AB-EFA95361D106");
        factory.connection(4, 2, "_186AC8AF-CE61-4FA4-87AA-94E4F70CB2ED");
        factory.connection(1, 4, "_3C352303-9B86-431D-B8E7-D27F8FAC95BA");
        factory.validate();
        return factory.getProcess();
    }
}
