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

import uid.Mediator;
import uid.Stage;
import uid.UidPackage;
import uid.Views;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Views</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uid.impl.ViewsImpl#getHasStage <em>Has Stage</em>}</li>
 *   <li>{@link uid.impl.ViewsImpl#getHasMediator <em>Has Mediator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewsImpl extends EObjectImpl implements Views {
	/**
	 * The cached value of the '{@link #getHasStage() <em>Has Stage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasStage()
	 * @generated
	 * @ordered
	 */
	protected EList<Stage> hasStage;

	/**
	 * The cached value of the '{@link #getHasMediator() <em>Has Mediator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasMediator()
	 * @generated
	 * @ordered
	 */
	protected EList<Mediator> hasMediator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UidPackage.Literals.VIEWS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stage> getHasStage() {
		if (hasStage == null) {
			hasStage = new EObjectContainmentEList<Stage>(Stage.class, this, UidPackage.VIEWS__HAS_STAGE);
		}
		return hasStage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mediator> getHasMediator() {
		if (hasMediator == null) {
			hasMediator = new EObjectContainmentEList<Mediator>(Mediator.class, this, UidPackage.VIEWS__HAS_MEDIATOR);
		}
		return hasMediator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UidPackage.VIEWS__HAS_STAGE:
				return ((InternalEList<?>)getHasStage()).basicRemove(otherEnd, msgs);
			case UidPackage.VIEWS__HAS_MEDIATOR:
				return ((InternalEList<?>)getHasMediator()).basicRemove(otherEnd, msgs);
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
			case UidPackage.VIEWS__HAS_STAGE:
				return getHasStage();
			case UidPackage.VIEWS__HAS_MEDIATOR:
				return getHasMediator();
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
			case UidPackage.VIEWS__HAS_STAGE:
				getHasStage().clear();
				getHasStage().addAll((Collection<? extends Stage>)newValue);
				return;
			case UidPackage.VIEWS__HAS_MEDIATOR:
				getHasMediator().clear();
				getHasMediator().addAll((Collection<? extends Mediator>)newValue);
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
			case UidPackage.VIEWS__HAS_STAGE:
				getHasStage().clear();
				return;
			case UidPackage.VIEWS__HAS_MEDIATOR:
				getHasMediator().clear();
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
			case UidPackage.VIEWS__HAS_STAGE:
				return hasStage != null && !hasStage.isEmpty();
			case UidPackage.VIEWS__HAS_MEDIATOR:
				return hasMediator != null && !hasMediator.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ViewsImpl
