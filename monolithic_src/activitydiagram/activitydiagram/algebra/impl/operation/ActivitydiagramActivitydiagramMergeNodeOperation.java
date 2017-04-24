package activitydiagram.activitydiagram.algebra.impl.operation;
public class ActivitydiagramActivitydiagramMergeNodeOperation implements activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramMergeNodeOperation { 
			
			
	private class EListCollector<T> implements java.util.stream.Collector<T, org.eclipse.emf.common.util.EList<T>, org.eclipse.emf.common.util.EList<T>> {

		@Override
		public java.util.function.Supplier<org.eclipse.emf.common.util.EList<T>> supplier() {
			return org.eclipse.emf.common.util.BasicEList::new;
		}

		@Override
		public java.util.function.BiConsumer<org.eclipse.emf.common.util.EList<T>, T> accumulator() {
			return (a, b) -> a.add(b);
		}

		@Override
		public java.util.function.BinaryOperator<org.eclipse.emf.common.util.EList<T>> combiner() {
			return (a, b) -> {
				a.addAll(b);
				return a;
			};
		}

		@Override
		public java.util.function.Function<org.eclipse.emf.common.util.EList<T>, org.eclipse.emf.common.util.EList<T>> finisher() {
			return java.util.function.Function.identity();
		}

		@Override
		public java.util.Set<java.util.stream.Collector.Characteristics> characteristics() {
			java.util.HashSet<java.util.stream.Collector.Characteristics> hashSet = new java.util.HashSet<>();
			hashSet.add(java.util.stream.Collector.Characteristics.UNORDERED);
			return hashSet;
		}

	}
		
	private final activitydiagram.MergeNode self;
	private final activitydiagram.algebra.ActivitydiagramAlgebra<? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramActionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramAction_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramActivityOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramActivityEdgeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramActivityEdge_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramActivityFinalNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramActivityFinalNode_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramActivityNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramActivityNode_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramActivity_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramBooleanBinaryExpressionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramBooleanBinaryExpression_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramBooleanExpressionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramBooleanExpression_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramBooleanUnaryExpressionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramBooleanUnaryExpression_AspectOperation, ? extends activitydiagram.$default.algebra.operation.Activitydiagram$defaultBooleanValueOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramBooleanVariableOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramBooleanVariable_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramControlFlowOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramControlFlow_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramControlNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramControlNode_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramControlTokenOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramControlToken_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramDecisionNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramDecisionNode_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramExecutableNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramExecutableNode_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramExpressionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramExpression_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramFinalNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramFinalNode_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramForkNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramForkNode_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramForkedTokenOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramForkedToken_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramInitialNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramInitialNode_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramInputOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramInputOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramInputValueOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramInputValueOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramIntegerCalculationExpressionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramIntegerCalculationExpression_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramIntegerComparisonExpressionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramIntegerComparisonExpression_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramIntegerExpressionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramIntegerExpression_AspectOperation, ? extends activitydiagram.$default.algebra.operation.Activitydiagram$defaultIntegerValueOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramIntegerVariableOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramIntegerVariable_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramJoinNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramJoinNode_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramMergeNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramMergeNode_AspectOperation, ? extends activitydiagram.$default.algebra.operation.Activitydiagram$defaultNamedElementOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramOfferOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramOffer_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramOpaqueActionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramOpaqueAction_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramTokenOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramToken_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramTraceOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramTrace_AspectOperation, ? extends activitydiagram.$default.algebra.operation.Activitydiagram$defaultValueOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramVariableOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramVariable_AspectOperation> algebra;
	private final activitydiagram.activitydiagram.algebra.impl.operation.ActivitydiagramActivitydiagramControlNodeOperation delegateControlNode;
	private final activitydiagram.activitydiagram.algebra.impl.operation.ActivitydiagramActivitydiagramActivityNodeOperation delegateActivityNode;
	private final activitydiagram.activitydiagram.algebra.impl.operation.ActivitydiagramActivitydiagramControlNode_AspectOperation delegateControlNode_Aspect;
	private final activitydiagram.activitydiagram.algebra.impl.operation.ActivitydiagramActivitydiagramActivityNode_AspectOperation delegateActivityNode_Aspect;
	
