/**
 */
package uid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Display</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uid.Display#getImage_background <em>Image background</em>}</li>
 *   <li>{@link uid.Display#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see uid.UidPackage#getDisplay()
 * @model
 * @generated
 */
public interface Display extends Component {
	/**
	 * Returns the value of the '<em><b>Image background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image background</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image background</em>' attribute.
	 * @see #setImage_background(String)
	 * @see uid.UidPackage#getDisplay_Image_background()
	 * @model dataType="types.String"
	 * @generated
	 */
	String getImage_background();

	/**
	 * Sets the value of the '{@link uid.Display#getImage_background <em>Image background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image background</em>' attribute.
	 * @see #getImage_background()
	 * @generated
	 */
	void setImage_background(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see uid.UidPackage#getDisplay_Value()
	 * @model dataType="types.String"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link uid.Display#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // Display
