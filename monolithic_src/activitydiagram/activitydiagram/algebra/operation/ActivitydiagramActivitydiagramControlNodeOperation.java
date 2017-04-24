package activitydiagram.activitydiagram.algebra.operation;

public interface ActivitydiagramActivitydiagramControlNodeOperation extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramActivityNodeOperation {
	void fire(org.eclipse.emf.common.util.EList<activitydiagram.Token> tokens);
	Boolean isReady();
}