package algebra.impl.operation;

import java.util.ArrayList;
import java.util.List;

import activitydiagram.Token;
import oabenchcase.algebra.impl.OabenchcaseAlgebraImpl;

public class ActivitydiagramtOfferOperationImpl
		implements algebra.operation.Activitydiagram$defaultOfferOperation {

	private final activitydiagram.Offer offer;
	private OabenchcaseAlgebraImpl alg;

	public ActivitydiagramtOfferOperationImpl(final activitydiagram.Offer self, OabenchcaseAlgebraImpl algebra) {
		this.offer = self;
		this.alg = algebra;
	}

	@Override
	public boolean hasTokens() {
		this.removeWithdrawnTokens();
		return this.offer.getOfferedTokens().size() > 0;
	}

	private void removeWithdrawnTokens() {
		final List<Token> tokensToBeRemoved = new ArrayList<Token>();
		for (final Token token : this.offer.getOfferedTokens()) {
			if (this.alg.$(token).isWithdrawn()) {
				tokensToBeRemoved.add(token);
			}
		}
		this.offer.getOfferedTokens().removeAll(tokensToBeRemoved);
	}

}
