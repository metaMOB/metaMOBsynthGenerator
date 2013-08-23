/**
 */
package uid.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import uid.EventNotification;
import uid.Mediator;
import uid.Notification;
import uid.UidPackage;
import uid.View;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Notification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uid.impl.EventNotificationImpl#getName <em>Name</em>}</li>
 *   <li>{@link uid.impl.EventNotificationImpl#getHasMediator <em>Has Mediator</em>}</li>
 *   <li>{@link uid.impl.EventNotificationImpl#getHasView <em>Has View</em>}</li>
 *   <li>{@link uid.impl.EventNotificationImpl#getHasNotification <em>Has Notification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventNotificationImpl extends EObjectImpl implements EventNotification {
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
	 * The cached value of the '{@link #getHasNotification() <em>Has Notification</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasNotification()
	 * @generated
	 * @ordered
	 */
	protected EList<Notification> hasNotification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventNotificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UidPackage.Literals.EVENT_NOTIFICATION;
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
			eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET, UidPackage.EVENT_NOTIFICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mediator getHasMediator() {
		if (eContainerFeatureID() != UidPackage.EVENT_NOTIFICATION__HAS_MEDIATOR) return null;
		return (Mediator)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasMediator(Mediator newHasMediator, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newHasMediator, UidPackage.EVENT_NOTIFICATION__HAS_MEDIATOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasMediator(Mediator newHasMediator) {
		if (newHasMediator != eInternalContainer() || (eContainerFeatureID() != UidPackage.EVENT_NOTIFICATION__HAS_MEDIATOR && newHasMediator != null)) {
			if (EcoreUtil.isAncestor(this, newHasMediator))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newHasMediator != null)
				msgs = ((InternalEObject)newHasMediator).eInverseAdd(this, UidPackage.MEDIATOR__HAS_EVENT_NOTIFICATION, Mediator.class, msgs);
			msgs = basicSetHasMediator(newHasMediator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET, UidPackage.EVENT_NOTIFICATION__HAS_MEDIATOR, newHasMediator, newHasMediator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public View getHasView() {
		if (eContainerFeatureID() != UidPackage.EVENT_NOTIFICATION__HAS_VIEW) return null;
		return (View)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasView(View newHasView, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newHasView, UidPackage.EVENT_NOTIFICATION__HAS_VIEW, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasView(View newHasView) {
		if (newHasView != eInternalContainer() || (eContainerFeatureID() != UidPackage.EVENT_NOTIFICATION__HAS_VIEW && newHasView != null)) {
			if (EcoreUtil.isAncestor(this, newHasView))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newHasView != null)
				msgs = ((InternalEObject)newHasView).eInverseAdd(this, UidPackage.VIEW__HAS_EVENT_NOTIFICATION, View.class, msgs);
			msgs = basicSetHasView(newHasView, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET, UidPackage.EVENT_NOTIFICATION__HAS_VIEW, newHasView, newHasView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Notification> getHasNotification() {
		if (hasNotification == null) {
			hasNotification = new EObjectResolvingEList<Notification>(Notification.class, this, UidPackage.EVENT_NOTIFICATION__HAS_NOTIFICATION);
		}
		return hasNotification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UidPackage.EVENT_NOTIFICATION__HAS_MEDIATOR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetHasMediator((Mediator)otherEnd, msgs);
			case UidPackage.EVENT_NOTIFICATION__HAS_VIEW:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetHasView((View)otherEnd, msgs);
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
			case UidPackage.EVENT_NOTIFICATION__HAS_MEDIATOR:
				return basicSetHasMediator(null, msgs);
			case UidPackage.EVENT_NOTIFICATION__HAS_VIEW:
				return basicSetHasView(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case UidPackage.EVENT_NOTIFICATION__HAS_MEDIATOR:
				return eInternalContainer().eInverseRemove(this, UidPackage.MEDIATOR__HAS_EVENT_NOTIFICATION, Mediator.class, msgs);
			case UidPackage.EVENT_NOTIFICATION__HAS_VIEW:
				return eInternalContainer().eInverseRemove(this, UidPackage.VIEW__HAS_EVENT_NOTIFICATION, View.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UidPackage.EVENT_NOTIFICATION__NAME:
				return getName();
			case UidPackage.EVENT_NOTIFICATION__HAS_MEDIATOR:
				return getHasMediator();
			case UidPackage.EVENT_NOTIFICATION__HAS_VIEW:
				return getHasView();
			case UidPackage.EVENT_NOTIFICATION__HAS_NOTIFICATION:
				return getHasNotification();
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
			case UidPackage.EVENT_NOTIFICATION__NAME:
				setName((String)newValue);
				return;
			case UidPackage.EVENT_NOTIFICATION__HAS_MEDIATOR:
				setHasMediator((Mediator)newValue);
				return;
			case UidPackage.EVENT_NOTIFICATION__HAS_VIEW:
				setHasView((View)newValue);
				return;
			case UidPackage.EVENT_NOTIFICATION__HAS_NOTIFICATION:
				getHasNotification().clear();
				getHasNotification().addAll((Collection<? extends Notification>)newValue);
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
			case UidPackage.EVENT_NOTIFICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UidPackage.EVENT_NOTIFICATION__HAS_MEDIATOR:
				setHasMediator((Mediator)null);
				return;
			case UidPackage.EVENT_NOTIFICATION__HAS_VIEW:
				setHasView((View)null);
				return;
			case UidPackage.EVENT_NOTIFICATION__HAS_NOTIFICATION:
				getHasNotification().clear();
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
			case UidPackage.EVENT_NOTIFICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UidPackage.EVENT_NOTIFICATION__HAS_MEDIATOR:
				return getHasMediator() != null;
			case UidPackage.EVENT_NOTIFICATION__HAS_VIEW:
				return getHasView() != null;
			case UidPackage.EVENT_NOTIFICATION__HAS_NOTIFICATION:
				return hasNotification != null && !hasNotification.isEmpty();
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

} //EventNotificationImpl
