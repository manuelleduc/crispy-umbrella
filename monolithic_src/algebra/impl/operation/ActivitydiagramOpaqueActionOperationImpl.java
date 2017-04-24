package algebra.impl.operation;

import activitydiagram.Expression;
import oabenchcase.algebra.impl.OabenchcaseAlgebraImpl;

public class ActivitydiagramOpaqueActionOperationImpl extends ActivitydiagramActionOperationImpl
		implements algebra.operation.Activitydiagram$defaultOpaqueActionOperation {

	private final activitydiagram.OpaqueAction opaqueAction;
	private OabenchcaseAlgebraImpl alg;

	public ActivitydiagramOpaqueActionOperationImpl(final activitydiagram.OpaqueAction self,
			OabenchcaseAlgebraImpl algebra) {
		super(self, algebra);
		this.opaqueAction = self;
		this.alg = algebra;
	}

	@Override
	public void doAction() {
		for (final Expression e : this.opaqueAction.getExpressions()) {
			this.alg.$(e).execute();
		}

	}

}
