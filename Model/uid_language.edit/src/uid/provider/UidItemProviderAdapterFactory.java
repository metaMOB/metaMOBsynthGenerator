/**
 */
package uid.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import uid.util.UidAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UidItemProviderAdapterFactory extends UidAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UidItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link uid.EntityTransition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityTransitionItemProvider entityTransitionItemProvider;

	/**
	 * This creates an adapter for a {@link uid.EntityTransition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEntityTransitionAdapter() {
		if (entityTransitionItemProvider == null) {
			entityTransitionItemProvider = new EntityTransitionItemProvider(this);
		}

		return entityTransitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uid.Application} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationItemProvider applicationItemProvider;

	/**
	 * This creates an adapter for a {@link uid.Application}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createApplicationAdapter() {
		if (applicationItemProvider == null) {
			applicationItemProvider = new ApplicationItemProvider(this);
		}

		return applicationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uid.Component} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentItemProvider componentItemProvider;

	/**
	 * This creates an adapter for a {@link uid.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentAdapter() {
		if (componentItemProvider == null) {
			componentItemProvider = new ComponentItemProvider(this);
		}

		return componentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uid.Switch} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwitchItemProvider switchItemProvider;

	/**
	 * This creates an adapter for a {@link uid.Switch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSwitchAdapter() {
		if (switchItemProvider == null) {
			switchItemProvider = new SwitchItemProvider(this);
		}

		return switchItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uid.Mediator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MediatorItemProvider mediatorItemProvider;

	/**
	 * This creates an adapter for a {@link uid.Mediator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMediatorAdapter() {
		if (mediatorItemProvider == null) {
			mediatorItemProvider = new MediatorItemProvider(this);
		}

		return mediatorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uid.Regulator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegulatorItemProvider regulatorItemProvider;

	/**
	 * This creates an adapter for a {@link uid.Regulator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRegulatorAdapter() {
		if (regulatorItemProvider == null) {
			regulatorItemProvider = new RegulatorItemProvider(this);
		}

		return regulatorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uid.Matrix} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatrixItemProvider matrixItemProvider;

	/**
	 * This creates an adapter for a {@link uid.Matrix}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMatrixAdapter() {
		if (matrixItemProvider == null) {
			matrixItemProvider = new MatrixItemProvider(this);
		}

		return matrixItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uid.Container} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerItemProvider containerItemProvider;

	/**
	 * This creates an adapter for a {@link uid.Container}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createContainerAdapter() {
		if (containerItemProvider == null) {
			containerItemProvider = new ContainerItemProvider(this);
		}

		return containerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uid.Display} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DisplayItemProvider displayItemProvider;

	/**
	 * This creates an adapter for a {@link uid.Display}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDisplayAdapter() {
		if (displayItemProvider == null) {
			displayItemProvider = new DisplayItemProvider(this);
		}

		return displayItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uid.Button} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ButtonItemProvider buttonItemProvider;

	/**
	 * This creates an adapter for a {@link uid.Button}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createButtonAdapter() {
		if (buttonItemProvider == null) {
			buttonItemProvider = new ButtonItemProvider(this);
		}

		return buttonItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uid.Notification} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotificationItemProvider notificationItemProvider;

	/**
	 * This creates an adapter for a {@link uid.Notification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNotificationAdapter() {
		if (notificationItemProvider == null) {
			notificationItemProvider = new NotificationItemProvider(this);
		}

		return notificationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uid.Command} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandItemProvider commandItemProvider;

	/**
	 * This creates an adapter for a {@link uid.Command}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCommandAdapter() {
		if (commandItemProvider == null) {
			commandItemProvider = new CommandItemProvider(this);
		}

		return commandItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uid.Event} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventItemProvider eventItemProvider;

	/**
	 * This creates an adapter for a {@link uid.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEventAdapter() {
		if (eventItemProvider == null) {
			eventItemProvider = new EventItemProvider(this);
		}

		return eventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uid.NotificationHandler} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotificationHandlerItemProvider notificationHandlerItemProvider;

	/**
	 * This creates an adapter for a {@link uid.NotificationHandler}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNotificationHandlerAdapter() {
		if (notificationHandlerItemProvider == null) {
			notificationHandlerItemProvider = new NotificationHandlerItemProvider(this);
		}

		return notificationHandlerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uid.Stage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StageItemProvider stageItemProvider;

	/**
	 * This creates an adapter for a {@link uid.Stage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStageAdapter() {
		if (stageItemProvider == null) {
			stageItemProvider = new StageItemProvider(this);
		}

		return stageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uid.Views} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewsItemProvider viewsItemProvider;

	/**
	 * This creates an adapter for a {@link uid.Views}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createViewsAdapter() {
		if (viewsItemProvider == null) {
			viewsItemProvider = new ViewsItemProvider(this);
		}

		return viewsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uid.Controllers} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControllersItemProvider controllersItemProvider;

	/**
	 * This creates an adapter for a {@link uid.Controllers}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createControllersAdapter() {
		if (controllersItemProvider == null) {
			controllersItemProvider = new ControllersItemProvider(this);
		}

		return controllersItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uid.Models} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelsItemProvider modelsItemProvider;

	/**
	 * This creates an adapter for a {@link uid.Models}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModelsAdapter() {
		if (modelsItemProvider == null) {
			modelsItemProvider = new ModelsItemProvider(this);
		}

		return modelsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link uid.Notifications} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotificationsItemProvider notificationsItemProvider;

	/**
	 * This creates an adapter for a {@link uid.Notifications}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNotificationsAdapter() {
		if (notificationsItemProvider == null) {
			notificationsItemProvider = new NotificationsItemProvider(this);
		}

		return notificationsItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (entityTransitionItemProvider != null) entityTransitionItemProvider.dispose();
		if (applicationItemProvider != null) applicationItemProvider.dispose();
		if (componentItemProvider != null) componentItemProvider.dispose();
		if (switchItemProvider != null) switchItemProvider.dispose();
		if (mediatorItemProvider != null) mediatorItemProvider.dispose();
		if (regulatorItemProvider != null) regulatorItemProvider.dispose();
		if (matrixItemProvider != null) matrixItemProvider.dispose();
		if (containerItemProvider != null) containerItemProvider.dispose();
		if (displayItemProvider != null) displayItemProvider.dispose();
		if (buttonItemProvider != null) buttonItemProvider.dispose();
		if (notificationItemProvider != null) notificationItemProvider.dispose();
		if (commandItemProvider != null) commandItemProvider.dispose();
		if (eventItemProvider != null) eventItemProvider.dispose();
		if (notificationHandlerItemProvider != null) notificationHandlerItemProvider.dispose();
		if (stageItemProvider != null) stageItemProvider.dispose();
		if (viewsItemProvider != null) viewsItemProvider.dispose();
		if (controllersItemProvider != null) controllersItemProvider.dispose();
		if (modelsItemProvider != null) modelsItemProvider.dispose();
		if (notificationsItemProvider != null) notificationsItemProvider.dispose();
	}

}
