/**
 */
package uid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regulator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uid.Regulator#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link uid.Regulator#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link uid.Regulator#getNotification_changed <em>Notification changed</em>}</li>
 *   <li>{@link uid.Regulator#getNotification_doubleTap <em>Notification double Tap</em>}</li>
 *   <li>{@link uid.Regulator#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see uid.UidPackage#getRegulator()
 * @model
 * @generated
 */
public interface Regulator extends Entity {
	/**
	 * Returns the value of the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value</em>' attribute.
	 * @see #setMinValue(int)
	 * @see uid.UidPackage#getRegulator_MinValue()
	 * @model dataType="types.Integer"
	 * @generated
	 */
	int getMinValue();

	/**
	 * Sets the value of the '{@link uid.Regulator#getMinValue <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value</em>' attribute.
	 * @see #getMinValue()
	 * @generated
	 */
	void setMinValue(int value);

	/**
	 * Returns the value of the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value</em>' attribute.
	 * @see #setMaxValue(int)
	 * @see uid.UidPackage#getRegulator_MaxValue()
	 * @model dataType="types.Integer"
	 * @generated
	 */
	int getMaxValue();

	/**
	 * Sets the value of the '{@link uid.Regulator#getMaxValue <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value</em>' attribute.
	 * @see #getMaxValue()
	 * @generated
	 */
	void setMaxValue(int value);

	/**
	 * Returns the value of the '<em><b>Notification changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notification changed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notification changed</em>' attribute.
	 * @see #setNotification_changed(String)
	 * @see uid.UidPackage#getRegulator_Notification_changed()
	 * @model dataType="types.String"
	 * @generated
	 */
	String getNotification_changed();

	/**
	 * Sets the value of the '{@link uid.Regulator#getNotification_changed <em>Notification changed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notification changed</em>' attribute.
	 * @see #getNotification_changed()
	 * @generated
	 */
	void setNotification_changed(String value);

	/**
	 * Returns the value of the '<em><b>Notification double Tap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notification double Tap</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notification double Tap</em>' attribute.
	 * @see #setNotification_doubleTap(String)
	 * @see uid.UidPackage#getRegulator_Notification_doubleTap()
	 * @model dataType="types.String"
	 * @generated
	 */
	String getNotification_doubleTap();

	/**
	 * Sets the value of the '{@link uid.Regulator#getNotification_doubleTap <em>Notification double Tap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notification double Tap</em>' attribute.
	 * @see #getNotification_doubleTap()
	 * @generated
	 */
	void setNotification_doubleTap(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see uid.UidPackage#getRegulator_Value()
	 * @model dataType="types.Integer"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link uid.Regulator#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="types.Integer"
	 * @generated
	 */
	int setValue();

} // Regulator
