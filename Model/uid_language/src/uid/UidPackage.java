/**
 */
package uid;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uid.UidFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface UidPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "uid";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://uid/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "uid";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UidPackage eINSTANCE = uid.impl.UidPackageImpl.init();

	/**
	 * The meta object id for the '{@link uid.impl.EntityTransitionImpl <em>Entity Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uid.impl.EntityTransitionImpl
	 * @see uid.impl.UidPackageImpl#getEntityTransition()
	 * @generated
	 */
	int ENTITY_TRANSITION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TRANSITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Animation Type In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TRANSITION__ANIMATION_TYPE_IN = 1;

	/**
	 * The feature id for the '<em><b>Animation Type Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TRANSITION__ANIMATION_TYPE_OUT = 2;

	/**
	 * The feature id for the '<em><b>Animation In Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TRANSITION__ANIMATION_IN_TIME = 3;

	/**
	 * The feature id for the '<em><b>Animation Out Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TRANSITION__ANIMATION_OUT_TIME = 4;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TRANSITION__ENTITIES = 5;

	/**
	 * The number of structural features of the '<em>Entity Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TRANSITION_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link uid.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uid.impl.ApplicationImpl
	 * @see uid.impl.UidPackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Has Entity Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__HAS_ENTITY_TRANSITION = 1;

	/**
	 * The feature id for the '<em><b>Has Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__HAS_ENTITIES = 2;

	/**
	 * The feature id for the '<em><b>Has Mediator</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__HAS_MEDIATOR = 3;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link uid.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uid.impl.EntityImpl
	 * @see uid.impl.UidPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__VISIBLE = 1;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__X = 2;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__Y = 3;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link uid.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uid.impl.StateImpl
	 * @see uid.impl.UidPackageImpl#getState()
	 * @generated
	 */
	int STATE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__VISIBLE = ENTITY__VISIBLE;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__X = ENTITY__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__Y = ENTITY__Y;

	/**
	 * The feature id for the '<em><b>Image background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__IMAGE_BACKGROUND = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Regulator</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__HAS_REGULATOR = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Matrix</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__HAS_MATRIX = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Has Button</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__HAS_BUTTON = ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Has Display</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__HAS_DISPLAY = ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Has Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__HAS_TRANSITION = ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link uid.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uid.impl.ButtonImpl
	 * @see uid.impl.UidPackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__VISIBLE = ENTITY__VISIBLE;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__X = ENTITY__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__Y = ENTITY__Y;

	/**
	 * The feature id for the '<em><b>Image on</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__IMAGE_ON = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Image off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__IMAGE_OFF = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Image disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__IMAGE_DISABLED = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Notification pressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__NOTIFICATION_PRESSED = ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Notification released</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__NOTIFICATION_RELEASED = ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link uid.impl.SwitchImpl <em>Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uid.impl.SwitchImpl
	 * @see uid.impl.UidPackageImpl#getSwitch()
	 * @generated
	 */
	int SWITCH = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__NAME = BUTTON__NAME;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__VISIBLE = BUTTON__VISIBLE;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__X = BUTTON__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__Y = BUTTON__Y;

	/**
	 * The feature id for the '<em><b>Image on</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__IMAGE_ON = BUTTON__IMAGE_ON;

	/**
	 * The feature id for the '<em><b>Image off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__IMAGE_OFF = BUTTON__IMAGE_OFF;

	/**
	 * The feature id for the '<em><b>Image disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__IMAGE_DISABLED = BUTTON__IMAGE_DISABLED;

	/**
	 * The feature id for the '<em><b>Notification pressed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__NOTIFICATION_PRESSED = BUTTON__NOTIFICATION_PRESSED;

	/**
	 * The feature id for the '<em><b>Notification released</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__NOTIFICATION_RELEASED = BUTTON__NOTIFICATION_RELEASED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__VALUE = BUTTON_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_FEATURE_COUNT = BUTTON_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uid.impl.MediatorImpl <em>Mediator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uid.impl.MediatorImpl
	 * @see uid.impl.UidPackageImpl#getMediator()
	 * @generated
	 */
	int MEDIATOR = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Has Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR__HAS_ENTITIES = 1;

	/**
	 * The feature id for the '<em><b>Commands To Generate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR__COMMANDS_TO_GENERATE = 2;

	/**
	 * The feature id for the '<em><b>Listeners</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR__LISTENERS = 3;

	/**
	 * The number of structural features of the '<em>Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link uid.impl.RegulatorImpl <em>Regulator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uid.impl.RegulatorImpl
	 * @see uid.impl.UidPackageImpl#getRegulator()
	 * @generated
	 */
	int REGULATOR = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATOR__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATOR__VISIBLE = ENTITY__VISIBLE;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATOR__X = ENTITY__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATOR__Y = ENTITY__Y;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATOR__MIN_VALUE = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATOR__MAX_VALUE = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Notification changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATOR__NOTIFICATION_CHANGED = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Notification double Tap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATOR__NOTIFICATION_DOUBLE_TAP = ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATOR__VALUE = ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATOR__DEFAULT_VALUE = ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Regulator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATOR_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link uid.impl.MatrixImpl <em>Matrix</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uid.impl.MatrixImpl
	 * @see uid.impl.UidPackageImpl#getMatrix()
	 * @generated
	 */
	int MATRIX = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__VISIBLE = ENTITY__VISIBLE;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__X = ENTITY__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__Y = ENTITY__Y;

	/**
	 * The feature id for the '<em><b>Image background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__IMAGE_BACKGROUND = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Image tap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__IMAGE_TAP = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Image double Tap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__IMAGE_DOUBLE_TAP = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Notification tap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__NOTIFICATION_TAP = ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Notification double Tap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__NOTIFICATION_DOUBLE_TAP = ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Notification move Single Touch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__NOTIFICATION_MOVE_SINGLE_TOUCH = ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Notification move Multi Touch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__NOTIFICATION_MOVE_MULTI_TOUCH = ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__VALUE = ENTITY_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Matrix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link uid.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uid.impl.ContainerImpl
	 * @see uid.impl.UidPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__VISIBLE = ENTITY__VISIBLE;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__X = ENTITY__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__Y = ENTITY__Y;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uid.impl.DisplayImpl <em>Display</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uid.impl.DisplayImpl
	 * @see uid.impl.UidPackageImpl#getDisplay()
	 * @generated
	 */
	int DISPLAY = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY__VISIBLE = ENTITY__VISIBLE;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY__X = ENTITY__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY__Y = ENTITY__Y;

	/**
	 * The feature id for the '<em><b>Image background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY__IMAGE_BACKGROUND = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY__VALUE = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Display</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link uid.ETransitionTypesIn <em>ETransition Types In</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uid.ETransitionTypesIn
	 * @see uid.impl.UidPackageImpl#getETransitionTypesIn()
	 * @generated
	 */
	int ETRANSITION_TYPES_IN = 11;

	/**
	 * The meta object id for the '{@link uid.ETransitionTypeOut <em>ETransition Type Out</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uid.ETransitionTypeOut
	 * @see uid.impl.UidPackageImpl#getETransitionTypeOut()
	 * @generated
	 */
	int ETRANSITION_TYPE_OUT = 12;


	/**
	 * Returns the meta object for class '{@link uid.EntityTransition <em>Entity Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Transition</em>'.
	 * @see uid.EntityTransition
	 * @generated
	 */
	EClass getEntityTransition();

	/**
	 * Returns the meta object for the attribute '{@link uid.EntityTransition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uid.EntityTransition#getName()
	 * @see #getEntityTransition()
	 * @generated
	 */
	EAttribute getEntityTransition_Name();

	/**
	 * Returns the meta object for the attribute '{@link uid.EntityTransition#getAnimationTypeIn <em>Animation Type In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Animation Type In</em>'.
	 * @see uid.EntityTransition#getAnimationTypeIn()
	 * @see #getEntityTransition()
	 * @generated
	 */
	EAttribute getEntityTransition_AnimationTypeIn();

	/**
	 * Returns the meta object for the attribute '{@link uid.EntityTransition#getAnimationTypeOut <em>Animation Type Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Animation Type Out</em>'.
	 * @see uid.EntityTransition#getAnimationTypeOut()
	 * @see #getEntityTransition()
	 * @generated
	 */
	EAttribute getEntityTransition_AnimationTypeOut();

	/**
	 * Returns the meta object for the attribute '{@link uid.EntityTransition#getAnimationInTime <em>Animation In Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Animation In Time</em>'.
	 * @see uid.EntityTransition#getAnimationInTime()
	 * @see #getEntityTransition()
	 * @generated
	 */
	EAttribute getEntityTransition_AnimationInTime();

	/**
	 * Returns the meta object for the attribute '{@link uid.EntityTransition#getAnimationOutTime <em>Animation Out Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Animation Out Time</em>'.
	 * @see uid.EntityTransition#getAnimationOutTime()
	 * @see #getEntityTransition()
	 * @generated
	 */
	EAttribute getEntityTransition_AnimationOutTime();

	/**
	 * Returns the meta object for the reference '{@link uid.EntityTransition#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entities</em>'.
	 * @see uid.EntityTransition#getEntities()
	 * @see #getEntityTransition()
	 * @generated
	 */
	EReference getEntityTransition_Entities();

	/**
	 * Returns the meta object for class '{@link uid.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see uid.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the attribute '{@link uid.Application#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uid.Application#getName()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link uid.Application#getHasEntityTransition <em>Has Entity Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Entity Transition</em>'.
	 * @see uid.Application#getHasEntityTransition()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_HasEntityTransition();

	/**
	 * Returns the meta object for the containment reference list '{@link uid.Application#getHasEntities <em>Has Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Entities</em>'.
	 * @see uid.Application#getHasEntities()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_HasEntities();

	/**
	 * Returns the meta object for the reference list '{@link uid.Application#getHasMediator <em>Has Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Mediator</em>'.
	 * @see uid.Application#getHasMediator()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_HasMediator();

	/**
	 * Returns the meta object for class '{@link uid.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see uid.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link uid.State#getImage_background <em>Image background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image background</em>'.
	 * @see uid.State#getImage_background()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Image_background();

	/**
	 * Returns the meta object for the reference list '{@link uid.State#getHasRegulator <em>Has Regulator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Regulator</em>'.
	 * @see uid.State#getHasRegulator()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_HasRegulator();

	/**
	 * Returns the meta object for the reference list '{@link uid.State#getHasMatrix <em>Has Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Matrix</em>'.
	 * @see uid.State#getHasMatrix()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_HasMatrix();

	/**
	 * Returns the meta object for the reference list '{@link uid.State#getHasButton <em>Has Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Button</em>'.
	 * @see uid.State#getHasButton()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_HasButton();

	/**
	 * Returns the meta object for the reference list '{@link uid.State#getHasDisplay <em>Has Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Display</em>'.
	 * @see uid.State#getHasDisplay()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_HasDisplay();

	/**
	 * Returns the meta object for the reference list '{@link uid.State#getHasTransition <em>Has Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Transition</em>'.
	 * @see uid.State#getHasTransition()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_HasTransition();

	/**
	 * Returns the meta object for class '{@link uid.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see uid.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the attribute '{@link uid.Entity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uid.Entity#getName()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Name();

	/**
	 * Returns the meta object for the attribute '{@link uid.Entity#isVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see uid.Entity#isVisible()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Visible();

	/**
	 * Returns the meta object for the attribute '{@link uid.Entity#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see uid.Entity#getX()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_X();

	/**
	 * Returns the meta object for the attribute '{@link uid.Entity#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see uid.Entity#getY()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Y();

	/**
	 * Returns the meta object for class '{@link uid.Switch <em>Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch</em>'.
	 * @see uid.Switch
	 * @generated
	 */
	EClass getSwitch();

	/**
	 * Returns the meta object for the attribute '{@link uid.Switch#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see uid.Switch#isValue()
	 * @see #getSwitch()
	 * @generated
	 */
	EAttribute getSwitch_Value();

	/**
	 * Returns the meta object for class '{@link uid.Mediator <em>Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mediator</em>'.
	 * @see uid.Mediator
	 * @generated
	 */
	EClass getMediator();

	/**
	 * Returns the meta object for the attribute '{@link uid.Mediator#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uid.Mediator#getName()
	 * @see #getMediator()
	 * @generated
	 */
	EAttribute getMediator_Name();

	/**
	 * Returns the meta object for the reference list '{@link uid.Mediator#getHasEntities <em>Has Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Entities</em>'.
	 * @see uid.Mediator#getHasEntities()
	 * @see #getMediator()
	 * @generated
	 */
	EReference getMediator_HasEntities();

	/**
	 * Returns the meta object for the attribute '{@link uid.Mediator#getCommandsToGenerate <em>Commands To Generate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Commands To Generate</em>'.
	 * @see uid.Mediator#getCommandsToGenerate()
	 * @see #getMediator()
	 * @generated
	 */
	EAttribute getMediator_CommandsToGenerate();

	/**
	 * Returns the meta object for the attribute '{@link uid.Mediator#getListeners <em>Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Listeners</em>'.
	 * @see uid.Mediator#getListeners()
	 * @see #getMediator()
	 * @generated
	 */
	EAttribute getMediator_Listeners();

	/**
	 * Returns the meta object for class '{@link uid.Regulator <em>Regulator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regulator</em>'.
	 * @see uid.Regulator
	 * @generated
	 */
	EClass getRegulator();

	/**
	 * Returns the meta object for the attribute '{@link uid.Regulator#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see uid.Regulator#getMinValue()
	 * @see #getRegulator()
	 * @generated
	 */
	EAttribute getRegulator_MinValue();

	/**
	 * Returns the meta object for the attribute '{@link uid.Regulator#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see uid.Regulator#getMaxValue()
	 * @see #getRegulator()
	 * @generated
	 */
	EAttribute getRegulator_MaxValue();

	/**
	 * Returns the meta object for the attribute '{@link uid.Regulator#getNotification_changed <em>Notification changed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notification changed</em>'.
	 * @see uid.Regulator#getNotification_changed()
	 * @see #getRegulator()
	 * @generated
	 */
	EAttribute getRegulator_Notification_changed();

	/**
	 * Returns the meta object for the attribute '{@link uid.Regulator#getNotification_doubleTap <em>Notification double Tap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notification double Tap</em>'.
	 * @see uid.Regulator#getNotification_doubleTap()
	 * @see #getRegulator()
	 * @generated
	 */
	EAttribute getRegulator_Notification_doubleTap();

	/**
	 * Returns the meta object for the attribute '{@link uid.Regulator#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see uid.Regulator#getValue()
	 * @see #getRegulator()
	 * @generated
	 */
	EAttribute getRegulator_Value();

	/**
	 * Returns the meta object for the attribute '{@link uid.Regulator#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see uid.Regulator#getDefaultValue()
	 * @see #getRegulator()
	 * @generated
	 */
	EAttribute getRegulator_DefaultValue();

	/**
	 * Returns the meta object for class '{@link uid.Matrix <em>Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matrix</em>'.
	 * @see uid.Matrix
	 * @generated
	 */
	EClass getMatrix();

	/**
	 * Returns the meta object for the attribute '{@link uid.Matrix#getImage_background <em>Image background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image background</em>'.
	 * @see uid.Matrix#getImage_background()
	 * @see #getMatrix()
	 * @generated
	 */
	EAttribute getMatrix_Image_background();

	/**
	 * Returns the meta object for the attribute '{@link uid.Matrix#getImage_tap <em>Image tap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image tap</em>'.
	 * @see uid.Matrix#getImage_tap()
	 * @see #getMatrix()
	 * @generated
	 */
	EAttribute getMatrix_Image_tap();

	/**
	 * Returns the meta object for the attribute '{@link uid.Matrix#getImage_doubleTap <em>Image double Tap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image double Tap</em>'.
	 * @see uid.Matrix#getImage_doubleTap()
	 * @see #getMatrix()
	 * @generated
	 */
	EAttribute getMatrix_Image_doubleTap();

	/**
	 * Returns the meta object for the attribute '{@link uid.Matrix#getNotification_tap <em>Notification tap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notification tap</em>'.
	 * @see uid.Matrix#getNotification_tap()
	 * @see #getMatrix()
	 * @generated
	 */
	EAttribute getMatrix_Notification_tap();

	/**
	 * Returns the meta object for the attribute '{@link uid.Matrix#getNotification_doubleTap <em>Notification double Tap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notification double Tap</em>'.
	 * @see uid.Matrix#getNotification_doubleTap()
	 * @see #getMatrix()
	 * @generated
	 */
	EAttribute getMatrix_Notification_doubleTap();

	/**
	 * Returns the meta object for the attribute '{@link uid.Matrix#getNotification_moveSingleTouch <em>Notification move Single Touch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notification move Single Touch</em>'.
	 * @see uid.Matrix#getNotification_moveSingleTouch()
	 * @see #getMatrix()
	 * @generated
	 */
	EAttribute getMatrix_Notification_moveSingleTouch();

	/**
	 * Returns the meta object for the attribute '{@link uid.Matrix#getNotification_moveMultiTouch <em>Notification move Multi Touch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notification move Multi Touch</em>'.
	 * @see uid.Matrix#getNotification_moveMultiTouch()
	 * @see #getMatrix()
	 * @generated
	 */
	EAttribute getMatrix_Notification_moveMultiTouch();

	/**
	 * Returns the meta object for the attribute '{@link uid.Matrix#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see uid.Matrix#getValue()
	 * @see #getMatrix()
	 * @generated
	 */
	EAttribute getMatrix_Value();

	/**
	 * Returns the meta object for class '{@link uid.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see uid.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for class '{@link uid.Display <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Display</em>'.
	 * @see uid.Display
	 * @generated
	 */
	EClass getDisplay();

	/**
	 * Returns the meta object for the attribute '{@link uid.Display#getImage_background <em>Image background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image background</em>'.
	 * @see uid.Display#getImage_background()
	 * @see #getDisplay()
	 * @generated
	 */
	EAttribute getDisplay_Image_background();

	/**
	 * Returns the meta object for the attribute '{@link uid.Display#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see uid.Display#getValue()
	 * @see #getDisplay()
	 * @generated
	 */
	EAttribute getDisplay_Value();

	/**
	 * Returns the meta object for class '{@link uid.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see uid.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for the attribute '{@link uid.Button#getImage_on <em>Image on</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image on</em>'.
	 * @see uid.Button#getImage_on()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_Image_on();

	/**
	 * Returns the meta object for the attribute '{@link uid.Button#getImage_off <em>Image off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image off</em>'.
	 * @see uid.Button#getImage_off()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_Image_off();

	/**
	 * Returns the meta object for the attribute '{@link uid.Button#getImage_disabled <em>Image disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image disabled</em>'.
	 * @see uid.Button#getImage_disabled()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_Image_disabled();

	/**
	 * Returns the meta object for the attribute '{@link uid.Button#getNotification_pressed <em>Notification pressed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notification pressed</em>'.
	 * @see uid.Button#getNotification_pressed()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_Notification_pressed();

	/**
	 * Returns the meta object for the attribute '{@link uid.Button#getNotification_released <em>Notification released</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notification released</em>'.
	 * @see uid.Button#getNotification_released()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_Notification_released();

	/**
	 * Returns the meta object for enum '{@link uid.ETransitionTypesIn <em>ETransition Types In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ETransition Types In</em>'.
	 * @see uid.ETransitionTypesIn
	 * @generated
	 */
	EEnum getETransitionTypesIn();

	/**
	 * Returns the meta object for enum '{@link uid.ETransitionTypeOut <em>ETransition Type Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ETransition Type Out</em>'.
	 * @see uid.ETransitionTypeOut
	 * @generated
	 */
	EEnum getETransitionTypeOut();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UidFactory getUidFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link uid.impl.EntityTransitionImpl <em>Entity Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uid.impl.EntityTransitionImpl
		 * @see uid.impl.UidPackageImpl#getEntityTransition()
		 * @generated
		 */
		EClass ENTITY_TRANSITION = eINSTANCE.getEntityTransition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_TRANSITION__NAME = eINSTANCE.getEntityTransition_Name();

		/**
		 * The meta object literal for the '<em><b>Animation Type In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_TRANSITION__ANIMATION_TYPE_IN = eINSTANCE.getEntityTransition_AnimationTypeIn();

		/**
		 * The meta object literal for the '<em><b>Animation Type Out</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_TRANSITION__ANIMATION_TYPE_OUT = eINSTANCE.getEntityTransition_AnimationTypeOut();

		/**
		 * The meta object literal for the '<em><b>Animation In Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_TRANSITION__ANIMATION_IN_TIME = eINSTANCE.getEntityTransition_AnimationInTime();

		/**
		 * The meta object literal for the '<em><b>Animation Out Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_TRANSITION__ANIMATION_OUT_TIME = eINSTANCE.getEntityTransition_AnimationOutTime();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TRANSITION__ENTITIES = eINSTANCE.getEntityTransition_Entities();

		/**
		 * The meta object literal for the '{@link uid.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uid.impl.ApplicationImpl
		 * @see uid.impl.UidPackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__NAME = eINSTANCE.getApplication_Name();

		/**
		 * The meta object literal for the '<em><b>Has Entity Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__HAS_ENTITY_TRANSITION = eINSTANCE.getApplication_HasEntityTransition();

		/**
		 * The meta object literal for the '<em><b>Has Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__HAS_ENTITIES = eINSTANCE.getApplication_HasEntities();

		/**
		 * The meta object literal for the '<em><b>Has Mediator</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__HAS_MEDIATOR = eINSTANCE.getApplication_HasMediator();

		/**
		 * The meta object literal for the '{@link uid.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uid.impl.StateImpl
		 * @see uid.impl.UidPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Image background</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__IMAGE_BACKGROUND = eINSTANCE.getState_Image_background();

		/**
		 * The meta object literal for the '<em><b>Has Regulator</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__HAS_REGULATOR = eINSTANCE.getState_HasRegulator();

		/**
		 * The meta object literal for the '<em><b>Has Matrix</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__HAS_MATRIX = eINSTANCE.getState_HasMatrix();

		/**
		 * The meta object literal for the '<em><b>Has Button</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__HAS_BUTTON = eINSTANCE.getState_HasButton();

		/**
		 * The meta object literal for the '<em><b>Has Display</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__HAS_DISPLAY = eINSTANCE.getState_HasDisplay();

		/**
		 * The meta object literal for the '<em><b>Has Transition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__HAS_TRANSITION = eINSTANCE.getState_HasTransition();

		/**
		 * The meta object literal for the '{@link uid.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uid.impl.EntityImpl
		 * @see uid.impl.UidPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__VISIBLE = eINSTANCE.getEntity_Visible();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__X = eINSTANCE.getEntity_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__Y = eINSTANCE.getEntity_Y();

		/**
		 * The meta object literal for the '{@link uid.impl.SwitchImpl <em>Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uid.impl.SwitchImpl
		 * @see uid.impl.UidPackageImpl#getSwitch()
		 * @generated
		 */
		EClass SWITCH = eINSTANCE.getSwitch();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCH__VALUE = eINSTANCE.getSwitch_Value();

		/**
		 * The meta object literal for the '{@link uid.impl.MediatorImpl <em>Mediator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uid.impl.MediatorImpl
		 * @see uid.impl.UidPackageImpl#getMediator()
		 * @generated
		 */
		EClass MEDIATOR = eINSTANCE.getMediator();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIATOR__NAME = eINSTANCE.getMediator_Name();

		/**
		 * The meta object literal for the '<em><b>Has Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIATOR__HAS_ENTITIES = eINSTANCE.getMediator_HasEntities();

		/**
		 * The meta object literal for the '<em><b>Commands To Generate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIATOR__COMMANDS_TO_GENERATE = eINSTANCE.getMediator_CommandsToGenerate();

		/**
		 * The meta object literal for the '<em><b>Listeners</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDIATOR__LISTENERS = eINSTANCE.getMediator_Listeners();

		/**
		 * The meta object literal for the '{@link uid.impl.RegulatorImpl <em>Regulator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uid.impl.RegulatorImpl
		 * @see uid.impl.UidPackageImpl#getRegulator()
		 * @generated
		 */
		EClass REGULATOR = eINSTANCE.getRegulator();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGULATOR__MIN_VALUE = eINSTANCE.getRegulator_MinValue();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGULATOR__MAX_VALUE = eINSTANCE.getRegulator_MaxValue();

		/**
		 * The meta object literal for the '<em><b>Notification changed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGULATOR__NOTIFICATION_CHANGED = eINSTANCE.getRegulator_Notification_changed();

		/**
		 * The meta object literal for the '<em><b>Notification double Tap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGULATOR__NOTIFICATION_DOUBLE_TAP = eINSTANCE.getRegulator_Notification_doubleTap();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGULATOR__VALUE = eINSTANCE.getRegulator_Value();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGULATOR__DEFAULT_VALUE = eINSTANCE.getRegulator_DefaultValue();

		/**
		 * The meta object literal for the '{@link uid.impl.MatrixImpl <em>Matrix</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uid.impl.MatrixImpl
		 * @see uid.impl.UidPackageImpl#getMatrix()
		 * @generated
		 */
		EClass MATRIX = eINSTANCE.getMatrix();

		/**
		 * The meta object literal for the '<em><b>Image background</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX__IMAGE_BACKGROUND = eINSTANCE.getMatrix_Image_background();

		/**
		 * The meta object literal for the '<em><b>Image tap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX__IMAGE_TAP = eINSTANCE.getMatrix_Image_tap();

		/**
		 * The meta object literal for the '<em><b>Image double Tap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX__IMAGE_DOUBLE_TAP = eINSTANCE.getMatrix_Image_doubleTap();

		/**
		 * The meta object literal for the '<em><b>Notification tap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX__NOTIFICATION_TAP = eINSTANCE.getMatrix_Notification_tap();

		/**
		 * The meta object literal for the '<em><b>Notification double Tap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX__NOTIFICATION_DOUBLE_TAP = eINSTANCE.getMatrix_Notification_doubleTap();

		/**
		 * The meta object literal for the '<em><b>Notification move Single Touch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX__NOTIFICATION_MOVE_SINGLE_TOUCH = eINSTANCE.getMatrix_Notification_moveSingleTouch();

		/**
		 * The meta object literal for the '<em><b>Notification move Multi Touch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX__NOTIFICATION_MOVE_MULTI_TOUCH = eINSTANCE.getMatrix_Notification_moveMultiTouch();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX__VALUE = eINSTANCE.getMatrix_Value();

		/**
		 * The meta object literal for the '{@link uid.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uid.impl.ContainerImpl
		 * @see uid.impl.UidPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '{@link uid.impl.DisplayImpl <em>Display</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uid.impl.DisplayImpl
		 * @see uid.impl.UidPackageImpl#getDisplay()
		 * @generated
		 */
		EClass DISPLAY = eINSTANCE.getDisplay();

		/**
		 * The meta object literal for the '<em><b>Image background</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPLAY__IMAGE_BACKGROUND = eINSTANCE.getDisplay_Image_background();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPLAY__VALUE = eINSTANCE.getDisplay_Value();

		/**
		 * The meta object literal for the '{@link uid.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uid.impl.ButtonImpl
		 * @see uid.impl.UidPackageImpl#getButton()
		 * @generated
		 */
		EClass BUTTON = eINSTANCE.getButton();

		/**
		 * The meta object literal for the '<em><b>Image on</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__IMAGE_ON = eINSTANCE.getButton_Image_on();

		/**
		 * The meta object literal for the '<em><b>Image off</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__IMAGE_OFF = eINSTANCE.getButton_Image_off();

		/**
		 * The meta object literal for the '<em><b>Image disabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__IMAGE_DISABLED = eINSTANCE.getButton_Image_disabled();

		/**
		 * The meta object literal for the '<em><b>Notification pressed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__NOTIFICATION_PRESSED = eINSTANCE.getButton_Notification_pressed();

		/**
		 * The meta object literal for the '<em><b>Notification released</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__NOTIFICATION_RELEASED = eINSTANCE.getButton_Notification_released();

		/**
		 * The meta object literal for the '{@link uid.ETransitionTypesIn <em>ETransition Types In</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uid.ETransitionTypesIn
		 * @see uid.impl.UidPackageImpl#getETransitionTypesIn()
		 * @generated
		 */
		EEnum ETRANSITION_TYPES_IN = eINSTANCE.getETransitionTypesIn();

		/**
		 * The meta object literal for the '{@link uid.ETransitionTypeOut <em>ETransition Type Out</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uid.ETransitionTypeOut
		 * @see uid.impl.UidPackageImpl#getETransitionTypeOut()
		 * @generated
		 */
		EEnum ETRANSITION_TYPE_OUT = eINSTANCE.getETransitionTypeOut();

	}

} //UidPackage
