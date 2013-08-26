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

import uid.Notification;
import uid.Notifications;
import uid.UidPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Notifications</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uid.impl.NotificationsImpl#getHasNotification <em>Has Notification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NotificationsImpl extends EObjectImpl implements Notifications {
	/**
	 * The cached value of the '{@link #getHasNotification() <em>Has Notification</em>}' containment reference list.
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
	protected NotificationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UidPackage.Literals.NOTIFICATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Notification> getHasNotification() {
		if (hasNotification == null) {
			hasNotification = new EObjectContainmentEList<Notification>(Notification.class, this, UidPackage.NOTIFICATIONS__HAS_NOTIFICATION);
		}
		return hasNotification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UidPackage.NOTIFICATIONS__HAS_NOTIFICATION:
				return ((InternalEList<?>)getHasNotification()).basicRemove(otherEnd, msgs);
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
			case UidPackage.NOTIFICATIONS__HAS_NOTIFICATION:
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
			case UidPackage.NOTIFICATIONS__HAS_NOTIFICATION:
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
			case UidPackage.NOTIFICATIONS__HAS_NOTIFICATION:
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
			case UidPackage.NOTIFICATIONS__HAS_NOTIFICATION:
				return hasNotification != null && !hasNotification.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NotificationsImpl