	public ActivitydiagramActivitydiagramMergeNodeOperation(final activitydiagram.MergeNode self, final activitydiagram.algebra.ActivitydiagramAlgebra<? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramActionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramAction_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramActivityOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramActivityEdgeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramActivityEdge_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramActivityFinalNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramActivityFinalNode_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramActivityNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramActivityNode_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramActivity_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramBooleanBinaryExpressionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramBooleanBinaryExpression_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramBooleanExpressionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramBooleanExpression_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramBooleanUnaryExpressionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramBooleanUnaryExpression_AspectOperation, ? extends activitydiagram.$default.algebra.operation.Activitydiagram$defaultBooleanValueOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramBooleanVariableOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramBooleanVariable_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramControlFlowOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramControlFlow_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramControlNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramControlNode_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramControlTokenOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramControlToken_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramDecisionNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramDecisionNode_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramExecutableNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramExecutableNode_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramExpressionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramExpression_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramFinalNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramFinalNode_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramForkNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramForkNode_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramForkedTokenOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramForkedToken_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramInitialNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramInitialNode_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramInputOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramInputOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramInputValueOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramInputValueOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramIntegerCalculationExpressionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramIntegerCalculationExpression_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramIntegerComparisonExpressionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramIntegerComparisonExpression_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramIntegerExpressionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramIntegerExpression_AspectOperation, ? extends activitydiagram.$default.algebra.operation.Activitydiagram$defaultIntegerValueOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramIntegerVariableOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramIntegerVariable_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramJoinNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramJoinNode_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramMergeNodeOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramMergeNode_AspectOperation, ? extends activitydiagram.$default.algebra.operation.Activitydiagram$defaultNamedElementOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramOfferOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramOffer_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramOpaqueActionOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramOpaqueAction_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramTokenOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramToken_AspectOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramTraceOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramTrace_AspectOperation, ? extends activitydiagram.$default.algebra.operation.Activitydiagram$defaultValueOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramVariableOperation, ? extends activitydiagram.activitydiagram.algebra.operation.ActivitydiagramActivitydiagramVariable_AspectOperation> algebra) {
		this.self = self;
		this.algebra = algebra;
		this.delegateControlNode = new activitydiagram.activitydiagram.algebra.impl.operation.ActivitydiagramActivitydiagramControlNodeOperation(self, algebra);
		this.delegateActivityNode = new activitydiagram.activitydiagram.algebra.impl.operation.ActivitydiagramActivitydiagramActivityNodeOperation(self, algebra);
		this.delegateControlNode_Aspect = new activitydiagram.activitydiagram.algebra.impl.operation.ActivitydiagramActivitydiagramControlNode_AspectOperation(self, algebra);
		this.delegateActivityNode_Aspect = new activitydiagram.activitydiagram.algebra.impl.operation.ActivitydiagramActivitydiagramActivityNode_AspectOperation(self, algebra);
	}
	
	
	
	
	public Boolean hasOffers() {
for(activitydiagram.ActivityEdge edge: self.getIncoming()) {
	if(algebra.$(edge).hasOffer()) {
				return true;
			} 
}
return false;
	}
	public void fire(org.eclipse.emf.common.util.EList<activitydiagram.Token> tokens) {
algebra.$(self).addTokens(tokens);
algebra.$(self).sendOffers(tokens);
	}
	public Boolean isReady() {
return this.delegateControlNode_Aspect.isReady() && this.hasOffers();
	}
	public void run() {
self.setRunning(true);
	}
	public Boolean isRunning() {
return algebra.$(self).getRunning();
	}
	public void terminate() {
self.setRunning(false);
	}
	public void sendOffers(org.eclipse.emf.common.util.EList<activitydiagram.Token> tokens) {
for(activitydiagram.ActivityEdge edge: self.getOutgoing()) {
	algebra.$(edge).sendOffer(tokens);
}
	}
	public org.eclipse.emf.common.util.EList<activitydiagram.Token> takeOfferedTokens() {
org.eclipse.emf.common.util.EList<activitydiagram.Token> allTokens = new org.eclipse.emf.common.util.BasicEList<>();;
for(activitydiagram.ActivityEdge edge: self.getIncoming()) {
	org.eclipse.emf.common.util.EList<activitydiagram.Token> tokens = algebra.$(edge).takeOfferedTokens();
	for(activitydiagram.Token token: tokens) {
		algebra.$(token).withdraw();
	}
	allTokens.addAll(tokens);
}
return allTokens;
	}
	public void addTokens(org.eclipse.emf.common.util.EList<activitydiagram.Token> tokens) {
for(activitydiagram.Token token: tokens) {
	activitydiagram.Token transferredToken = algebra.$(token).transfer(self);
	self.getHeldTokens().add(transferredToken);
}
	}
	public void removeToken(activitydiagram.Token token) {
self.getHeldTokens().remove(token);
	}
}
