package life.genny.kogito;

import org.jbpm.process.core.datatype.impl.type.ObjectDataType;
import org.jbpm.ruleflow.core.RuleFlowProcessFactory;
import org.drools.core.util.KieFunctions;

@javax.enterprise.context.ApplicationScoped()
@javax.inject.Named("timersOnTask")
@io.quarkus.runtime.Startup()
public class TimersOnTaskProcess extends org.kie.kogito.process.impl.AbstractProcess<life.genny.kogito.TimersOnTaskModel> {

    @javax.inject.Inject()
    public TimersOnTaskProcess(org.kie.kogito.app.Application app) {
        super(app, java.util.Arrays.asList());
        activate();
    }

    public TimersOnTaskProcess() {
    }

    @Override()
    public life.genny.kogito.TimersOnTaskProcessInstance createInstance(life.genny.kogito.TimersOnTaskModel value) {
        return new life.genny.kogito.TimersOnTaskProcessInstance(this, value, this.createProcessRuntime());
    }

    public life.genny.kogito.TimersOnTaskProcessInstance createInstance(java.lang.String businessKey, life.genny.kogito.TimersOnTaskModel value) {
        return new life.genny.kogito.TimersOnTaskProcessInstance(this, value, businessKey, this.createProcessRuntime());
    }

    @Override()
    public life.genny.kogito.TimersOnTaskModel createModel() {
        return new life.genny.kogito.TimersOnTaskModel();
    }

    public life.genny.kogito.TimersOnTaskProcessInstance createInstance(org.kie.kogito.Model value) {
        return this.createInstance((life.genny.kogito.TimersOnTaskModel) value);
    }

