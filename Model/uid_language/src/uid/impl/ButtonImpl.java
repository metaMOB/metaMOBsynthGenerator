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
 *   <li>{@link uid.impl.ButtonImpl#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ButtonImpl extends ComponentImpl implements Button {
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
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

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
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidPackage.BUTTON__LABEL, oldLabel, label));
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
			case UidPackage.BUTTON__LABEL:
				return getLabel();
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
			case UidPackage.BUTTON__LABEL:
				setLabel((String)newValue);
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
			case UidPackage.BUTTON__LABEL:
				setLabel(LABEL_EDEFAULT);
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
			case UidPackage.BUTTON__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
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
		result.append(", label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //ButtonImpl
