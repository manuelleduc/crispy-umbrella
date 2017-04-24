package algebra.impl.operation;

import oabenchcase.algebra.impl.OabenchcaseAlgebraImpl;

public class ActivitydiagramControlFlowOperationImpl extends ActivitydiagramActivityEdgeOperationImpl
		implements algebra.operation.Activitydiagram$defaultControlFlowOperation {

	private final activitydiagram.ControlFlow self;

	public ActivitydiagramControlFlowOperationImpl(final activitydiagram.ControlFlow self,
			OabenchcaseAlgebraImpl algebra) {
		super(self, algebra);
		this.self = self;
	}

}
