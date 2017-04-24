package algebra.impl.operation;

import java.util.List;

import activitydiagram.ActivityEdge;
import activitydiagram.BooleanValue;
import activitydiagram.ControlFlow;
import activitydiagram.Token;
import activitydiagram.Value;
import oabenchcase.algebra.impl.OabenchcaseAlgebraImpl;

public class ActivitydiagramDecisionNodeOperationImpl extends ActivitydiagramControlNodeOperationImpl
		implements algebra.operation.Activitydiagram$defaultDecisionNodeOperation {

	private final activitydiagram.DecisionNode decisionNode;
	private OabenchcaseAlgebraImpl alg;

	public ActivitydiagramDecisionNodeOperationImpl(final activitydiagram.DecisionNode self,
			OabenchcaseAlgebraImpl algebra) {
		super(self, algebra);
		this.decisionNode = self;
		this.alg = algebra;
	}

	@Override
	public void fire(final List<Token> tokens) {
		ActivityEdge selectedEdge = null;
		for (final ActivityEdge edge : this.decisionNode.getOutgoing()) {
			if (edge instanceof ControlFlow) {
				final ControlFlow controlFlow = (ControlFlow) edge;
				final Value guardValue = controlFlow.getGuard().getCurrentValue();
				if (guardValue instanceof BooleanValue) {
					final BooleanValue booleanValue = (BooleanValue) guardValue;
					if (booleanValue.isValue()) {
						selectedEdge = edge;
						break;
					}
				}
			}
		}

		if (selectedEdge != null) {
			this.addTokens(tokens);
			this.alg.$(selectedEdge).sendOffer(tokens);
		}

	}

	@Override
	public boolean isReady() {
		boolean ready = true;
		for (final ActivityEdge edge : this.decisionNode.getIncoming()) {
			if (!this.alg.$(edge).hasOffer()) {
				ready = false;
			}
		}
		return ready;
	}

}
