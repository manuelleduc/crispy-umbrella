		package activitydiagram.algebra;

import activitydiagram.ActivitydiagramPackage;
import activitydiagramoa.ActivitydiagramoaPackage;

public interface ActivitydiagramAlgebra<Activitydiagramoa__ActionT  extends Activitydiagramoa__ExecutableNodeT ,Activitydiagram__Action_AspectT ,Activitydiagramoa__ActivityT  extends Activitydiagramoa__NamedElementT ,Activitydiagramoa__ActivityEdgeT  extends Activitydiagramoa__NamedElementT ,Activitydiagram__ActivityEdge_AspectT  extends Activitydiagramoa__ActivityEdgeT ,Activitydiagramoa__ActivityFinalNodeT  extends Activitydiagramoa__FinalNodeT ,Activitydiagram__ActivityFinalNode_AspectT ,Activitydiagramoa__ActivityNodeT  extends Activitydiagramoa__NamedElementT ,Activitydiagram__ActivityNode_AspectT  extends Activitydiagramoa__ActivityNodeT ,Activitydiagram__Activity_AspectT  extends Activitydiagramoa__ActivityT ,Activitydiagramoa__BooleanBinaryExpressionT  extends Activitydiagramoa__BooleanExpressionT ,Activitydiagram__BooleanBinaryExpression_AspectT ,Activitydiagramoa__BooleanExpressionT  extends Activitydiagramoa__ExpressionT ,Activitydiagram__BooleanExpression_AspectT ,Activitydiagramoa__BooleanUnaryExpressionT  extends Activitydiagramoa__BooleanExpressionT ,Activitydiagram__BooleanUnaryExpression_AspectT ,Activitydiagramoa__BooleanValueT  extends Activitydiagramoa__ValueT ,Activitydiagramoa__BooleanVariableT  extends Activitydiagramoa__VariableT ,Activitydiagram__BooleanVariable_AspectT ,Activitydiagramoa__ControlFlowT  extends Activitydiagramoa__ActivityEdgeT ,Activitydiagram__ControlFlow_AspectT ,Activitydiagramoa__ControlNodeT  extends Activitydiagramoa__ActivityNodeT ,Activitydiagram__ControlNode_AspectT ,Activitydiagram__ControlTokenT  extends Activitydiagram__TokenT ,Activitydiagramoa__DecisionNodeT  extends Activitydiagramoa__ControlNodeT ,Activitydiagram__DecisionNode_AspectT ,Activitydiagramoa__ExecutableNodeT  extends Activitydiagramoa__ActivityNodeT ,Activitydiagram__ExecutableNode_AspectT ,Activitydiagramoa__ExpressionT ,Activitydiagram__Expression_AspectT  extends Activitydiagramoa__ExpressionT ,Activitydiagramoa__FinalNodeT  extends Activitydiagramoa__ControlNodeT ,Activitydiagram__FinalNode_AspectT ,Activitydiagramoa__ForkNodeT  extends Activitydiagramoa__ControlNodeT ,Activitydiagram__ForkNode_AspectT ,Activitydiagram__ForkedTokenT  extends Activitydiagram__TokenT ,Activitydiagramoa__InitialNodeT  extends Activitydiagramoa__ControlNodeT ,Activitydiagram__InitialNode_AspectT ,Activitydiagram__InputT ,Activitydiagram__InputValueT ,Activitydiagramoa__IntegerCalculationExpressionT  extends Activitydiagramoa__IntegerExpressionT ,Activitydiagram__IntegerCalculationExpression_AspectT ,Activitydiagramoa__IntegerComparisonExpressionT  extends Activitydiagramoa__IntegerExpressionT ,Activitydiagram__IntegerComparisonExpression_AspectT ,Activitydiagramoa__IntegerExpressionT  extends Activitydiagramoa__ExpressionT ,Activitydiagram__IntegerExpression_AspectT ,Activitydiagramoa__IntegerValueT  extends Activitydiagramoa__ValueT ,Activitydiagramoa__IntegerVariableT  extends Activitydiagramoa__VariableT ,Activitydiagram__IntegerVariable_AspectT ,Activitydiagramoa__JoinNodeT  extends Activitydiagramoa__ControlNodeT ,Activitydiagram__JoinNode_AspectT ,Activitydiagramoa__MergeNodeT  extends Activitydiagramoa__ControlNodeT ,Activitydiagram__MergeNode_AspectT ,Activitydiagramoa__NamedElementT ,Activitydiagram__OfferT ,Activitydiagramoa__OpaqueActionT  extends Activitydiagramoa__ActionT ,Activitydiagram__OpaqueAction_AspectT ,Activitydiagram__TokenT ,Activitydiagram__TraceT ,Activitydiagramoa__ValueT ,Activitydiagramoa__VariableT ,Activitydiagram__Variable_AspectT  extends Activitydiagramoa__VariableT >
	 extends activitydiagramoa.algebra.ActivitydiagramoaAlgebra<Activitydiagramoa__ActionT , Activitydiagramoa__ActivityT , Activitydiagramoa__ActivityEdgeT , Activitydiagramoa__ActivityFinalNodeT , Activitydiagramoa__ActivityNodeT , Activitydiagramoa__BooleanBinaryExpressionT , Activitydiagramoa__BooleanExpressionT , Activitydiagramoa__BooleanUnaryExpressionT , Activitydiagramoa__BooleanValueT , Activitydiagramoa__BooleanVariableT , Activitydiagramoa__ControlFlowT , Activitydiagramoa__ControlNodeT , Activitydiagramoa__DecisionNodeT , Activitydiagramoa__ExecutableNodeT , Activitydiagramoa__ExpressionT , Activitydiagramoa__FinalNodeT , Activitydiagramoa__ForkNodeT , Activitydiagramoa__InitialNodeT , Activitydiagramoa__IntegerCalculationExpressionT , Activitydiagramoa__IntegerComparisonExpressionT , Activitydiagramoa__IntegerExpressionT , Activitydiagramoa__IntegerValueT , Activitydiagramoa__IntegerVariableT , Activitydiagramoa__JoinNodeT , Activitydiagramoa__MergeNodeT , Activitydiagramoa__NamedElementT , Activitydiagramoa__OpaqueActionT , Activitydiagramoa__ValueT , Activitydiagramoa__VariableT > {
	Activitydiagram__Action_AspectT  action_Aspect(final activitydiagram.Action_Aspect action_Aspect);
	Activitydiagramoa__ExecutableNodeT  executableNode_action_Aspect(final activitydiagram.Action_Aspect action_Aspect);
	Activitydiagramoa__NamedElementT  namedElement_action_Aspect(final activitydiagram.Action_Aspect action_Aspect);
	Activitydiagramoa__ActionT  action_action_Aspect(final activitydiagram.Action_Aspect action_Aspect);
	Activitydiagram__ExecutableNode_AspectT  executableNode_Aspect_action_Aspect(final activitydiagram.Action_Aspect action_Aspect);
	Activitydiagramoa__ActivityNodeT  activityNode_action_Aspect(final activitydiagram.Action_Aspect action_Aspect);
	Activitydiagram__ActivityNode_AspectT  activityNode_Aspect_action_Aspect(final activitydiagram.Action_Aspect action_Aspect);
	
	Activitydiagram__ActivityEdge_AspectT  activityEdge_Aspect(final activitydiagram.ActivityEdge_Aspect activityEdge_Aspect);
	Activitydiagramoa__ActivityEdgeT  activityEdge_activityEdge_Aspect(final activitydiagram.ActivityEdge_Aspect activityEdge_Aspect);
	Activitydiagramoa__NamedElementT  namedElement_activityEdge_Aspect(final activitydiagram.ActivityEdge_Aspect activityEdge_Aspect);
	
	Activitydiagram__ActivityFinalNode_AspectT  activityFinalNode_Aspect(final activitydiagram.ActivityFinalNode_Aspect activityFinalNode_Aspect);
	Activitydiagramoa__NamedElementT  namedElement_activityFinalNode_Aspect(final activitydiagram.ActivityFinalNode_Aspect activityFinalNode_Aspect);
	Activitydiagramoa__ControlNodeT  controlNode_activityFinalNode_Aspect(final activitydiagram.ActivityFinalNode_Aspect activityFinalNode_Aspect);
	Activitydiagramoa__ActivityNodeT  activityNode_activityFinalNode_Aspect(final activitydiagram.ActivityFinalNode_Aspect activityFinalNode_Aspect);
	Activitydiagram__ControlNode_AspectT  controlNode_Aspect_activityFinalNode_Aspect(final activitydiagram.ActivityFinalNode_Aspect activityFinalNode_Aspect);
	Activitydiagram__FinalNode_AspectT  finalNode_Aspect_activityFinalNode_Aspect(final activitydiagram.ActivityFinalNode_Aspect activityFinalNode_Aspect);
	Activitydiagramoa__FinalNodeT  finalNode_activityFinalNode_Aspect(final activitydiagram.ActivityFinalNode_Aspect activityFinalNode_Aspect);
	Activitydiagramoa__ActivityFinalNodeT  activityFinalNode_activityFinalNode_Aspect(final activitydiagram.ActivityFinalNode_Aspect activityFinalNode_Aspect);
	Activitydiagram__ActivityNode_AspectT  activityNode_Aspect_activityFinalNode_Aspect(final activitydiagram.ActivityFinalNode_Aspect activityFinalNode_Aspect);
	
	Activitydiagram__ActivityNode_AspectT  activityNode_Aspect(final activitydiagram.ActivityNode_Aspect activityNode_Aspect);
	Activitydiagramoa__NamedElementT  namedElement_activityNode_Aspect(final activitydiagram.ActivityNode_Aspect activityNode_Aspect);
	Activitydiagramoa__ActivityNodeT  activityNode_activityNode_Aspect(final activitydiagram.ActivityNode_Aspect activityNode_Aspect);
	
	Activitydiagram__Activity_AspectT  activity_Aspect(final activitydiagram.Activity_Aspect activity_Aspect);
	Activitydiagramoa__ActivityT  activity_activity_Aspect(final activitydiagram.Activity_Aspect activity_Aspect);
	Activitydiagramoa__NamedElementT  namedElement_activity_Aspect(final activitydiagram.Activity_Aspect activity_Aspect);
	
	Activitydiagram__BooleanBinaryExpression_AspectT  booleanBinaryExpression_Aspect(final activitydiagram.BooleanBinaryExpression_Aspect booleanBinaryExpression_Aspect);
	Activitydiagram__BooleanExpression_AspectT  booleanExpression_Aspect_booleanBinaryExpression_Aspect(final activitydiagram.BooleanBinaryExpression_Aspect booleanBinaryExpression_Aspect);
	Activitydiagramoa__BooleanBinaryExpressionT  booleanBinaryExpression_booleanBinaryExpression_Aspect(final activitydiagram.BooleanBinaryExpression_Aspect booleanBinaryExpression_Aspect);
	Activitydiagramoa__BooleanExpressionT  booleanExpression_booleanBinaryExpression_Aspect(final activitydiagram.BooleanBinaryExpression_Aspect booleanBinaryExpression_Aspect);
	Activitydiagramoa__ExpressionT  expression_booleanBinaryExpression_Aspect(final activitydiagram.BooleanBinaryExpression_Aspect booleanBinaryExpression_Aspect);
	Activitydiagram__Expression_AspectT  expression_Aspect_booleanBinaryExpression_Aspect(final activitydiagram.BooleanBinaryExpression_Aspect booleanBinaryExpression_Aspect);
	
	Activitydiagram__BooleanExpression_AspectT  booleanExpression_Aspect(final activitydiagram.BooleanExpression_Aspect booleanExpression_Aspect);
	Activitydiagramoa__ExpressionT  expression_booleanExpression_Aspect(final activitydiagram.BooleanExpression_Aspect booleanExpression_Aspect);
	Activitydiagram__Expression_AspectT  expression_Aspect_booleanExpression_Aspect(final activitydiagram.BooleanExpression_Aspect booleanExpression_Aspect);
	Activitydiagramoa__BooleanExpressionT  booleanExpression_booleanExpression_Aspect(final activitydiagram.BooleanExpression_Aspect booleanExpression_Aspect);
	
	Activitydiagram__BooleanUnaryExpression_AspectT  booleanUnaryExpression_Aspect(final activitydiagram.BooleanUnaryExpression_Aspect booleanUnaryExpression_Aspect);
	Activitydiagramoa__BooleanUnaryExpressionT  booleanUnaryExpression_booleanUnaryExpression_Aspect(final activitydiagram.BooleanUnaryExpression_Aspect booleanUnaryExpression_Aspect);
	Activitydiagram__BooleanExpression_AspectT  booleanExpression_Aspect_booleanUnaryExpression_Aspect(final activitydiagram.BooleanUnaryExpression_Aspect booleanUnaryExpression_Aspect);
	Activitydiagramoa__BooleanExpressionT  booleanExpression_booleanUnaryExpression_Aspect(final activitydiagram.BooleanUnaryExpression_Aspect booleanUnaryExpression_Aspect);
	Activitydiagramoa__ExpressionT  expression_booleanUnaryExpression_Aspect(final activitydiagram.BooleanUnaryExpression_Aspect booleanUnaryExpression_Aspect);
	Activitydiagram__Expression_AspectT  expression_Aspect_booleanUnaryExpression_Aspect(final activitydiagram.BooleanUnaryExpression_Aspect booleanUnaryExpression_Aspect);
	
	Activitydiagram__BooleanVariable_AspectT  booleanVariable_Aspect(final activitydiagram.BooleanVariable_Aspect booleanVariable_Aspect);
	Activitydiagramoa__VariableT  variable_booleanVariable_Aspect(final activitydiagram.BooleanVariable_Aspect booleanVariable_Aspect);
	Activitydiagramoa__BooleanVariableT  booleanVariable_booleanVariable_Aspect(final activitydiagram.BooleanVariable_Aspect booleanVariable_Aspect);
	Activitydiagram__Variable_AspectT  variable_Aspect_booleanVariable_Aspect(final activitydiagram.BooleanVariable_Aspect booleanVariable_Aspect);
	
	Activitydiagram__ControlFlow_AspectT  controlFlow_Aspect(final activitydiagram.ControlFlow_Aspect controlFlow_Aspect);
	Activitydiagramoa__NamedElementT  namedElement_controlFlow_Aspect(final activitydiagram.ControlFlow_Aspect controlFlow_Aspect);
	Activitydiagram__ActivityEdge_AspectT  activityEdge_Aspect_controlFlow_Aspect(final activitydiagram.ControlFlow_Aspect controlFlow_Aspect);
	Activitydiagramoa__ActivityEdgeT  activityEdge_controlFlow_Aspect(final activitydiagram.ControlFlow_Aspect controlFlow_Aspect);
	Activitydiagramoa__ControlFlowT  controlFlow_controlFlow_Aspect(final activitydiagram.ControlFlow_Aspect controlFlow_Aspect);
	
	Activitydiagram__ControlNode_AspectT  controlNode_Aspect(final activitydiagram.ControlNode_Aspect controlNode_Aspect);
	Activitydiagramoa__NamedElementT  namedElement_controlNode_Aspect(final activitydiagram.ControlNode_Aspect controlNode_Aspect);
	Activitydiagramoa__ControlNodeT  controlNode_controlNode_Aspect(final activitydiagram.ControlNode_Aspect controlNode_Aspect);
	Activitydiagramoa__ActivityNodeT  activityNode_controlNode_Aspect(final activitydiagram.ControlNode_Aspect controlNode_Aspect);
	Activitydiagram__ActivityNode_AspectT  activityNode_Aspect_controlNode_Aspect(final activitydiagram.ControlNode_Aspect controlNode_Aspect);
	
	Activitydiagram__ControlTokenT  controlToken(final activitydiagram.ControlToken controlToken);
	Activitydiagram__TokenT  token_controlToken(final activitydiagram.ControlToken controlToken);
	
	Activitydiagram__DecisionNode_AspectT  decisionNode_Aspect(final activitydiagram.DecisionNode_Aspect decisionNode_Aspect);
	Activitydiagram__ControlNode_AspectT  controlNode_Aspect_decisionNode_Aspect(final activitydiagram.DecisionNode_Aspect decisionNode_Aspect);
	Activitydiagramoa__DecisionNodeT  decisionNode_decisionNode_Aspect(final activitydiagram.DecisionNode_Aspect decisionNode_Aspect);
	Activitydiagramoa__NamedElementT  namedElement_decisionNode_Aspect(final activitydiagram.DecisionNode_Aspect decisionNode_Aspect);
	Activitydiagramoa__ControlNodeT  controlNode_decisionNode_Aspect(final activitydiagram.DecisionNode_Aspect decisionNode_Aspect);
	Activitydiagramoa__ActivityNodeT  activityNode_decisionNode_Aspect(final activitydiagram.DecisionNode_Aspect decisionNode_Aspect);
	Activitydiagram__ActivityNode_AspectT  activityNode_Aspect_decisionNode_Aspect(final activitydiagram.DecisionNode_Aspect decisionNode_Aspect);
	
	Activitydiagram__ExecutableNode_AspectT  executableNode_Aspect(final activitydiagram.ExecutableNode_Aspect executableNode_Aspect);
	Activitydiagramoa__ExecutableNodeT  executableNode_executableNode_Aspect(final activitydiagram.ExecutableNode_Aspect executableNode_Aspect);
	Activitydiagramoa__NamedElementT  namedElement_executableNode_Aspect(final activitydiagram.ExecutableNode_Aspect executableNode_Aspect);
	Activitydiagramoa__ActivityNodeT  activityNode_executableNode_Aspect(final activitydiagram.ExecutableNode_Aspect executableNode_Aspect);
	Activitydiagram__ActivityNode_AspectT  activityNode_Aspect_executableNode_Aspect(final activitydiagram.ExecutableNode_Aspect executableNode_Aspect);
	
	Activitydiagram__Expression_AspectT  expression_Aspect(final activitydiagram.Expression_Aspect expression_Aspect);
	Activitydiagramoa__ExpressionT  expression_expression_Aspect(final activitydiagram.Expression_Aspect expression_Aspect);
	
	Activitydiagram__FinalNode_AspectT  finalNode_Aspect(final activitydiagram.FinalNode_Aspect finalNode_Aspect);
	Activitydiagram__ControlNode_AspectT  controlNode_Aspect_finalNode_Aspect(final activitydiagram.FinalNode_Aspect finalNode_Aspect);
	Activitydiagramoa__NamedElementT  namedElement_finalNode_Aspect(final activitydiagram.FinalNode_Aspect finalNode_Aspect);
	Activitydiagramoa__FinalNodeT  finalNode_finalNode_Aspect(final activitydiagram.FinalNode_Aspect finalNode_Aspect);
	Activitydiagramoa__ControlNodeT  controlNode_finalNode_Aspect(final activitydiagram.FinalNode_Aspect finalNode_Aspect);
	Activitydiagramoa__ActivityNodeT  activityNode_finalNode_Aspect(final activitydiagram.FinalNode_Aspect finalNode_Aspect);
	Activitydiagram__ActivityNode_AspectT  activityNode_Aspect_finalNode_Aspect(final activitydiagram.FinalNode_Aspect finalNode_Aspect);
	
	Activitydiagram__ForkNode_AspectT  forkNode_Aspect(final activitydiagram.ForkNode_Aspect forkNode_Aspect);
	Activitydiagram__ControlNode_AspectT  controlNode_Aspect_forkNode_Aspect(final activitydiagram.ForkNode_Aspect forkNode_Aspect);
	Activitydiagramoa__NamedElementT  namedElement_forkNode_Aspect(final activitydiagram.ForkNode_Aspect forkNode_Aspect);
	Activitydiagramoa__ForkNodeT  forkNode_forkNode_Aspect(final activitydiagram.ForkNode_Aspect forkNode_Aspect);
	Activitydiagramoa__ControlNodeT  controlNode_forkNode_Aspect(final activitydiagram.ForkNode_Aspect forkNode_Aspect);
	Activitydiagramoa__ActivityNodeT  activityNode_forkNode_Aspect(final activitydiagram.ForkNode_Aspect forkNode_Aspect);
	Activitydiagram__ActivityNode_AspectT  activityNode_Aspect_forkNode_Aspect(final activitydiagram.ForkNode_Aspect forkNode_Aspect);
	
	Activitydiagram__ForkedTokenT  forkedToken(final activitydiagram.ForkedToken forkedToken);
	Activitydiagram__TokenT  token_forkedToken(final activitydiagram.ForkedToken forkedToken);
	
	Activitydiagram__InitialNode_AspectT  initialNode_Aspect(final activitydiagram.InitialNode_Aspect initialNode_Aspect);
	Activitydiagram__ControlNode_AspectT  controlNode_Aspect_initialNode_Aspect(final activitydiagram.InitialNode_Aspect initialNode_Aspect);
	Activitydiagramoa__NamedElementT  namedElement_initialNode_Aspect(final activitydiagram.InitialNode_Aspect initialNode_Aspect);
	Activitydiagramoa__InitialNodeT  initialNode_initialNode_Aspect(final activitydiagram.InitialNode_Aspect initialNode_Aspect);
	Activitydiagramoa__ControlNodeT  controlNode_initialNode_Aspect(final activitydiagram.InitialNode_Aspect initialNode_Aspect);
	Activitydiagramoa__ActivityNodeT  activityNode_initialNode_Aspect(final activitydiagram.InitialNode_Aspect initialNode_Aspect);
	Activitydiagram__ActivityNode_AspectT  activityNode_Aspect_initialNode_Aspect(final activitydiagram.InitialNode_Aspect initialNode_Aspect);
	
	Activitydiagram__InputT  input(final activitydiagram.Input input);
	
	Activitydiagram__InputValueT  inputValue(final activitydiagram.InputValue inputValue);
	
	Activitydiagram__IntegerCalculationExpression_AspectT  integerCalculationExpression_Aspect(final activitydiagram.IntegerCalculationExpression_Aspect integerCalculationExpression_Aspect);
	Activitydiagramoa__IntegerCalculationExpressionT  integerCalculationExpression_integerCalculationExpression_Aspect(final activitydiagram.IntegerCalculationExpression_Aspect integerCalculationExpression_Aspect);
	Activitydiagramoa__ExpressionT  expression_integerCalculationExpression_Aspect(final activitydiagram.IntegerCalculationExpression_Aspect integerCalculationExpression_Aspect);
	Activitydiagramoa__IntegerExpressionT  integerExpression_integerCalculationExpression_Aspect(final activitydiagram.IntegerCalculationExpression_Aspect integerCalculationExpression_Aspect);
	Activitydiagram__Expression_AspectT  expression_Aspect_integerCalculationExpression_Aspect(final activitydiagram.IntegerCalculationExpression_Aspect integerCalculationExpression_Aspect);
	Activitydiagram__IntegerExpression_AspectT  integerExpression_Aspect_integerCalculationExpression_Aspect(final activitydiagram.IntegerCalculationExpression_Aspect integerCalculationExpression_Aspect);
	
	Activitydiagram__IntegerComparisonExpression_AspectT  integerComparisonExpression_Aspect(final activitydiagram.IntegerComparisonExpression_Aspect integerComparisonExpression_Aspect);
	Activitydiagramoa__ExpressionT  expression_integerComparisonExpression_Aspect(final activitydiagram.IntegerComparisonExpression_Aspect integerComparisonExpression_Aspect);
	Activitydiagramoa__IntegerExpressionT  integerExpression_integerComparisonExpression_Aspect(final activitydiagram.IntegerComparisonExpression_Aspect integerComparisonExpression_Aspect);
	Activitydiagram__Expression_AspectT  expression_Aspect_integerComparisonExpression_Aspect(final activitydiagram.IntegerComparisonExpression_Aspect integerComparisonExpression_Aspect);
	Activitydiagram__IntegerExpression_AspectT  integerExpression_Aspect_integerComparisonExpression_Aspect(final activitydiagram.IntegerComparisonExpression_Aspect integerComparisonExpression_Aspect);
	Activitydiagramoa__IntegerComparisonExpressionT  integerComparisonExpression_integerComparisonExpression_Aspect(final activitydiagram.IntegerComparisonExpression_Aspect integerComparisonExpression_Aspect);
	
	Activitydiagram__IntegerExpression_AspectT  integerExpression_Aspect(final activitydiagram.IntegerExpression_Aspect integerExpression_Aspect);
	Activitydiagramoa__ExpressionT  expression_integerExpression_Aspect(final activitydiagram.IntegerExpression_Aspect integerExpression_Aspect);
	Activitydiagramoa__IntegerExpressionT  integerExpression_integerExpression_Aspect(final activitydiagram.IntegerExpression_Aspect integerExpression_Aspect);
	Activitydiagram__Expression_AspectT  expression_Aspect_integerExpression_Aspect(final activitydiagram.IntegerExpression_Aspect integerExpression_Aspect);
	
	Activitydiagram__IntegerVariable_AspectT  integerVariable_Aspect(final activitydiagram.IntegerVariable_Aspect integerVariable_Aspect);
	Activitydiagramoa__VariableT  variable_integerVariable_Aspect(final activitydiagram.IntegerVariable_Aspect integerVariable_Aspect);
	Activitydiagramoa__IntegerVariableT  integerVariable_integerVariable_Aspect(final activitydiagram.IntegerVariable_Aspect integerVariable_Aspect);
	Activitydiagram__Variable_AspectT  variable_Aspect_integerVariable_Aspect(final activitydiagram.IntegerVariable_Aspect integerVariable_Aspect);
	
	Activitydiagram__JoinNode_AspectT  joinNode_Aspect(final activitydiagram.JoinNode_Aspect joinNode_Aspect);
	Activitydiagram__ControlNode_AspectT  controlNode_Aspect_joinNode_Aspect(final activitydiagram.JoinNode_Aspect joinNode_Aspect);
	Activitydiagramoa__NamedElementT  namedElement_joinNode_Aspect(final activitydiagram.JoinNode_Aspect joinNode_Aspect);
	Activitydiagramoa__ControlNodeT  controlNode_joinNode_Aspect(final activitydiagram.JoinNode_Aspect joinNode_Aspect);
	Activitydiagramoa__JoinNodeT  joinNode_joinNode_Aspect(final activitydiagram.JoinNode_Aspect joinNode_Aspect);
	Activitydiagramoa__ActivityNodeT  activityNode_joinNode_Aspect(final activitydiagram.JoinNode_Aspect joinNode_Aspect);
	Activitydiagram__ActivityNode_AspectT  activityNode_Aspect_joinNode_Aspect(final activitydiagram.JoinNode_Aspect joinNode_Aspect);
	
	Activitydiagram__MergeNode_AspectT  mergeNode_Aspect(final activitydiagram.MergeNode_Aspect mergeNode_Aspect);
	Activitydiagram__ControlNode_AspectT  controlNode_Aspect_mergeNode_Aspect(final activitydiagram.MergeNode_Aspect mergeNode_Aspect);
	Activitydiagramoa__NamedElementT  namedElement_mergeNode_Aspect(final activitydiagram.MergeNode_Aspect mergeNode_Aspect);
	Activitydiagramoa__MergeNodeT  mergeNode_mergeNode_Aspect(final activitydiagram.MergeNode_Aspect mergeNode_Aspect);
	Activitydiagramoa__ControlNodeT  controlNode_mergeNode_Aspect(final activitydiagram.MergeNode_Aspect mergeNode_Aspect);
	Activitydiagramoa__ActivityNodeT  activityNode_mergeNode_Aspect(final activitydiagram.MergeNode_Aspect mergeNode_Aspect);
	Activitydiagram__ActivityNode_AspectT  activityNode_Aspect_mergeNode_Aspect(final activitydiagram.MergeNode_Aspect mergeNode_Aspect);
	
	Activitydiagram__OfferT  offer(final activitydiagram.Offer offer);
	
	Activitydiagram__OpaqueAction_AspectT  opaqueAction_Aspect(final activitydiagram.OpaqueAction_Aspect opaqueAction_Aspect);
	Activitydiagramoa__ExecutableNodeT  executableNode_opaqueAction_Aspect(final activitydiagram.OpaqueAction_Aspect opaqueAction_Aspect);
	Activitydiagramoa__OpaqueActionT  opaqueAction_opaqueAction_Aspect(final activitydiagram.OpaqueAction_Aspect opaqueAction_Aspect);
	Activitydiagramoa__NamedElementT  namedElement_opaqueAction_Aspect(final activitydiagram.OpaqueAction_Aspect opaqueAction_Aspect);
	Activitydiagramoa__ActionT  action_opaqueAction_Aspect(final activitydiagram.OpaqueAction_Aspect opaqueAction_Aspect);
	Activitydiagramoa__ActivityNodeT  activityNode_opaqueAction_Aspect(final activitydiagram.OpaqueAction_Aspect opaqueAction_Aspect);
	Activitydiagram__ExecutableNode_AspectT  executableNode_Aspect_opaqueAction_Aspect(final activitydiagram.OpaqueAction_Aspect opaqueAction_Aspect);
	Activitydiagram__Action_AspectT  action_Aspect_opaqueAction_Aspect(final activitydiagram.OpaqueAction_Aspect opaqueAction_Aspect);
	Activitydiagram__ActivityNode_AspectT  activityNode_Aspect_opaqueAction_Aspect(final activitydiagram.OpaqueAction_Aspect opaqueAction_Aspect);
	
	Activitydiagram__TokenT  token(final activitydiagram.Token token);
	
	Activitydiagram__TraceT  trace(final activitydiagram.Trace trace);
	
	Activitydiagram__Variable_AspectT  variable_Aspect(final activitydiagram.Variable_Aspect variable_Aspect);
	Activitydiagramoa__VariableT  variable_variable_Aspect(final activitydiagram.Variable_Aspect variable_Aspect);
	
	
	default Activitydiagram__BooleanVariable_AspectT  $(final activitydiagram.BooleanVariable_Aspect self) {
		return booleanVariable_Aspect(self);
	}
	default Activitydiagram__TokenT  $(final activitydiagram.Token self) {
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.CONTROL_TOKEN) return controlToken((activitydiagram.ControlToken) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.FORKED_TOKEN) return forkedToken((activitydiagram.ForkedToken) self);
		return token(self);
	}
	default Activitydiagramoa__ActionT  $(final activitydiagramoa.Action self) {
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.OPAQUE_ACTION_ASPECT) return action_opaqueAction_Aspect((activitydiagram.OpaqueAction_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.ACTION_ASPECT) return action_action_Aspect((activitydiagram.Action_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramoaPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramoaPackage.OPAQUE_ACTION) return opaqueAction((activitydiagramoa.OpaqueAction) self);
		return null;
	}
	default Activitydiagramoa__ValueT  $(final activitydiagramoa.Value self) {
		if(self.eClass().getEPackage() ==ActivitydiagramoaPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramoaPackage.BOOLEAN_VALUE) return booleanValue((activitydiagramoa.BooleanValue) self);
		if(self.eClass().getEPackage() ==ActivitydiagramoaPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramoaPackage.INTEGER_VALUE) return integerValue((activitydiagramoa.IntegerValue) self);
		return null;
	}
	default Activitydiagramoa__ControlNodeT  $(final activitydiagramoa.ControlNode self) {
		if(self.eClass().getEPackage() ==ActivitydiagramoaPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramoaPackage.MERGE_NODE) return mergeNode((activitydiagramoa.MergeNode) self);
		if(self.eClass().getEPackage() ==ActivitydiagramoaPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramoaPackage.DECISION_NODE) return decisionNode((activitydiagramoa.DecisionNode) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.ACTIVITY_FINAL_NODE_ASPECT) return controlNode_activityFinalNode_Aspect((activitydiagram.ActivityFinalNode_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.FINAL_NODE_ASPECT) return controlNode_finalNode_Aspect((activitydiagram.FinalNode_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramoaPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramoaPackage.ACTIVITY_FINAL_NODE) return activityFinalNode((activitydiagramoa.ActivityFinalNode) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.DECISION_NODE_ASPECT) return controlNode_decisionNode_Aspect((activitydiagram.DecisionNode_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.FORK_NODE_ASPECT) return controlNode_forkNode_Aspect((activitydiagram.ForkNode_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramoaPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramoaPackage.FORK_NODE) return forkNode((activitydiagramoa.ForkNode) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.MERGE_NODE_ASPECT) return controlNode_mergeNode_Aspect((activitydiagram.MergeNode_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.JOIN_NODE_ASPECT) return controlNode_joinNode_Aspect((activitydiagram.JoinNode_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramoaPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramoaPackage.JOIN_NODE) return joinNode((activitydiagramoa.JoinNode) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.INITIAL_NODE_ASPECT) return controlNode_initialNode_Aspect((activitydiagram.InitialNode_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.CONTROL_NODE_ASPECT) return controlNode_controlNode_Aspect((activitydiagram.ControlNode_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramoaPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramoaPackage.INITIAL_NODE) return initialNode((activitydiagramoa.InitialNode) self);
		return null;
	}
	default Activitydiagramoa__BooleanVariableT  $(final activitydiagramoa.BooleanVariable self) {
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.BOOLEAN_VARIABLE_ASPECT) return booleanVariable_booleanVariable_Aspect((activitydiagram.BooleanVariable_Aspect) self);
		return booleanVariable(self);
	}
	default Activitydiagram__ActivityEdge_AspectT  $(final activitydiagram.ActivityEdge_Aspect self) {
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.CONTROL_FLOW_ASPECT) return activityEdge_Aspect_controlFlow_Aspect((activitydiagram.ControlFlow_Aspect) self);
		return activityEdge_Aspect(self);
	}
	default Activitydiagram__OpaqueAction_AspectT  $(final activitydiagram.OpaqueAction_Aspect self) {
		return opaqueAction_Aspect(self);
	}
	default Activitydiagramoa__MergeNodeT  $(final activitydiagramoa.MergeNode self) {
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.MERGE_NODE_ASPECT) return mergeNode_mergeNode_Aspect((activitydiagram.MergeNode_Aspect) self);
		return mergeNode(self);
	}
	default Activitydiagram__Action_AspectT  $(final activitydiagram.Action_Aspect self) {
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.OPAQUE_ACTION_ASPECT) return action_Aspect_opaqueAction_Aspect((activitydiagram.OpaqueAction_Aspect) self);
		return action_Aspect(self);
	}
	default Activitydiagram__ControlFlow_AspectT  $(final activitydiagram.ControlFlow_Aspect self) {
		return controlFlow_Aspect(self);
	}
	default Activitydiagram__TraceT  $(final activitydiagram.Trace self) {
		return trace(self);
	}
	default Activitydiagramoa__DecisionNodeT  $(final activitydiagramoa.DecisionNode self) {
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.DECISION_NODE_ASPECT) return decisionNode_decisionNode_Aspect((activitydiagram.DecisionNode_Aspect) self);
		return decisionNode(self);
	}
	default Activitydiagramoa__OpaqueActionT  $(final activitydiagramoa.OpaqueAction self) {
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.OPAQUE_ACTION_ASPECT) return opaqueAction_opaqueAction_Aspect((activitydiagram.OpaqueAction_Aspect) self);
		return opaqueAction(self);
	}
	default Activitydiagramoa__IntegerVariableT  $(final activitydiagramoa.IntegerVariable self) {
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.INTEGER_VARIABLE_ASPECT) return integerVariable_integerVariable_Aspect((activitydiagram.IntegerVariable_Aspect) self);
		return integerVariable(self);
	}
	default Activitydiagramoa__ActivityEdgeT  $(final activitydiagramoa.ActivityEdge self) {
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.CONTROL_FLOW_ASPECT) return activityEdge_controlFlow_Aspect((activitydiagram.ControlFlow_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.ACTIVITY_EDGE_ASPECT) return activityEdge_Aspect((activitydiagram.ActivityEdge_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramoaPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramoaPackage.CONTROL_FLOW) return controlFlow((activitydiagramoa.ControlFlow) self);
		return null;
	}
	default Activitydiagram__ActivityFinalNode_AspectT  $(final activitydiagram.ActivityFinalNode_Aspect self) {
		return activityFinalNode_Aspect(self);
	}
	default Activitydiagramoa__IntegerCalculationExpressionT  $(final activitydiagramoa.IntegerCalculationExpression self) {
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.INTEGER_CALCULATION_EXPRESSION_ASPECT) return integerCalculationExpression_integerCalculationExpression_Aspect((activitydiagram.IntegerCalculationExpression_Aspect) self);
		return integerCalculationExpression(self);
	}
	default Activitydiagramoa__IntegerComparisonExpressionT  $(final activitydiagramoa.IntegerComparisonExpression self) {
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.INTEGER_COMPARISON_EXPRESSION_ASPECT) return integerComparisonExpression_integerComparisonExpression_Aspect((activitydiagram.IntegerComparisonExpression_Aspect) self);
		return integerComparisonExpression(self);
	}
	default Activitydiagramoa__ExecutableNodeT  $(final activitydiagramoa.ExecutableNode self) {
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.OPAQUE_ACTION_ASPECT) return executableNode_opaqueAction_Aspect((activitydiagram.OpaqueAction_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.ACTION_ASPECT) return executableNode_action_Aspect((activitydiagram.Action_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramoaPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramoaPackage.OPAQUE_ACTION) return opaqueAction((activitydiagramoa.OpaqueAction) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.EXECUTABLE_NODE_ASPECT) return executableNode_executableNode_Aspect((activitydiagram.ExecutableNode_Aspect) self);
		return null;
	}
	default Activitydiagramoa__NamedElementT  $(final activitydiagramoa.NamedElement self) {
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.ACTIVITY_EDGE_ASPECT) return activityEdge_Aspect((activitydiagram.ActivityEdge_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.OPAQUE_ACTION_ASPECT) return namedElement_opaqueAction_Aspect((activitydiagram.OpaqueAction_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramoaPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramoaPackage.MERGE_NODE) return mergeNode((activitydiagramoa.MergeNode) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.ACTION_ASPECT) return namedElement_action_Aspect((activitydiagram.Action_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.CONTROL_FLOW_ASPECT) return namedElement_controlFlow_Aspect((activitydiagram.ControlFlow_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramoaPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramoaPackage.DECISION_NODE) return decisionNode((activitydiagramoa.DecisionNode) self);
		if(self.eClass().getEPackage() ==ActivitydiagramoaPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramoaPackage.OPAQUE_ACTION) return opaqueAction((activitydiagramoa.OpaqueAction) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.ACTIVITY_FINAL_NODE_ASPECT) return namedElement_activityFinalNode_Aspect((activitydiagram.ActivityFinalNode_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.EXECUTABLE_NODE_ASPECT) return namedElement_executableNode_Aspect((activitydiagram.ExecutableNode_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramoaPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramoaPackage.CONTROL_FLOW) return controlFlow((activitydiagramoa.ControlFlow) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.FINAL_NODE_ASPECT) return namedElement_finalNode_Aspect((activitydiagram.FinalNode_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramoaPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramoaPackage.ACTIVITY_FINAL_NODE) return activityFinalNode((activitydiagramoa.ActivityFinalNode) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.FORK_NODE_ASPECT) return namedElement_forkNode_Aspect((activitydiagram.ForkNode_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.MERGE_NODE_ASPECT) return namedElement_mergeNode_Aspect((activitydiagram.MergeNode_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.INITIAL_NODE_ASPECT) return namedElement_initialNode_Aspect((activitydiagram.InitialNode_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.JOIN_NODE_ASPECT) return namedElement_joinNode_Aspect((activitydiagram.JoinNode_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.CONTROL_NODE_ASPECT) return namedElement_controlNode_Aspect((activitydiagram.ControlNode_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.ACTIVITY_NODE_ASPECT) return activityNode_Aspect((activitydiagram.ActivityNode_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramoaPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramoaPackage.ACTIVITY) return activity((activitydiagramoa.Activity) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.DECISION_NODE_ASPECT) return namedElement_decisionNode_Aspect((activitydiagram.DecisionNode_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramoaPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramoaPackage.FORK_NODE) return forkNode((activitydiagramoa.ForkNode) self);
		if(self.eClass().getEPackage() ==ActivitydiagramoaPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramoaPackage.JOIN_NODE) return joinNode((activitydiagramoa.JoinNode) self);
		if(self.eClass().getEPackage() ==ActivitydiagramoaPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramoaPackage.INITIAL_NODE) return initialNode((activitydiagramoa.InitialNode) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.ACTIVITY_ASPECT) return activity_Aspect((activitydiagram.Activity_Aspect) self);
		return null;
	}
	default Activitydiagram__InputValueT  $(final activitydiagram.InputValue self) {
		return inputValue(self);
	}
	default Activitydiagramoa__VariableT  $(final activitydiagramoa.Variable self) {
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.BOOLEAN_VARIABLE_ASPECT) return variable_booleanVariable_Aspect((activitydiagram.BooleanVariable_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramoaPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramoaPackage.BOOLEAN_VARIABLE) return booleanVariable((activitydiagramoa.BooleanVariable) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.INTEGER_VARIABLE_ASPECT) return variable_integerVariable_Aspect((activitydiagram.IntegerVariable_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramoaPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramoaPackage.INTEGER_VARIABLE) return integerVariable((activitydiagramoa.IntegerVariable) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.VARIABLE_ASPECT) return variable_Aspect((activitydiagram.Variable_Aspect) self);
		return null;
	}
	default Activitydiagramoa__ControlFlowT  $(final activitydiagramoa.ControlFlow self) {
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.CONTROL_FLOW_ASPECT) return controlFlow_controlFlow_Aspect((activitydiagram.ControlFlow_Aspect) self);
		return controlFlow(self);
	}
	default Activitydiagramoa__ActivityNodeT  $(final activitydiagramoa.ActivityNode self) {
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.MERGE_NODE_ASPECT) return activityNode_mergeNode_Aspect((activitydiagram.MergeNode_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.OPAQUE_ACTION_ASPECT) return activityNode_opaqueAction_Aspect((activitydiagram.OpaqueAction_Aspect) self);
//		if(self.eClass().getEPackage() ==ActivitydiagramoaPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramoaPackage.MERGE_NODE) return mergeNode((activitydiagramoa.MergeNode) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.ACTION_ASPECT) return activityNode_action_Aspect((activitydiagram.Action_Aspect) self);
//		if(self.eClass().getEPackage() ==ActivitydiagramoaPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramoaPackage.DECISION_NODE) return decisionNode((activitydiagramoa.DecisionNode) self);
		if(self.eClass().getEPackage() ==ActivitydiagramoaPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramoaPackage.OPAQUE_ACTION) return opaqueAction((activitydiagramoa.OpaqueAction) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.ACTIVITY_FINAL_NODE_ASPECT) return activityNode_activityFinalNode_Aspect((activitydiagram.ActivityFinalNode_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.EXECUTABLE_NODE_ASPECT) return activityNode_executableNode_Aspect((activitydiagram.ExecutableNode_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.FINAL_NODE_ASPECT) return activityNode_finalNode_Aspect((activitydiagram.FinalNode_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramoaPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramoaPackage.ACTIVITY_FINAL_NODE) return activityFinalNode((activitydiagramoa.ActivityFinalNode) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.DECISION_NODE_ASPECT) return activityNode_decisionNode_Aspect((activitydiagram.DecisionNode_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.FORK_NODE_ASPECT) return activityNode_forkNode_Aspect((activitydiagram.ForkNode_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.INITIAL_NODE_ASPECT) return activityNode_initialNode_Aspect((activitydiagram.InitialNode_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.JOIN_NODE_ASPECT) return activityNode_joinNode_Aspect((activitydiagram.JoinNode_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.CONTROL_NODE_ASPECT) return activityNode_controlNode_Aspect((activitydiagram.ControlNode_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.ACTIVITY_NODE_ASPECT) return activityNode_Aspect((activitydiagram.ActivityNode_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramoaPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramoaPackage.FORK_NODE) return forkNode((activitydiagramoa.ForkNode) self);
		if(self.eClass().getEPackage() ==ActivitydiagramoaPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramoaPackage.JOIN_NODE) return joinNode((activitydiagramoa.JoinNode) self);
		if(self.eClass().getEPackage() ==ActivitydiagramoaPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramoaPackage.INITIAL_NODE) return initialNode((activitydiagramoa.InitialNode) self);
		return null;
	}
	default Activitydiagram__OfferT  $(final activitydiagram.Offer self) {
		return offer(self);
	}
	default Activitydiagram__FinalNode_AspectT  $(final activitydiagram.FinalNode_Aspect self) {
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.ACTIVITY_FINAL_NODE_ASPECT) return finalNode_Aspect_activityFinalNode_Aspect((activitydiagram.ActivityFinalNode_Aspect) self);
		return finalNode_Aspect(self);
	}
	default Activitydiagramoa__FinalNodeT  $(final activitydiagramoa.FinalNode self) {
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.ACTIVITY_FINAL_NODE_ASPECT) return finalNode_activityFinalNode_Aspect((activitydiagram.ActivityFinalNode_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.FINAL_NODE_ASPECT) return finalNode_finalNode_Aspect((activitydiagram.FinalNode_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramoaPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramoaPackage.ACTIVITY_FINAL_NODE) return activityFinalNode((activitydiagramoa.ActivityFinalNode) self);
		return null;
	}
	default Activitydiagram__ActivityNode_AspectT  $(final activitydiagram.ActivityNode_Aspect self) {
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.OPAQUE_ACTION_ASPECT) return activityNode_Aspect_opaqueAction_Aspect((activitydiagram.OpaqueAction_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.ACTION_ASPECT) return activityNode_Aspect_action_Aspect((activitydiagram.Action_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.ACTIVITY_FINAL_NODE_ASPECT) return activityNode_Aspect_activityFinalNode_Aspect((activitydiagram.ActivityFinalNode_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.FINAL_NODE_ASPECT) return activityNode_Aspect_finalNode_Aspect((activitydiagram.FinalNode_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.DECISION_NODE_ASPECT) return activityNode_Aspect_decisionNode_Aspect((activitydiagram.DecisionNode_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.FORK_NODE_ASPECT) return activityNode_Aspect_forkNode_Aspect((activitydiagram.ForkNode_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.EXECUTABLE_NODE_ASPECT) return activityNode_Aspect_executableNode_Aspect((activitydiagram.ExecutableNode_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.MERGE_NODE_ASPECT) return activityNode_Aspect_mergeNode_Aspect((activitydiagram.MergeNode_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.INITIAL_NODE_ASPECT) return activityNode_Aspect_initialNode_Aspect((activitydiagram.InitialNode_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.JOIN_NODE_ASPECT) return activityNode_Aspect_joinNode_Aspect((activitydiagram.JoinNode_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.CONTROL_NODE_ASPECT) return activityNode_Aspect_controlNode_Aspect((activitydiagram.ControlNode_Aspect) self);
		return activityNode_Aspect(self);
	}
	default Activitydiagramoa__ActivityFinalNodeT  $(final activitydiagramoa.ActivityFinalNode self) {
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.ACTIVITY_FINAL_NODE_ASPECT) return activityFinalNode_activityFinalNode_Aspect((activitydiagram.ActivityFinalNode_Aspect) self);
		return activityFinalNode(self);
	}
	default Activitydiagramoa__ActivityT  $(final activitydiagramoa.Activity self) {
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.ACTIVITY_ASPECT) return activity_Aspect((activitydiagram.Activity_Aspect) self);
		return activity(self);
	}
	default Activitydiagram__Variable_AspectT  $(final activitydiagram.Variable_Aspect self) {
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.BOOLEAN_VARIABLE_ASPECT) return variable_Aspect_booleanVariable_Aspect((activitydiagram.BooleanVariable_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.INTEGER_VARIABLE_ASPECT) return variable_Aspect_integerVariable_Aspect((activitydiagram.IntegerVariable_Aspect) self);
		return variable_Aspect(self);
	}
	default Activitydiagram__BooleanUnaryExpression_AspectT  $(final activitydiagram.BooleanUnaryExpression_Aspect self) {
		return booleanUnaryExpression_Aspect(self);
	}
	default Activitydiagram__DecisionNode_AspectT  $(final activitydiagram.DecisionNode_Aspect self) {
		return decisionNode_Aspect(self);
	}
	default Activitydiagramoa__BooleanBinaryExpressionT  $(final activitydiagramoa.BooleanBinaryExpression self) {
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.BOOLEAN_BINARY_EXPRESSION_ASPECT) return booleanBinaryExpression_booleanBinaryExpression_Aspect((activitydiagram.BooleanBinaryExpression_Aspect) self);
		return booleanBinaryExpression(self);
	}
	default Activitydiagramoa__ExpressionT  $(final activitydiagramoa.Expression self) {
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.INTEGER_CALCULATION_EXPRESSION_ASPECT) return expression_integerCalculationExpression_Aspect((activitydiagram.IntegerCalculationExpression_Aspect) self);
//		if(self.eClass().getEPackage() ==ActivitydiagramoaPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramoaPackage.INTEGER_CALCULATION_EXPRESSION) return integerCalculationExpression((activitydiagramoa.IntegerCalculationExpression) self);
//		if(self.eClass().getEPackage() ==ActivitydiagramoaPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramoaPackage.INTEGER_COMPARISON_EXPRESSION) return integerComparisonExpression((activitydiagramoa.IntegerComparisonExpression) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.BOOLEAN_UNARY_EXPRESSION_ASPECT) return expression_booleanUnaryExpression_Aspect((activitydiagram.BooleanUnaryExpression_Aspect) self);
//		if(self.eClass().getEPackage() ==ActivitydiagramoaPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramoaPackage.BOOLEAN_BINARY_EXPRESSION) return booleanBinaryExpression((activitydiagramoa.BooleanBinaryExpression) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.BOOLEAN_EXPRESSION_ASPECT) return expression_booleanExpression_Aspect((activitydiagram.BooleanExpression_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.INTEGER_EXPRESSION_ASPECT) return expression_integerExpression_Aspect((activitydiagram.IntegerExpression_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.EXPRESSION_ASPECT) return expression_Aspect((activitydiagram.Expression_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.INTEGER_COMPARISON_EXPRESSION_ASPECT) return expression_integerComparisonExpression_Aspect((activitydiagram.IntegerComparisonExpression_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.BOOLEAN_BINARY_EXPRESSION_ASPECT) return expression_booleanBinaryExpression_Aspect((activitydiagram.BooleanBinaryExpression_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramoaPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramoaPackage.BOOLEAN_UNARY_EXPRESSION) return booleanUnaryExpression((activitydiagramoa.BooleanUnaryExpression) self);
		return null;
	}
	default Activitydiagramoa__BooleanValueT  $(final activitydiagramoa.BooleanValue self) {
		return booleanValue(self);
	}
	default Activitydiagram__BooleanExpression_AspectT  $(final activitydiagram.BooleanExpression_Aspect self) {
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.BOOLEAN_UNARY_EXPRESSION_ASPECT) return booleanExpression_Aspect_booleanUnaryExpression_Aspect((activitydiagram.BooleanUnaryExpression_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.BOOLEAN_BINARY_EXPRESSION_ASPECT) return booleanExpression_Aspect_booleanBinaryExpression_Aspect((activitydiagram.BooleanBinaryExpression_Aspect) self);
		return booleanExpression_Aspect(self);
	}
	default Activitydiagram__ControlTokenT  $(final activitydiagram.ControlToken self) {
		return controlToken(self);
	}
	default Activitydiagram__Expression_AspectT  $(final activitydiagram.Expression_Aspect self) {
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.INTEGER_CALCULATION_EXPRESSION_ASPECT) return expression_Aspect_integerCalculationExpression_Aspect((activitydiagram.IntegerCalculationExpression_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.BOOLEAN_UNARY_EXPRESSION_ASPECT) return expression_Aspect_booleanUnaryExpression_Aspect((activitydiagram.BooleanUnaryExpression_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.BOOLEAN_EXPRESSION_ASPECT) return expression_Aspect_booleanExpression_Aspect((activitydiagram.BooleanExpression_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.INTEGER_COMPARISON_EXPRESSION_ASPECT) return expression_Aspect_integerComparisonExpression_Aspect((activitydiagram.IntegerComparisonExpression_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.INTEGER_EXPRESSION_ASPECT) return expression_Aspect_integerExpression_Aspect((activitydiagram.IntegerExpression_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.BOOLEAN_BINARY_EXPRESSION_ASPECT) return expression_Aspect_booleanBinaryExpression_Aspect((activitydiagram.BooleanBinaryExpression_Aspect) self);
		return expression_Aspect(self);
	}
	default Activitydiagram__ForkNode_AspectT  $(final activitydiagram.ForkNode_Aspect self) {
		return forkNode_Aspect(self);
	}
	default Activitydiagram__ExecutableNode_AspectT  $(final activitydiagram.ExecutableNode_Aspect self) {
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.OPAQUE_ACTION_ASPECT) return executableNode_Aspect_opaqueAction_Aspect((activitydiagram.OpaqueAction_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.ACTION_ASPECT) return executableNode_Aspect_action_Aspect((activitydiagram.Action_Aspect) self);
		return executableNode_Aspect(self);
	}
	default Activitydiagramoa__BooleanExpressionT  $(final activitydiagramoa.BooleanExpression self) {
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.BOOLEAN_UNARY_EXPRESSION_ASPECT) return booleanExpression_booleanUnaryExpression_Aspect((activitydiagram.BooleanUnaryExpression_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.BOOLEAN_BINARY_EXPRESSION_ASPECT) return booleanExpression_booleanBinaryExpression_Aspect((activitydiagram.BooleanBinaryExpression_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramoaPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramoaPackage.BOOLEAN_BINARY_EXPRESSION) return booleanBinaryExpression((activitydiagramoa.BooleanBinaryExpression) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.BOOLEAN_EXPRESSION_ASPECT) return booleanExpression_booleanExpression_Aspect((activitydiagram.BooleanExpression_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramoaPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramoaPackage.BOOLEAN_UNARY_EXPRESSION) return booleanUnaryExpression((activitydiagramoa.BooleanUnaryExpression) self);
		return null;
	}
	default Activitydiagramoa__ForkNodeT  $(final activitydiagramoa.ForkNode self) {
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.FORK_NODE_ASPECT) return forkNode_forkNode_Aspect((activitydiagram.ForkNode_Aspect) self);
		return forkNode(self);
	}
	default Activitydiagram__IntegerCalculationExpression_AspectT  $(final activitydiagram.IntegerCalculationExpression_Aspect self) {
		return integerCalculationExpression_Aspect(self);
	}
	default Activitydiagram__IntegerComparisonExpression_AspectT  $(final activitydiagram.IntegerComparisonExpression_Aspect self) {
		return integerComparisonExpression_Aspect(self);
	}
	default Activitydiagram__MergeNode_AspectT  $(final activitydiagram.MergeNode_Aspect self) {
		return mergeNode_Aspect(self);
	}
	default Activitydiagram__ForkedTokenT  $(final activitydiagram.ForkedToken self) {
		return forkedToken(self);
	}
	default Activitydiagram__InputT  $(final activitydiagram.Input self) {
		return input(self);
	}
	default Activitydiagram__IntegerExpression_AspectT  $(final activitydiagram.IntegerExpression_Aspect self) {
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.INTEGER_CALCULATION_EXPRESSION_ASPECT) return integerExpression_Aspect_integerCalculationExpression_Aspect((activitydiagram.IntegerCalculationExpression_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.INTEGER_COMPARISON_EXPRESSION_ASPECT) return integerExpression_Aspect_integerComparisonExpression_Aspect((activitydiagram.IntegerComparisonExpression_Aspect) self);
		return integerExpression_Aspect(self);
	}
	default Activitydiagram__IntegerVariable_AspectT  $(final activitydiagram.IntegerVariable_Aspect self) {
		return integerVariable_Aspect(self);
	}
	default Activitydiagram__BooleanBinaryExpression_AspectT  $(final activitydiagram.BooleanBinaryExpression_Aspect self) {
		return booleanBinaryExpression_Aspect(self);
	}
	default Activitydiagramoa__JoinNodeT  $(final activitydiagramoa.JoinNode self) {
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.JOIN_NODE_ASPECT) return joinNode_joinNode_Aspect((activitydiagram.JoinNode_Aspect) self);
		return joinNode(self);
	}
	default Activitydiagramoa__BooleanUnaryExpressionT  $(final activitydiagramoa.BooleanUnaryExpression self) {
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.BOOLEAN_UNARY_EXPRESSION_ASPECT) return booleanUnaryExpression_booleanUnaryExpression_Aspect((activitydiagram.BooleanUnaryExpression_Aspect) self);
		return booleanUnaryExpression(self);
	}
	default Activitydiagram__InitialNode_AspectT  $(final activitydiagram.InitialNode_Aspect self) {
		return initialNode_Aspect(self);
	}
	default Activitydiagramoa__IntegerValueT  $(final activitydiagramoa.IntegerValue self) {
		return integerValue(self);
	}
	default Activitydiagramoa__IntegerExpressionT  $(final activitydiagramoa.IntegerExpression self) {
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.INTEGER_CALCULATION_EXPRESSION_ASPECT) return integerExpression_integerCalculationExpression_Aspect((activitydiagram.IntegerCalculationExpression_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.INTEGER_COMPARISON_EXPRESSION_ASPECT) return integerExpression_integerComparisonExpression_Aspect((activitydiagram.IntegerComparisonExpression_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.INTEGER_EXPRESSION_ASPECT) return integerExpression_integerExpression_Aspect((activitydiagram.IntegerExpression_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramoaPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramoaPackage.INTEGER_CALCULATION_EXPRESSION) return integerCalculationExpression((activitydiagramoa.IntegerCalculationExpression) self);
		if(self.eClass().getEPackage() ==ActivitydiagramoaPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramoaPackage.INTEGER_COMPARISON_EXPRESSION) return integerComparisonExpression((activitydiagramoa.IntegerComparisonExpression) self);
		return null;
	}
	default Activitydiagram__JoinNode_AspectT  $(final activitydiagram.JoinNode_Aspect self) {
		return joinNode_Aspect(self);
	}
	default Activitydiagram__ControlNode_AspectT  $(final activitydiagram.ControlNode_Aspect self) {
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.ACTIVITY_FINAL_NODE_ASPECT) return controlNode_Aspect_activityFinalNode_Aspect((activitydiagram.ActivityFinalNode_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.FINAL_NODE_ASPECT) return controlNode_Aspect_finalNode_Aspect((activitydiagram.FinalNode_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.DECISION_NODE_ASPECT) return controlNode_Aspect_decisionNode_Aspect((activitydiagram.DecisionNode_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.FORK_NODE_ASPECT) return controlNode_Aspect_forkNode_Aspect((activitydiagram.ForkNode_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.MERGE_NODE_ASPECT) return controlNode_Aspect_mergeNode_Aspect((activitydiagram.MergeNode_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.INITIAL_NODE_ASPECT) return controlNode_Aspect_initialNode_Aspect((activitydiagram.InitialNode_Aspect) self);
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.JOIN_NODE_ASPECT) return controlNode_Aspect_joinNode_Aspect((activitydiagram.JoinNode_Aspect) self);
		return controlNode_Aspect(self);
	}
	default Activitydiagramoa__InitialNodeT  $(final activitydiagramoa.InitialNode self) {
		if(self.eClass().getEPackage() ==ActivitydiagramPackage.eINSTANCE && self.eClass().getClassifierID() == ActivitydiagramPackage.INITIAL_NODE_ASPECT) return initialNode_initialNode_Aspect((activitydiagram.InitialNode_Aspect) self);
		return initialNode(self);
	}
	default Activitydiagram__Activity_AspectT  $(final activitydiagram.Activity_Aspect self) {
		return activity_Aspect(self);
	}
	
}
