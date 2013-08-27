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
	 * The feature id for the '<em><b>Has Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TRANSITION__HAS_COMPONENT = 5;

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
	 * The feature id for the '<em><b>Has Views</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__HAS_VIEWS = 2;

	/**
	 * The feature id for the '<em><b>Has Controllers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__HAS_CONTROLLERS = 3;

	/**
	 * The feature id for the '<em><b>Has Notifications</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__HAS_NOTIFICATIONS = 4;

	/**
	 * The feature id for the '<em><b>Has Models</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__HAS_MODELS = 5;

	/**
	 * The feature id for the '<em><b>Has Mediator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__HAS_MEDIATOR = 6;

	/**
	 * The feature id for the '<em><b>Has Initial View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__HAS_INITIAL_VIEW = 7;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link uid.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uid.impl.ComponentImpl
	 * @see uid.impl.UidPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__VISIBLE = 1;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__X = 2;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__Y = 3;

	/**
	 * The feature id for the '<em><b>Has Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__HAS_EVENTS = 4;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link uid.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uid.impl.ButtonImpl
	 * @see uid.impl.UidPackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__VISIBLE = COMPONENT__VISIBLE;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__X = COMPONENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__Y = COMPONENT__Y;

	/**
	 * The feature id for the '<em><b>Has Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__HAS_EVENTS = COMPONENT__HAS_EVENTS;

	/**
	 * The feature id for the '<em><b>Image on</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__IMAGE_ON = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Image off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__IMAGE_OFF = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Image disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__IMAGE_DISABLED = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__LABEL = COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link uid.impl.SwitchImpl <em>Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uid.impl.SwitchImpl
	 * @see uid.impl.UidPackageImpl#getSwitch()
	 * @generated
	 */
	int SWITCH = 3;

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
	 * The feature id for the '<em><b>Has Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__HAS_EVENTS = BUTTON__HAS_EVENTS;

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
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__LABEL = BUTTON__LABEL;

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
	int MEDIATOR = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Has Notification Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR__HAS_NOTIFICATION_HANDLER = 1;

	/**
	 * The number of structural features of the '<em>Mediator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIATOR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link uid.impl.RegulatorImpl <em>Regulator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uid.impl.RegulatorImpl
	 * @see uid.impl.UidPackageImpl#getRegulator()
	 * @generated
	 */
	int REGULATOR = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATOR__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATOR__VISIBLE = COMPONENT__VISIBLE;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATOR__X = COMPONENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATOR__Y = COMPONENT__Y;

	/**
	 * The feature id for the '<em><b>Has Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATOR__HAS_EVENTS = COMPONENT__HAS_EVENTS;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATOR__MIN_VALUE = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATOR__MAX_VALUE = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATOR__VALUE = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATOR__DEFAULT_VALUE = COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Regulator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGULATOR_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link uid.impl.MatrixImpl <em>Matrix</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uid.impl.MatrixImpl
	 * @see uid.impl.UidPackageImpl#getMatrix()
	 * @generated
	 */
	int MATRIX = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__VISIBLE = COMPONENT__VISIBLE;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__X = COMPONENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__Y = COMPONENT__Y;

	/**
	 * The feature id for the '<em><b>Has Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__HAS_EVENTS = COMPONENT__HAS_EVENTS;

	/**
	 * The feature id for the '<em><b>Image background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__IMAGE_BACKGROUND = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Image tap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__IMAGE_TAP = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Image double Tap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__IMAGE_DOUBLE_TAP = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__VALUE = COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Matrix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link uid.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uid.impl.ContainerImpl
	 * @see uid.impl.UidPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__VISIBLE = COMPONENT__VISIBLE;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__X = COMPONENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__Y = COMPONENT__Y;

	/**
	 * The feature id for the '<em><b>Has Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__HAS_EVENTS = COMPONENT__HAS_EVENTS;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uid.impl.DisplayImpl <em>Display</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uid.impl.DisplayImpl
	 * @see uid.impl.UidPackageImpl#getDisplay()
	 * @generated
	 */
	int DISPLAY = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY__VISIBLE = COMPONENT__VISIBLE;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY__X = COMPONENT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY__Y = COMPONENT__Y;

	/**
	 * The feature id for the '<em><b>Has Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY__HAS_EVENTS = COMPONENT__HAS_EVENTS;

	/**
	 * The feature id for the '<em><b>Image background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY__IMAGE_BACKGROUND = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY__VALUE = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Display</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link uid.impl.NotificationImpl <em>Notification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uid.impl.NotificationImpl
	 * @see uid.impl.UidPackageImpl#getNotification()
	 * @generated
	 */
	int NOTIFICATION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Recieved By Command</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION__RECIEVED_BY_COMMAND = 1;

	/**
	 * The number of structural features of the '<em>Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link uid.impl.CommandImpl <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uid.impl.CommandImpl
	 * @see uid.impl.UidPackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__NAME = 0;

	/**
	 * The feature id for the '<em><b>Has Notification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__HAS_NOTIFICATION = 1;

	/**
	 * The number of structural features of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link uid.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uid.impl.EventImpl
	 * @see uid.impl.UidPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Sends Notification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__SENDS_NOTIFICATION = 1;

	/**
	 * The feature id for the '<em><b>Callback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__CALLBACK = 2;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link uid.impl.NotificationHandlerImpl <em>Notification Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uid.impl.NotificationHandlerImpl
	 * @see uid.impl.UidPackageImpl#getNotificationHandler()
	 * @generated
	 */
	int NOTIFICATION_HANDLER = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_HANDLER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Recieves Notification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_HANDLER__RECIEVES_NOTIFICATION = 1;

	/**
	 * The feature id for the '<em><b>Sends Notification</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_HANDLER__SENDS_NOTIFICATION = 2;

	/**
	 * The feature id for the '<em><b>Change Stage To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_HANDLER__CHANGE_STAGE_TO = 3;

	/**
	 * The number of structural features of the '<em>Notification Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_HANDLER_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link uid.impl.StageImpl <em>Stage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uid.impl.StageImpl
	 * @see uid.impl.UidPackageImpl#getStage()
	 * @generated
	 */
	int STAGE = 14;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__BACKGROUND = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Has Display</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__HAS_DISPLAY = 2;

	/**
	 * The feature id for the '<em><b>Has Container</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__HAS_CONTAINER = 3;

	/**
	 * The feature id for the '<em><b>Has Matrix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__HAS_MATRIX = 4;

	/**
	 * The feature id for the '<em><b>Has Regulator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__HAS_REGULATOR = 5;

	/**
	 * The feature id for the '<em><b>Has Button</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__HAS_BUTTON = 6;

	/**
	 * The feature id for the '<em><b>Has Switch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__HAS_SWITCH = 7;

	/**
	 * The feature id for the '<em><b>Has Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__HAS_EVENTS = 8;

	/**
	 * The number of structural features of the '<em>Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link uid.impl.ViewsImpl <em>Views</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uid.impl.ViewsImpl
	 * @see uid.impl.UidPackageImpl#getViews()
	 * @generated
	 */
	int VIEWS = 15;

	/**
	 * The feature id for the '<em><b>Has Stage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWS__HAS_STAGE = 0;

	/**
	 * The feature id for the '<em><b>Has Mediator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWS__HAS_MEDIATOR = 1;

	/**
	 * The number of structural features of the '<em>Views</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link uid.impl.ControllersImpl <em>Controllers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uid.impl.ControllersImpl
	 * @see uid.impl.UidPackageImpl#getControllers()
	 * @generated
	 */
	int CONTROLLERS = 16;

	/**
	 * The feature id for the '<em><b>Has Command</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLERS__HAS_COMMAND = 0;

	/**
	 * The number of structural features of the '<em>Controllers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLERS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link uid.impl.ModelsImpl <em>Models</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uid.impl.ModelsImpl
	 * @see uid.impl.UidPackageImpl#getModels()
	 * @generated
	 */
	int MODELS = 17;

	/**
	 * The number of structural features of the '<em>Models</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link uid.impl.NotificationsImpl <em>Notifications</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uid.impl.NotificationsImpl
	 * @see uid.impl.UidPackageImpl#getNotifications()
	 * @generated
	 */
	int NOTIFICATIONS = 18;

	/**
	 * The feature id for the '<em><b>Has Notification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATIONS__HAS_NOTIFICATION = 0;

	/**
	 * The number of structural features of the '<em>Notifications</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATIONS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link uid.impl.StateTransitionImpl <em>State Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uid.impl.StateTransitionImpl
	 * @see uid.impl.UidPackageImpl#getStateTransition()
	 * @generated
	 */
	int STATE_TRANSITION = 19;

	/**
	 * The number of structural features of the '<em>State Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_TRANSITION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link uid.ETransitionTypesIn <em>ETransition Types In</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uid.ETransitionTypesIn
	 * @see uid.impl.UidPackageImpl#getETransitionTypesIn()
	 * @generated
	 */
	int ETRANSITION_TYPES_IN = 20;

	/**
	 * The meta object id for the '{@link uid.ETransitionTypeOut <em>ETransition Type Out</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uid.ETransitionTypeOut
	 * @see uid.impl.UidPackageImpl#getETransitionTypeOut()
	 * @generated
	 */
	int ETRANSITION_TYPE_OUT = 21;

	/**
	 * The meta object id for the '{@link uid.EuiEventCallbacks <em>Eui Event Callbacks</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uid.EuiEventCallbacks
	 * @see uid.impl.UidPackageImpl#getEuiEventCallbacks()
	 * @generated
	 */
	int EUI_EVENT_CALLBACKS = 22;


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
	 * Returns the meta object for the reference '{@link uid.EntityTransition#getHasComponent <em>Has Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Component</em>'.
	 * @see uid.EntityTransition#getHasComponent()
	 * @see #getEntityTransition()
	 * @generated
	 */
	EReference getEntityTransition_HasComponent();

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
	 * Returns the meta object for the containment reference '{@link uid.Application#getHasViews <em>Has Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Views</em>'.
	 * @see uid.Application#getHasViews()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_HasViews();

	/**
	 * Returns the meta object for the containment reference '{@link uid.Application#getHasControllers <em>Has Controllers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Controllers</em>'.
	 * @see uid.Application#getHasControllers()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_HasControllers();

	/**
	 * Returns the meta object for the containment reference '{@link uid.Application#getHasNotifications <em>Has Notifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Notifications</em>'.
	 * @see uid.Application#getHasNotifications()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_HasNotifications();

	/**
	 * Returns the meta object for the containment reference '{@link uid.Application#getHasModels <em>Has Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Models</em>'.
	 * @see uid.Application#getHasModels()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_HasModels();

	/**
	 * Returns the meta object for the containment reference '{@link uid.Application#getHasMediator <em>Has Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Mediator</em>'.
	 * @see uid.Application#getHasMediator()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_HasMediator();

	/**
	 * Returns the meta object for the reference '{@link uid.Application#getHasInitialView <em>Has Initial View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Initial View</em>'.
	 * @see uid.Application#getHasInitialView()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_HasInitialView();

	/**
	 * Returns the meta object for class '{@link uid.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see uid.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link uid.Component#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uid.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Name();

	/**
	 * Returns the meta object for the attribute '{@link uid.Component#isVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see uid.Component#isVisible()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Visible();

	/**
	 * Returns the meta object for the attribute '{@link uid.Component#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see uid.Component#getX()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_X();

	/**
	 * Returns the meta object for the attribute '{@link uid.Component#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see uid.Component#getY()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Y();

	/**
	 * Returns the meta object for the containment reference list '{@link uid.Component#getHasEvents <em>Has Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Events</em>'.
	 * @see uid.Component#getHasEvents()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_HasEvents();

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
	 * Returns the meta object for the containment reference list '{@link uid.Mediator#getHasNotificationHandler <em>Has Notification Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Notification Handler</em>'.
	 * @see uid.Mediator#getHasNotificationHandler()
	 * @see #getMediator()
	 * @generated
	 */
	EReference getMediator_HasNotificationHandler();

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
	 * Returns the meta object for the attribute '{@link uid.Button#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see uid.Button#getLabel()
	 * @see #getButton()
	 * @generated
	 */
	EAttribute getButton_Label();

	/**
	 * Returns the meta object for class '{@link uid.Notification <em>Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notification</em>'.
	 * @see uid.Notification
	 * @generated
	 */
	EClass getNotification();

	/**
	 * Returns the meta object for the attribute '{@link uid.Notification#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uid.Notification#getName()
	 * @see #getNotification()
	 * @generated
	 */
	EAttribute getNotification_Name();

	/**
	 * Returns the meta object for the reference '{@link uid.Notification#getRecievedByCommand <em>Recieved By Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Recieved By Command</em>'.
	 * @see uid.Notification#getRecievedByCommand()
	 * @see #getNotification()
	 * @generated
	 */
	EReference getNotification_RecievedByCommand();

	/**
	 * Returns the meta object for class '{@link uid.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command</em>'.
	 * @see uid.Command
	 * @generated
	 */
	EClass getCommand();

	/**
	 * Returns the meta object for the attribute '{@link uid.Command#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uid.Command#getName()
	 * @see #getCommand()
	 * @generated
	 */
	EAttribute getCommand_Name();

	/**
	 * Returns the meta object for the reference list '{@link uid.Command#getHasNotification <em>Has Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Notification</em>'.
	 * @see uid.Command#getHasNotification()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_HasNotification();

	/**
	 * Returns the meta object for class '{@link uid.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see uid.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link uid.Event#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uid.Event#getName()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Name();

	/**
	 * Returns the meta object for the reference list '{@link uid.Event#getSendsNotification <em>Sends Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sends Notification</em>'.
	 * @see uid.Event#getSendsNotification()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_SendsNotification();

	/**
	 * Returns the meta object for the attribute '{@link uid.Event#getCallback <em>Callback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Callback</em>'.
	 * @see uid.Event#getCallback()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Callback();

	/**
	 * Returns the meta object for class '{@link uid.NotificationHandler <em>Notification Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notification Handler</em>'.
	 * @see uid.NotificationHandler
	 * @generated
	 */
	EClass getNotificationHandler();

	/**
	 * Returns the meta object for the attribute '{@link uid.NotificationHandler#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uid.NotificationHandler#getName()
	 * @see #getNotificationHandler()
	 * @generated
	 */
	EAttribute getNotificationHandler_Name();

	/**
	 * Returns the meta object for the reference '{@link uid.NotificationHandler#getRecievesNotification <em>Recieves Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Recieves Notification</em>'.
	 * @see uid.NotificationHandler#getRecievesNotification()
	 * @see #getNotificationHandler()
	 * @generated
	 */
	EReference getNotificationHandler_RecievesNotification();

	/**
	 * Returns the meta object for the reference list '{@link uid.NotificationHandler#getSendsNotification <em>Sends Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sends Notification</em>'.
	 * @see uid.NotificationHandler#getSendsNotification()
	 * @see #getNotificationHandler()
	 * @generated
	 */
	EReference getNotificationHandler_SendsNotification();

	/**
	 * Returns the meta object for the reference '{@link uid.NotificationHandler#getChangeStageTo <em>Change Stage To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Change Stage To</em>'.
	 * @see uid.NotificationHandler#getChangeStageTo()
	 * @see #getNotificationHandler()
	 * @generated
	 */
	EReference getNotificationHandler_ChangeStageTo();

	/**
	 * Returns the meta object for class '{@link uid.Stage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stage</em>'.
	 * @see uid.Stage
	 * @generated
	 */
	EClass getStage();

	/**
	 * Returns the meta object for the attribute '{@link uid.Stage#getBackground <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background</em>'.
	 * @see uid.Stage#getBackground()
	 * @see #getStage()
	 * @generated
	 */
	EAttribute getStage_Background();

	/**
	 * Returns the meta object for the attribute '{@link uid.Stage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uid.Stage#getName()
	 * @see #getStage()
	 * @generated
	 */
	EAttribute getStage_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link uid.Stage#getHasDisplay <em>Has Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Display</em>'.
	 * @see uid.Stage#getHasDisplay()
	 * @see #getStage()
	 * @generated
	 */
	EReference getStage_HasDisplay();

	/**
	 * Returns the meta object for the containment reference list '{@link uid.Stage#getHasContainer <em>Has Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Container</em>'.
	 * @see uid.Stage#getHasContainer()
	 * @see #getStage()
	 * @generated
	 */
	EReference getStage_HasContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link uid.Stage#getHasMatrix <em>Has Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Matrix</em>'.
	 * @see uid.Stage#getHasMatrix()
	 * @see #getStage()
	 * @generated
	 */
	EReference getStage_HasMatrix();

	/**
	 * Returns the meta object for the containment reference list '{@link uid.Stage#getHasRegulator <em>Has Regulator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Regulator</em>'.
	 * @see uid.Stage#getHasRegulator()
	 * @see #getStage()
	 * @generated
	 */
	EReference getStage_HasRegulator();

	/**
	 * Returns the meta object for the containment reference list '{@link uid.Stage#getHasButton <em>Has Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Button</em>'.
	 * @see uid.Stage#getHasButton()
	 * @see #getStage()
	 * @generated
	 */
	EReference getStage_HasButton();

	/**
	 * Returns the meta object for the containment reference list '{@link uid.Stage#getHasSwitch <em>Has Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Switch</em>'.
	 * @see uid.Stage#getHasSwitch()
	 * @see #getStage()
	 * @generated
	 */
	EReference getStage_HasSwitch();

	/**
	 * Returns the meta object for the containment reference list '{@link uid.Stage#getHasEvents <em>Has Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Events</em>'.
	 * @see uid.Stage#getHasEvents()
	 * @see #getStage()
	 * @generated
	 */
	EReference getStage_HasEvents();

	/**
	 * Returns the meta object for class '{@link uid.Views <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Views</em>'.
	 * @see uid.Views
	 * @generated
	 */
	EClass getViews();

	/**
	 * Returns the meta object for the containment reference list '{@link uid.Views#getHasStage <em>Has Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Stage</em>'.
	 * @see uid.Views#getHasStage()
	 * @see #getViews()
	 * @generated
	 */
	EReference getViews_HasStage();

	/**
	 * Returns the meta object for the containment reference list '{@link uid.Views#getHasMediator <em>Has Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Mediator</em>'.
	 * @see uid.Views#getHasMediator()
	 * @see #getViews()
	 * @generated
	 */
	EReference getViews_HasMediator();

	/**
	 * Returns the meta object for class '{@link uid.Controllers <em>Controllers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controllers</em>'.
	 * @see uid.Controllers
	 * @generated
	 */
	EClass getControllers();

	/**
	 * Returns the meta object for the containment reference list '{@link uid.Controllers#getHasCommand <em>Has Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Command</em>'.
	 * @see uid.Controllers#getHasCommand()
	 * @see #getControllers()
	 * @generated
	 */
	EReference getControllers_HasCommand();

	/**
	 * Returns the meta object for class '{@link uid.Models <em>Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Models</em>'.
	 * @see uid.Models
	 * @generated
	 */
	EClass getModels();

	/**
	 * Returns the meta object for class '{@link uid.Notifications <em>Notifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notifications</em>'.
	 * @see uid.Notifications
	 * @generated
	 */
	EClass getNotifications();

	/**
	 * Returns the meta object for the containment reference list '{@link uid.Notifications#getHasNotification <em>Has Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Notification</em>'.
	 * @see uid.Notifications#getHasNotification()
	 * @see #getNotifications()
	 * @generated
	 */
	EReference getNotifications_HasNotification();

	/**
	 * Returns the meta object for class '{@link uid.StateTransition <em>State Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Transition</em>'.
	 * @see uid.StateTransition
	 * @generated
	 */
	EClass getStateTransition();

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
	 * Returns the meta object for enum '{@link uid.EuiEventCallbacks <em>Eui Event Callbacks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Eui Event Callbacks</em>'.
	 * @see uid.EuiEventCallbacks
	 * @generated
	 */
	EEnum getEuiEventCallbacks();

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
		 * The meta object literal for the '<em><b>Has Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TRANSITION__HAS_COMPONENT = eINSTANCE.getEntityTransition_HasComponent();

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
		 * The meta object literal for the '<em><b>Has Views</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__HAS_VIEWS = eINSTANCE.getApplication_HasViews();

		/**
		 * The meta object literal for the '<em><b>Has Controllers</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__HAS_CONTROLLERS = eINSTANCE.getApplication_HasControllers();

		/**
		 * The meta object literal for the '<em><b>Has Notifications</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__HAS_NOTIFICATIONS = eINSTANCE.getApplication_HasNotifications();

		/**
		 * The meta object literal for the '<em><b>Has Models</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__HAS_MODELS = eINSTANCE.getApplication_HasModels();

		/**
		 * The meta object literal for the '<em><b>Has Mediator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__HAS_MEDIATOR = eINSTANCE.getApplication_HasMediator();

		/**
		 * The meta object literal for the '<em><b>Has Initial View</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__HAS_INITIAL_VIEW = eINSTANCE.getApplication_HasInitialView();

		/**
		 * The meta object literal for the '{@link uid.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uid.impl.ComponentImpl
		 * @see uid.impl.UidPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__VISIBLE = eINSTANCE.getComponent_Visible();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__X = eINSTANCE.getComponent_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__Y = eINSTANCE.getComponent_Y();

		/**
		 * The meta object literal for the '<em><b>Has Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__HAS_EVENTS = eINSTANCE.getComponent_HasEvents();

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
		 * The meta object literal for the '<em><b>Has Notification Handler</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIATOR__HAS_NOTIFICATION_HANDLER = eINSTANCE.getMediator_HasNotificationHandler();

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
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON__LABEL = eINSTANCE.getButton_Label();

		/**
		 * The meta object literal for the '{@link uid.impl.NotificationImpl <em>Notification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uid.impl.NotificationImpl
		 * @see uid.impl.UidPackageImpl#getNotification()
		 * @generated
		 */
		EClass NOTIFICATION = eINSTANCE.getNotification();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICATION__NAME = eINSTANCE.getNotification_Name();

		/**
		 * The meta object literal for the '<em><b>Recieved By Command</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTIFICATION__RECIEVED_BY_COMMAND = eINSTANCE.getNotification_RecievedByCommand();

		/**
		 * The meta object literal for the '{@link uid.impl.CommandImpl <em>Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uid.impl.CommandImpl
		 * @see uid.impl.UidPackageImpl#getCommand()
		 * @generated
		 */
		EClass COMMAND = eINSTANCE.getCommand();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND__NAME = eINSTANCE.getCommand_Name();

		/**
		 * The meta object literal for the '<em><b>Has Notification</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND__HAS_NOTIFICATION = eINSTANCE.getCommand_HasNotification();

		/**
		 * The meta object literal for the '{@link uid.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uid.impl.EventImpl
		 * @see uid.impl.UidPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

		/**
		 * The meta object literal for the '<em><b>Sends Notification</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__SENDS_NOTIFICATION = eINSTANCE.getEvent_SendsNotification();

		/**
		 * The meta object literal for the '<em><b>Callback</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__CALLBACK = eINSTANCE.getEvent_Callback();

		/**
		 * The meta object literal for the '{@link uid.impl.NotificationHandlerImpl <em>Notification Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uid.impl.NotificationHandlerImpl
		 * @see uid.impl.UidPackageImpl#getNotificationHandler()
		 * @generated
		 */
		EClass NOTIFICATION_HANDLER = eINSTANCE.getNotificationHandler();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICATION_HANDLER__NAME = eINSTANCE.getNotificationHandler_Name();

		/**
		 * The meta object literal for the '<em><b>Recieves Notification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTIFICATION_HANDLER__RECIEVES_NOTIFICATION = eINSTANCE.getNotificationHandler_RecievesNotification();

		/**
		 * The meta object literal for the '<em><b>Sends Notification</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTIFICATION_HANDLER__SENDS_NOTIFICATION = eINSTANCE.getNotificationHandler_SendsNotification();

		/**
		 * The meta object literal for the '<em><b>Change Stage To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTIFICATION_HANDLER__CHANGE_STAGE_TO = eINSTANCE.getNotificationHandler_ChangeStageTo();

		/**
		 * The meta object literal for the '{@link uid.impl.StageImpl <em>Stage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uid.impl.StageImpl
		 * @see uid.impl.UidPackageImpl#getStage()
		 * @generated
		 */
		EClass STAGE = eINSTANCE.getStage();

		/**
		 * The meta object literal for the '<em><b>Background</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAGE__BACKGROUND = eINSTANCE.getStage_Background();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAGE__NAME = eINSTANCE.getStage_Name();

		/**
		 * The meta object literal for the '<em><b>Has Display</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGE__HAS_DISPLAY = eINSTANCE.getStage_HasDisplay();

		/**
		 * The meta object literal for the '<em><b>Has Container</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGE__HAS_CONTAINER = eINSTANCE.getStage_HasContainer();

		/**
		 * The meta object literal for the '<em><b>Has Matrix</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGE__HAS_MATRIX = eINSTANCE.getStage_HasMatrix();

		/**
		 * The meta object literal for the '<em><b>Has Regulator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGE__HAS_REGULATOR = eINSTANCE.getStage_HasRegulator();

		/**
		 * The meta object literal for the '<em><b>Has Button</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGE__HAS_BUTTON = eINSTANCE.getStage_HasButton();

		/**
		 * The meta object literal for the '<em><b>Has Switch</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGE__HAS_SWITCH = eINSTANCE.getStage_HasSwitch();

		/**
		 * The meta object literal for the '<em><b>Has Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGE__HAS_EVENTS = eINSTANCE.getStage_HasEvents();

		/**
		 * The meta object literal for the '{@link uid.impl.ViewsImpl <em>Views</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uid.impl.ViewsImpl
		 * @see uid.impl.UidPackageImpl#getViews()
		 * @generated
		 */
		EClass VIEWS = eINSTANCE.getViews();

		/**
		 * The meta object literal for the '<em><b>Has Stage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEWS__HAS_STAGE = eINSTANCE.getViews_HasStage();

		/**
		 * The meta object literal for the '<em><b>Has Mediator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEWS__HAS_MEDIATOR = eINSTANCE.getViews_HasMediator();

		/**
		 * The meta object literal for the '{@link uid.impl.ControllersImpl <em>Controllers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uid.impl.ControllersImpl
		 * @see uid.impl.UidPackageImpl#getControllers()
		 * @generated
		 */
		EClass CONTROLLERS = eINSTANCE.getControllers();

		/**
		 * The meta object literal for the '<em><b>Has Command</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLERS__HAS_COMMAND = eINSTANCE.getControllers_HasCommand();

		/**
		 * The meta object literal for the '{@link uid.impl.ModelsImpl <em>Models</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uid.impl.ModelsImpl
		 * @see uid.impl.UidPackageImpl#getModels()
		 * @generated
		 */
		EClass MODELS = eINSTANCE.getModels();

		/**
		 * The meta object literal for the '{@link uid.impl.NotificationsImpl <em>Notifications</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uid.impl.NotificationsImpl
		 * @see uid.impl.UidPackageImpl#getNotifications()
		 * @generated
		 */
		EClass NOTIFICATIONS = eINSTANCE.getNotifications();

		/**
		 * The meta object literal for the '<em><b>Has Notification</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTIFICATIONS__HAS_NOTIFICATION = eINSTANCE.getNotifications_HasNotification();

		/**
		 * The meta object literal for the '{@link uid.impl.StateTransitionImpl <em>State Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uid.impl.StateTransitionImpl
		 * @see uid.impl.UidPackageImpl#getStateTransition()
		 * @generated
		 */
		EClass STATE_TRANSITION = eINSTANCE.getStateTransition();

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

		/**
		 * The meta object literal for the '{@link uid.EuiEventCallbacks <em>Eui Event Callbacks</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uid.EuiEventCallbacks
		 * @see uid.impl.UidPackageImpl#getEuiEventCallbacks()
		 * @generated
		 */
		EEnum EUI_EVENT_CALLBACKS = eINSTANCE.getEuiEventCallbacks();

	}

} //UidPackage
