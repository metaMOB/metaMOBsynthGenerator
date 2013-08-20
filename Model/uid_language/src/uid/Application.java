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
 *   <li>{@link uid.Application#getHasEntities <em>Has Entities</em>}</li>
 *   <li>{@link uid.Application#getHasMediator <em>Has Mediator</em>}</li>
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
	 * Returns the value of the '<em><b>Has Entities</b></em>' containment reference list.
	 * The list contents are of type {@link uid.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Entities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Entities</em>' containment reference list.
	 * @see uid.UidPackage#getApplication_HasEntities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entity> getHasEntities();

	/**
	 * Returns the value of the '<em><b>Has Mediator</b></em>' reference list.
	 * The list contents are of type {@link uid.Mediator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Mediator</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Mediator</em>' reference list.
	 * @see uid.UidPackage#getApplication_HasMediator()
	 * @model
	 * @generated
	 */
	EList<Mediator> getHasMediator();

} // Application
