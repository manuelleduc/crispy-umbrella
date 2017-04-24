/**
 */
package activitydiagramoa.impl;

import activitydiagramoa.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivitydiagramoaFactoryImpl extends EFactoryImpl implements ActivitydiagramoaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActivitydiagramoaFactory init() {
		try {
			ActivitydiagramoaFactory theActivitydiagramoaFactory = (ActivitydiagramoaFactory)EPackage.Registry.INSTANCE.getEFactory(ActivitydiagramoaPackage.eNS_URI);
			if (theActivitydiagramoaFactory != null) {
				return theActivitydiagramoaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ActivitydiagramoaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivitydiagramoaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ActivitydiagramoaPackage.ACTIVITY: return createActivity();
			case ActivitydiagramoaPackage.CONTROL_FLOW: return createControlFlow();
			case ActivitydiagramoaPackage.OPAQUE_ACTION: return createOpaqueAction();
			case ActivitydiagramoaPackage.INITIAL_NODE: return createInitialNode();
			case ActivitydiagramoaPackage.ACTIVITY_FINAL_NODE: return createActivityFinalNode();
			case ActivitydiagramoaPackage.FORK_NODE: return createForkNode();
			case ActivitydiagramoaPackage.JOIN_NODE: return createJoinNode();
			case ActivitydiagramoaPackage.MERGE_NODE: return createMergeNode();
			case ActivitydiagramoaPackage.DECISION_NODE: return createDecisionNode();
			case ActivitydiagramoaPackage.INTEGER_VARIABLE: return createIntegerVariable();
			case ActivitydiagramoaPackage.BOOLEAN_VARIABLE: return createBooleanVariable();
			case ActivitydiagramoaPackage.BOOLEAN_VALUE: return createBooleanValue();
			case ActivitydiagramoaPackage.INTEGER_VALUE: return createIntegerValue();
			case ActivitydiagramoaPackage.INTEGER_CALCULATION_EXPRESSION: return createIntegerCalculationExpression();
			case ActivitydiagramoaPackage.INTEGER_COMPARISON_EXPRESSION: return createIntegerComparisonExpression();
			case ActivitydiagramoaPackage.BOOLEAN_UNARY_EXPRESSION: return createBooleanUnaryExpression();
			case ActivitydiagramoaPackage.BOOLEAN_BINARY_EXPRESSION: return createBooleanBinaryExpression();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ActivitydiagramoaPackage.INTEGER_CALCULATION_OPERATOR:
				return createIntegerCalculationOperatorFromString(eDataType, initialValue);
			case ActivitydiagramoaPackage.INTEGER_COMPARISON_OPERATOR:
				return createIntegerComparisonOperatorFromString(eDataType, initialValue);
			case ActivitydiagramoaPackage.BOOLEAN_UNARY_OPERATOR:
				return createBooleanUnaryOperatorFromString(eDataType, initialValue);
			case ActivitydiagramoaPackage.BOOLEAN_BINARY_OPERATOR:
				return createBooleanBinaryOperatorFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ActivitydiagramoaPackage.INTEGER_CALCULATION_OPERATOR:
				return convertIntegerCalculationOperatorToString(eDataType, instanceValue);
			case ActivitydiagramoaPackage.INTEGER_COMPARISON_OPERATOR:
				return convertIntegerComparisonOperatorToString(eDataType, instanceValue);
			case ActivitydiagramoaPackage.BOOLEAN_UNARY_OPERATOR:
				return convertBooleanUnaryOperatorToString(eDataType, instanceValue);
			case ActivitydiagramoaPackage.BOOLEAN_BINARY_OPERATOR:
				return convertBooleanBinaryOperatorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlow createControlFlow() {
		ControlFlowImpl controlFlow = new ControlFlowImpl();
		return controlFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueAction createOpaqueAction() {
		OpaqueActionImpl opaqueAction = new OpaqueActionImpl();
		return opaqueAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialNode createInitialNode() {
		InitialNodeImpl initialNode = new InitialNodeImpl();
		return initialNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityFinalNode createActivityFinalNode() {
		ActivityFinalNodeImpl activityFinalNode = new ActivityFinalNodeImpl();
		return activityFinalNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForkNode createForkNode() {
		ForkNodeImpl forkNode = new ForkNodeImpl();
		return forkNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinNode createJoinNode() {
		JoinNodeImpl joinNode = new JoinNodeImpl();
		return joinNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MergeNode createMergeNode() {
		MergeNodeImpl mergeNode = new MergeNodeImpl();
		return mergeNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionNode createDecisionNode() {
		DecisionNodeImpl decisionNode = new DecisionNodeImpl();
		return decisionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerVariable createIntegerVariable() {
		IntegerVariableImpl integerVariable = new IntegerVariableImpl();
		return integerVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanVariable createBooleanVariable() {
		BooleanVariableImpl booleanVariable = new BooleanVariableImpl();
		return booleanVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanValue createBooleanValue() {
		BooleanValueImpl booleanValue = new BooleanValueImpl();
		return booleanValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerValue createIntegerValue() {
		IntegerValueImpl integerValue = new IntegerValueImpl();
		return integerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerCalculationExpression createIntegerCalculationExpression() {
		IntegerCalculationExpressionImpl integerCalculationExpression = new IntegerCalculationExpressionImpl();
		return integerCalculationExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerComparisonExpression createIntegerComparisonExpression() {
		IntegerComparisonExpressionImpl integerComparisonExpression = new IntegerComparisonExpressionImpl();
		return integerComparisonExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanUnaryExpression createBooleanUnaryExpression() {
		BooleanUnaryExpressionImpl booleanUnaryExpression = new BooleanUnaryExpressionImpl();
		return booleanUnaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanBinaryExpression createBooleanBinaryExpression() {
		BooleanBinaryExpressionImpl booleanBinaryExpression = new BooleanBinaryExpressionImpl();
		return booleanBinaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerCalculationOperator createIntegerCalculationOperatorFromString(EDataType eDataType, String initialValue) {
		IntegerCalculationOperator result = IntegerCalculationOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegerCalculationOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerComparisonOperator createIntegerComparisonOperatorFromString(EDataType eDataType, String initialValue) {
		IntegerComparisonOperator result = IntegerComparisonOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegerComparisonOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanUnaryOperator createBooleanUnaryOperatorFromString(EDataType eDataType, String initialValue) {
		BooleanUnaryOperator result = BooleanUnaryOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanUnaryOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanBinaryOperator createBooleanBinaryOperatorFromString(EDataType eDataType, String initialValue) {
		BooleanBinaryOperator result = BooleanBinaryOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanBinaryOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivitydiagramoaPackage getActivitydiagramoaPackage() {
		return (ActivitydiagramoaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ActivitydiagramoaPackage getPackage() {
		return ActivitydiagramoaPackage.eINSTANCE;
	}

} //ActivitydiagramoaFactoryImpl
