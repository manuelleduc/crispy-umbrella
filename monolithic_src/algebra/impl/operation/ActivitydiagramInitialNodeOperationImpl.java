package algebra.impl.operation;

import java.util.ArrayList;
import java.util.List;

import activitydiagram.ActivitydiagramFactory;
import activitydiagram.Token;
import oabenchcase.algebra.impl.OabenchcaseAlgebraImpl;

public class ActivitydiagramInitialNodeOperationImpl extends ActivitydiagramControlNodeOperationImpl
		implements algebra.operation.Activitydiagram$defaultInitialNodeOperation {

	private final activitydiagram.InitialNode self;

	public ActivitydiagramInitialNodeOperationImpl(final activitydiagram.InitialNode self,
			OabenchcaseAlgebraImpl algebra) {
		super(self, algebra);
		this.self = self;
	}


	@Override
	public void fire(final List<Token> tokens) {
		final List<Token> producedTokens = new ArrayList<Token>();
		producedTokens.add(ActivitydiagramFactory.eINSTANCE.createControlToken());
		this.addTokens(producedTokens);
		this.sendOffers(producedTokens);

	}

	@Override
	public boolean isReady() {
		return false; // is fired by activity directly
	}


}
