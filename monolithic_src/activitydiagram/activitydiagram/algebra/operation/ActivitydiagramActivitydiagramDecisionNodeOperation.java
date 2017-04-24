package activitydiagram.activitydiagram.algebra.operation;

public interface ActivitydiagramActivitydiagramDecisionNodeOperation extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramControlNodeOperation {
	void fire(org.eclipse.emf.common.util.EList<activitydiagram.Token> tokens);
	Boolean isReady();
}