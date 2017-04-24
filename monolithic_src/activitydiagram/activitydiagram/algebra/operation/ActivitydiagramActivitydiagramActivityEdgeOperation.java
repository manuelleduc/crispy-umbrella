package activitydiagram.activitydiagram.algebra.operation;

public interface ActivitydiagramActivitydiagramActivityEdgeOperation extends activitydiagram.$default.algebra.operation.Activitydiagram$defaultNamedElementOperation {
	void sendOffer(org.eclipse.emf.common.util.EList<activitydiagram.Token> tokens);
	org.eclipse.emf.common.util.EList<activitydiagram.Token> takeOfferedTokens();
	Boolean hasOffer();
}