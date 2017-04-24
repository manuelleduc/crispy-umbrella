package activitydiagramoa.algebra;

import activitydiagramoa.ActivitydiagramoaPackage;

public interface ActivitydiagramoaAlgebra<Activitydiagramoa__ActionT  extends Activitydiagramoa__ExecutableNodeT ,Activitydiagramoa__ActivityT  extends Activitydiagramoa__NamedElementT ,Activitydiagramoa__ActivityEdgeT  extends Activitydiagramoa__NamedElementT ,Activitydiagramoa__ActivityFinalNodeT  extends Activitydiagramoa__FinalNodeT ,Activitydiagramoa__ActivityNodeT  extends Activitydiagramoa__NamedElementT ,Activitydiagramoa__BooleanBinaryExpressionT  extends Activitydiagramoa__BooleanExpressionT ,Activitydiagramoa__BooleanExpressionT  extends Activitydiagramoa__ExpressionT ,Activitydiagramoa__BooleanUnaryExpressionT  extends Activitydiagramoa__BooleanExpressionT ,Activitydiagramoa__BooleanValueT  extends Activitydiagramoa__ValueT ,Activitydiagramoa__BooleanVariableT  extends Activitydiagramoa__VariableT ,Activitydiagramoa__ControlFlowT  extends Activitydiagramoa__ActivityEdgeT ,Activitydiagramoa__ControlNodeT  extends Activitydiagramoa__ActivityNodeT ,Activitydiagramoa__DecisionNodeT  extends Activitydiagramoa__ControlNodeT ,Activitydiagramoa__ExecutableNodeT  extends Activitydiagramoa__ActivityNodeT ,Activitydiagramoa__ExpressionT ,Activitydiagramoa__FinalNodeT  extends Activitydiagramoa__ControlNodeT ,Activitydiagramoa__ForkNodeT  extends Activitydiagramoa__ControlNodeT ,Activitydiagramoa__InitialNodeT  extends Activitydiagramoa__ControlNodeT ,Activitydiagramoa__IntegerCalculationExpressionT  extends Activitydiagramoa__IntegerExpressionT ,Activitydiagramoa__IntegerComparisonExpressionT  extends Activitydiagramoa__IntegerExpressionT ,Activitydiagramoa__IntegerExpressionT  extends Activitydiagramoa__ExpressionT ,Activitydiagramoa__IntegerValueT  extends Activitydiagramoa__ValueT ,Activitydiagramoa__IntegerVariableT  extends Activitydiagramoa__VariableT ,Activitydiagramoa__JoinNodeT  extends Activitydiagramoa__ControlNodeT ,Activitydiagramoa__MergeNodeT  extends Activitydiagramoa__ControlNodeT ,Activitydiagramoa__NamedElementT ,Activitydiagramoa__OpaqueActionT  extends Activitydiagramoa__ActionT ,Activitydiagramoa__ValueT ,Activitydiagramoa__VariableT >
	 {
	Activitydiagramoa__ActivityT  activity(final activitydiagramoa.Activity activity);
	Activitydiagramoa__NamedElementT  namedElement_activity(final activitydiagramoa.Activity activity);
	
	Activitydiagramoa__ActivityFinalNodeT  activityFinalNode(final activitydiagramoa.ActivityFinalNode activityFinalNode);
	Activitydiagramoa__NamedElementT  namedElement_activityFinalNode(final activitydiagramoa.ActivityFinalNode activityFinalNode);
	Activitydiagramoa__FinalNodeT  finalNode_activityFinalNode(final activitydiagramoa.ActivityFinalNode activityFinalNode);
	Activitydiagramoa__ControlNodeT  controlNode_activityFinalNode(final activitydiagramoa.ActivityFinalNode activityFinalNode);
	Activitydiagramoa__ActivityNodeT  activityNode_activityFinalNode(final activitydiagramoa.ActivityFinalNode activityFinalNode);
	
	Activitydiagramoa__BooleanBinaryExpressionT  booleanBinaryExpression(final activitydiagramoa.BooleanBinaryExpression booleanBinaryExpression);
	Activitydiagramoa__ExpressionT  expression_booleanBinaryExpression(final activitydiagramoa.BooleanBinaryExpression booleanBinaryExpression);
	Activitydiagramoa__BooleanExpressionT  booleanExpression_booleanBinaryExpression(final activitydiagramoa.BooleanBinaryExpression booleanBinaryExpression);
	
	Activitydiagramoa__BooleanUnaryExpressionT  booleanUnaryExpression(final activitydiagramoa.BooleanUnaryExpression booleanUnaryExpression);
	Activitydiagramoa__ExpressionT  expression_booleanUnaryExpression(final activitydiagramoa.BooleanUnaryExpression booleanUnaryExpression);
	Activitydiagramoa__BooleanExpressionT  booleanExpression_booleanUnaryExpression(final activitydiagramoa.BooleanUnaryExpression booleanUnaryExpression);
	
	Activitydiagramoa__BooleanValueT  booleanValue(final activitydiagramoa.BooleanValue booleanValue);
	Activitydiagramoa__ValueT  value_booleanValue(final activitydiagramoa.BooleanValue booleanValue);
	
	Activitydiagramoa__BooleanVariableT  booleanVariable(final activitydiagramoa.BooleanVariable booleanVariable);
	Activitydiagramoa__VariableT  variable_booleanVariable(final activitydiagramoa.BooleanVariable booleanVariable);
	
	Activitydiagramoa__ControlFlowT  controlFlow(final activitydiagramoa.ControlFlow controlFlow);
	Activitydiagramoa__ActivityEdgeT  activityEdge_controlFlow(final activitydiagramoa.ControlFlow controlFlow);
	Activitydiagramoa__NamedElementT  namedElement_controlFlow(final activitydiagramoa.ControlFlow controlFlow);
	
	Activitydiagramoa__DecisionNodeT  decisionNode(final activitydiagramoa.DecisionNode decisionNode);
	Activitydiagramoa__NamedElementT  namedElement_decisionNode(final activitydiagramoa.DecisionNode decisionNode);
	Activitydiagramoa__ControlNodeT  controlNode_decisionNode(final activitydiagramoa.DecisionNode decisionNode);
	Activitydiagramoa__ActivityNodeT  activityNode_decisionNode(final activitydiagramoa.DecisionNode decisionNode);
	
	Activitydiagramoa__ForkNodeT  forkNode(final activitydiagramoa.ForkNode forkNode);
	Activitydiagramoa__NamedElementT  namedElement_forkNode(final activitydiagramoa.ForkNode forkNode);
	Activitydiagramoa__ControlNodeT  controlNode_forkNode(final activitydiagramoa.ForkNode forkNode);
	Activitydiagramoa__ActivityNodeT  activityNode_forkNode(final activitydiagramoa.ForkNode forkNode);
	
	Activitydiagramoa__InitialNodeT  initialNode(final activitydiagramoa.InitialNode initialNode);
	Activitydiagramoa__NamedElementT  namedElement_initialNode(final activitydiagramoa.InitialNode initialNode);
	Activitydiagramoa__ControlNodeT  controlNode_initialNode(final activitydiagramoa.InitialNode initialNode);
	Activitydiagramoa__ActivityNodeT  activityNode_initialNode(final activitydiagramoa.InitialNode initialNode);
	
	Activitydiagramoa__IntegerCalculationExpressionT  integerCalculationExpression(final activitydiagramoa.IntegerCalculationExpression integerCalculationExpression);
	Activitydiagramoa__ExpressionT  expression_integerCalculationExpression(final activitydiagramoa.IntegerCalculationExpression integerCalculationExpression);
	Activitydiagramoa__IntegerExpressionT  integerExpression_integerCalculationExpression(final activitydiagramoa.IntegerCalculationExpression integerCalculationExpression);
	
	Activitydiagramoa__IntegerComparisonExpressionT  integerComparisonExpression(final activitydiagramoa.IntegerComparisonExpression integerComparisonExpression);
	Activitydiagramoa__ExpressionT  expression_integerComparisonExpression(final activitydiagramoa.IntegerComparisonExpression integerComparisonExpression);
	Activitydiagramoa__IntegerExpressionT  integerExpression_integerComparisonExpression(final activitydiagramoa.IntegerComparisonExpression integerComparisonExpression);
	
	Activitydiagramoa__IntegerValueT  integerValue(final activitydiagramoa.IntegerValue integerValue);
	Activitydiagramoa__ValueT  value_integerValue(final activitydiagramoa.IntegerValue integerValue);
	
	Activitydiagramoa__IntegerVariableT  integerVariable(final activitydiagramoa.IntegerVariable integerVariable);
	Activitydiagramoa__VariableT  variable_integerVariable(final activitydiagramoa.IntegerVariable integerVariable);
	
	Activitydiagramoa__JoinNodeT  joinNode(final activitydiagramoa.JoinNode joinNode);
	Activitydiagramoa__NamedElementT  namedElement_joinNode(final activitydiagramoa.JoinNode joinNode);
	Activitydiagramoa__ControlNodeT  controlNode_joinNode(final activitydiagramoa.JoinNode joinNode);
	Activitydiagramoa__ActivityNodeT  activityNode_joinNode(final activitydiagramoa.JoinNode joinNode);
	
	Activitydiagramoa__MergeNodeT  mergeNode(final activitydiagramoa.MergeNode mergeNode);
	Activitydiagramoa__NamedElementT  namedElement_mergeNode(final activitydiagramoa.MergeNode mergeNode);
	Activitydiagramoa__ControlNodeT  controlNode_mergeNode(final activitydiagramoa.MergeNode mergeNode);
	Activitydiagramoa__ActivityNodeT  activityNode_mergeNode(final activitydiagramoa.MergeNode mergeNode);
	
	Activitydiagramoa__OpaqueActionT  opaqueAction(final activitydiagramoa.OpaqueAction opaqueAction);
	Activitydiagramoa__ExecutableNodeT  executableNode_opaqueAction(final activitydiagramoa.OpaqueAction opaqueAction);
	Activitydiagramoa__NamedElementT  namedElement_opaqueAction(final activitydiagramoa.OpaqueAction opaqueAction);
	Activitydiagramoa__ActionT  action_opaqueAction(final activitydiagramoa.OpaqueAction opaqueAction);
	Activitydiagramoa__ActivityNodeT  activityNode_opaqueAction(final activitydiagramoa.OpaqueAction opaqueAction);
	
	
	default Activitydiagramoa__ActionT  $(final activitydiagramoa.Action self) {
		if(self.eClass().getClassifierID() == ActivitydiagramoaPackage.OPAQUE_ACTION) return opaqueAction((activitydiagramoa.OpaqueAction) self);
		return null;
	}
	default Activitydiagramoa__ValueT  $(final activitydiagramoa.Value self) {
		if(self.eClass().getClassifierID() == ActivitydiagramoaPackage.INTEGER_VALUE) return integerValue((activitydiagramoa.IntegerValue) self);
		if(self.eClass().getClassifierID() == ActivitydiagramoaPackage.BOOLEAN_VALUE) return booleanValue((activitydiagramoa.BooleanValue) self);
		return null;
	}
	default Activitydiagramoa__ControlNodeT  $(final activitydiagramoa.ControlNode self) {
		if(self.eClass().getClassifierID() == ActivitydiagramoaPackage.FORK_NODE) return forkNode((activitydiagramoa.ForkNode) self);
		if(self.eClass().getClassifierID() == ActivitydiagramoaPackage.MERGE_NODE) return mergeNode((activitydiagramoa.MergeNode) self);
		if(self.eClass().getClassifierID() == ActivitydiagramoaPackage.DECISION_NODE) return decisionNode((activitydiagramoa.DecisionNode) self);
		if(self.eClass().getClassifierID() == ActivitydiagramoaPackage.JOIN_NODE) return joinNode((activitydiagramoa.JoinNode) self);
		if(self.eClass().getClassifierID() == ActivitydiagramoaPackage.ACTIVITY_FINAL_NODE) return activityFinalNode((activitydiagramoa.ActivityFinalNode) self);
		if(self.eClass().getClassifierID() == ActivitydiagramoaPackage.INITIAL_NODE) return initialNode((activitydiagramoa.InitialNode) self);
		return null;
	}
	default Activitydiagramoa__BooleanVariableT  $(final activitydiagramoa.BooleanVariable self) {
		return booleanVariable(self);
	}
	default Activitydiagramoa__BooleanExpressionT  $(final activitydiagramoa.BooleanExpression self) {
		if(self.eClass().getClassifierID() == ActivitydiagramoaPackage.BOOLEAN_UNARY_EXPRESSION) return booleanUnaryExpression((activitydiagramoa.BooleanUnaryExpression) self);
		if(self.eClass().getClassifierID() == ActivitydiagramoaPackage.BOOLEAN_BINARY_EXPRESSION) return booleanBinaryExpression((activitydiagramoa.BooleanBinaryExpression) self);
		return null;
	}
	default Activitydiagramoa__ForkNodeT  $(final activitydiagramoa.ForkNode self) {
		return forkNode(self);
	}
	default Activitydiagramoa__MergeNodeT  $(final activitydiagramoa.MergeNode self) {
		return mergeNode(self);
	}
	default Activitydiagramoa__DecisionNodeT  $(final activitydiagramoa.DecisionNode self) {
		return decisionNode(self);
	}
	default Activitydiagramoa__OpaqueActionT  $(final activitydiagramoa.OpaqueAction self) {
		return opaqueAction(self);
	}
	default Activitydiagramoa__IntegerVariableT  $(final activitydiagramoa.IntegerVariable self) {
		return integerVariable(self);
	}
	default Activitydiagramoa__ActivityEdgeT  $(final activitydiagramoa.ActivityEdge self) {
		if(self.eClass().getClassifierID() == ActivitydiagramoaPackage.CONTROL_FLOW) return controlFlow((activitydiagramoa.ControlFlow) self);
		return null;
	}
	default Activitydiagramoa__IntegerCalculationExpressionT  $(final activitydiagramoa.IntegerCalculationExpression self) {
		return integerCalculationExpression(self);
	}
	default Activitydiagramoa__IntegerComparisonExpressionT  $(final activitydiagramoa.IntegerComparisonExpression self) {
		return integerComparisonExpression(self);
	}
	default Activitydiagramoa__ExecutableNodeT  $(final activitydiagramoa.ExecutableNode self) {
		if(self.eClass().getClassifierID() == ActivitydiagramoaPackage.OPAQUE_ACTION) return opaqueAction((activitydiagramoa.OpaqueAction) self);
		return null;
	}
	default Activitydiagramoa__NamedElementT  $(final activitydiagramoa.NamedElement self) {
		if(self.eClass().getClassifierID() == ActivitydiagramoaPackage.FORK_NODE) return forkNode((activitydiagramoa.ForkNode) self);
		if(self.eClass().getClassifierID() == ActivitydiagramoaPackage.MERGE_NODE) return mergeNode((activitydiagramoa.MergeNode) self);
		if(self.eClass().getClassifierID() == ActivitydiagramoaPackage.DECISION_NODE) return decisionNode((activitydiagramoa.DecisionNode) self);
		if(self.eClass().getClassifierID() == ActivitydiagramoaPackage.OPAQUE_ACTION) return opaqueAction((activitydiagramoa.OpaqueAction) self);
		if(self.eClass().getClassifierID() == ActivitydiagramoaPackage.CONTROL_FLOW) return controlFlow((activitydiagramoa.ControlFlow) self);
		if(self.eClass().getClassifierID() == ActivitydiagramoaPackage.JOIN_NODE) return joinNode((activitydiagramoa.JoinNode) self);
		if(self.eClass().getClassifierID() == ActivitydiagramoaPackage.ACTIVITY_FINAL_NODE) return activityFinalNode((activitydiagramoa.ActivityFinalNode) self);
		if(self.eClass().getClassifierID() == ActivitydiagramoaPackage.ACTIVITY) return activity((activitydiagramoa.Activity) self);
		if(self.eClass().getClassifierID() == ActivitydiagramoaPackage.INITIAL_NODE) return initialNode((activitydiagramoa.InitialNode) self);
		return null;
	}
	default Activitydiagramoa__VariableT  $(final activitydiagramoa.Variable self) {
		if(self.eClass().getClassifierID() == ActivitydiagramoaPackage.BOOLEAN_VARIABLE) return booleanVariable((activitydiagramoa.BooleanVariable) self);
		if(self.eClass().getClassifierID() == ActivitydiagramoaPackage.INTEGER_VARIABLE) return integerVariable((activitydiagramoa.IntegerVariable) self);
		return null;
	}
	default Activitydiagramoa__ControlFlowT  $(final activitydiagramoa.ControlFlow self) {
		return controlFlow(self);
	}
	default Activitydiagramoa__ActivityNodeT  $(final activitydiagramoa.ActivityNode self) {
		if(self.eClass().getClassifierID() == ActivitydiagramoaPackage.FORK_NODE) return forkNode((activitydiagramoa.ForkNode) self);
		if(self.eClass().getClassifierID() == ActivitydiagramoaPackage.MERGE_NODE) return mergeNode((activitydiagramoa.MergeNode) self);
		if(self.eClass().getClassifierID() == ActivitydiagramoaPackage.DECISION_NODE) return decisionNode((activitydiagramoa.DecisionNode) self);
		if(self.eClass().getClassifierID() == ActivitydiagramoaPackage.JOIN_NODE) return joinNode((activitydiagramoa.JoinNode) self);
		if(self.eClass().getClassifierID() == ActivitydiagramoaPackage.ACTIVITY_FINAL_NODE) return activityFinalNode((activitydiagramoa.ActivityFinalNode) self);
		if(self.eClass().getClassifierID() == ActivitydiagramoaPackage.OPAQUE_ACTION) return opaqueAction((activitydiagramoa.OpaqueAction) self);
		if(self.eClass().getClassifierID() == ActivitydiagramoaPackage.INITIAL_NODE) return initialNode((activitydiagramoa.InitialNode) self);
		return null;
	}
	default Activitydiagramoa__JoinNodeT  $(final activitydiagramoa.JoinNode self) {
		return joinNode(self);
	}
	default Activitydiagramoa__BooleanUnaryExpressionT  $(final activitydiagramoa.BooleanUnaryExpression self) {
		return booleanUnaryExpression(self);
	}
	default Activitydiagramoa__FinalNodeT  $(final activitydiagramoa.FinalNode self) {
		if(self.eClass().getClassifierID() == ActivitydiagramoaPackage.ACTIVITY_FINAL_NODE) return activityFinalNode((activitydiagramoa.ActivityFinalNode) self);
		return null;
	}
	default Activitydiagramoa__ActivityFinalNodeT  $(final activitydiagramoa.ActivityFinalNode self) {
		return activityFinalNode(self);
	}
	default Activitydiagramoa__ActivityT  $(final activitydiagramoa.Activity self) {
		return activity(self);
	}
	default Activitydiagramoa__IntegerValueT  $(final activitydiagramoa.IntegerValue self) {
		return integerValue(self);
	}
	default Activitydiagramoa__IntegerExpressionT  $(final activitydiagramoa.IntegerExpression self) {
		if(self.eClass().getClassifierID() == ActivitydiagramoaPackage.INTEGER_CALCULATION_EXPRESSION) return integerCalculationExpression((activitydiagramoa.IntegerCalculationExpression) self);
		if(self.eClass().getClassifierID() == ActivitydiagramoaPackage.INTEGER_COMPARISON_EXPRESSION) return integerComparisonExpression((activitydiagramoa.IntegerComparisonExpression) self);
		return null;
	}
	default Activitydiagramoa__BooleanBinaryExpressionT  $(final activitydiagramoa.BooleanBinaryExpression self) {
		return booleanBinaryExpression(self);
	}
	
	
	default Activitydiagramoa__ExpressionT  $(final activitydiagramoa.Expression self) {
		if(self.eClass().getClassifierID() == ActivitydiagramoaPackage.INTEGER_CALCULATION_EXPRESSION) return integerCalculationExpression((activitydiagramoa.IntegerCalculationExpression) self);
		if(self.eClass().getClassifierID() == ActivitydiagramoaPackage.INTEGER_COMPARISON_EXPRESSION) return integerComparisonExpression((activitydiagramoa.IntegerComparisonExpression) self);
		if(self.eClass().getClassifierID() == ActivitydiagramoaPackage.BOOLEAN_UNARY_EXPRESSION) return booleanUnaryExpression((activitydiagramoa.BooleanUnaryExpression) self);
		if(self.eClass().getClassifierID() == ActivitydiagramoaPackage.BOOLEAN_BINARY_EXPRESSION) return booleanBinaryExpression((activitydiagramoa.BooleanBinaryExpression) self);
		return null;
	}
	default Activitydiagramoa__InitialNodeT  $(final activitydiagramoa.InitialNode self) {
		return initialNode(self);
	}
	default Activitydiagramoa__BooleanValueT  $(final activitydiagramoa.BooleanValue self) {
		return booleanValue(self);
	}
	
}
