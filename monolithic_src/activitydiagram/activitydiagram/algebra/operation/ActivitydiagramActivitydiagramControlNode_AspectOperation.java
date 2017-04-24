package activitydiagram.activitydiagram.algebra.operation;

public interface ActivitydiagramActivitydiagramControlNode_AspectOperation extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramControlNodeOperation, activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramActivityNode_AspectOperation {
	void fire(org.eclipse.emf.common.util.EList<activitydiagram.Token> tokens);
	Boolean isReady();
}