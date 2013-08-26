/**
 */
package uid;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uid.View#getImage_background <em>Image background</em>}</li>
 *   <li>{@link uid.View#getHasTransition <em>Has Transition</em>}</li>
 *   <li>{@link uid.View#getName <em>Name</em>}</li>
 *   <li>{@link uid.View#getHasDisplay <em>Has Display</em>}</li>
 *   <li>{@link uid.View#getHasContainer <em>Has Container</em>}</li>
 *   <li>{@link uid.View#getHasMatrix <em>Has Matrix</em>}</li>
 *   <li>{@link uid.View#getHasRegulator <em>Has Regulator</em>}</li>
 *   <li>{@link uid.View#getHasButton <em>Has Button</em>}</li>
 *   <li>{@link uid.View#getHasSwitch <em>Has Switch</em>}</li>
 * </ul>
 * </p>
 *
 * @see uid.UidPackage#getView()
 * @model
 * @generated
 */
public interface View extends EObject {
	/**
	 * Returns the value of the '<em><b>Image background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image background</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image background</em>' attribute.
	 * @see #setImage_background(String)
	 * @see uid.UidPackage#getView_Image_background()
	 * @model dataType="types.String"
	 * @generated
	 */
	String getImage_background();

	/**
	 * Sets the value of the '{@link uid.View#getImage_background <em>Image background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image background</em>' attribute.
	 * @see #getImage_background()
	 * @generated
	 */
	void setImage_background(String value);

	/**
	 * Returns the value of the '<em><b>Has Transition</b></em>' reference list.
	 * The list contents are of type {@link uid.EntityTransition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Transition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Transition</em>' reference list.
	 * @see uid.UidPackage#getView_HasTransition()
	 * @model
	 * @generated
	 */
	EList<EntityTransition> getHasTransition();

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
	 * @see uid.UidPackage#getView_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uid.View#getName <em>Name</em>}' attribute.
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
	 * @see uid.UidPackage#getView_HasDisplay()
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
	 * @see uid.UidPackage#getView_HasContainer()
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
	 * @see uid.UidPackage#getView_HasMatrix()
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
	 * @see uid.UidPackage#getView_HasRegulator()
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
	 * @see uid.UidPackage#getView_HasButton()
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
	 * @see uid.UidPackage#getView_HasSwitch()
	 * @model containment="true"
	 * @generated
	 */
	EList<Switch> getHasSwitch();

} // View
