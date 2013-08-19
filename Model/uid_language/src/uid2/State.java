/**
 */
package uid;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uid.State#getImage_background <em>Image background</em>}</li>
 *   <li>{@link uid.State#getHasRegulator <em>Has Regulator</em>}</li>
 *   <li>{@link uid.State#getHasMatrix <em>Has Matrix</em>}</li>
 *   <li>{@link uid.State#getHasButton <em>Has Button</em>}</li>
 *   <li>{@link uid.State#getHasDisplay <em>Has Display</em>}</li>
 * </ul>
 * </p>
 *
 * @see uid.UidPackage#getState()
 * @model
 * @generated
 */
public interface State extends Entity {
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
	 * @see uid.UidPackage#getState_Image_background()
	 * @model dataType="types.String"
	 * @generated
	 */
	String getImage_background();

	/**
	 * Sets the value of the '{@link uid.State#getImage_background <em>Image background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image background</em>' attribute.
	 * @see #getImage_background()
	 * @generated
	 */
	void setImage_background(String value);

	/**
	 * Returns the value of the '<em><b>Has Regulator</b></em>' reference list.
	 * The list contents are of type {@link uid.Regulator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Regulator</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Regulator</em>' reference list.
	 * @see uid.UidPackage#getState_HasRegulator()
	 * @model
	 * @generated
	 */
	EList<Regulator> getHasRegulator();

	/**
	 * Returns the value of the '<em><b>Has Matrix</b></em>' reference list.
	 * The list contents are of type {@link uid.Matrix}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Matrix</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Matrix</em>' reference list.
	 * @see uid.UidPackage#getState_HasMatrix()
	 * @model
	 * @generated
	 */
	EList<Matrix> getHasMatrix();

	/**
	 * Returns the value of the '<em><b>Has Button</b></em>' reference list.
	 * The list contents are of type {@link uid.Button}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Button</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Button</em>' reference list.
	 * @see uid.UidPackage#getState_HasButton()
	 * @model
	 * @generated
	 */
	EList<Button> getHasButton();

	/**
	 * Returns the value of the '<em><b>Has Display</b></em>' reference list.
	 * The list contents are of type {@link uid.Display}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Display</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Display</em>' reference list.
	 * @see uid.UidPackage#getState_HasDisplay()
	 * @model
	 * @generated
	 */
	EList<Display> getHasDisplay();

} // State
