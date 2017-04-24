package algebra.impl.operation;

import org.eclipse.emf.ecore.InternalEObject;

import activitydiagram.Token;
import oabenchcase.algebra.impl.OabenchcaseAlgebraImpl;

public class ActivitydiagramForkedTokenOperationImpl extends ActivitydiagramTokenOperation
		implements algebra.operation.Activitydiagram$defaultForkedTokenOperation {

	private final activitydiagram.ForkedToken forkedlToken;
	private OabenchcaseAlgebraImpl alg;

	public ActivitydiagramForkedTokenOperationImpl(final activitydiagram.ForkedToken self,
			OabenchcaseAlgebraImpl algebra) {
		super(self, algebra);
		this.forkedlToken = self;
		this.alg = algebra;
	}

	@Override
	public void withdraw() {
		if (!this.alg.$(this.getBaseToken()).isWithdrawn()) {
			this.alg.$(this.getBaseToken()).withdraw();
		}
		if (this.forkedlToken.getRemainingOffersCount() > 0) {
			this.forkedlToken.setRemainingOffersCount(this.forkedlToken.getRemainingOffersCount() - 1);
		}
		if (this.forkedlToken.getRemainingOffersCount() == 0) {
			super.withdraw();
		}
	}

	private Token getBaseToken() {
		if (this.forkedlToken.getBaseToken() != null && this.forkedlToken.getBaseToken().eIsProxy()) {
			final InternalEObject oldBaseToken = (InternalEObject) this.forkedlToken.getBaseToken();

			// FIXME : differs from standard implementation
			if (this.forkedlToken.getBaseToken() != oldBaseToken) {

			}
		}
		return this.forkedlToken.getBaseToken();
	}

}
