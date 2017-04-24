package activitydiagram.activitydiagram.algebra.operation;

public interface ActivitydiagramActivitydiagramDecisionNode_AspectOperation extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramDecisionNodeOperation, activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramControlNode_AspectOperation {
	void fire(org.eclipse.emf.common.util.EList<activitydiagram.Token> tokens);
	Boolean isReady();
}