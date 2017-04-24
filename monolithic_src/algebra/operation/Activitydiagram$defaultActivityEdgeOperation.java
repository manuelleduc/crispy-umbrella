package algebra.operation;

import java.util.List;

import activitydiagram.Token;

public interface Activitydiagram$defaultActivityEdgeOperation extends algebra.operation.ActivitydiagramNamedElementOperation {

	List<Token> takeOfferedTokens();

	void sendOffer(List<Token> tokens);

	boolean hasOffer();
}