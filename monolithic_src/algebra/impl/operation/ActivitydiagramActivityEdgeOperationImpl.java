package algebra.impl.operation;

import java.util.ArrayList;
import java.util.List;

import activitydiagram.ActivitydiagramFactory;
import activitydiagram.Offer;
import activitydiagram.Token;
import algebra.operation.Activitydiagram$defaultActivityEdgeOperation;
import oabenchcase.algebra.impl.OabenchcaseAlgebraImpl;

public class ActivitydiagramActivityEdgeOperationImpl implements Activitydiagram$defaultActivityEdgeOperation {

	private final activitydiagram.ActivityEdge activityEdge;
	private OabenchcaseAlgebraImpl alg;

	public ActivitydiagramActivityEdgeOperationImpl(final activitydiagram.ActivityEdge self,
			OabenchcaseAlgebraImpl algebra) {
		this.activityEdge = self;
		this.alg = algebra;

	}

	@Override
	public void sendOffer(final List<Token> tokens) {
		final Offer offer = ActivitydiagramFactory.eINSTANCE.createOffer();
		for (final Token token : tokens) {
			offer.getOfferedTokens().add(token);
		}
		this.activityEdge.getOffers().add(offer);
	}

	@Override
	public List<Token> takeOfferedTokens() {
		final List<Token> tokens = new ArrayList<Token>();

		for (final Offer o : this.activityEdge.getOffers()) {
			tokens.addAll(o.getOfferedTokens());
		}
		this.activityEdge.getOffers().clear();

		return tokens;
	}

	@Override
	public boolean hasOffer() {
		for (final Offer o : this.activityEdge.getOffers()) {
			if (this.alg.$(o).hasTokens()) {
				return true;
			}
		}
		return false;
	}

}
