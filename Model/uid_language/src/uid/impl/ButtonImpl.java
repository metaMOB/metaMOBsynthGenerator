/**
 */
package uid.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uid.Button;
import uid.UidPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uid.impl.ButtonImpl#getImage_on <em>Image on</em>}</li>
 *   <li>{@link uid.impl.ButtonImpl#getImage_off <em>Image off</em>}</li>
 *   <li>{@link uid.impl.ButtonImpl#getImage_disabled <em>Image disabled</em>}</li>
 *   <li>{@link uid.impl.ButtonImpl#getNotification_pressed <em>Notification pressed</em>}</li>
 *   <li>{@link uid.impl.ButtonImpl#getNotification_released <em>Notification released</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ButtonImpl extends EntityImpl implements Button {
	/**
	 * The default value of the '{@link #getImage_on() <em>Image on</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage_on()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_ON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImage_on() <em>Image on</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage_on()
	 * @generated
	 * @ordered
	 */
	protected String image_on = IMAGE_ON_EDEFAULT;

	/**
	 * The default value of the '{@link #getImage_off() <em>Image off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage_off()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_OFF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImage_off() <em>Image off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage_off()
	 * @generated
	 * @ordered
	 */
	protected String image_off = IMAGE_OFF_EDEFAULT;

	/**
	 * The default value of the '{@link #getImage_disabled() <em>Image disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage_disabled()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_DISABLED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImage_disabled() <em>Image disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage_disabled()
	 * @generated
	 * @ordered
	 */
	protected String image_disabled = IMAGE_DISABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotification_pressed() <em>Notification pressed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotification_pressed()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTIFICATION_PRESSED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotification_pressed() <em>Notification pressed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotification_pressed()
	 * @generated
	 * @ordered
	 */
	protected String notification_pressed = NOTIFICATION_PRESSED_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotification_released() <em>Notification released</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotification_released()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTIFICATION_RELEASED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotification_released() <em>Notification released</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotification_released()
	 * @generated
	 * @ordered
	 */
	protected String notification_released = NOTIFICATION_RELEASED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ButtonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UidPackage.Literals.BUTTON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImage_on() {
		return image_on;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImage_on(String newImage_on) {
		String oldImage_on = image_on;
		image_on = newImage_on;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidPackage.BUTTON__IMAGE_ON, oldImage_on, image_on));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImage_off() {
		return image_off;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImage_off(String newImage_off) {
		String oldImage_off = image_off;
		image_off = newImage_off;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidPackage.BUTTON__IMAGE_OFF, oldImage_off, image_off));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImage_disabled() {
		return image_disabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImage_disabled(String newImage_disabled) {
		String oldImage_disabled = image_disabled;
		image_disabled = newImage_disabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidPackage.BUTTON__IMAGE_DISABLED, oldImage_disabled, image_disabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNotification_pressed() {
		return notification_pressed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotification_pressed(String newNotification_pressed) {
		String oldNotification_pressed = notification_pressed;
		notification_pressed = newNotification_pressed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidPackage.BUTTON__NOTIFICATION_PRESSED, oldNotification_pressed, notification_pressed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNotification_released() {
		return notification_released;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotification_released(String newNotification_released) {
		String oldNotification_released = notification_released;
		notification_released = newNotification_released;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidPackage.BUTTON__NOTIFICATION_RELEASED, oldNotification_released, notification_released));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UidPackage.BUTTON__IMAGE_ON:
				return getImage_on();
			case UidPackage.BUTTON__IMAGE_OFF:
				return getImage_off();
			case UidPackage.BUTTON__IMAGE_DISABLED:
				return getImage_disabled();
			case UidPackage.BUTTON__NOTIFICATION_PRESSED:
				return getNotification_pressed();
			case UidPackage.BUTTON__NOTIFICATION_RELEASED:
				return getNotification_released();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UidPackage.BUTTON__IMAGE_ON:
				setImage_on((String)newValue);
				return;
			case UidPackage.BUTTON__IMAGE_OFF:
				setImage_off((String)newValue);
				return;
			case UidPackage.BUTTON__IMAGE_DISABLED:
				setImage_disabled((String)newValue);
				return;
			case UidPackage.BUTTON__NOTIFICATION_PRESSED:
				setNotification_pressed((String)newValue);
				return;
			case UidPackage.BUTTON__NOTIFICATION_RELEASED:
				setNotification_released((String)newValue);
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
			case UidPackage.BUTTON__IMAGE_ON:
				setImage_on(IMAGE_ON_EDEFAULT);
				return;
			case UidPackage.BUTTON__IMAGE_OFF:
				setImage_off(IMAGE_OFF_EDEFAULT);
				return;
			case UidPackage.BUTTON__IMAGE_DISABLED:
				setImage_disabled(IMAGE_DISABLED_EDEFAULT);
				return;
			case UidPackage.BUTTON__NOTIFICATION_PRESSED:
				setNotification_pressed(NOTIFICATION_PRESSED_EDEFAULT);
				return;
			case UidPackage.BUTTON__NOTIFICATION_RELEASED:
				setNotification_released(NOTIFICATION_RELEASED_EDEFAULT);
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
			case UidPackage.BUTTON__IMAGE_ON:
				return IMAGE_ON_EDEFAULT == null ? image_on != null : !IMAGE_ON_EDEFAULT.equals(image_on);
			case UidPackage.BUTTON__IMAGE_OFF:
				return IMAGE_OFF_EDEFAULT == null ? image_off != null : !IMAGE_OFF_EDEFAULT.equals(image_off);
			case UidPackage.BUTTON__IMAGE_DISABLED:
				return IMAGE_DISABLED_EDEFAULT == null ? image_disabled != null : !IMAGE_DISABLED_EDEFAULT.equals(image_disabled);
			case UidPackage.BUTTON__NOTIFICATION_PRESSED:
				return NOTIFICATION_PRESSED_EDEFAULT == null ? notification_pressed != null : !NOTIFICATION_PRESSED_EDEFAULT.equals(notification_pressed);
			case UidPackage.BUTTON__NOTIFICATION_RELEASED:
				return NOTIFICATION_RELEASED_EDEFAULT == null ? notification_released != null : !NOTIFICATION_RELEASED_EDEFAULT.equals(notification_released);
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
		result.append(" (image_on: ");
		result.append(image_on);
		result.append(", image_off: ");
		result.append(image_off);
		result.append(", image_disabled: ");
		result.append(image_disabled);
		result.append(", notification_pressed: ");
		result.append(notification_pressed);
		result.append(", notification_released: ");
		result.append(notification_released);
		result.append(')');
		return result.toString();
	}

} //ButtonImpl
