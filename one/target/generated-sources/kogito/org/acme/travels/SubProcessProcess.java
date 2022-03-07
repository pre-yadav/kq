package org.acme.travels;

import org.jbpm.process.core.datatype.impl.type.ObjectDataType;
import org.jbpm.ruleflow.core.RuleFlowProcessFactory;
import org.drools.core.util.KieFunctions;

@javax.enterprise.context.ApplicationScoped()
@javax.inject.Named("subProcess")
@io.quarkus.runtime.Startup()
public class SubProcessProcess extends org.kie.kogito.process.impl.AbstractProcess<org.acme.travels.SubProcessModel> {

    @javax.inject.Inject()
    org.kie.kogito.process.Process<TimersOnTaskModel> processtimersOnTask;

    @javax.inject.Inject()
    public SubProcessProcess(org.kie.kogito.app.Application app) {
        super(app, java.util.Arrays.asList());
        activate();
    }

    public SubProcessProcess() {
    }

    @Override()
    public org.acme.travels.SubProcessProcessInstance createInstance(org.acme.travels.SubProcessModel value) {
        return new org.acme.travels.SubProcessProcessInstance(this, value, this.createProcessRuntime());
    }

    public org.acme.travels.SubProcessProcessInstance createInstance(java.lang.String businessKey, org.acme.travels.SubProcessModel value) {
        return new org.acme.travels.SubProcessProcessInstance(this, value, businessKey, this.createProcessRuntime());
    }

    @Override()
    public org.acme.travels.SubProcessModel createModel() {
        return new org.acme.travels.SubProcessModel();
    }

    public org.acme.travels.SubProcessProcessInstance createInstance(org.kie.kogito.Model value) {
        return this.createInstance((org.acme.travels.SubProcessModel) value);
    }

