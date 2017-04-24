package activitydiagram.activitydiagram.algebra.operation;

public interface ActivitydiagramActivitydiagramActivity_AspectOperation extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramActivityOperation {
	void initialize(org.eclipse.emf.common.util.EList<activitydiagram.InputValue> inputValues);
	void main(org.eclipse.emf.common.util.EList<activitydiagram.InputValue> inputValues);
	void run();
	activitydiagram.ActivityNode selectNextNode(org.eclipse.emf.common.util.EList<activitydiagram.ActivityNode> activityNodes);
	org.eclipse.emf.common.util.EList<activitydiagram.ActivityNode> getEnabledNodes();
	void fireInitialNode();
	void fireNode(activitydiagram.ActivityNode node);
	activitydiagram.InitialNode getInitialNode();
	void runNodes();
	void initializeTrace();
	void terminate();
}