/**
 */
package activitydiagramoa.impl;

import activitydiagramoa.Activity;
import activitydiagramoa.ActivityEdge;
import activitydiagramoa.ActivityNode;
import activitydiagramoa.ActivitydiagramoaPackage;
import activitydiagramoa.Variable;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link activitydiagramoa.impl.ActivityImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link activitydiagramoa.impl.ActivityImpl#getEdges <em>Edges</em>}</li>
 *   <li>{@link activitydiagramoa.impl.ActivityImpl#getLocals <em>Locals</em>}</li>
 *   <li>{@link activitydiagramoa.impl.ActivityImpl#getInputs <em>Inputs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityImpl extends NamedElementImpl implements Activity {
	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNode> nodes;

	/**
	 * The cached value of the '{@link #getEdges() <em>Edges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge> edges;

	/**
	 * The cached value of the '{@link #getLocals() <em>Locals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocals()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> locals;

	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> inputs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitydiagramoaPackage.Literals.ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentWithInverseEList<ActivityNode>(ActivityNode.class, this, ActivitydiagramoaPackage.ACTIVITY__NODES, ActivitydiagramoaPackage.ACTIVITY_NODE__ACTIVITY);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getEdges() {
		if (edges == null) {
			edges = new EObjectContainmentEList<ActivityEdge>(ActivityEdge.class, this, ActivitydiagramoaPackage.ACTIVITY__EDGES);
		}
		return edges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getLocals() {
		if (locals == null) {
			locals = new EObjectContainmentEList<Variable>(Variable.class, this, ActivitydiagramoaPackage.ACTIVITY__LOCALS);
		}
		return locals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getInputs() {
		if (inputs == null) {
			inputs = new EObjectContainmentEList<Variable>(Variable.class, this, ActivitydiagramoaPackage.ACTIVITY__INPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivitydiagramoaPackage.ACTIVITY__NODES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNodes()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivitydiagramoaPackage.ACTIVITY__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case ActivitydiagramoaPackage.ACTIVITY__EDGES:
				return ((InternalEList<?>)getEdges()).basicRemove(otherEnd, msgs);
			case ActivitydiagramoaPackage.ACTIVITY__LOCALS:
				return ((InternalEList<?>)getLocals()).basicRemove(otherEnd, msgs);
			case ActivitydiagramoaPackage.ACTIVITY__INPUTS:
				return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActivitydiagramoaPackage.ACTIVITY__NODES:
				return getNodes();
			case ActivitydiagramoaPackage.ACTIVITY__EDGES:
				return getEdges();
			case ActivitydiagramoaPackage.ACTIVITY__LOCALS:
				return getLocals();
			case ActivitydiagramoaPackage.ACTIVITY__INPUTS:
				return getInputs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ActivitydiagramoaPackage.ACTIVITY__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends ActivityNode>)newValue);
				return;
			case ActivitydiagramoaPackage.ACTIVITY__EDGES:
				getEdges().clear();
				getEdges().addAll((Collection<? extends ActivityEdge>)newValue);
				return;
			case ActivitydiagramoaPackage.ACTIVITY__LOCALS:
				getLocals().clear();
				getLocals().addAll((Collection<? extends Variable>)newValue);
				return;
			case ActivitydiagramoaPackage.ACTIVITY__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends Variable>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ActivitydiagramoaPackage.ACTIVITY__NODES:
				getNodes().clear();
				return;
			case ActivitydiagramoaPackage.ACTIVITY__EDGES:
				getEdges().clear();
				return;
			case ActivitydiagramoaPackage.ACTIVITY__LOCALS:
				getLocals().clear();
				return;
			case ActivitydiagramoaPackage.ACTIVITY__INPUTS:
				getInputs().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ActivitydiagramoaPackage.ACTIVITY__NODES:
				return nodes != null && !nodes.isEmpty();
			case ActivitydiagramoaPackage.ACTIVITY__EDGES:
				return edges != null && !edges.isEmpty();
			case ActivitydiagramoaPackage.ACTIVITY__LOCALS:
				return locals != null && !locals.isEmpty();
			case ActivitydiagramoaPackage.ACTIVITY__INPUTS:
				return inputs != null && !inputs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActivityImpl
