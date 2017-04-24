package algebra.impl.operation;

import oabenchcase.algebra.impl.OabenchcaseAlgebraImpl;

public class ActivitydiagramControlTokenOperationImpl extends ActivitydiagramTokenOperation
		implements algebra.operation.Activitydiagram$defaultControlTokenOperation {

	private final activitydiagram.ControlToken self;

	public ActivitydiagramControlTokenOperationImpl(final activitydiagram.ControlToken self,
			OabenchcaseAlgebraImpl algebra) {
		super(self, algebra);
		this.self = self;
	}

}
