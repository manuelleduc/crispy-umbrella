package algebra.impl.operation;

import java.util.List;

import activitydiagram.Token;
import oabenchcase.algebra.impl.OabenchcaseAlgebraImpl;

public class ActivitydiagramControlNodeOperationImpl extends ActivitydiagramActivityNodeOperationImpl
		implements algebra.operation.Activitydiagram$defaultControlNodeOperation {

	private final activitydiagram.ControlNode self;

	public ActivitydiagramControlNodeOperationImpl(final activitydiagram.ControlNode self,
			OabenchcaseAlgebraImpl algebra) {
		super(self, algebra);
		this.self = self;
	}

	@Override
	public void fire(List<Token> tokens) {
		this.addTokens(tokens);
		this.sendOffers(tokens);

	}

	@Override
	public boolean isReady() {
		return super.isReady() && this.hasOffers();
	}

}
