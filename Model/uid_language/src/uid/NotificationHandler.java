/**
 */
package uid;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Notification Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uid.NotificationHandler#getName <em>Name</em>}</li>
 *   <li>{@link uid.NotificationHandler#getRecievesNotification <em>Recieves Notification</em>}</li>
 *   <li>{@link uid.NotificationHandler#getSendsNotification <em>Sends Notification</em>}</li>
 *   <li>{@link uid.NotificationHandler#getChangeStageTo <em>Change Stage To</em>}</li>
 * </ul>
 * </p>
 *
 * @see uid.UidPackage#getNotificationHandler()
 * @model
 * @generated
 */
public interface NotificationHandler extends EObject {
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
	 * @see uid.UidPackage#getNotificationHandler_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uid.NotificationHandler#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Recieves Notification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recieves Notification</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recieves Notification</em>' reference.
	 * @see #setRecievesNotification(Notification)
	 * @see uid.UidPackage#getNotificationHandler_RecievesNotification()
	 * @model
	 * @generated
	 */
	Notification getRecievesNotification();

	/**
	 * Sets the value of the '{@link uid.NotificationHandler#getRecievesNotification <em>Recieves Notification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recieves Notification</em>' reference.
	 * @see #getRecievesNotification()
	 * @generated
	 */
	void setRecievesNotification(Notification value);

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
	 * @see uid.UidPackage#getNotificationHandler_SendsNotification()
	 * @model
	 * @generated
	 */
	EList<Notification> getSendsNotification();

	/**
	 * Returns the value of the '<em><b>Change Stage To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Stage To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Stage To</em>' reference.
	 * @see #setChangeStageTo(Stage)
	 * @see uid.UidPackage#getNotificationHandler_ChangeStageTo()
	 * @model required="true"
	 * @generated
	 */
	Stage getChangeStageTo();

	/**
	 * Sets the value of the '{@link uid.NotificationHandler#getChangeStageTo <em>Change Stage To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Stage To</em>' reference.
	 * @see #getChangeStageTo()
	 * @generated
	 */
	void setChangeStageTo(Stage value);

} // NotificationHandler
