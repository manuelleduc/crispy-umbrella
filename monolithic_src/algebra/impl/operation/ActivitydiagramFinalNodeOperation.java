package algebra.impl.operation;

import oabenchcase.algebra.impl.OabenchcaseAlgebraImpl;

public abstract class ActivitydiagramFinalNodeOperation extends ActivitydiagramControlNodeOperationImpl
		implements algebra.operation.Activitydiagram$defaultFinalNodeOperation {

	private final activitydiagram.FinalNode self;

	public ActivitydiagramFinalNodeOperation(final activitydiagram.FinalNode self, OabenchcaseAlgebraImpl algebra) {
		super(self, algebra);
		this.self = self;
	}

}
