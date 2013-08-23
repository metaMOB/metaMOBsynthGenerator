/**
 */
package uid;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mediator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uid.Mediator#getName <em>Name</em>}</li>
 *   <li>{@link uid.Mediator#getHasEventNotification <em>Has Event Notification</em>}</li>
 * </ul>
 * </p>
 *
 * @see uid.UidPackage#getMediator()
 * @model
 * @generated
 */
public interface Mediator extends EObject {
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
	 * @see uid.UidPackage#getMediator_Name()
	 * @model dataType="types.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uid.Mediator#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Has Event Notification</b></em>' containment reference list.
	 * The list contents are of type {@link uid.EventNotification}.
	 * It is bidirectional and its opposite is '{@link uid.EventNotification#getHasMediator <em>Has Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Event Notification</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Event Notification</em>' containment reference list.
	 * @see uid.UidPackage#getMediator_HasEventNotification()
	 * @see uid.EventNotification#getHasMediator
	 * @model opposite="hasMediator" containment="true"
	 * @generated
	 */
	EList<EventNotification> getHasEventNotification();

} // Mediator
