/**
 */
package uid;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uid.Event#getName <em>Name</em>}</li>
 *   <li>{@link uid.Event#getSendsNotification <em>Sends Notification</em>}</li>
 *   <li>{@link uid.Event#getCallback <em>Callback</em>}</li>
 * </ul>
 * </p>
 *
 * @see uid.UidPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends EObject {
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
	 * @see uid.UidPackage#getEvent_Name()
	 * @model dataType="types.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uid.Event#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Sends Notification</b></em>' reference list.
	 * The list contents are of type {@link uid.Notification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sends Notification</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sends Notification</em>' reference list.
	 * @see uid.UidPackage#getEvent_SendsNotification()
	 * @model
	 * @generated
	 */
	EList<Notification> getSendsNotification();

	/**
	 * Returns the value of the '<em><b>Callback</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link uid.EuiEventCallbacks}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Callback</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Callback</em>' attribute.
	 * @see uid.EuiEventCallbacks
	 * @see #setCallback(EuiEventCallbacks)
	 * @see uid.UidPackage#getEvent_Callback()
	 * @model default=""
	 * @generated
	 */
	EuiEventCallbacks getCallback();

	/**
	 * Sets the value of the '{@link uid.Event#getCallback <em>Callback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Callback</em>' attribute.
	 * @see uid.EuiEventCallbacks
	 * @see #getCallback()
	 * @generated
	 */
	void setCallback(EuiEventCallbacks value);

} // Event
