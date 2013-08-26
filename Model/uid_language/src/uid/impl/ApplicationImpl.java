/**
 */
package uid.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uid.Application;
import uid.Command;
import uid.EntityTransition;
import uid.Mediator;
import uid.Notification;
import uid.UidPackage;
import uid.View;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uid.impl.ApplicationImpl#getName <em>Name</em>}</li>
 *   <li>{@link uid.impl.ApplicationImpl#getHasEntityTransition <em>Has Entity Transition</em>}</li>
 *   <li>{@link uid.impl.ApplicationImpl#getHasMediator <em>Has Mediator</em>}</li>
 *   <li>{@link uid.impl.ApplicationImpl#getHasNotification <em>Has Notification</em>}</li>
 *   <li>{@link uid.impl.ApplicationImpl#getHasCommand <em>Has Command</em>}</li>
 *   <li>{@link uid.impl.ApplicationImpl#getHasView <em>Has View</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationImpl extends EObjectImpl implements Application {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasEntityTransition() <em>Has Entity Transition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasEntityTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityTransition> hasEntityTransition;

	/**
	 * The cached value of the '{@link #getHasMediator() <em>Has Mediator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasMediator()
	 * @generated
	 * @ordered
	 */
	protected EList<Mediator> hasMediator;

	/**
	 * The cached value of the '{@link #getHasNotification() <em>Has Notification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasNotification()
	 * @generated
	 * @ordered
	 */
	protected EList<Notification> hasNotification;

	/**
	 * The cached value of the '{@link #getHasCommand() <em>Has Command</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasCommand()
	 * @generated
	 * @ordered
	 */
	protected EList<Command> hasCommand;

	/**
	 * The cached value of the '{@link #getHasView() <em>Has View</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasView()
	 * @generated
	 * @ordered
	 */
	protected EList<View> hasView;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UidPackage.Literals.APPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET, UidPackage.APPLICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityTransition> getHasEntityTransition() {
		if (hasEntityTransition == null) {
			hasEntityTransition = new EObjectContainmentEList<EntityTransition>(EntityTransition.class, this, UidPackage.APPLICATION__HAS_ENTITY_TRANSITION);
		}
		return hasEntityTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Mediator> getHasMediator() {
		if (hasMediator == null) {
			hasMediator = new EObjectContainmentEList<Mediator>(Mediator.class, this, UidPackage.APPLICATION__HAS_MEDIATOR);
		}
		return hasMediator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Notification> getHasNotification() {
		if (hasNotification == null) {
			hasNotification = new EObjectContainmentEList<Notification>(Notification.class, this, UidPackage.APPLICATION__HAS_NOTIFICATION);
		}
		return hasNotification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Command> getHasCommand() {
		if (hasCommand == null) {
			hasCommand = new EObjectContainmentEList<Command>(Command.class, this, UidPackage.APPLICATION__HAS_COMMAND);
		}
		return hasCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<View> getHasView() {
		if (hasView == null) {
			hasView = new EObjectContainmentEList<View>(View.class, this, UidPackage.APPLICATION__HAS_VIEW);
		}
		return hasView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UidPackage.APPLICATION__HAS_ENTITY_TRANSITION:
				return ((InternalEList<?>)getHasEntityTransition()).basicRemove(otherEnd, msgs);
			case UidPackage.APPLICATION__HAS_MEDIATOR:
				return ((InternalEList<?>)getHasMediator()).basicRemove(otherEnd, msgs);
			case UidPackage.APPLICATION__HAS_NOTIFICATION:
				return ((InternalEList<?>)getHasNotification()).basicRemove(otherEnd, msgs);
			case UidPackage.APPLICATION__HAS_COMMAND:
				return ((InternalEList<?>)getHasCommand()).basicRemove(otherEnd, msgs);
			case UidPackage.APPLICATION__HAS_VIEW:
				return ((InternalEList<?>)getHasView()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UidPackage.APPLICATION__NAME:
				return getName();
			case UidPackage.APPLICATION__HAS_ENTITY_TRANSITION:
				return getHasEntityTransition();
			case UidPackage.APPLICATION__HAS_MEDIATOR:
				return getHasMediator();
			case UidPackage.APPLICATION__HAS_NOTIFICATION:
				return getHasNotification();
			case UidPackage.APPLICATION__HAS_COMMAND:
				return getHasCommand();
			case UidPackage.APPLICATION__HAS_VIEW:
				return getHasView();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UidPackage.APPLICATION__NAME:
				setName((String)newValue);
				return;
			case UidPackage.APPLICATION__HAS_ENTITY_TRANSITION:
				getHasEntityTransition().clear();
				getHasEntityTransition().addAll((Collection<? extends EntityTransition>)newValue);
				return;
			case UidPackage.APPLICATION__HAS_MEDIATOR:
				getHasMediator().clear();
				getHasMediator().addAll((Collection<? extends Mediator>)newValue);
				return;
			case UidPackage.APPLICATION__HAS_NOTIFICATION:
				getHasNotification().clear();
				getHasNotification().addAll((Collection<? extends Notification>)newValue);
				return;
			case UidPackage.APPLICATION__HAS_COMMAND:
				getHasCommand().clear();
				getHasCommand().addAll((Collection<? extends Command>)newValue);
				return;
			case UidPackage.APPLICATION__HAS_VIEW:
				getHasView().clear();
				getHasView().addAll((Collection<? extends View>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UidPackage.APPLICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UidPackage.APPLICATION__HAS_ENTITY_TRANSITION:
				getHasEntityTransition().clear();
				return;
			case UidPackage.APPLICATION__HAS_MEDIATOR:
				getHasMediator().clear();
				return;
			case UidPackage.APPLICATION__HAS_NOTIFICATION:
				getHasNotification().clear();
				return;
			case UidPackage.APPLICATION__HAS_COMMAND:
				getHasCommand().clear();
				return;
			case UidPackage.APPLICATION__HAS_VIEW:
				getHasView().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UidPackage.APPLICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UidPackage.APPLICATION__HAS_ENTITY_TRANSITION:
				return hasEntityTransition != null && !hasEntityTransition.isEmpty();
			case UidPackage.APPLICATION__HAS_MEDIATOR:
				return hasMediator != null && !hasMediator.isEmpty();
			case UidPackage.APPLICATION__HAS_NOTIFICATION:
				return hasNotification != null && !hasNotification.isEmpty();
			case UidPackage.APPLICATION__HAS_COMMAND:
				return hasCommand != null && !hasCommand.isEmpty();
			case UidPackage.APPLICATION__HAS_VIEW:
				return hasView != null && !hasView.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ApplicationImpl
