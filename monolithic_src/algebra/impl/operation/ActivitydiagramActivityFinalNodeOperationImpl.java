package algebra.impl.operation;

import java.util.List;

import activitydiagram.Token;
import oabenchcase.algebra.impl.OabenchcaseAlgebraImpl;

public class ActivitydiagramActivityFinalNodeOperationImpl extends ActivitydiagramFinalNodeOperation
		implements algebra.operation.Activitydiagram$defaultActivityFinalNodeOperation {

	private final activitydiagram.ActivityFinalNode activityFinalNode;
	private OabenchcaseAlgebraImpl alg;

	public ActivitydiagramActivityFinalNodeOperationImpl(final activitydiagram.ActivityFinalNode self,
			OabenchcaseAlgebraImpl algebra) {
		super(self, algebra);
		this.activityFinalNode = self;
		this.alg = algebra;
	}

	@Override
	public void fire(final List<Token> tokens) {
		this.alg.$(this.activityFinalNode.getActivity()).terminate();

	}

}
