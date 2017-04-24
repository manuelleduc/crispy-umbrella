package algebra.impl.operation;

import activitydiagram.ActivityEdge;
import oabenchcase.algebra.impl.OabenchcaseAlgebraImpl;

public class ActivitydiagramtMergeNodeOperation extends ActivitydiagramControlNodeOperationImpl
		implements algebra.operation.Activitydiagram$defaultMergeNodeOperation {

	private final activitydiagram.MergeNode mergeNode;
	private OabenchcaseAlgebraImpl alg;

	public ActivitydiagramtMergeNodeOperation(final activitydiagram.MergeNode self, OabenchcaseAlgebraImpl algebra) {
		super(self, algebra);
		this.mergeNode = self;
		this.alg = algebra;
	}

	@Override
	public boolean hasOffers() {
		for (final ActivityEdge edge : this.mergeNode.getIncoming()) {
			if (this.alg.$(edge).hasOffer()) {
				return true;
			}
		}
		return false;
	}

}
