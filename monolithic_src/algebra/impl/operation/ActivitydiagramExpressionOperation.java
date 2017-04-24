package algebra.impl.operation;

public abstract class ActivitydiagramExpressionOperation
		implements algebra.operation.Activitydiagram$defaultExpressionOperation {

	private final activitydiagram.Expression self;

	public ActivitydiagramExpressionOperation(final activitydiagram.Expression self, Object algebra) {
		this.self = self;
	}

}