    public org.acme.travels.SubProcessProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.Model value) {
        return this.createInstance(businessKey, (org.acme.travels.SubProcessModel) value);
    }

    public org.acme.travels.SubProcessProcessInstance createInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new org.acme.travels.SubProcessProcessInstance(this, this.createModel(), this.createProcessRuntime(), wpi);
    }

    public org.acme.travels.SubProcessProcessInstance createReadOnlyInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new org.acme.travels.SubProcessProcessInstance(this, this.createModel(), wpi);
    }

    public org.kie.api.definition.process.Process process() {
        RuleFlowProcessFactory factory = RuleFlowProcessFactory.createProcess("subProcess");
        factory.variable("type2", new ObjectDataType("java.lang.String", org.acme.travels.SubProcessProcess.class.getClassLoader()), "customTags", null);
        factory.name("sb");
        factory.packageName("org.acme.travels");
        factory.dynamic(false);
        factory.version("1.0");
        factory.visibility("Public");
        factory.metaData("TargetNamespace", "http://www.omg.org/bpmn20");
        factory.imports("String");
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode1 = factory.actionNode(1);
        actionNode1.name("Task2");
        actionNode1.action(kcontext -> {
            java.lang.String type2 = (java.lang.String) kcontext.getVariable("type2");
            System.out.println("SB ----- After calling sub-process 1 " + type2);
        });
        actionNode1.metaData("UniqueId", "_0C48B589-E1A9-4F4E-AD21-DECDE0A945D9");
        actionNode1.metaData("elementname", "Task2");
        actionNode1.metaData("NodeType", "ScriptTask");
        actionNode1.metaData("x", 637);
        actionNode1.metaData("width", 125);
        actionNode1.metaData("y", 398);
        actionNode1.metaData("height", 104);
        actionNode1.done();
        org.jbpm.ruleflow.core.factory.SubProcessNodeFactory<?> subProcessNode2 = factory.subProcessNode(2);
        subProcessNode2.name("Sub-process2");
        subProcessNode2.processId("timersOnTask");
        subProcessNode2.processName("");
        subProcessNode2.waitForCompletion(true);
        subProcessNode2.independent(false);
        subProcessNode2.subProcessNode(new org.jbpm.workflow.core.node.SubProcessFactory<TimersOnTaskModel>() {

            public TimersOnTaskModel bind(org.kie.api.runtime.process.ProcessContext kcontext) {
                org.acme.travels.TimersOnTaskModel model = new org.acme.travels.TimersOnTaskModel();
                java.lang.String type2 = (java.lang.String) kcontext.getVariable("type2");
                model.setDelay2((String) (type2));
                return model;
            }

            public org.kie.kogito.process.ProcessInstance<TimersOnTaskModel> createInstance(TimersOnTaskModel model) {
                return processtimersOnTask.createInstance(model);
            }

            public void unbind(org.kie.api.runtime.process.ProcessContext kcontext, TimersOnTaskModel model) {
                java.lang.String delay2 = (java.lang.String) model.getDelay2();
                kcontext.setVariable("type2", delay2);
            }
        });
        subProcessNode2.metaData("UniqueId", "_B0F050E9-F1C7-4182-8E5A-14F09257567D");
        subProcessNode2.metaData("elementname", "Sub-process2");
        subProcessNode2.metaData("x", 830);
        subProcessNode2.metaData("width", 140);
        subProcessNode2.metaData("y", 399);
        subProcessNode2.metaData("height", 98);
        subProcessNode2.done();
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode3 = factory.actionNode(3);
        actionNode3.name("Task1");
        actionNode3.action(kcontext -> {
            System.out.println("SB ----- Before calling sub-process ");
        });
        actionNode3.metaData("UniqueId", "_CFC9EC20-19FB-47B5-8141-91910ECA9FF1");
        actionNode3.metaData("elementname", "Task1");
        actionNode3.metaData("NodeType", "ScriptTask");
        actionNode3.metaData("x", 260);
        actionNode3.metaData("width", 114);
        actionNode3.metaData("y", 399);
        actionNode3.metaData("height", 97);
        actionNode3.done();
        org.jbpm.ruleflow.core.factory.SubProcessNodeFactory<?> subProcessNode4 = factory.subProcessNode(4);
        subProcessNode4.name("Sub-process1");
        subProcessNode4.processId("timersOnTask");
        subProcessNode4.processName("");
        subProcessNode4.waitForCompletion(true);
        subProcessNode4.independent(false);
        subProcessNode4.subProcessNode(new org.jbpm.workflow.core.node.SubProcessFactory<TimersOnTaskModel>() {

            public TimersOnTaskModel bind(org.kie.api.runtime.process.ProcessContext kcontext) {
                org.acme.travels.TimersOnTaskModel model = new org.acme.travels.TimersOnTaskModel();
                java.lang.String type2 = (java.lang.String) kcontext.getVariable("type2");
                model.setDelay2((String) (type2));
                return model;
            }

            public org.kie.kogito.process.ProcessInstance<TimersOnTaskModel> createInstance(TimersOnTaskModel model) {
                return processtimersOnTask.createInstance(model);
            }

            public void unbind(org.kie.api.runtime.process.ProcessContext kcontext, TimersOnTaskModel model) {
                java.lang.String delay2 = (java.lang.String) model.getDelay2();
                kcontext.setVariable("type2", delay2);
            }
        });
        subProcessNode4.metaData("UniqueId", "_E34DFC94-D080-421D-BDE4-5065C00CECF5");
        subProcessNode4.metaData("elementname", "Sub-process1");
        subProcessNode4.metaData("x", 438);
        subProcessNode4.metaData("width", 135);
        subProcessNode4.metaData("y", 400);
        subProcessNode4.metaData("height", 96);
        subProcessNode4.done();
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode5 = factory.endNode(5);
        endNode5.name("End");
        endNode5.terminate(false);
        endNode5.metaData("UniqueId", "_C5496B61-D4FC-4009-8B5D-7A14CF7370CE");
        endNode5.metaData("x", 1034);
        endNode5.metaData("width", 56);
        endNode5.metaData("y", 420);
        endNode5.metaData("height", 56);
        endNode5.done();
        org.jbpm.ruleflow.core.factory.StartNodeFactory<?> startNode6 = factory.startNode(6);
        startNode6.name("Start");
        startNode6.interrupting(false);
        startNode6.metaData("UniqueId", "_3E60860C-171F-41CF-BD4C-6F3EE20ACAB0");
        startNode6.metaData("x", 126);
        startNode6.metaData("width", 56);
        startNode6.metaData("y", 420);
        startNode6.metaData("height", 56);
        startNode6.done();
        factory.connection(4, 1, "_AB171787-484E-4E23-A817-8EB9EE4BCE6E");
        factory.connection(1, 2, "_35573298-6C33-401C-8F81-F7B75F632E5F");
        factory.connection(6, 3, "_72CCB3DE-055C-43E0-93C7-E127E4E02367");
        factory.connection(3, 4, "_16088EB2-4534-4532-B07C-79BD7232BB64");
        factory.connection(2, 5, "_AA13A6F2-D8C3-494F-84C5-FD36329731D4");
        factory.validate();
        return factory.getProcess();
    }

    protected void registerListeners() {
        services.getSignalManager().addEventListener("timersOnTask", completionEventListener);
    }
}
