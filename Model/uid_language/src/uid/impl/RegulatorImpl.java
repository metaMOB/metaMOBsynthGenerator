/**
 */
package uid.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uid.Regulator;
import uid.UidPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regulator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uid.impl.RegulatorImpl#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link uid.impl.RegulatorImpl#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link uid.impl.RegulatorImpl#getNotification_changed <em>Notification changed</em>}</li>
 *   <li>{@link uid.impl.RegulatorImpl#getNotification_doubleTap <em>Notification double Tap</em>}</li>
 *   <li>{@link uid.impl.RegulatorImpl#getValue <em>Value</em>}</li>
 *   <li>{@link uid.impl.RegulatorImpl#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RegulatorImpl extends EntityImpl implements Regulator {
	/**
	 * The default value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValue()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValue()
	 * @generated
	 * @ordered
	 */
	protected double minValue = MIN_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected double maxValue = MAX_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotification_changed() <em>Notification changed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotification_changed()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTIFICATION_CHANGED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotification_changed() <em>Notification changed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotification_changed()
	 * @generated
	 * @ordered
	 */
	protected String notification_changed = NOTIFICATION_CHANGED_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotification_doubleTap() <em>Notification double Tap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotification_doubleTap()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTIFICATION_DOUBLE_TAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotification_doubleTap() <em>Notification double Tap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotification_doubleTap()
	 * @generated
	 * @ordered
	 */
	protected String notification_doubleTap = NOTIFICATION_DOUBLE_TAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final double VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected double value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final double DEFAULT_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected double defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegulatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UidPackage.Literals.REGULATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinValue() {
		return minValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinValue(double newMinValue) {
		double oldMinValue = minValue;
		minValue = newMinValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidPackage.REGULATOR__MIN_VALUE, oldMinValue, minValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxValue() {
		return maxValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxValue(double newMaxValue) {
		double oldMaxValue = maxValue;
		maxValue = newMaxValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidPackage.REGULATOR__MAX_VALUE, oldMaxValue, maxValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNotification_changed() {
		return notification_changed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotification_changed(String newNotification_changed) {
		String oldNotification_changed = notification_changed;
		notification_changed = newNotification_changed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidPackage.REGULATOR__NOTIFICATION_CHANGED, oldNotification_changed, notification_changed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNotification_doubleTap() {
		return notification_doubleTap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotification_doubleTap(String newNotification_doubleTap) {
		String oldNotification_doubleTap = notification_doubleTap;
		notification_doubleTap = newNotification_doubleTap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidPackage.REGULATOR__NOTIFICATION_DOUBLE_TAP, oldNotification_doubleTap, notification_doubleTap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(double newValue) {
		double oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidPackage.REGULATOR__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(double newDefaultValue) {
		double oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidPackage.REGULATOR__DEFAULT_VALUE, oldDefaultValue, defaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int setValue() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UidPackage.REGULATOR__MIN_VALUE:
				return getMinValue();
			case UidPackage.REGULATOR__MAX_VALUE:
				return getMaxValue();
			case UidPackage.REGULATOR__NOTIFICATION_CHANGED:
				return getNotification_changed();
			case UidPackage.REGULATOR__NOTIFICATION_DOUBLE_TAP:
				return getNotification_doubleTap();
			case UidPackage.REGULATOR__VALUE:
				return getValue();
			case UidPackage.REGULATOR__DEFAULT_VALUE:
				return getDefaultValue();
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
			case UidPackage.REGULATOR__MIN_VALUE:
				setMinValue((Double)newValue);
				return;
			case UidPackage.REGULATOR__MAX_VALUE:
				setMaxValue((Double)newValue);
				return;
			case UidPackage.REGULATOR__NOTIFICATION_CHANGED:
				setNotification_changed((String)newValue);
				return;
			case UidPackage.REGULATOR__NOTIFICATION_DOUBLE_TAP:
				setNotification_doubleTap((String)newValue);
				return;
			case UidPackage.REGULATOR__VALUE:
				setValue((Double)newValue);
				return;
			case UidPackage.REGULATOR__DEFAULT_VALUE:
				setDefaultValue((Double)newValue);
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
			case UidPackage.REGULATOR__MIN_VALUE:
				setMinValue(MIN_VALUE_EDEFAULT);
				return;
			case UidPackage.REGULATOR__MAX_VALUE:
				setMaxValue(MAX_VALUE_EDEFAULT);
				return;
			case UidPackage.REGULATOR__NOTIFICATION_CHANGED:
				setNotification_changed(NOTIFICATION_CHANGED_EDEFAULT);
				return;
			case UidPackage.REGULATOR__NOTIFICATION_DOUBLE_TAP:
				setNotification_doubleTap(NOTIFICATION_DOUBLE_TAP_EDEFAULT);
				return;
			case UidPackage.REGULATOR__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case UidPackage.REGULATOR__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
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
			case UidPackage.REGULATOR__MIN_VALUE:
				return minValue != MIN_VALUE_EDEFAULT;
			case UidPackage.REGULATOR__MAX_VALUE:
				return maxValue != MAX_VALUE_EDEFAULT;
			case UidPackage.REGULATOR__NOTIFICATION_CHANGED:
				return NOTIFICATION_CHANGED_EDEFAULT == null ? notification_changed != null : !NOTIFICATION_CHANGED_EDEFAULT.equals(notification_changed);
			case UidPackage.REGULATOR__NOTIFICATION_DOUBLE_TAP:
				return NOTIFICATION_DOUBLE_TAP_EDEFAULT == null ? notification_doubleTap != null : !NOTIFICATION_DOUBLE_TAP_EDEFAULT.equals(notification_doubleTap);
			case UidPackage.REGULATOR__VALUE:
				return value != VALUE_EDEFAULT;
			case UidPackage.REGULATOR__DEFAULT_VALUE:
				return defaultValue != DEFAULT_VALUE_EDEFAULT;
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
		result.append(" (minValue: ");
		result.append(minValue);
		result.append(", maxValue: ");
		result.append(maxValue);
		result.append(", notification_changed: ");
		result.append(notification_changed);
		result.append(", notification_doubleTap: ");
		result.append(notification_doubleTap);
		result.append(", value: ");
		result.append(value);
		result.append(", defaultValue: ");
		result.append(defaultValue);
		result.append(')');
		return result.toString();
	}

} //RegulatorImpl
