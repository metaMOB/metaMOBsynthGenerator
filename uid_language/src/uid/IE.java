/**
 */
package uid;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uid.IE#getIeAssoc <em>Ie Assoc</em>}</li>
 *   <li>{@link uid.IE#getName <em>Name</em>}</li>
 *   <li>{@link uid.IE#getMargin <em>Margin</em>}</li>
 *   <li>{@link uid.IE#isVisible <em>Visible</em>}</li>
 * </ul>
 * </p>
 *
 * @see uid.UidPackage#getIE()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nameNotNull'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot nameNotNull='name.oclIsUndefined() <> true'"
 * @generated
 */
public interface IE extends EObject {
	/**
	 * Returns the value of the '<em><b>Ie Assoc</b></em>' reference list.
	 * The list contents are of type {@link uid.IEAssoc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ie Assoc</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ie Assoc</em>' reference list.
	 * @see uid.UidPackage#getIE_IeAssoc()
	 * @model
	 * @generated
	 */
	EList<IEAssoc> getIeAssoc();

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
	 * @see uid.UidPackage#getIE_Name()
	 * @model dataType="types.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uid.IE#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Margin</b></em>' attribute.
	 * The default value is <code>"0, 0, 0, 0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Margin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Margin</em>' attribute.
	 * @see #setMargin(String)
	 * @see uid.UidPackage#getIE_Margin()
	 * @model default="0, 0, 0, 0"
	 * @generated
	 */
	String getMargin();

	/**
	 * Sets the value of the '{@link uid.IE#getMargin <em>Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Margin</em>' attribute.
	 * @see #getMargin()
	 * @generated
	 */
	void setMargin(String value);

	/**
	 * Returns the value of the '<em><b>Visible</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible</em>' attribute.
	 * @see #setVisible(boolean)
	 * @see uid.UidPackage#getIE_Visible()
	 * @model default="true"
	 * @generated
	 */
	boolean isVisible();

	/**
	 * Sets the value of the '{@link uid.IE#isVisible <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible</em>' attribute.
	 * @see #isVisible()
	 * @generated
	 */
	void setVisible(boolean value);

} // IE
