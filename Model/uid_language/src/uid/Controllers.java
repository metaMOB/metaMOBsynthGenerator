/**
 */
package uid;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controllers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uid.Controllers#getHasCommand <em>Has Command</em>}</li>
 * </ul>
 * </p>
 *
 * @see uid.UidPackage#getControllers()
 * @model
 * @generated
 */
public interface Controllers extends EObject {
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
	 * @see uid.UidPackage#getControllers_HasCommand()
	 * @model containment="true"
	 * @generated
	 */
	EList<Command> getHasCommand();

} // Controllers
