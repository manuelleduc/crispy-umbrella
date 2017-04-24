package oabenchcase.algebra;

import activitydiagram.ActivityFinalNode;
import activitydiagram.ActivitydiagramPackage;

public interface OabenchcaseAlgebra<Activitydiagram__ActionT extends Activitydiagram__ExecutableNodeT, Activitydiagram__ActivityT extends Activitydiagram__NamedElementT, Activitydiagram__ActivityEdgeT extends Activitydiagram__NamedElementT, Activitydiagram__ActivityFinalNodeT extends Activitydiagram__FinalNodeT, Activitydiagram__ActivityNodeT extends Activitydiagram__NamedElementT, Activitydiagram__BooleanBinaryExpressionT extends Activitydiagram__BooleanExpressionT, Activitydiagram__BooleanExpressionT extends Activitydiagram__ExpressionT, Activitydiagram__BooleanUnaryExpressionT extends Activitydiagram__BooleanExpressionT, Activitydiagram__BooleanValueT extends Activitydiagram__ValueT, Activitydiagram__BooleanVariableT extends Activitydiagram__VariableT, Activitydiagram__ControlFlowT extends Activitydiagram__ActivityEdgeT, Activitydiagram__ControlNodeT extends Activitydiagram__ActivityNodeT, Activitydiagram__ControlTokenT extends Activitydiagram__TokenT, Activitydiagram__DecisionNodeT extends Activitydiagram__ControlNodeT, Activitydiagram__ExecutableNodeT extends Activitydiagram__ActivityNodeT, Activitydiagram__ExpressionT, Activitydiagram__FinalNodeT extends Activitydiagram__ControlNodeT, Activitydiagram__ForkNodeT extends Activitydiagram__ControlNodeT, Activitydiagram__ForkedTokenT extends Activitydiagram__TokenT, Activitydiagram__InitialNodeT extends Activitydiagram__ControlNodeT, Activitydiagram__InputT, Activitydiagram__InputValueT, Activitydiagram__IntegerCalculationExpressionT extends Activitydiagram__IntegerExpressionT, Activitydiagram__IntegerComparisonExpressionT extends Activitydiagram__IntegerExpressionT, Activitydiagram__IntegerExpressionT extends Activitydiagram__ExpressionT, Activitydiagram__IntegerValueT extends Activitydiagram__ValueT, Activitydiagram__IntegerVariableT extends Activitydiagram__VariableT, Activitydiagram__JoinNodeT extends Activitydiagram__ControlNodeT, Activitydiagram__MergeNodeT extends Activitydiagram__ControlNodeT, Activitydiagram__NamedElementT, Activitydiagram__OfferT, Activitydiagram__OpaqueActionT extends Activitydiagram__ActionT, Activitydiagram__TokenT, Activitydiagram__TraceT, Activitydiagram__ValueT, Activitydiagram__VariableT>
		extends
		algebra.ActivitydiagramAlgebra<Activitydiagram__ActionT, Activitydiagram__ActivityT, Activitydiagram__ActivityEdgeT, Activitydiagram__ActivityFinalNodeT, Activitydiagram__ActivityNodeT, Activitydiagram__BooleanBinaryExpressionT, Activitydiagram__BooleanExpressionT, Activitydiagram__BooleanUnaryExpressionT, Activitydiagram__BooleanValueT, Activitydiagram__BooleanVariableT, Activitydiagram__ControlFlowT, Activitydiagram__ControlNodeT, Activitydiagram__ControlTokenT, Activitydiagram__DecisionNodeT, Activitydiagram__ExecutableNodeT, Activitydiagram__ExpressionT, Activitydiagram__FinalNodeT, Activitydiagram__ForkNodeT, Activitydiagram__ForkedTokenT, Activitydiagram__InitialNodeT, Activitydiagram__InputT, Activitydiagram__InputValueT, Activitydiagram__IntegerCalculationExpressionT, Activitydiagram__IntegerComparisonExpressionT, Activitydiagram__IntegerExpressionT, Activitydiagram__IntegerValueT, Activitydiagram__IntegerVariableT, Activitydiagram__JoinNodeT, Activitydiagram__MergeNodeT, Activitydiagram__NamedElementT, Activitydiagram__OfferT, Activitydiagram__OpaqueActionT, Activitydiagram__TokenT, Activitydiagram__TraceT, Activitydiagram__ValueT, Activitydiagram__VariableT> {

	@Override
	default Activitydiagram__FinalNodeT $(final activitydiagram.FinalNode self) {
		if (self.eClass().getClassifierID() ==  ActivitydiagramPackage.ACTIVITY_FINAL_NODE)
			return activityFinalNode((activitydiagram.ActivityFinalNode) self);
		return null;
	}

	@Override
	default Activitydiagram__BooleanExpressionT $(final activitydiagram.BooleanExpression self) {
		if (self.eClass().getClassifierID() == ActivitydiagramPackage.BOOLEAN_UNARY_EXPRESSION)
			return booleanUnaryExpression((activitydiagram.BooleanUnaryExpression) self);
		if (self.eClass().getClassifierID() == ActivitydiagramPackage.BOOLEAN_BINARY_EXPRESSION) 
			return booleanBinaryExpression((activitydiagram.BooleanBinaryExpression) self);
		return null;
	}

	@Override
	default Activitydiagram__BooleanValueT $(final activitydiagram.BooleanValue self) {
		return booleanValue(self);
	}

	@Override
	default Activitydiagram__ControlTokenT $(final activitydiagram.ControlToken self) {
		return controlToken(self);
	}

	@Override
	default Activitydiagram__NamedElementT $(final activitydiagram.NamedElement self) {
		if (self.eClass().getClassifierID() == ActivitydiagramPackage.ACTIVITY) 
			return activity((activitydiagram.Activity) self);
		if (self.eClass().getClassifierID() == ActivitydiagramPackage.JOIN_NODE)
			return joinNode((activitydiagram.JoinNode) self);
		if (self.eClass().getClassifierID() == ActivitydiagramPackage.DECISION_NODE) 
			return decisionNode((activitydiagram.DecisionNode) self);
		if (self.eClass().getClassifierID() == ActivitydiagramPackage.FORK_NODE) 
			return forkNode((activitydiagram.ForkNode) self);
		if (self.eClass().getClassifierID() == ActivitydiagramPackage.MERGE_NODE)
			return mergeNode((activitydiagram.MergeNode) self);
		if (self.eClass().getClassifierID() == ActivitydiagramPackage.ACTIVITY_FINAL_NODE)
			return activityFinalNode((activitydiagram.ActivityFinalNode) self);
		if (self.eClass().getClassifierID() == ActivitydiagramPackage.OPAQUE_ACTION)
			return opaqueAction((activitydiagram.OpaqueAction) self);
		if (self.eClass().getClassifierID() == ActivitydiagramPackage.CONTROL_FLOW) 
			return controlFlow((activitydiagram.ControlFlow) self);
		if (self.eClass().getClassifierID() == ActivitydiagramPackage.INITIAL_NODE) 
			return initialNode((activitydiagram.InitialNode) self);
		return null;
	}

	@Override
	default Activitydiagram__InputT $(final activitydiagram.Input self) {
		return input(self);
	}

	@Override
	default Activitydiagram__ActivityT $(final activitydiagram.Activity self) {
		return activity(self);
	}

	@Override
	default Activitydiagram__ControlNodeT $(final activitydiagram.ControlNode self) {
		if (self.eClass().getClassifierID() == ActivitydiagramPackage.JOIN_NODE)
			return joinNode((activitydiagram.JoinNode) self);
		if (self.eClass().getClassifierID() == ActivitydiagramPackage.DECISION_NODE)
			return decisionNode((activitydiagram.DecisionNode) self);
		if (self.eClass().getClassifierID() == ActivitydiagramPackage.FORK_NODE)
			return forkNode((activitydiagram.ForkNode) self);
		if (self.eClass().getClassifierID() == ActivitydiagramPackage.MERGE_NODE)
			return mergeNode((activitydiagram.MergeNode) self);
		if (self.eClass().getClassifierID() == ActivitydiagramPackage.ACTIVITY_FINAL_NODE)
			return activityFinalNode((activitydiagram.ActivityFinalNode) self);
		if (self.eClass().getClassifierID() == ActivitydiagramPackage.INITIAL_NODE)
			return initialNode((activitydiagram.InitialNode) self);
		return null;
	}

	@Override
	default Activitydiagram__JoinNodeT $(final activitydiagram.JoinNode self) {
		return joinNode(self);
	}

	@Override
	default Activitydiagram__IntegerCalculationExpressionT $(final activitydiagram.IntegerCalculationExpression self) {
		return integerCalculationExpression(self);
	}

	@Override
	default Activitydiagram__ForkedTokenT $(final activitydiagram.ForkedToken self) {
		return forkedToken(self);
	}

	@Override
	default Activitydiagram__DecisionNodeT $(final activitydiagram.DecisionNode self) {
		return decisionNode(self);
	}

	@Override
	default Activitydiagram__IntegerVariableT $(final activitydiagram.IntegerVariable self) {
		return integerVariable(self);
	}

	@Override
	default Activitydiagram__ForkNodeT $(final activitydiagram.ForkNode self) {
		return forkNode(self);
	}

	@Override
	default Activitydiagram__IntegerComparisonExpressionT $(final activitydiagram.IntegerComparisonExpression self) {
		return integerComparisonExpression(self);
	}

	@Override
	default Activitydiagram__BooleanUnaryExpressionT $(final activitydiagram.BooleanUnaryExpression self) {
		return booleanUnaryExpression(self);
	}

	@Override
	default Activitydiagram__MergeNodeT $(final activitydiagram.MergeNode self) {
		return mergeNode(self);
	}

	@Override
	default Activitydiagram__ActionT $(final activitydiagram.Action self) {
		if (self.eClass().getClassifierID() == ActivitydiagramPackage.OPAQUE_ACTION)
			return opaqueAction((activitydiagram.OpaqueAction) self);
		return null;
	}

	@Override
	default Activitydiagram__ActivityFinalNodeT $(final ActivityFinalNode self) {
		return activityFinalNode(self);
	}

	@Override
	default Activitydiagram__VariableT $(final activitydiagram.Variable self) {
		if (self.eClass().getClassifierID() == ActivitydiagramPackage.INTEGER_VARIABLE) 
			return integerVariable((activitydiagram.IntegerVariable) self);
		if (self.eClass().getClassifierID() == ActivitydiagramPackage.BOOLEAN_VARIABLE) 
			return booleanVariable((activitydiagram.BooleanVariable) self);
		return null;
	}

	@Override
	default Activitydiagram__TokenT $(final activitydiagram.Token self) {
		if (self.eClass().getClassifierID() == ActivitydiagramPackage.CONTROL_TOKEN) 
			return controlToken((activitydiagram.ControlToken) self);
		if (self.eClass().getClassifierID() == ActivitydiagramPackage.FORKED_TOKEN) 
			return forkedToken((activitydiagram.ForkedToken) self);
		return null;
	}

	@Override
	default Activitydiagram__InputValueT $(final activitydiagram.InputValue self) {
		return inputValue(self);
	}

	@Override
	default Activitydiagram__ActivityNodeT $(final activitydiagram.ActivityNode self) {
		if (self.eClass().getClassifierID() == ActivitydiagramPackage.JOIN_NODE)
			return joinNode((activitydiagram.JoinNode) self);
		if (self.eClass().getClassifierID() == ActivitydiagramPackage.DECISION_NODE)
			return decisionNode((activitydiagram.DecisionNode) self);
		if (self.eClass().getClassifierID() == ActivitydiagramPackage.FORK_NODE)
			return forkNode((activitydiagram.ForkNode) self);
		if (self.eClass().getClassifierID() == ActivitydiagramPackage.MERGE_NODE) 
			return mergeNode((activitydiagram.MergeNode) self);
		if (self.eClass().getClassifierID() == ActivitydiagramPackage.ACTIVITY_FINAL_NODE)
			return activityFinalNode((activitydiagram.ActivityFinalNode) self);
		if (self.eClass().getClassifierID() == ActivitydiagramPackage.OPAQUE_ACTION) 
			return opaqueAction((activitydiagram.OpaqueAction) self);
		if (self.eClass().getClassifierID() == ActivitydiagramPackage.INITIAL_NODE)
			return initialNode((activitydiagram.InitialNode) self);
		return null;
	}

	@Override
	default Activitydiagram__BooleanVariableT $(final activitydiagram.BooleanVariable self) {
		return booleanVariable(self);
	}

	@Override
	default Activitydiagram__IntegerValueT $(final activitydiagram.IntegerValue self) {
		return integerValue(self);
	}

	@Override
	default Activitydiagram__ExpressionT $(final activitydiagram.Expression self) {
		if (self.eClass().getClassifierID() == ActivitydiagramPackage.INTEGER_CALCULATION_EXPRESSION) 
			return integerCalculationExpression((activitydiagram.IntegerCalculationExpression) self);
		if (self.eClass().getClassifierID() == ActivitydiagramPackage.INTEGER_COMPARISON_EXPRESSION)
			return integerComparisonExpression((activitydiagram.IntegerComparisonExpression) self);
		if (self.eClass().getClassifierID() == ActivitydiagramPackage.BOOLEAN_UNARY_EXPRESSION)
			return booleanUnaryExpression((activitydiagram.BooleanUnaryExpression) self);
		if (self.eClass().getClassifierID() == ActivitydiagramPackage.BOOLEAN_BINARY_EXPRESSION)
			return booleanBinaryExpression((activitydiagram.BooleanBinaryExpression) self);
		return null;
	}

	@Override
	default Activitydiagram__OfferT $(final activitydiagram.Offer self) {
		return offer(self);
	}

	@Override
	default Activitydiagram__ActivityEdgeT $(final activitydiagram.ActivityEdge self) {
		if (self.eClass().getClassifierID() == ActivitydiagramPackage.CONTROL_FLOW)
			return controlFlow((activitydiagram.ControlFlow) self);
		return null;
	}

	@Override
	default Activitydiagram__ValueT $(final activitydiagram.Value self) {
		if (self.eClass().getClassifierID() == ActivitydiagramPackage.BOOLEAN_VALUE) 
			return booleanValue((activitydiagram.BooleanValue) self);
		if (self.eClass().getClassifierID() == ActivitydiagramPackage.INTEGER_VALUE)
			return integerValue((activitydiagram.IntegerValue) self);
		return null;
	}

	@Override
	default Activitydiagram__BooleanBinaryExpressionT $(final activitydiagram.BooleanBinaryExpression self) {
		return booleanBinaryExpression(self);
	}

	@Override
	default Activitydiagram__TraceT $(final activitydiagram.Trace self) {
		return trace(self);
	}

	@Override
	default Activitydiagram__IntegerExpressionT $(final activitydiagram.IntegerExpression self) {
		if (self.eClass().getClassifierID() == ActivitydiagramPackage.INTEGER_CALCULATION_EXPRESSION)
			return integerCalculationExpression((activitydiagram.IntegerCalculationExpression) self);
		if (self.eClass().getClassifierID() == ActivitydiagramPackage.INTEGER_COMPARISON_EXPRESSION) 
			return integerComparisonExpression((activitydiagram.IntegerComparisonExpression) self);
		return null;
	}

	@Override
	default Activitydiagram__OpaqueActionT $(final activitydiagram.OpaqueAction self) {
		return opaqueAction(self);
	}

	@Override
	default Activitydiagram__ControlFlowT $(final activitydiagram.ControlFlow self) {
		return controlFlow(self);
	}

	@Override
	default Activitydiagram__InitialNodeT $(final activitydiagram.InitialNode self) {
		return initialNode(self);
	}

	@Override
	default Activitydiagram__ExecutableNodeT $(final activitydiagram.ExecutableNode self) {
		if (self.eClass().getClassifierID() == ActivitydiagramPackage.OPAQUE_ACTION)
			return opaqueAction((activitydiagram.OpaqueAction) self);
		return null;
	}

}
