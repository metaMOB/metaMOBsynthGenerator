/**
 */
package uid;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matrix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uid.Matrix#getImage_background <em>Image background</em>}</li>
 *   <li>{@link uid.Matrix#getImage_tap <em>Image tap</em>}</li>
 *   <li>{@link uid.Matrix#getImage_doubleTap <em>Image double Tap</em>}</li>
 *   <li>{@link uid.Matrix#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see uid.UidPackage#getMatrix()
 * @model
 * @generated
 */
public interface Matrix extends Component {
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
	 * @see uid.UidPackage#getMatrix_Image_background()
	 * @model dataType="types.String"
	 * @generated
	 */
	String getImage_background();

	/**
	 * Sets the value of the '{@link uid.Matrix#getImage_background <em>Image background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image background</em>' attribute.
	 * @see #getImage_background()
	 * @generated
	 */
	void setImage_background(String value);

	/**
	 * Returns the value of the '<em><b>Image tap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image tap</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image tap</em>' attribute.
	 * @see #setImage_tap(String)
	 * @see uid.UidPackage#getMatrix_Image_tap()
	 * @model dataType="types.String"
	 * @generated
	 */
	String getImage_tap();

	/**
	 * Sets the value of the '{@link uid.Matrix#getImage_tap <em>Image tap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image tap</em>' attribute.
	 * @see #getImage_tap()
	 * @generated
	 */
	void setImage_tap(String value);

	/**
	 * Returns the value of the '<em><b>Image double Tap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image double Tap</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image double Tap</em>' attribute.
	 * @see #setImage_doubleTap(String)
	 * @see uid.UidPackage#getMatrix_Image_doubleTap()
	 * @model dataType="types.String"
	 * @generated
	 */
	String getImage_doubleTap();

	/**
	 * Sets the value of the '{@link uid.Matrix#getImage_doubleTap <em>Image double Tap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image double Tap</em>' attribute.
	 * @see #getImage_doubleTap()
	 * @generated
	 */
	void setImage_doubleTap(String value);

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
	 * @see uid.UidPackage#getMatrix_Value()
	 * @model dataType="types.String"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link uid.Matrix#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // Matrix
