/**
 */
package uid;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uid.Application#getName <em>Name</em>}</li>
 *   <li>{@link uid.Application#getHasEntityTransition <em>Has Entity Transition</em>}</li>
 *   <li>{@link uid.Application#getHasMediator <em>Has Mediator</em>}</li>
 *   <li>{@link uid.Application#getHasNotification <em>Has Notification</em>}</li>
 *   <li>{@link uid.Application#getHasCommand <em>Has Command</em>}</li>
 *   <li>{@link uid.Application#getHasView <em>Has View</em>}</li>
 * </ul>
 * </p>
 *
 * @see uid.UidPackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends EObject {
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
	 * @see uid.UidPackage#getApplication_Name()
	 * @model dataType="types.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uid.Application#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Has Entity Transition</b></em>' containment reference list.
	 * The list contents are of type {@link uid.EntityTransition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Entity Transition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Entity Transition</em>' containment reference list.
	 * @see uid.UidPackage#getApplication_HasEntityTransition()
	 * @model containment="true"
	 * @generated
	 */
	EList<EntityTransition> getHasEntityTransition();

	/**
	 * Returns the value of the '<em><b>Has Mediator</b></em>' containment reference list.
	 * The list contents are of type {@link uid.Mediator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Mediator</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Mediator</em>' containment reference list.
	 * @see uid.UidPackage#getApplication_HasMediator()
	 * @model containment="true"
	 * @generated
	 */
	EList<Mediator> getHasMediator();

	/**
	 * Returns the value of the '<em><b>Has Notification</b></em>' containment reference list.
	 * The list contents are of type {@link uid.Notification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Notification</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Notification</em>' containment reference list.
	 * @see uid.UidPackage#getApplication_HasNotification()
	 * @model containment="true"
	 * @generated
	 */
	EList<Notification> getHasNotification();

	/**
	 * Returns the value of the '<em><b>Has Command</b></em>' containment reference list.
	 * The list contents are of type {@link uid.Command}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Command</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Command</em>' containment reference list.
	 * @see uid.UidPackage#getApplication_HasCommand()
	 * @model containment="true"
	 * @generated
	 */
	EList<Command> getHasCommand();

	/**
	 * Returns the value of the '<em><b>Has View</b></em>' containment reference list.
	 * The list contents are of type {@link uid.View}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has View</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has View</em>' containment reference list.
	 * @see uid.UidPackage#getApplication_HasView()
	 * @model containment="true"
	 * @generated
	 */
	EList<View> getHasView();

} // Application
