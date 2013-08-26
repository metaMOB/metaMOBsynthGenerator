/**
 */
package uid;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Views</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uid.Views#getHasStage <em>Has Stage</em>}</li>
 *   <li>{@link uid.Views#getHasMediator <em>Has Mediator</em>}</li>
 * </ul>
 * </p>
 *
 * @see uid.UidPackage#getViews()
 * @model
 * @generated
 */
public interface Views extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Stage</b></em>' containment reference list.
	 * The list contents are of type {@link uid.Stage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Stage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Stage</em>' containment reference list.
	 * @see uid.UidPackage#getViews_HasStage()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Stage> getHasStage();

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
	 * @see uid.UidPackage#getViews_HasMediator()
	 * @model containment="true"
	 * @generated
	 */
	EList<Mediator> getHasMediator();

} // Views
