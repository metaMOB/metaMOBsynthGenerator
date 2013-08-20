/**
 */
package uid;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uid.EntityTransition#getName <em>Name</em>}</li>
 *   <li>{@link uid.EntityTransition#getAnimationTypeIn <em>Animation Type In</em>}</li>
 *   <li>{@link uid.EntityTransition#getAnimationTypeOut <em>Animation Type Out</em>}</li>
 *   <li>{@link uid.EntityTransition#getAnimationInTime <em>Animation In Time</em>}</li>
 *   <li>{@link uid.EntityTransition#getAnimationOutTime <em>Animation Out Time</em>}</li>
 *   <li>{@link uid.EntityTransition#getEntities <em>Entities</em>}</li>
 * </ul>
 * </p>
 *
 * @see uid.UidPackage#getEntityTransition()
 * @model
 * @generated
 */
public interface EntityTransition extends EObject {
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
	 * @see uid.UidPackage#getEntityTransition_Name()
	 * @model dataType="types.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uid.EntityTransition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Animation Type In</b></em>' attribute.
	 * The literals are from the enumeration {@link uid.ETransitionTypesIn}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Animation Type In</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Animation Type In</em>' attribute.
	 * @see uid.ETransitionTypesIn
	 * @see #setAnimationTypeIn(ETransitionTypesIn)
	 * @see uid.UidPackage#getEntityTransition_AnimationTypeIn()
	 * @model
	 * @generated
	 */
	ETransitionTypesIn getAnimationTypeIn();

	/**
	 * Sets the value of the '{@link uid.EntityTransition#getAnimationTypeIn <em>Animation Type In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Animation Type In</em>' attribute.
	 * @see uid.ETransitionTypesIn
	 * @see #getAnimationTypeIn()
	 * @generated
	 */
	void setAnimationTypeIn(ETransitionTypesIn value);

	/**
	 * Returns the value of the '<em><b>Animation Type Out</b></em>' attribute.
	 * The literals are from the enumeration {@link uid.ETransitionTypeOut}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Animation Type Out</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Animation Type Out</em>' attribute.
	 * @see uid.ETransitionTypeOut
	 * @see #setAnimationTypeOut(ETransitionTypeOut)
	 * @see uid.UidPackage#getEntityTransition_AnimationTypeOut()
	 * @model
	 * @generated
	 */
	ETransitionTypeOut getAnimationTypeOut();

	/**
	 * Sets the value of the '{@link uid.EntityTransition#getAnimationTypeOut <em>Animation Type Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Animation Type Out</em>' attribute.
	 * @see uid.ETransitionTypeOut
	 * @see #getAnimationTypeOut()
	 * @generated
	 */
	void setAnimationTypeOut(ETransitionTypeOut value);

	/**
	 * Returns the value of the '<em><b>Animation In Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Animation In Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Animation In Time</em>' attribute.
	 * @see #setAnimationInTime(int)
	 * @see uid.UidPackage#getEntityTransition_AnimationInTime()
	 * @model dataType="types.Integer"
	 * @generated
	 */
	int getAnimationInTime();

	/**
	 * Sets the value of the '{@link uid.EntityTransition#getAnimationInTime <em>Animation In Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Animation In Time</em>' attribute.
	 * @see #getAnimationInTime()
	 * @generated
	 */
	void setAnimationInTime(int value);

	/**
	 * Returns the value of the '<em><b>Animation Out Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Animation Out Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Animation Out Time</em>' attribute.
	 * @see #setAnimationOutTime(int)
	 * @see uid.UidPackage#getEntityTransition_AnimationOutTime()
	 * @model dataType="types.Integer"
	 * @generated
	 */
	int getAnimationOutTime();

	/**
	 * Sets the value of the '{@link uid.EntityTransition#getAnimationOutTime <em>Animation Out Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Animation Out Time</em>' attribute.
	 * @see #getAnimationOutTime()
	 * @generated
	 */
	void setAnimationOutTime(int value);

	/**
	 * Returns the value of the '<em><b>Entities</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entities</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' reference.
	 * @see #setEntities(Entity)
	 * @see uid.UidPackage#getEntityTransition_Entities()
	 * @model required="true"
	 * @generated
	 */
	Entity getEntities();

	/**
	 * Sets the value of the '{@link uid.EntityTransition#getEntities <em>Entities</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entities</em>' reference.
	 * @see #getEntities()
	 * @generated
	 */
	void setEntities(Entity value);

} // EntityTransition
