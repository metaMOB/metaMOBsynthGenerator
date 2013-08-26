/**
 */
package uid;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Notifications</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uid.Notifications#getHasNotification <em>Has Notification</em>}</li>
 * </ul>
 * </p>
 *
 * @see uid.UidPackage#getNotifications()
 * @model
 * @generated
 */
public interface Notifications extends EObject {
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
	 * @see uid.UidPackage#getNotifications_HasNotification()
	 * @model containment="true"
	 * @generated
	 */
	EList<Notification> getHasNotification();

} // Notifications
