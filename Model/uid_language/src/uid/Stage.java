/**
 */
package uid;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uid.Stage#getBackground <em>Background</em>}</li>
 *   <li>{@link uid.Stage#getName <em>Name</em>}</li>
 *   <li>{@link uid.Stage#getHasDisplay <em>Has Display</em>}</li>
 *   <li>{@link uid.Stage#getHasContainer <em>Has Container</em>}</li>
 *   <li>{@link uid.Stage#getHasMatrix <em>Has Matrix</em>}</li>
 *   <li>{@link uid.Stage#getHasRegulator <em>Has Regulator</em>}</li>
 *   <li>{@link uid.Stage#getHasButton <em>Has Button</em>}</li>
 *   <li>{@link uid.Stage#getHasSwitch <em>Has Switch</em>}</li>
 *   <li>{@link uid.Stage#getHasEvents <em>Has Events</em>}</li>
 * </ul>
 * </p>
 *
 * @see uid.UidPackage#getStage()
 * @model
 * @generated
 */
public interface Stage extends EObject {
	/**
	 * Returns the value of the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Background</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background</em>' attribute.
	 * @see #setBackground(String)
	 * @see uid.UidPackage#getStage_Background()
	 * @model
	 * @generated
	 */
	String getBackground();

	/**
	 * Sets the value of the '{@link uid.Stage#getBackground <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background</em>' attribute.
	 * @see #getBackground()
	 * @generated
	 */
	void setBackground(String value);

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
	 * @see uid.UidPackage#getStage_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uid.Stage#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Has Display</b></em>' containment reference list.
	 * The list contents are of type {@link uid.Display}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Display</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Display</em>' containment reference list.
	 * @see uid.UidPackage#getStage_HasDisplay()
	 * @model containment="true"
	 * @generated
	 */
	EList<Display> getHasDisplay();

	/**
	 * Returns the value of the '<em><b>Has Container</b></em>' containment reference list.
	 * The list contents are of type {@link uid.Container}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Container</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Container</em>' containment reference list.
	 * @see uid.UidPackage#getStage_HasContainer()
	 * @model containment="true"
	 * @generated
	 */
	EList<Container> getHasContainer();

	/**
	 * Returns the value of the '<em><b>Has Matrix</b></em>' containment reference list.
	 * The list contents are of type {@link uid.Matrix}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Matrix</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Matrix</em>' containment reference list.
	 * @see uid.UidPackage#getStage_HasMatrix()
	 * @model containment="true"
	 * @generated
	 */
	EList<Matrix> getHasMatrix();

	/**
	 * Returns the value of the '<em><b>Has Regulator</b></em>' containment reference list.
	 * The list contents are of type {@link uid.Regulator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Regulator</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Regulator</em>' containment reference list.
	 * @see uid.UidPackage#getStage_HasRegulator()
	 * @model containment="true"
	 * @generated
	 */
	EList<Regulator> getHasRegulator();

	/**
	 * Returns the value of the '<em><b>Has Button</b></em>' containment reference list.
	 * The list contents are of type {@link uid.Button}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Button</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Button</em>' containment reference list.
	 * @see uid.UidPackage#getStage_HasButton()
	 * @model containment="true"
	 * @generated
	 */
	EList<Button> getHasButton();

	/**
	 * Returns the value of the '<em><b>Has Switch</b></em>' containment reference list.
	 * The list contents are of type {@link uid.Switch}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Switch</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Switch</em>' containment reference list.
	 * @see uid.UidPackage#getStage_HasSwitch()
	 * @model containment="true"
	 * @generated
	 */
	EList<Switch> getHasSwitch();

	/**
	 * Returns the value of the '<em><b>Has Events</b></em>' containment reference list.
	 * The list contents are of type {@link uid.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Events</em>' containment reference list.
	 * @see uid.UidPackage#getStage_HasEvents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getHasEvents();

} // Stage
