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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

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
	 * The cached value of the '{@link #getHasEntityTransition() <em>Has Entity Transition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasEntityTransition()
	 * @generated
	 * @ordered
	 */
	protected EntityTransition hasEntityTransition;

	/**
	 * The cached value of the '{@link #getHasEntities() <em>Has Entities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasEntities()
	 * @generated
	 * @ordered
	 */
	protected Entity hasEntities;

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
	public EntityTransition getHasEntityTransition() {
		return hasEntityTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasEntityTransition(EntityTransition newHasEntityTransition, NotificationChain msgs) {
		EntityTransition oldHasEntityTransition = hasEntityTransition;
		hasEntityTransition = newHasEntityTransition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UidPackage.APPLICATION__HAS_ENTITY_TRANSITION, oldHasEntityTransition, newHasEntityTransition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasEntityTransition(EntityTransition newHasEntityTransition) {
		if (newHasEntityTransition != hasEntityTransition) {
			NotificationChain msgs = null;
			if (hasEntityTransition != null)
				msgs = ((InternalEObject)hasEntityTransition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UidPackage.APPLICATION__HAS_ENTITY_TRANSITION, null, msgs);
			if (newHasEntityTransition != null)
				msgs = ((InternalEObject)newHasEntityTransition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UidPackage.APPLICATION__HAS_ENTITY_TRANSITION, null, msgs);
			msgs = basicSetHasEntityTransition(newHasEntityTransition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidPackage.APPLICATION__HAS_ENTITY_TRANSITION, newHasEntityTransition, newHasEntityTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getHasEntities() {
		return hasEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasEntities(Entity newHasEntities, NotificationChain msgs) {
		Entity oldHasEntities = hasEntities;
		hasEntities = newHasEntities;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UidPackage.APPLICATION__HAS_ENTITIES, oldHasEntities, newHasEntities);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasEntities(Entity newHasEntities) {
		if (newHasEntities != hasEntities) {
			NotificationChain msgs = null;
			if (hasEntities != null)
				msgs = ((InternalEObject)hasEntities).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UidPackage.APPLICATION__HAS_ENTITIES, null, msgs);
			if (newHasEntities != null)
				msgs = ((InternalEObject)newHasEntities).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UidPackage.APPLICATION__HAS_ENTITIES, null, msgs);
			msgs = basicSetHasEntities(newHasEntities, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidPackage.APPLICATION__HAS_ENTITIES, newHasEntities, newHasEntities));
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
				return basicSetHasEntityTransition(null, msgs);
			case UidPackage.APPLICATION__HAS_ENTITIES:
				return basicSetHasEntities(null, msgs);
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
				setHasEntityTransition((EntityTransition)newValue);
				return;
			case UidPackage.APPLICATION__HAS_ENTITIES:
				setHasEntities((Entity)newValue);
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
				setHasEntityTransition((EntityTransition)null);
				return;
			case UidPackage.APPLICATION__HAS_ENTITIES:
				setHasEntities((Entity)null);
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
				return hasEntityTransition != null;
			case UidPackage.APPLICATION__HAS_ENTITIES:
				return hasEntities != null;
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
