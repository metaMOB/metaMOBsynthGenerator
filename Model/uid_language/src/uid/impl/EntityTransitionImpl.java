/**
 */
package uid.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import uid.ETransitionTypeOut;
import uid.ETransitionTypesIn;
import uid.Entity;
import uid.EntityTransition;
import uid.UidPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uid.impl.EntityTransitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link uid.impl.EntityTransitionImpl#getAnimationTypeIn <em>Animation Type In</em>}</li>
 *   <li>{@link uid.impl.EntityTransitionImpl#getAnimationTypeOut <em>Animation Type Out</em>}</li>
 *   <li>{@link uid.impl.EntityTransitionImpl#getAnimationInTime <em>Animation In Time</em>}</li>
 *   <li>{@link uid.impl.EntityTransitionImpl#getAnimationOutTime <em>Animation Out Time</em>}</li>
 *   <li>{@link uid.impl.EntityTransitionImpl#getEntities <em>Entities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityTransitionImpl extends EObjectImpl implements EntityTransition {
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
	 * The default value of the '{@link #getAnimationTypeIn() <em>Animation Type In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnimationTypeIn()
	 * @generated
	 * @ordered
	 */
	protected static final ETransitionTypesIn ANIMATION_TYPE_IN_EDEFAULT = ETransitionTypesIn.FADE_IN;

	/**
	 * The cached value of the '{@link #getAnimationTypeIn() <em>Animation Type In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnimationTypeIn()
	 * @generated
	 * @ordered
	 */
	protected ETransitionTypesIn animationTypeIn = ANIMATION_TYPE_IN_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnimationTypeOut() <em>Animation Type Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnimationTypeOut()
	 * @generated
	 * @ordered
	 */
	protected static final ETransitionTypeOut ANIMATION_TYPE_OUT_EDEFAULT = ETransitionTypeOut.FADE_OUT;

	/**
	 * The cached value of the '{@link #getAnimationTypeOut() <em>Animation Type Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnimationTypeOut()
	 * @generated
	 * @ordered
	 */
	protected ETransitionTypeOut animationTypeOut = ANIMATION_TYPE_OUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnimationInTime() <em>Animation In Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnimationInTime()
	 * @generated
	 * @ordered
	 */
	protected static final int ANIMATION_IN_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAnimationInTime() <em>Animation In Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnimationInTime()
	 * @generated
	 * @ordered
	 */
	protected int animationInTime = ANIMATION_IN_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnimationOutTime() <em>Animation Out Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnimationOutTime()
	 * @generated
	 * @ordered
	 */
	protected static final int ANIMATION_OUT_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAnimationOutTime() <em>Animation Out Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnimationOutTime()
	 * @generated
	 * @ordered
	 */
	protected int animationOutTime = ANIMATION_OUT_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntities() <em>Entities</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntities()
	 * @generated
	 * @ordered
	 */
	protected Entity entities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UidPackage.Literals.ENTITY_TRANSITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UidPackage.ENTITY_TRANSITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETransitionTypesIn getAnimationTypeIn() {
		return animationTypeIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnimationTypeIn(ETransitionTypesIn newAnimationTypeIn) {
		ETransitionTypesIn oldAnimationTypeIn = animationTypeIn;
		animationTypeIn = newAnimationTypeIn == null ? ANIMATION_TYPE_IN_EDEFAULT : newAnimationTypeIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidPackage.ENTITY_TRANSITION__ANIMATION_TYPE_IN, oldAnimationTypeIn, animationTypeIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ETransitionTypeOut getAnimationTypeOut() {
		return animationTypeOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnimationTypeOut(ETransitionTypeOut newAnimationTypeOut) {
		ETransitionTypeOut oldAnimationTypeOut = animationTypeOut;
		animationTypeOut = newAnimationTypeOut == null ? ANIMATION_TYPE_OUT_EDEFAULT : newAnimationTypeOut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidPackage.ENTITY_TRANSITION__ANIMATION_TYPE_OUT, oldAnimationTypeOut, animationTypeOut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAnimationInTime() {
		return animationInTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnimationInTime(int newAnimationInTime) {
		int oldAnimationInTime = animationInTime;
		animationInTime = newAnimationInTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidPackage.ENTITY_TRANSITION__ANIMATION_IN_TIME, oldAnimationInTime, animationInTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAnimationOutTime() {
		return animationOutTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnimationOutTime(int newAnimationOutTime) {
		int oldAnimationOutTime = animationOutTime;
		animationOutTime = newAnimationOutTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidPackage.ENTITY_TRANSITION__ANIMATION_OUT_TIME, oldAnimationOutTime, animationOutTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getEntities() {
		if (entities != null && entities.eIsProxy()) {
			InternalEObject oldEntities = (InternalEObject)entities;
			entities = (Entity)eResolveProxy(oldEntities);
			if (entities != oldEntities) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UidPackage.ENTITY_TRANSITION__ENTITIES, oldEntities, entities));
			}
		}
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetEntities() {
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntities(Entity newEntities) {
		Entity oldEntities = entities;
		entities = newEntities;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidPackage.ENTITY_TRANSITION__ENTITIES, oldEntities, entities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UidPackage.ENTITY_TRANSITION__NAME:
				return getName();
			case UidPackage.ENTITY_TRANSITION__ANIMATION_TYPE_IN:
				return getAnimationTypeIn();
			case UidPackage.ENTITY_TRANSITION__ANIMATION_TYPE_OUT:
				return getAnimationTypeOut();
			case UidPackage.ENTITY_TRANSITION__ANIMATION_IN_TIME:
				return getAnimationInTime();
			case UidPackage.ENTITY_TRANSITION__ANIMATION_OUT_TIME:
				return getAnimationOutTime();
			case UidPackage.ENTITY_TRANSITION__ENTITIES:
				if (resolve) return getEntities();
				return basicGetEntities();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UidPackage.ENTITY_TRANSITION__NAME:
				setName((String)newValue);
				return;
			case UidPackage.ENTITY_TRANSITION__ANIMATION_TYPE_IN:
				setAnimationTypeIn((ETransitionTypesIn)newValue);
				return;
			case UidPackage.ENTITY_TRANSITION__ANIMATION_TYPE_OUT:
				setAnimationTypeOut((ETransitionTypeOut)newValue);
				return;
			case UidPackage.ENTITY_TRANSITION__ANIMATION_IN_TIME:
				setAnimationInTime((Integer)newValue);
				return;
			case UidPackage.ENTITY_TRANSITION__ANIMATION_OUT_TIME:
				setAnimationOutTime((Integer)newValue);
				return;
			case UidPackage.ENTITY_TRANSITION__ENTITIES:
				setEntities((Entity)newValue);
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
			case UidPackage.ENTITY_TRANSITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UidPackage.ENTITY_TRANSITION__ANIMATION_TYPE_IN:
				setAnimationTypeIn(ANIMATION_TYPE_IN_EDEFAULT);
				return;
			case UidPackage.ENTITY_TRANSITION__ANIMATION_TYPE_OUT:
				setAnimationTypeOut(ANIMATION_TYPE_OUT_EDEFAULT);
				return;
			case UidPackage.ENTITY_TRANSITION__ANIMATION_IN_TIME:
				setAnimationInTime(ANIMATION_IN_TIME_EDEFAULT);
				return;
			case UidPackage.ENTITY_TRANSITION__ANIMATION_OUT_TIME:
				setAnimationOutTime(ANIMATION_OUT_TIME_EDEFAULT);
				return;
			case UidPackage.ENTITY_TRANSITION__ENTITIES:
				setEntities((Entity)null);
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
			case UidPackage.ENTITY_TRANSITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UidPackage.ENTITY_TRANSITION__ANIMATION_TYPE_IN:
				return animationTypeIn != ANIMATION_TYPE_IN_EDEFAULT;
			case UidPackage.ENTITY_TRANSITION__ANIMATION_TYPE_OUT:
				return animationTypeOut != ANIMATION_TYPE_OUT_EDEFAULT;
			case UidPackage.ENTITY_TRANSITION__ANIMATION_IN_TIME:
				return animationInTime != ANIMATION_IN_TIME_EDEFAULT;
			case UidPackage.ENTITY_TRANSITION__ANIMATION_OUT_TIME:
				return animationOutTime != ANIMATION_OUT_TIME_EDEFAULT;
			case UidPackage.ENTITY_TRANSITION__ENTITIES:
				return entities != null;
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
		result.append(", animationTypeIn: ");
		result.append(animationTypeIn);
		result.append(", animationTypeOut: ");
		result.append(animationTypeOut);
		result.append(", animationInTime: ");
		result.append(animationInTime);
		result.append(", animationOutTime: ");
		result.append(animationOutTime);
		result.append(')');
		return result.toString();
	}

} //EntityTransitionImpl
