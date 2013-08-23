/**
 */
package uid.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uid.Matrix;
import uid.UidPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Matrix</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uid.impl.MatrixImpl#getImage_background <em>Image background</em>}</li>
 *   <li>{@link uid.impl.MatrixImpl#getImage_tap <em>Image tap</em>}</li>
 *   <li>{@link uid.impl.MatrixImpl#getImage_doubleTap <em>Image double Tap</em>}</li>
 *   <li>{@link uid.impl.MatrixImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MatrixImpl extends ComponentImpl implements Matrix {
	/**
	 * The default value of the '{@link #getImage_background() <em>Image background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage_background()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_BACKGROUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImage_background() <em>Image background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage_background()
	 * @generated
	 * @ordered
	 */
	protected String image_background = IMAGE_BACKGROUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getImage_tap() <em>Image tap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage_tap()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_TAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImage_tap() <em>Image tap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage_tap()
	 * @generated
	 * @ordered
	 */
	protected String image_tap = IMAGE_TAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getImage_doubleTap() <em>Image double Tap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage_doubleTap()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_DOUBLE_TAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImage_doubleTap() <em>Image double Tap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage_doubleTap()
	 * @generated
	 * @ordered
	 */
	protected String image_doubleTap = IMAGE_DOUBLE_TAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatrixImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UidPackage.Literals.MATRIX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImage_background() {
		return image_background;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImage_background(String newImage_background) {
		String oldImage_background = image_background;
		image_background = newImage_background;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidPackage.MATRIX__IMAGE_BACKGROUND, oldImage_background, image_background));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImage_tap() {
		return image_tap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImage_tap(String newImage_tap) {
		String oldImage_tap = image_tap;
		image_tap = newImage_tap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidPackage.MATRIX__IMAGE_TAP, oldImage_tap, image_tap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImage_doubleTap() {
		return image_doubleTap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImage_doubleTap(String newImage_doubleTap) {
		String oldImage_doubleTap = image_doubleTap;
		image_doubleTap = newImage_doubleTap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidPackage.MATRIX__IMAGE_DOUBLE_TAP, oldImage_doubleTap, image_doubleTap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidPackage.MATRIX__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UidPackage.MATRIX__IMAGE_BACKGROUND:
				return getImage_background();
			case UidPackage.MATRIX__IMAGE_TAP:
				return getImage_tap();
			case UidPackage.MATRIX__IMAGE_DOUBLE_TAP:
				return getImage_doubleTap();
			case UidPackage.MATRIX__VALUE:
				return getValue();
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
			case UidPackage.MATRIX__IMAGE_BACKGROUND:
				setImage_background((String)newValue);
				return;
			case UidPackage.MATRIX__IMAGE_TAP:
				setImage_tap((String)newValue);
				return;
			case UidPackage.MATRIX__IMAGE_DOUBLE_TAP:
				setImage_doubleTap((String)newValue);
				return;
			case UidPackage.MATRIX__VALUE:
				setValue((String)newValue);
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
			case UidPackage.MATRIX__IMAGE_BACKGROUND:
				setImage_background(IMAGE_BACKGROUND_EDEFAULT);
				return;
			case UidPackage.MATRIX__IMAGE_TAP:
				setImage_tap(IMAGE_TAP_EDEFAULT);
				return;
			case UidPackage.MATRIX__IMAGE_DOUBLE_TAP:
				setImage_doubleTap(IMAGE_DOUBLE_TAP_EDEFAULT);
				return;
			case UidPackage.MATRIX__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case UidPackage.MATRIX__IMAGE_BACKGROUND:
				return IMAGE_BACKGROUND_EDEFAULT == null ? image_background != null : !IMAGE_BACKGROUND_EDEFAULT.equals(image_background);
			case UidPackage.MATRIX__IMAGE_TAP:
				return IMAGE_TAP_EDEFAULT == null ? image_tap != null : !IMAGE_TAP_EDEFAULT.equals(image_tap);
			case UidPackage.MATRIX__IMAGE_DOUBLE_TAP:
				return IMAGE_DOUBLE_TAP_EDEFAULT == null ? image_doubleTap != null : !IMAGE_DOUBLE_TAP_EDEFAULT.equals(image_doubleTap);
			case UidPackage.MATRIX__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
		result.append(" (image_background: ");
		result.append(image_background);
		result.append(", image_tap: ");
		result.append(image_tap);
		result.append(", image_doubleTap: ");
		result.append(image_doubleTap);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //MatrixImpl
