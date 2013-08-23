/**
 */
package uid;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uid.View#getImage_background <em>Image background</em>}</li>
 *   <li>{@link uid.View#getHasRegulator <em>Has Regulator</em>}</li>
 *   <li>{@link uid.View#getHasMatrix <em>Has Matrix</em>}</li>
 *   <li>{@link uid.View#getHasButton <em>Has Button</em>}</li>
 *   <li>{@link uid.View#getHasDisplay <em>Has Display</em>}</li>
 *   <li>{@link uid.View#getHasTransition <em>Has Transition</em>}</li>
 *   <li>{@link uid.View#getHasComponent <em>Has Component</em>}</li>
 *   <li>{@link uid.View#getHasEventNotification <em>Has Event Notification</em>}</li>
 * </ul>
 * </p>
 *
 * @see uid.UidPackage#getView()
 * @model
 * @generated
 */
public interface View extends Component {
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
	 * Returns the value of the '<em><b>Has Regulator</b></em>' reference list.
	 * The list contents are of type {@link uid.Regulator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Regulator</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Regulator</em>' reference list.
	 * @see uid.UidPackage#getView_HasRegulator()
	 * @model
	 * @generated
	 */
	EList<Regulator> getHasRegulator();

	/**
	 * Returns the value of the '<em><b>Has Matrix</b></em>' reference list.
	 * The list contents are of type {@link uid.Matrix}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Matrix</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Matrix</em>' reference list.
	 * @see uid.UidPackage#getView_HasMatrix()
	 * @model
	 * @generated
	 */
	EList<Matrix> getHasMatrix();

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
	 * @see uid.UidPackage#getView_HasButton()
	 * @model
	 * @generated
	 */
	EList<Button> getHasButton();

	/**
	 * Returns the value of the '<em><b>Has Display</b></em>' reference list.
	 * The list contents are of type {@link uid.Display}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Display</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Display</em>' reference list.
	 * @see uid.UidPackage#getView_HasDisplay()
	 * @model
	 * @generated
	 */
	EList<Display> getHasDisplay();

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
	 * Returns the value of the '<em><b>Has Component</b></em>' reference list.
	 * The list contents are of type {@link uid.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Component</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Component</em>' reference list.
	 * @see uid.UidPackage#getView_HasComponent()
	 * @model
	 * @generated
	 */
	EList<Component> getHasComponent();

	/**
	 * Returns the value of the '<em><b>Has Event Notification</b></em>' containment reference list.
	 * The list contents are of type {@link uid.EventNotification}.
	 * It is bidirectional and its opposite is '{@link uid.EventNotification#getHasView <em>Has View</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Event Notification</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Event Notification</em>' containment reference list.
	 * @see uid.UidPackage#getView_HasEventNotification()
	 * @see uid.EventNotification#getHasView
	 * @model opposite="hasView" containment="true"
	 * @generated
	 */
	EList<EventNotification> getHasEventNotification();

} // View
