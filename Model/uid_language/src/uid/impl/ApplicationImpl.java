/**
 */
package uid.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uid.Application;
import uid.Controllers;
import uid.EntityTransition;
import uid.Mediator;
import uid.Models;
import uid.Notifications;
import uid.UidPackage;
import uid.Views;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uid.impl.ApplicationImpl#getName <em>Name</em>}</li>
 *   <li>{@link uid.impl.ApplicationImpl#getHasEntityTransition <em>Has Entity Transition</em>}</li>
 *   <li>{@link uid.impl.ApplicationImpl#getHasViews <em>Has Views</em>}</li>
 *   <li>{@link uid.impl.ApplicationImpl#getHasControllers <em>Has Controllers</em>}</li>
 *   <li>{@link uid.impl.ApplicationImpl#getHasNotifications <em>Has Notifications</em>}</li>
 *   <li>{@link uid.impl.ApplicationImpl#getHasModels <em>Has Models</em>}</li>
 *   <li>{@link uid.impl.ApplicationImpl#getHasMediator <em>Has Mediator</em>}</li>
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
	 * The cached value of the '{@link #getHasViews() <em>Has Views</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasViews()
	 * @generated
	 * @ordered
	 */
	protected Views hasViews;

	/**
	 * The cached value of the '{@link #getHasControllers() <em>Has Controllers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasControllers()
	 * @generated
	 * @ordered
	 */
	protected Controllers hasControllers;

	/**
	 * The cached value of the '{@link #getHasNotifications() <em>Has Notifications</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasNotifications()
	 * @generated
	 * @ordered
	 */
	protected Notifications hasNotifications;

	/**
	 * The cached value of the '{@link #getHasModels() <em>Has Models</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasModels()
	 * @generated
	 * @ordered
	 */
	protected Models hasModels;

	/**
	 * The cached value of the '{@link #getHasMediator() <em>Has Mediator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasMediator()
	 * @generated
	 * @ordered
	 */
	protected Mediator hasMediator;

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
			eNotify(new ENotificationImpl(this, Notification.SET, UidPackage.APPLICATION__NAME, oldName, name));
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
	public Views getHasViews() {
		return hasViews;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasViews(Views newHasViews, NotificationChain msgs) {
		Views oldHasViews = hasViews;
		hasViews = newHasViews;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UidPackage.APPLICATION__HAS_VIEWS, oldHasViews, newHasViews);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasViews(Views newHasViews) {
		if (newHasViews != hasViews) {
			NotificationChain msgs = null;
			if (hasViews != null)
				msgs = ((InternalEObject)hasViews).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UidPackage.APPLICATION__HAS_VIEWS, null, msgs);
			if (newHasViews != null)
				msgs = ((InternalEObject)newHasViews).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UidPackage.APPLICATION__HAS_VIEWS, null, msgs);
			msgs = basicSetHasViews(newHasViews, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidPackage.APPLICATION__HAS_VIEWS, newHasViews, newHasViews));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controllers getHasControllers() {
		return hasControllers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasControllers(Controllers newHasControllers, NotificationChain msgs) {
		Controllers oldHasControllers = hasControllers;
		hasControllers = newHasControllers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UidPackage.APPLICATION__HAS_CONTROLLERS, oldHasControllers, newHasControllers);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasControllers(Controllers newHasControllers) {
		if (newHasControllers != hasControllers) {
			NotificationChain msgs = null;
			if (hasControllers != null)
				msgs = ((InternalEObject)hasControllers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UidPackage.APPLICATION__HAS_CONTROLLERS, null, msgs);
			if (newHasControllers != null)
				msgs = ((InternalEObject)newHasControllers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UidPackage.APPLICATION__HAS_CONTROLLERS, null, msgs);
			msgs = basicSetHasControllers(newHasControllers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidPackage.APPLICATION__HAS_CONTROLLERS, newHasControllers, newHasControllers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Notifications getHasNotifications() {
		return hasNotifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasNotifications(Notifications newHasNotifications, NotificationChain msgs) {
		Notifications oldHasNotifications = hasNotifications;
		hasNotifications = newHasNotifications;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UidPackage.APPLICATION__HAS_NOTIFICATIONS, oldHasNotifications, newHasNotifications);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasNotifications(Notifications newHasNotifications) {
		if (newHasNotifications != hasNotifications) {
			NotificationChain msgs = null;
			if (hasNotifications != null)
				msgs = ((InternalEObject)hasNotifications).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UidPackage.APPLICATION__HAS_NOTIFICATIONS, null, msgs);
			if (newHasNotifications != null)
				msgs = ((InternalEObject)newHasNotifications).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UidPackage.APPLICATION__HAS_NOTIFICATIONS, null, msgs);
			msgs = basicSetHasNotifications(newHasNotifications, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidPackage.APPLICATION__HAS_NOTIFICATIONS, newHasNotifications, newHasNotifications));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Models getHasModels() {
		return hasModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasModels(Models newHasModels, NotificationChain msgs) {
		Models oldHasModels = hasModels;
		hasModels = newHasModels;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UidPackage.APPLICATION__HAS_MODELS, oldHasModels, newHasModels);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasModels(Models newHasModels) {
		if (newHasModels != hasModels) {
			NotificationChain msgs = null;
			if (hasModels != null)
				msgs = ((InternalEObject)hasModels).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UidPackage.APPLICATION__HAS_MODELS, null, msgs);
			if (newHasModels != null)
				msgs = ((InternalEObject)newHasModels).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UidPackage.APPLICATION__HAS_MODELS, null, msgs);
			msgs = basicSetHasModels(newHasModels, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidPackage.APPLICATION__HAS_MODELS, newHasModels, newHasModels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mediator getHasMediator() {
		return hasMediator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasMediator(Mediator newHasMediator, NotificationChain msgs) {
		Mediator oldHasMediator = hasMediator;
		hasMediator = newHasMediator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UidPackage.APPLICATION__HAS_MEDIATOR, oldHasMediator, newHasMediator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasMediator(Mediator newHasMediator) {
		if (newHasMediator != hasMediator) {
			NotificationChain msgs = null;
			if (hasMediator != null)
				msgs = ((InternalEObject)hasMediator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UidPackage.APPLICATION__HAS_MEDIATOR, null, msgs);
			if (newHasMediator != null)
				msgs = ((InternalEObject)newHasMediator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UidPackage.APPLICATION__HAS_MEDIATOR, null, msgs);
			msgs = basicSetHasMediator(newHasMediator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidPackage.APPLICATION__HAS_MEDIATOR, newHasMediator, newHasMediator));
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
			case UidPackage.APPLICATION__HAS_VIEWS:
				return basicSetHasViews(null, msgs);
			case UidPackage.APPLICATION__HAS_CONTROLLERS:
				return basicSetHasControllers(null, msgs);
			case UidPackage.APPLICATION__HAS_NOTIFICATIONS:
				return basicSetHasNotifications(null, msgs);
			case UidPackage.APPLICATION__HAS_MODELS:
				return basicSetHasModels(null, msgs);
			case UidPackage.APPLICATION__HAS_MEDIATOR:
				return basicSetHasMediator(null, msgs);
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
			case UidPackage.APPLICATION__HAS_VIEWS:
				return getHasViews();
			case UidPackage.APPLICATION__HAS_CONTROLLERS:
				return getHasControllers();
			case UidPackage.APPLICATION__HAS_NOTIFICATIONS:
				return getHasNotifications();
			case UidPackage.APPLICATION__HAS_MODELS:
				return getHasModels();
			case UidPackage.APPLICATION__HAS_MEDIATOR:
				return getHasMediator();
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
			case UidPackage.APPLICATION__HAS_VIEWS:
				setHasViews((Views)newValue);
				return;
			case UidPackage.APPLICATION__HAS_CONTROLLERS:
				setHasControllers((Controllers)newValue);
				return;
			case UidPackage.APPLICATION__HAS_NOTIFICATIONS:
				setHasNotifications((Notifications)newValue);
				return;
			case UidPackage.APPLICATION__HAS_MODELS:
				setHasModels((Models)newValue);
				return;
			case UidPackage.APPLICATION__HAS_MEDIATOR:
				setHasMediator((Mediator)newValue);
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
			case UidPackage.APPLICATION__HAS_VIEWS:
				setHasViews((Views)null);
				return;
			case UidPackage.APPLICATION__HAS_CONTROLLERS:
				setHasControllers((Controllers)null);
				return;
			case UidPackage.APPLICATION__HAS_NOTIFICATIONS:
				setHasNotifications((Notifications)null);
				return;
			case UidPackage.APPLICATION__HAS_MODELS:
				setHasModels((Models)null);
				return;
			case UidPackage.APPLICATION__HAS_MEDIATOR:
				setHasMediator((Mediator)null);
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
			case UidPackage.APPLICATION__HAS_VIEWS:
				return hasViews != null;
			case UidPackage.APPLICATION__HAS_CONTROLLERS:
				return hasControllers != null;
			case UidPackage.APPLICATION__HAS_NOTIFICATIONS:
				return hasNotifications != null;
			case UidPackage.APPLICATION__HAS_MODELS:
				return hasModels != null;
			case UidPackage.APPLICATION__HAS_MEDIATOR:
				return hasMediator != null;
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
