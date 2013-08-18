/**
 */
package uid;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uid.List#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see uid.UidPackage#getList()
 * @model
 * @generated
 */
public interface List extends IE {

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute list.
	 * @see uid.UidPackage#getList_Content()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getContent();
} // List
