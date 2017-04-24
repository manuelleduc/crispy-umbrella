package algebra.impl.operation;

import activitydiagram.ActivityEdge;
import oabenchcase.algebra.impl.OabenchcaseAlgebraImpl;

public class ActivitydiagramJoinNodeOperationImpl extends ActivitydiagramControlNodeOperationImpl
		implements algebra.operation.Activitydiagram$defaultJoinNodeOperation {

	private final activitydiagram.JoinNode joinNode;
	private OabenchcaseAlgebraImpl alg;

	public ActivitydiagramJoinNodeOperationImpl(final activitydiagram.JoinNode self, OabenchcaseAlgebraImpl algebra) {
		super(self, algebra);
		this.joinNode = self;
		this.alg = algebra;
	}

	@Override
	public boolean isReady() {
		boolean ready = true;
		for (final ActivityEdge edge : this.joinNode.getIncoming()) {
			if (!this.alg.$(edge).hasOffer()) {
				ready = false;
			}
		}
		return ready;

	}

}
