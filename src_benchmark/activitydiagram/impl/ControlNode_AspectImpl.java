/**
 */
package activitydiagram.impl;

import activitydiagram.ActivityNode_Aspect;
import activitydiagram.ActivitydiagramPackage;
import activitydiagram.ControlNode_Aspect;
import activitydiagram.Token;

import activitydiagramoa.impl.ControlNodeImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Node Aspect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link activitydiagram.impl.ControlNode_AspectImpl#getHeldTokens <em>Held Tokens</em>}</li>
 *   <li>{@link activitydiagram.impl.ControlNode_AspectImpl#isRunning <em>Running</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlNode_AspectImpl extends ControlNodeImpl implements ControlNode_Aspect {
	/**
	 * The cached value of the '{@link #getHeldTokens() <em>Held Tokens</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeldTokens()
	 * @generated
	 * @ordered
	 */
	protected EList<Token> heldTokens;

	/**
	 * The default value of the '{@link #isRunning() <em>Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRunning()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RUNNING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRunning() <em>Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRunning()
	 * @generated
	 * @ordered
	 */
	protected boolean running = RUNNING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlNode_AspectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitydiagramPackage.Literals.CONTROL_NODE_ASPECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Token> getHeldTokens() {
		if (heldTokens == null) {
			heldTokens = new EObjectContainmentEList<Token>(Token.class, this, ActivitydiagramPackage.CONTROL_NODE_ASPECT__HELD_TOKENS);
		}
		return heldTokens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRunning() {
		return running;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunning(boolean newRunning) {
		boolean oldRunning = running;
		running = newRunning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitydiagramPackage.CONTROL_NODE_ASPECT__RUNNING, oldRunning, running));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivitydiagramPackage.CONTROL_NODE_ASPECT__HELD_TOKENS:
				return ((InternalEList<?>)getHeldTokens()).basicRemove(otherEnd, msgs);
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
			case ActivitydiagramPackage.CONTROL_NODE_ASPECT__HELD_TOKENS:
				return getHeldTokens();
			case ActivitydiagramPackage.CONTROL_NODE_ASPECT__RUNNING:
				return isRunning();
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
			case ActivitydiagramPackage.CONTROL_NODE_ASPECT__HELD_TOKENS:
				getHeldTokens().clear();
				getHeldTokens().addAll((Collection<? extends Token>)newValue);
				return;
			case ActivitydiagramPackage.CONTROL_NODE_ASPECT__RUNNING:
				setRunning((Boolean)newValue);
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
			case ActivitydiagramPackage.CONTROL_NODE_ASPECT__HELD_TOKENS:
				getHeldTokens().clear();
				return;
			case ActivitydiagramPackage.CONTROL_NODE_ASPECT__RUNNING:
				setRunning(RUNNING_EDEFAULT);
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
			case ActivitydiagramPackage.CONTROL_NODE_ASPECT__HELD_TOKENS:
				return heldTokens != null && !heldTokens.isEmpty();
			case ActivitydiagramPackage.CONTROL_NODE_ASPECT__RUNNING:
				return running != RUNNING_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ActivityNode_Aspect.class) {
			switch (derivedFeatureID) {
				case ActivitydiagramPackage.CONTROL_NODE_ASPECT__HELD_TOKENS: return ActivitydiagramPackage.ACTIVITY_NODE_ASPECT__HELD_TOKENS;
				case ActivitydiagramPackage.CONTROL_NODE_ASPECT__RUNNING: return ActivitydiagramPackage.ACTIVITY_NODE_ASPECT__RUNNING;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ActivityNode_Aspect.class) {
			switch (baseFeatureID) {
				case ActivitydiagramPackage.ACTIVITY_NODE_ASPECT__HELD_TOKENS: return ActivitydiagramPackage.CONTROL_NODE_ASPECT__HELD_TOKENS;
				case ActivitydiagramPackage.ACTIVITY_NODE_ASPECT__RUNNING: return ActivitydiagramPackage.CONTROL_NODE_ASPECT__RUNNING;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (running: ");
		result.append(running);
		result.append(')');
		return result.toString();
	}

} //ControlNode_AspectImpl
