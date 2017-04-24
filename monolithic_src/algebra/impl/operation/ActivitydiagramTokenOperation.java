package algebra.impl.operation;

import activitydiagram.ActivityNode;
import activitydiagram.Token;
import oabenchcase.algebra.impl.OabenchcaseAlgebraImpl;

public class ActivitydiagramTokenOperation
		implements algebra.operation.Activitydiagram$defaultTokenOperation {

	private final activitydiagram.Token token;
	private OabenchcaseAlgebraImpl alg;

	public ActivitydiagramTokenOperation(final activitydiagram.Token self, OabenchcaseAlgebraImpl algebra) {
		this.token = self;
		this.alg = algebra;
	}

	@Override
	public void withdraw() {
		if (!this.isWithdrawn()) {
			this.alg.$(this.token.getHolder()).removeToken(this.token);
			this.token.setHolder(null);
		}

	}

	@Override
	public boolean isWithdrawn() {
		return this.token.getHolder() == null;
	}

	@Override
	public Token transfer(final ActivityNode holder) {
		if (this.token.getHolder() != null) {
			this.withdraw();
		}
		this.token.setHolder(holder);
		return this.token;
	}

}
