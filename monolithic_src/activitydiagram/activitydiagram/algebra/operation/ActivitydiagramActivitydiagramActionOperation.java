package activitydiagram.activitydiagram.algebra.operation;

public interface ActivitydiagramActivitydiagramActionOperation extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramExecutableNodeOperation {
	void fire(org.eclipse.emf.common.util.EList<activitydiagram.Token> tokens);
	void doAction();
	void sendOffers();
	Boolean isReady();
}