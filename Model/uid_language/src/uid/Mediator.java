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
 *   <li>{@link uid.Mediator#getHasEntities <em>Has Entities</em>}</li>
 *   <li>{@link uid.Mediator#getCommandsToGenerate <em>Commands To Generate</em>}</li>
 *   <li>{@link uid.Mediator#getListeners <em>Listeners</em>}</li>
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
	 * Returns the value of the '<em><b>Has Entities</b></em>' reference list.
	 * The list contents are of type {@link uid.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Entities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Entities</em>' reference list.
	 * @see uid.UidPackage#getMediator_HasEntities()
	 * @model
	 * @generated
	 */
	EList<Entity> getHasEntities();

	/**
	 * Returns the value of the '<em><b>Commands To Generate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commands To Generate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commands To Generate</em>' attribute.
	 * @see #setCommandsToGenerate(String)
	 * @see uid.UidPackage#getMediator_CommandsToGenerate()
	 * @model
	 * @generated
	 */
	String getCommandsToGenerate();

	/**
	 * Sets the value of the '{@link uid.Mediator#getCommandsToGenerate <em>Commands To Generate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commands To Generate</em>' attribute.
	 * @see #getCommandsToGenerate()
	 * @generated
	 */
	void setCommandsToGenerate(String value);

	/**
	 * Returns the value of the '<em><b>Listeners</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Listeners</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listeners</em>' attribute.
	 * @see #setListeners(String)
	 * @see uid.UidPackage#getMediator_Listeners()
	 * @model
	 * @generated
	 */
	String getListeners();

	/**
	 * Sets the value of the '{@link uid.Mediator#getListeners <em>Listeners</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Listeners</em>' attribute.
	 * @see #getListeners()
	 * @generated
	 */
	void setListeners(String value);

} // Mediator
