/**
 */
package uid.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uid.Command;
import uid.Controllers;
import uid.UidPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controllers</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uid.impl.ControllersImpl#getHasCommand <em>Has Command</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ControllersImpl extends EObjectImpl implements Controllers {
	/**
	 * The cached value of the '{@link #getHasCommand() <em>Has Command</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasCommand()
	 * @generated
	 * @ordered
	 */
	protected EList<Command> hasCommand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControllersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UidPackage.Literals.CONTROLLERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Command> getHasCommand() {
		if (hasCommand == null) {
			hasCommand = new EObjectContainmentEList<Command>(Command.class, this, UidPackage.CONTROLLERS__HAS_COMMAND);
		}
		return hasCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UidPackage.CONTROLLERS__HAS_COMMAND:
				return ((InternalEList<?>)getHasCommand()).basicRemove(otherEnd, msgs);
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
			case UidPackage.CONTROLLERS__HAS_COMMAND:
				return getHasCommand();
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
			case UidPackage.CONTROLLERS__HAS_COMMAND:
				getHasCommand().clear();
				getHasCommand().addAll((Collection<? extends Command>)newValue);
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
			case UidPackage.CONTROLLERS__HAS_COMMAND:
				getHasCommand().clear();
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
			case UidPackage.CONTROLLERS__HAS_COMMAND:
				return hasCommand != null && !hasCommand.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ControllersImpl
