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
 *   <li>{@link uid.Application#getHasViews <em>Has Views</em>}</li>
 *   <li>{@link uid.Application#getHasControllers <em>Has Controllers</em>}</li>
 *   <li>{@link uid.Application#getHasNotifications <em>Has Notifications</em>}</li>
 *   <li>{@link uid.Application#getHasModels <em>Has Models</em>}</li>
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
	 * Returns the value of the '<em><b>Has Views</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Views</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Views</em>' containment reference.
	 * @see #setHasViews(Views)
	 * @see uid.UidPackage#getApplication_HasViews()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Views getHasViews();

	/**
	 * Sets the value of the '{@link uid.Application#getHasViews <em>Has Views</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Views</em>' containment reference.
	 * @see #getHasViews()
	 * @generated
	 */
	void setHasViews(Views value);

	/**
	 * Returns the value of the '<em><b>Has Controllers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Controllers</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Controllers</em>' containment reference.
	 * @see #setHasControllers(Controllers)
	 * @see uid.UidPackage#getApplication_HasControllers()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Controllers getHasControllers();

	/**
	 * Sets the value of the '{@link uid.Application#getHasControllers <em>Has Controllers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Controllers</em>' containment reference.
	 * @see #getHasControllers()
	 * @generated
	 */
	void setHasControllers(Controllers value);

	/**
	 * Returns the value of the '<em><b>Has Notifications</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Notifications</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Notifications</em>' containment reference.
	 * @see #setHasNotifications(Notifications)
	 * @see uid.UidPackage#getApplication_HasNotifications()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Notifications getHasNotifications();

	/**
	 * Sets the value of the '{@link uid.Application#getHasNotifications <em>Has Notifications</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Notifications</em>' containment reference.
	 * @see #getHasNotifications()
	 * @generated
	 */
	void setHasNotifications(Notifications value);

	/**
	 * Returns the value of the '<em><b>Has Models</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Models</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Models</em>' containment reference.
	 * @see #setHasModels(Models)
	 * @see uid.UidPackage#getApplication_HasModels()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Models getHasModels();

	/**
	 * Sets the value of the '{@link uid.Application#getHasModels <em>Has Models</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Models</em>' containment reference.
	 * @see #getHasModels()
	 * @generated
	 */
	void setHasModels(Models value);

} // Application
