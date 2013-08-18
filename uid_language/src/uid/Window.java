/**
 */
package uid;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Window</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uid.Window#getHasButton <em>Has Button</em>}</li>
 *   <li>{@link uid.Window#getHasTextField <em>Has Text Field</em>}</li>
 *   <li>{@link uid.Window#getHasList <em>Has List</em>}</li>
 *   <li>{@link uid.Window#getHasCheckBox <em>Has Check Box</em>}</li>
 * </ul>
 * </p>
 *
 * @see uid.UidPackage#getWindow()
 * @model
 * @generated
 */
public interface Window extends IE {

	/**
	 * Returns the value of the '<em><b>Has Button</b></em>' reference list.
	 * The list contents are of type {@link uid.Button}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Button</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Button</em>' reference list.
	 * @see uid.UidPackage#getWindow_HasButton()
	 * @model
	 * @generated
	 */
	EList<Button> getHasButton();

	/**
	 * Returns the value of the '<em><b>Has Text Field</b></em>' reference list.
	 * The list contents are of type {@link uid.TextField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Text Field</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Text Field</em>' reference list.
	 * @see uid.UidPackage#getWindow_HasTextField()
	 * @model
	 * @generated
	 */
	EList<TextField> getHasTextField();

	/**
	 * Returns the value of the '<em><b>Has List</b></em>' reference list.
	 * The list contents are of type {@link uid.List}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has List</em>' reference list.
	 * @see uid.UidPackage#getWindow_HasList()
	 * @model
	 * @generated
	 */
	EList<List> getHasList();

	/**
	 * Returns the value of the '<em><b>Has Check Box</b></em>' reference list.
	 * The list contents are of type {@link uid.CheckBox}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Check Box</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Check Box</em>' reference list.
	 * @see uid.UidPackage#getWindow_HasCheckBox()
	 * @model
	 * @generated
	 */
	EList<CheckBox> getHasCheckBox();
} // Window
