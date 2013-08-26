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
 *   <li>{@link uid.Button#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see uid.UidPackage#getButton()
 * @model
 * @generated
 */
public interface Button extends Component {
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
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see uid.UidPackage#getButton_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link uid.Button#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

} // Button