    public life.genny.kogito.TimersOnTaskProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.Model value) {
        return this.createInstance(businessKey, (life.genny.kogito.TimersOnTaskModel) value);
    }

    public life.genny.kogito.TimersOnTaskProcessInstance createInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new life.genny.kogito.TimersOnTaskProcessInstance(this, this.createModel(), this.createProcessRuntime(), wpi);
    }

    public life.genny.kogito.TimersOnTaskProcessInstance createReadOnlyInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new life.genny.kogito.TimersOnTaskProcessInstance(this, this.createModel(), wpi);
    }

    public org.kie.api.definition.process.Process process() {
        RuleFlowProcessFactory factory = RuleFlowProcessFactory.createProcess("timersOnTask");
        factory.variable("delay2", new ObjectDataType("java.lang.String", life.genny.kogito.TimersOnTaskProcess.class.getClassLoader()), "customTags", "input");
        factory.name("timersOnTask");
        factory.packageName("life.genny.kogito");
        factory.dynamic(false);
        factory.version("1.0");
        factory.visibility("Public");
        factory.metaData("TargetNamespace", "http://www.omg.org/bpmn20");
        factory.imports("String");
        factory.global("delay4", "String");
        org.jbpm.ruleflow.core.factory.HumanTaskNodeFactory<?> humanTaskNode1 = factory.humanTaskNode(1);
        humanTaskNode1.name("User Task 1");
        humanTaskNode1.workParameter("TaskName", "work");
        humanTaskNode1.workParameter("Skippable", "true");
        humanTaskNode1.workParameter("NodeName", "User Task 1");
        humanTaskNode1.done();
        humanTaskNode1.metaData("UniqueId", "_DECEF7EE-8E20-4DC7-B9CC-829DF8F6ADBE");
        humanTaskNode1.metaData("elementname", "User Task 1");
        humanTaskNode1.metaData("x", 705);
        humanTaskNode1.metaData("width", 154);
        humanTaskNode1.metaData("y", 177);
        humanTaskNode1.metaData("height", 102);
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode2 = factory.actionNode(2);
        actionNode2.name("Before Timer");
        actionNode2.action(kcontext -> {
            java.lang.String delay2 = (java.lang.String) kcontext.getVariable("delay2");
            System.out.println("Before timer, waiting for task to be complete or expires in " + delay2);
        });
        actionNode2.metaData("UniqueId", "_7144F58E-6B9F-4C06-98C3-1B9359686851");
        actionNode2.metaData("elementname", "Before Timer");
        actionNode2.metaData("NodeType", "ScriptTask");
        actionNode2.metaData("x", 446);
        actionNode2.metaData("width", 154);
        actionNode2.metaData("y", 177);
        actionNode2.metaData("height", 102);
        actionNode2.done();
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode3 = factory.endNode(3);
        endNode3.name("End");
        endNode3.terminate(false);
        endNode3.metaData("UniqueId", "_C005CFDD-76A2-4483-8983-B517A55CEDB0");
        endNode3.metaData("elementname", "End");
        endNode3.metaData("x", 1120);
        endNode3.metaData("width", 56);
        endNode3.metaData("y", 379);
        endNode3.metaData("height", 56);
        endNode3.done();
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode4 = factory.endNode(4);
        endNode4.name("End Event 2");
        endNode4.terminate(false);
        endNode4.metaData("UniqueId", "_E8083A8F-D9EA-4E8A-A363-D40906829E0C");
        endNode4.metaData("elementname", "End Event 2");
        endNode4.metaData("x", 1120);
        endNode4.metaData("width", 56);
        endNode4.metaData("y", 200);
        endNode4.metaData("height", 56);
        endNode4.done();
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode5 = factory.actionNode(5);
        actionNode5.name("After Timer");
        actionNode5.action(kcontext -> {
            java.lang.String delay2 = (java.lang.String) kcontext.getVariable("delay2");
            System.out.println("After timer ");
            kcontext.setVariable("delay2", "9S");
            System.out.println("After setting delay timer " + delay2);
        });
        actionNode5.metaData("UniqueId", "_6149ED0D-C469-4E71-8308-9DAB77EE1AD5");
        actionNode5.metaData("elementname", "After Timer");
        actionNode5.metaData("NodeType", "ScriptTask");
        actionNode5.metaData("x", 886);
        actionNode5.metaData("width", 154);
        actionNode5.metaData("y", 356);
        actionNode5.metaData("height", 102);
        actionNode5.done();
        org.jbpm.ruleflow.core.factory.StartNodeFactory<?> startNode6 = factory.startNode(6);
        startNode6.name("StartProcess");
        startNode6.interrupting(true);
        startNode6.metaData("UniqueId", "_7E2C104E-EE2D-4F32-A127-245FE3454ECA");
        startNode6.metaData("elementname", "StartProcess");
        startNode6.metaData("x", 310);
        startNode6.metaData("width", 56);
        startNode6.metaData("y", 200);
        startNode6.metaData("height", 56);
        startNode6.done();
        org.jbpm.ruleflow.core.factory.BoundaryEventNodeFactory<?> boundaryEventNode7 = factory.boundaryEventNode(7);
        boundaryEventNode7.name("BoundaryEvent");
        boundaryEventNode7.eventType("Timer-_DECEF7EE-8E20-4DC7-B9CC-829DF8F6ADBE-#{delay2}-7");
        boundaryEventNode7.attachedTo("_DECEF7EE-8E20-4DC7-B9CC-829DF8F6ADBE");
        boundaryEventNode7.scope(null);
        boundaryEventNode7.metaData("UniqueId", "_8AC28C5C-0AF3-412F-ABBF-FAF966239155");
        boundaryEventNode7.metaData("EventType", "timer");
        boundaryEventNode7.metaData("x", 754);
        boundaryEventNode7.metaData("width", 56);
        boundaryEventNode7.metaData("y", 251);
        boundaryEventNode7.metaData("AttachedTo", "_DECEF7EE-8E20-4DC7-B9CC-829DF8F6ADBE");
        boundaryEventNode7.metaData("TimeDuration", "#{delay2}");
        boundaryEventNode7.metaData("CancelActivity", true);
        boundaryEventNode7.metaData("height", 56);
        boundaryEventNode7.done();
        factory.connection(2, 1, "_C00B257C-741C-4541-9D18-4339383B158C");
        factory.connection(6, 2, "_8EC70170-62F5-48C3-BBA3-8F11E2DB771D");
        factory.connection(5, 3, "_DFE77F9F-6037-4009-B071-35B345C34ABE");
        factory.connection(1, 4, "_24FF8718-E460-4B66-8E17-3EC4BC46DE9F");
        factory.connection(7, 5, "_4E3102D2-08C6-4140-BF3A-A21C9B31959D");
        factory.validate();
        return factory.getProcess();
    }
}
