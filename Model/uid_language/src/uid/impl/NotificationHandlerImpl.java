/**
 */
package uid.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import uid.Notification;
import uid.NotificationHandler;
import uid.Stage;
import uid.UidPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Notification Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uid.impl.NotificationHandlerImpl#getName <em>Name</em>}</li>
 *   <li>{@link uid.impl.NotificationHandlerImpl#getRecievesNotification <em>Recieves Notification</em>}</li>
 *   <li>{@link uid.impl.NotificationHandlerImpl#getSendsNotification <em>Sends Notification</em>}</li>
 *   <li>{@link uid.impl.NotificationHandlerImpl#getChangeStageTo <em>Change Stage To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NotificationHandlerImpl extends EObjectImpl implements NotificationHandler {
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
	 * The cached value of the '{@link #getRecievesNotification() <em>Recieves Notification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecievesNotification()
	 * @generated
	 * @ordered
	 */
	protected Notification recievesNotification;

	/**
	 * The cached value of the '{@link #getSendsNotification() <em>Sends Notification</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendsNotification()
	 * @generated
	 * @ordered
	 */
	protected EList<Notification> sendsNotification;

	/**
	 * The cached value of the '{@link #getChangeStageTo() <em>Change Stage To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeStageTo()
	 * @generated
	 * @ordered
	 */
	protected Stage changeStageTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotificationHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UidPackage.Literals.NOTIFICATION_HANDLER;
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
			eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET, UidPackage.NOTIFICATION_HANDLER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Notification getRecievesNotification() {
		if (recievesNotification != null && recievesNotification.eIsProxy()) {
			InternalEObject oldRecievesNotification = (InternalEObject)recievesNotification;
			recievesNotification = (Notification)eResolveProxy(oldRecievesNotification);
			if (recievesNotification != oldRecievesNotification) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.RESOLVE, UidPackage.NOTIFICATION_HANDLER__RECIEVES_NOTIFICATION, oldRecievesNotification, recievesNotification));
			}
		}
		return recievesNotification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Notification basicGetRecievesNotification() {
		return recievesNotification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecievesNotification(Notification newRecievesNotification) {
		Notification oldRecievesNotification = recievesNotification;
		recievesNotification = newRecievesNotification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET, UidPackage.NOTIFICATION_HANDLER__RECIEVES_NOTIFICATION, oldRecievesNotification, recievesNotification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Notification> getSendsNotification() {
		if (sendsNotification == null) {
			sendsNotification = new EObjectResolvingEList<Notification>(Notification.class, this, UidPackage.NOTIFICATION_HANDLER__SENDS_NOTIFICATION);
		}
		return sendsNotification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stage getChangeStageTo() {
		if (changeStageTo != null && changeStageTo.eIsProxy()) {
			InternalEObject oldChangeStageTo = (InternalEObject)changeStageTo;
			changeStageTo = (Stage)eResolveProxy(oldChangeStageTo);
			if (changeStageTo != oldChangeStageTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.RESOLVE, UidPackage.NOTIFICATION_HANDLER__CHANGE_STAGE_TO, oldChangeStageTo, changeStageTo));
			}
		}
		return changeStageTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stage basicGetChangeStageTo() {
		return changeStageTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeStageTo(Stage newChangeStageTo) {
		Stage oldChangeStageTo = changeStageTo;
		changeStageTo = newChangeStageTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET, UidPackage.NOTIFICATION_HANDLER__CHANGE_STAGE_TO, oldChangeStageTo, changeStageTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UidPackage.NOTIFICATION_HANDLER__NAME:
				return getName();
			case UidPackage.NOTIFICATION_HANDLER__RECIEVES_NOTIFICATION:
				if (resolve) return getRecievesNotification();
				return basicGetRecievesNotification();
			case UidPackage.NOTIFICATION_HANDLER__SENDS_NOTIFICATION:
				return getSendsNotification();
			case UidPackage.NOTIFICATION_HANDLER__CHANGE_STAGE_TO:
				if (resolve) return getChangeStageTo();
				return basicGetChangeStageTo();
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
			case UidPackage.NOTIFICATION_HANDLER__NAME:
				setName((String)newValue);
				return;
			case UidPackage.NOTIFICATION_HANDLER__RECIEVES_NOTIFICATION:
				setRecievesNotification((Notification)newValue);
				return;
			case UidPackage.NOTIFICATION_HANDLER__SENDS_NOTIFICATION:
				getSendsNotification().clear();
				getSendsNotification().addAll((Collection<? extends Notification>)newValue);
				return;
			case UidPackage.NOTIFICATION_HANDLER__CHANGE_STAGE_TO:
				setChangeStageTo((Stage)newValue);
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
			case UidPackage.NOTIFICATION_HANDLER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UidPackage.NOTIFICATION_HANDLER__RECIEVES_NOTIFICATION:
				setRecievesNotification((Notification)null);
				return;
			case UidPackage.NOTIFICATION_HANDLER__SENDS_NOTIFICATION:
				getSendsNotification().clear();
				return;
			case UidPackage.NOTIFICATION_HANDLER__CHANGE_STAGE_TO:
				setChangeStageTo((Stage)null);
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
			case UidPackage.NOTIFICATION_HANDLER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UidPackage.NOTIFICATION_HANDLER__RECIEVES_NOTIFICATION:
				return recievesNotification != null;
			case UidPackage.NOTIFICATION_HANDLER__SENDS_NOTIFICATION:
				return sendsNotification != null && !sendsNotification.isEmpty();
			case UidPackage.NOTIFICATION_HANDLER__CHANGE_STAGE_TO:
				return changeStageTo != null;
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

} //NotificationHandlerImpl
