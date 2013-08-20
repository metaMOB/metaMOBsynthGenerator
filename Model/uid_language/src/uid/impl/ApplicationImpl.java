/**
 */
package uid.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uid.Application;
import uid.Entity;
import uid.EntityTransition;
import uid.Mediator;
import uid.UidPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uid.impl.ApplicationImpl#getName <em>Name</em>}</li>
 *   <li>{@link uid.impl.ApplicationImpl#getHasEntityTransition <em>Has Entity Transition</em>}</li>
 *   <li>{@link uid.impl.ApplicationImpl#getHasEntities <em>Has Entities</em>}</li>
 *   <li>{@link uid.impl.ApplicationImpl#getHasMediator <em>Has Mediator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationImpl extends EObjectImpl implements Application {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasEntityTransition() <em>Has Entity Transition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasEntityTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityTransition> hasEntityTransition;

	/**
	 * The cached value of the '{@link #getHasEntities() <em>Has Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> hasEntities;

	/**
	 * The cached value of the '{@link #getHasMediator() <em>Has Mediator</em>}' reference list.
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
	protected ApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UidPackage.Literals.APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidPackage.APPLICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityTransition> getHasEntityTransition() {
		if (hasEntityTransition == null) {
			hasEntityTransition = new EObjectContainmentEList<EntityTransition>(EntityTransition.class, this, UidPackage.APPLICATION__HAS_ENTITY_TRANSITION);
		}
		return hasEntityTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getHasEntities() {
		if (hasEntities == null) {
			hasEntities = new EObjectContainmentEList<Entity>(Entity.class, this, UidPackage.APPLICATION__HAS_ENTITIES);
		}
		return hasEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mediator> getHasMediator() {
		if (hasMediator == null) {
			hasMediator = new EObjectResolvingEList<Mediator>(Mediator.class, this, UidPackage.APPLICATION__HAS_MEDIATOR);
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
			case UidPackage.APPLICATION__HAS_ENTITY_TRANSITION:
				return ((InternalEList<?>)getHasEntityTransition()).basicRemove(otherEnd, msgs);
			case UidPackage.APPLICATION__HAS_ENTITIES:
				return ((InternalEList<?>)getHasEntities()).basicRemove(otherEnd, msgs);
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
			case UidPackage.APPLICATION__NAME:
				return getName();
			case UidPackage.APPLICATION__HAS_ENTITY_TRANSITION:
				return getHasEntityTransition();
			case UidPackage.APPLICATION__HAS_ENTITIES:
				return getHasEntities();
			case UidPackage.APPLICATION__HAS_MEDIATOR:
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
			case UidPackage.APPLICATION__NAME:
				setName((String)newValue);
				return;
			case UidPackage.APPLICATION__HAS_ENTITY_TRANSITION:
				getHasEntityTransition().clear();
				getHasEntityTransition().addAll((Collection<? extends EntityTransition>)newValue);
				return;
			case UidPackage.APPLICATION__HAS_ENTITIES:
				getHasEntities().clear();
				getHasEntities().addAll((Collection<? extends Entity>)newValue);
				return;
			case UidPackage.APPLICATION__HAS_MEDIATOR:
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
			case UidPackage.APPLICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UidPackage.APPLICATION__HAS_ENTITY_TRANSITION:
				getHasEntityTransition().clear();
				return;
			case UidPackage.APPLICATION__HAS_ENTITIES:
				getHasEntities().clear();
				return;
			case UidPackage.APPLICATION__HAS_MEDIATOR:
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
			case UidPackage.APPLICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UidPackage.APPLICATION__HAS_ENTITY_TRANSITION:
				return hasEntityTransition != null && !hasEntityTransition.isEmpty();
			case UidPackage.APPLICATION__HAS_ENTITIES:
				return hasEntities != null && !hasEntities.isEmpty();
			case UidPackage.APPLICATION__HAS_MEDIATOR:
				return hasMediator != null && !hasMediator.isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ApplicationImpl
