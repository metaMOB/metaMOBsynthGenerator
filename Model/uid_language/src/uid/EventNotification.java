/**
 */
package uid;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Notification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uid.EventNotification#getName <em>Name</em>}</li>
 *   <li>{@link uid.EventNotification#getHasMediator <em>Has Mediator</em>}</li>
 *   <li>{@link uid.EventNotification#getHasView <em>Has View</em>}</li>
 *   <li>{@link uid.EventNotification#getHasNotification <em>Has Notification</em>}</li>
 * </ul>
 * </p>
 *
 * @see uid.UidPackage#getEventNotification()
 * @model
 * @generated
 */
public interface EventNotification extends EObject {
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
	 * @see uid.UidPackage#getEventNotification_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uid.EventNotification#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Has Mediator</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uid.Mediator#getHasEventNotification <em>Has Event Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Mediator</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Mediator</em>' container reference.
	 * @see #setHasMediator(Mediator)
	 * @see uid.UidPackage#getEventNotification_HasMediator()
	 * @see uid.Mediator#getHasEventNotification
	 * @model opposite="hasEventNotification" transient="false"
	 * @generated
	 */
	Mediator getHasMediator();

	/**
	 * Sets the value of the '{@link uid.EventNotification#getHasMediator <em>Has Mediator</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Mediator</em>' container reference.
	 * @see #getHasMediator()
	 * @generated
	 */
	void setHasMediator(Mediator value);

	/**
	 * Returns the value of the '<em><b>Has View</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uid.View#getHasEventNotification <em>Has Event Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has View</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has View</em>' container reference.
	 * @see #setHasView(View)
	 * @see uid.UidPackage#getEventNotification_HasView()
	 * @see uid.View#getHasEventNotification
	 * @model opposite="hasEventNotification" transient="false"
	 * @generated
	 */
	View getHasView();

	/**
	 * Sets the value of the '{@link uid.EventNotification#getHasView <em>Has View</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has View</em>' container reference.
	 * @see #getHasView()
	 * @generated
	 */
	void setHasView(View value);

	/**
	 * Returns the value of the '<em><b>Has Notification</b></em>' reference list.
	 * The list contents are of type {@link uid.Notification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Notification</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Notification</em>' reference list.
	 * @see uid.UidPackage#getEventNotification_HasNotification()
	 * @model
	 * @generated
	 */
	EList<Notification> getHasNotification();

} // EventNotification
