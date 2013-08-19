/**
 */
package uid.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import uid.Entity;
import uid.Mediator;
import uid.UidPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mediator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uid.impl.MediatorImpl#getName <em>Name</em>}</li>
 *   <li>{@link uid.impl.MediatorImpl#getHasEntities <em>Has Entities</em>}</li>
 *   <li>{@link uid.impl.MediatorImpl#getCommandsToGenerate <em>Commands To Generate</em>}</li>
 *   <li>{@link uid.impl.MediatorImpl#getListeners <em>Listeners</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MediatorImpl extends EObjectImpl implements Mediator {
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
	 * The cached value of the '{@link #getHasEntities() <em>Has Entities</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> hasEntities;

	/**
	 * The default value of the '{@link #getCommandsToGenerate() <em>Commands To Generate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandsToGenerate()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMANDS_TO_GENERATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommandsToGenerate() <em>Commands To Generate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandsToGenerate()
	 * @generated
	 * @ordered
	 */
	protected String commandsToGenerate = COMMANDS_TO_GENERATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getListeners() <em>Listeners</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListeners()
	 * @generated
	 * @ordered
	 */
	protected static final String LISTENERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getListeners() <em>Listeners</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListeners()
	 * @generated
	 * @ordered
	 */
	protected String listeners = LISTENERS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MediatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UidPackage.Literals.MEDIATOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UidPackage.MEDIATOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getHasEntities() {
		if (hasEntities == null) {
			hasEntities = new EObjectResolvingEList<Entity>(Entity.class, this, UidPackage.MEDIATOR__HAS_ENTITIES);
		}
		return hasEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommandsToGenerate() {
		return commandsToGenerate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommandsToGenerate(String newCommandsToGenerate) {
		String oldCommandsToGenerate = commandsToGenerate;
		commandsToGenerate = newCommandsToGenerate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidPackage.MEDIATOR__COMMANDS_TO_GENERATE, oldCommandsToGenerate, commandsToGenerate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getListeners() {
		return listeners;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListeners(String newListeners) {
		String oldListeners = listeners;
		listeners = newListeners;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidPackage.MEDIATOR__LISTENERS, oldListeners, listeners));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UidPackage.MEDIATOR__NAME:
				return getName();
			case UidPackage.MEDIATOR__HAS_ENTITIES:
				return getHasEntities();
			case UidPackage.MEDIATOR__COMMANDS_TO_GENERATE:
				return getCommandsToGenerate();
			case UidPackage.MEDIATOR__LISTENERS:
				return getListeners();
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
			case UidPackage.MEDIATOR__NAME:
				setName((String)newValue);
				return;
			case UidPackage.MEDIATOR__HAS_ENTITIES:
				getHasEntities().clear();
				getHasEntities().addAll((Collection<? extends Entity>)newValue);
				return;
			case UidPackage.MEDIATOR__COMMANDS_TO_GENERATE:
				setCommandsToGenerate((String)newValue);
				return;
			case UidPackage.MEDIATOR__LISTENERS:
				setListeners((String)newValue);
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
			case UidPackage.MEDIATOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UidPackage.MEDIATOR__HAS_ENTITIES:
				getHasEntities().clear();
				return;
			case UidPackage.MEDIATOR__COMMANDS_TO_GENERATE:
				setCommandsToGenerate(COMMANDS_TO_GENERATE_EDEFAULT);
				return;
			case UidPackage.MEDIATOR__LISTENERS:
				setListeners(LISTENERS_EDEFAULT);
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
			case UidPackage.MEDIATOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UidPackage.MEDIATOR__HAS_ENTITIES:
				return hasEntities != null && !hasEntities.isEmpty();
			case UidPackage.MEDIATOR__COMMANDS_TO_GENERATE:
				return COMMANDS_TO_GENERATE_EDEFAULT == null ? commandsToGenerate != null : !COMMANDS_TO_GENERATE_EDEFAULT.equals(commandsToGenerate);
			case UidPackage.MEDIATOR__LISTENERS:
				return LISTENERS_EDEFAULT == null ? listeners != null : !LISTENERS_EDEFAULT.equals(listeners);
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
		result.append(", commandsToGenerate: ");
		result.append(commandsToGenerate);
		result.append(", listeners: ");
		result.append(listeners);
		result.append(')');
		return result.toString();
	}

} //MediatorImpl
