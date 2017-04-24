package algebra.impl.operation;

import oabenchcase.algebra.impl.OabenchcaseAlgebraImpl;

public abstract class ActivitydiagramtExecutableNodeOperationImpl extends ActivitydiagramActivityNodeOperationImpl
		implements algebra.operation.Activitydiagram$defaultExecutableNodeOperation {

	private final activitydiagram.ExecutableNode self;
	private OabenchcaseAlgebraImpl alg;

	public ActivitydiagramtExecutableNodeOperationImpl(final activitydiagram.ExecutableNode self,
			OabenchcaseAlgebraImpl algebra) {
		super(self, algebra);
		this.self = self;
		this.alg = algebra;
	}

}
