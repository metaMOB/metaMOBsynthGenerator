/**
 */
package uid.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uid.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UidFactoryImpl extends EFactoryImpl implements UidFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UidFactory init() {
		try {
			UidFactory theUidFactory = (UidFactory)EPackage.Registry.INSTANCE.getEFactory(UidPackage.eNS_URI);
			if (theUidFactory != null) {
				return theUidFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UidFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UidFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case UidPackage.ENTITY_TRANSITION: return createEntityTransition();
			case UidPackage.APPLICATION: return createApplication();
			case UidPackage.COMPONENT: return createComponent();
			case UidPackage.SWITCH: return createSwitch();
			case UidPackage.MEDIATOR: return createMediator();
			case UidPackage.REGULATOR: return createRegulator();
			case UidPackage.MATRIX: return createMatrix();
			case UidPackage.CONTAINER: return createContainer();
			case UidPackage.DISPLAY: return createDisplay();
			case UidPackage.BUTTON: return createButton();
			case UidPackage.NOTIFICATION: return createNotification();
			case UidPackage.COMMAND: return createCommand();
			case UidPackage.EVENT: return createEvent();
			case UidPackage.NOTIFICATION_HANDLER: return createNotificationHandler();
			case UidPackage.STAGE: return createStage();
			case UidPackage.VIEWS: return createViews();
			case UidPackage.CONTROLLERS: return createControllers();
			case UidPackage.MODELS: return createModels();
			case UidPackage.NOTIFICATIONS: return createNotifications();
			case UidPackage.STATE_TRANSITION: return createStateTransition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case UidPackage.ETRANSITION_TYPES_IN:
				return createETransitionTypesInFromString(eDataType, initialValue);
			case UidPackage.ETRANSITION_TYPE_OUT:
				return createETransitionTypeOutFromString(eDataType, initialValue);
			case UidPackage.EUI_EVENT_CALLBACKS:
				return createEuiEventCallbacksFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case UidPackage.ETRANSITION_TYPES_IN:
				return convertETransitionTypesInToString(eDataType, instanceValue);
			case UidPackage.ETRANSITION_TYPE_OUT:
				return convertETransitionTypeOutToString(eDataType, instanceValue);
			case UidPackage.EUI_EVENT_CALLBACKS:
				return convertEuiEventCallbacksToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityTransition createEntityTransition() {
		EntityTransitionImpl entityTransition = new EntityTransitionImpl();
		return entityTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application createApplication() {
		ApplicationImpl application = new ApplicationImpl();
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Switch createSwitch() {
		SwitchImpl switch_ = new SwitchImpl();
		return switch_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mediator createMediator() {
		MediatorImpl mediator = new MediatorImpl();
		return mediator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Regulator createRegulator() {
		RegulatorImpl regulator = new RegulatorImpl();
		return regulator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Matrix createMatrix() {
		MatrixImpl matrix = new MatrixImpl();
		return matrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uid.Container createContainer() {
		ContainerImpl container = new ContainerImpl();
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Display createDisplay() {
		DisplayImpl display = new DisplayImpl();
		return display;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Button createButton() {
		ButtonImpl button = new ButtonImpl();
		return button;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Notification createNotification() {
		NotificationImpl notification = new NotificationImpl();
		return notification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Command createCommand() {
		CommandImpl command = new CommandImpl();
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationHandler createNotificationHandler() {
		NotificationHandlerImpl notificationHandler = new NotificationHandlerImpl();
		return notificationHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stage createStage() {
		StageImpl stage = new StageImpl();
		return stage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Views createViews() {
		ViewsImpl views = new ViewsImpl();
		return views;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controllers createControllers() {
		ControllersImpl controllers = new ControllersImpl();
		return controllers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Models createModels() {
		ModelsImpl models = new ModelsImpl();
		return models;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Notifications createNotifications() {
		NotificationsImpl notifications = new NotificationsImpl();
		return notifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateTransition createStateTransition() {
		StateTransitionImpl stateTransition = new StateTransitionImpl();
		return stateTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETransitionTypesIn createETransitionTypesInFromString(EDataType eDataType, String initialValue) {
		ETransitionTypesIn result = ETransitionTypesIn.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertETransitionTypesInToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETransitionTypeOut createETransitionTypeOutFromString(EDataType eDataType, String initialValue) {
		ETransitionTypeOut result = ETransitionTypeOut.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertETransitionTypeOutToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EuiEventCallbacks createEuiEventCallbacksFromString(EDataType eDataType, String initialValue) {
		EuiEventCallbacks result = EuiEventCallbacks.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEuiEventCallbacksToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UidPackage getUidPackage() {
		return (UidPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UidPackage getPackage() {
		return UidPackage.eINSTANCE;
	}

} //UidFactoryImpl
