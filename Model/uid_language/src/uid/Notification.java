/**
 */
package uid;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Notification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uid.Notification#getName <em>Name</em>}</li>
 *   <li>{@link uid.Notification#getRecievedByCommand <em>Recieved By Command</em>}</li>
 * </ul>
 * </p>
 *
 * @see uid.UidPackage#getNotification()
 * @model
 * @generated
 */
public interface Notification extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see uid.UidPackage#getNotification_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uid.Notification#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Recieved By Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recieved By Command</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recieved By Command</em>' reference.
	 * @see #setRecievedByCommand(Command)
	 * @see uid.UidPackage#getNotification_RecievedByCommand()
	 * @model
	 * @generated
	 */
	Command getRecievedByCommand();

	/**
	 * Sets the value of the '{@link uid.Notification#getRecievedByCommand <em>Recieved By Command</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recieved By Command</em>' reference.
	 * @see #getRecievedByCommand()
	 * @generated
	 */
	void setRecievedByCommand(Command value);

} // Notification
