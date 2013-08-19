/**
 */
package uid;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>hallo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uid.hallo#getHallo <em>Hallo</em>}</li>
 * </ul>
 * </p>
 *
 * @see uid.UidPackage#gethallo()
 * @model
 * @generated
 */
public interface hallo extends EObject {
	/**
	 * Returns the value of the '<em><b>Hallo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hallo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hallo</em>' attribute.
	 * @see #setHallo(String)
	 * @see uid.UidPackage#gethallo_Hallo()
	 * @model dataType="types.String"
	 * @generated
	 */
	String getHallo();

	/**
	 * Sets the value of the '{@link uid.hallo#getHallo <em>Hallo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hallo</em>' attribute.
	 * @see #getHallo()
	 * @generated
	 */
	void setHallo(String value);

} // hallo
