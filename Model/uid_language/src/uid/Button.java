/**
 */
package uid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uid.Button#getImage_on <em>Image on</em>}</li>
 *   <li>{@link uid.Button#getImage_off <em>Image off</em>}</li>
 *   <li>{@link uid.Button#getImage_disabled <em>Image disabled</em>}</li>
 *   <li>{@link uid.Button#getNotification_pressed <em>Notification pressed</em>}</li>
 *   <li>{@link uid.Button#getNotification_released <em>Notification released</em>}</li>
 * </ul>
 * </p>
 *
 * @see uid.UidPackage#getButton()
 * @model
 * @generated
 */
public interface Button extends Entity {
	/**
	 * Returns the value of the '<em><b>Image on</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image on</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image on</em>' attribute.
	 * @see #setImage_on(String)
	 * @see uid.UidPackage#getButton_Image_on()
	 * @model dataType="types.String"
	 * @generated
	 */
	String getImage_on();

	/**
	 * Sets the value of the '{@link uid.Button#getImage_on <em>Image on</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image on</em>' attribute.
	 * @see #getImage_on()
	 * @generated
	 */
	void setImage_on(String value);

	/**
	 * Returns the value of the '<em><b>Image off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image off</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image off</em>' attribute.
	 * @see #setImage_off(String)
	 * @see uid.UidPackage#getButton_Image_off()
	 * @model dataType="types.String"
	 * @generated
	 */
	String getImage_off();

	/**
	 * Sets the value of the '{@link uid.Button#getImage_off <em>Image off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image off</em>' attribute.
	 * @see #getImage_off()
	 * @generated
	 */
	void setImage_off(String value);

	/**
	 * Returns the value of the '<em><b>Image disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image disabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image disabled</em>' attribute.
	 * @see #setImage_disabled(String)
	 * @see uid.UidPackage#getButton_Image_disabled()
	 * @model dataType="types.String"
	 * @generated
	 */
	String getImage_disabled();

	/**
	 * Sets the value of the '{@link uid.Button#getImage_disabled <em>Image disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image disabled</em>' attribute.
	 * @see #getImage_disabled()
	 * @generated
	 */
	void setImage_disabled(String value);

	/**
	 * Returns the value of the '<em><b>Notification pressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notification pressed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notification pressed</em>' attribute.
	 * @see #setNotification_pressed(String)
	 * @see uid.UidPackage#getButton_Notification_pressed()
	 * @model dataType="types.String"
	 * @generated
	 */
	String getNotification_pressed();

	/**
	 * Sets the value of the '{@link uid.Button#getNotification_pressed <em>Notification pressed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notification pressed</em>' attribute.
	 * @see #getNotification_pressed()
	 * @generated
	 */
	void setNotification_pressed(String value);

	/**
	 * Returns the value of the '<em><b>Notification released</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notification released</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notification released</em>' attribute.
	 * @see #setNotification_released(String)
	 * @see uid.UidPackage#getButton_Notification_released()
	 * @model dataType="types.String"
	 * @generated
	 */
	String getNotification_released();

	/**
	 * Sets the value of the '{@link uid.Button#getNotification_released <em>Notification released</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notification released</em>' attribute.
	 * @see #getNotification_released()
	 * @generated
	 */
	void setNotification_released(String value);

} // Button
