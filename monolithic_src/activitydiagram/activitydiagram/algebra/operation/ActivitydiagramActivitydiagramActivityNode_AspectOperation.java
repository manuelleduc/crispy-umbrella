package activitydiagram.activitydiagram.algebra.operation;

public interface ActivitydiagramActivitydiagramActivityNode_AspectOperation extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramActivityNodeOperation {
	void run();
	Boolean isRunning();
	void terminate();
	Boolean isReady();
	void sendOffers(org.eclipse.emf.common.util.EList<activitydiagram.Token> tokens);
	org.eclipse.emf.common.util.EList<activitydiagram.Token> takeOfferedTokens();
	void addTokens(org.eclipse.emf.common.util.EList<activitydiagram.Token> tokens);
	Boolean hasOffers();
	void removeToken(activitydiagram.Token token);
	void fire(org.eclipse.emf.common.util.EList<activitydiagram.Token> tokens);
}