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

import uid.Button;
import uid.Container;
import uid.Display;
import uid.Event;
import uid.Matrix;
import uid.Regulator;
import uid.Stage;
import uid.Switch;
import uid.UidPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uid.impl.StageImpl#getBackground <em>Background</em>}</li>
 *   <li>{@link uid.impl.StageImpl#getName <em>Name</em>}</li>
 *   <li>{@link uid.impl.StageImpl#getHasDisplay <em>Has Display</em>}</li>
 *   <li>{@link uid.impl.StageImpl#getHasContainer <em>Has Container</em>}</li>
 *   <li>{@link uid.impl.StageImpl#getHasMatrix <em>Has Matrix</em>}</li>
 *   <li>{@link uid.impl.StageImpl#getHasRegulator <em>Has Regulator</em>}</li>
 *   <li>{@link uid.impl.StageImpl#getHasButton <em>Has Button</em>}</li>
 *   <li>{@link uid.impl.StageImpl#getHasSwitch <em>Has Switch</em>}</li>
 *   <li>{@link uid.impl.StageImpl#getHasEvents <em>Has Events</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StageImpl extends EObjectImpl implements Stage {
	/**
	 * The default value of the '{@link #getBackground() <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackground()
	 * @generated
	 * @ordered
	 */
	protected static final String BACKGROUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackground() <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackground()
	 * @generated
	 * @ordered
	 */
	protected String background = BACKGROUND_EDEFAULT;

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
	 * The cached value of the '{@link #getHasDisplay() <em>Has Display</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasDisplay()
	 * @generated
	 * @ordered
	 */
	protected EList<Display> hasDisplay;

	/**
	 * The cached value of the '{@link #getHasContainer() <em>Has Container</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasContainer()
	 * @generated
	 * @ordered
	 */
	protected EList<Container> hasContainer;

	/**
	 * The cached value of the '{@link #getHasMatrix() <em>Has Matrix</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasMatrix()
	 * @generated
	 * @ordered
	 */
	protected EList<Matrix> hasMatrix;

	/**
	 * The cached value of the '{@link #getHasRegulator() <em>Has Regulator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasRegulator()
	 * @generated
	 * @ordered
	 */
	protected EList<Regulator> hasRegulator;

	/**
	 * The cached value of the '{@link #getHasButton() <em>Has Button</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasButton()
	 * @generated
	 * @ordered
	 */
	protected EList<Button> hasButton;

	/**
	 * The cached value of the '{@link #getHasSwitch() <em>Has Switch</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasSwitch()
	 * @generated
	 * @ordered
	 */
	protected EList<Switch> hasSwitch;

	/**
	 * The cached value of the '{@link #getHasEvents() <em>Has Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> hasEvents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UidPackage.Literals.STAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBackground() {
		return background;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackground(String newBackground) {
		String oldBackground = background;
		background = newBackground;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidPackage.STAGE__BACKGROUND, oldBackground, background));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UidPackage.STAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Display> getHasDisplay() {
		if (hasDisplay == null) {
			hasDisplay = new EObjectContainmentEList<Display>(Display.class, this, UidPackage.STAGE__HAS_DISPLAY);
		}
		return hasDisplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Container> getHasContainer() {
		if (hasContainer == null) {
			hasContainer = new EObjectContainmentEList<Container>(Container.class, this, UidPackage.STAGE__HAS_CONTAINER);
		}
		return hasContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Matrix> getHasMatrix() {
		if (hasMatrix == null) {
			hasMatrix = new EObjectContainmentEList<Matrix>(Matrix.class, this, UidPackage.STAGE__HAS_MATRIX);
		}
		return hasMatrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Regulator> getHasRegulator() {
		if (hasRegulator == null) {
			hasRegulator = new EObjectContainmentEList<Regulator>(Regulator.class, this, UidPackage.STAGE__HAS_REGULATOR);
		}
		return hasRegulator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Button> getHasButton() {
		if (hasButton == null) {
			hasButton = new EObjectContainmentEList<Button>(Button.class, this, UidPackage.STAGE__HAS_BUTTON);
		}
		return hasButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Switch> getHasSwitch() {
		if (hasSwitch == null) {
			hasSwitch = new EObjectContainmentEList<Switch>(Switch.class, this, UidPackage.STAGE__HAS_SWITCH);
		}
		return hasSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getHasEvents() {
		if (hasEvents == null) {
			hasEvents = new EObjectContainmentEList<Event>(Event.class, this, UidPackage.STAGE__HAS_EVENTS);
		}
		return hasEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UidPackage.STAGE__HAS_DISPLAY:
				return ((InternalEList<?>)getHasDisplay()).basicRemove(otherEnd, msgs);
			case UidPackage.STAGE__HAS_CONTAINER:
				return ((InternalEList<?>)getHasContainer()).basicRemove(otherEnd, msgs);
			case UidPackage.STAGE__HAS_MATRIX:
				return ((InternalEList<?>)getHasMatrix()).basicRemove(otherEnd, msgs);
			case UidPackage.STAGE__HAS_REGULATOR:
				return ((InternalEList<?>)getHasRegulator()).basicRemove(otherEnd, msgs);
			case UidPackage.STAGE__HAS_BUTTON:
				return ((InternalEList<?>)getHasButton()).basicRemove(otherEnd, msgs);
			case UidPackage.STAGE__HAS_SWITCH:
				return ((InternalEList<?>)getHasSwitch()).basicRemove(otherEnd, msgs);
			case UidPackage.STAGE__HAS_EVENTS:
				return ((InternalEList<?>)getHasEvents()).basicRemove(otherEnd, msgs);
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
			case UidPackage.STAGE__BACKGROUND:
				return getBackground();
			case UidPackage.STAGE__NAME:
				return getName();
			case UidPackage.STAGE__HAS_DISPLAY:
				return getHasDisplay();
			case UidPackage.STAGE__HAS_CONTAINER:
				return getHasContainer();
			case UidPackage.STAGE__HAS_MATRIX:
				return getHasMatrix();
			case UidPackage.STAGE__HAS_REGULATOR:
				return getHasRegulator();
			case UidPackage.STAGE__HAS_BUTTON:
				return getHasButton();
			case UidPackage.STAGE__HAS_SWITCH:
				return getHasSwitch();
			case UidPackage.STAGE__HAS_EVENTS:
				return getHasEvents();
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
			case UidPackage.STAGE__BACKGROUND:
				setBackground((String)newValue);
				return;
			case UidPackage.STAGE__NAME:
				setName((String)newValue);
				return;
			case UidPackage.STAGE__HAS_DISPLAY:
				getHasDisplay().clear();
				getHasDisplay().addAll((Collection<? extends Display>)newValue);
				return;
			case UidPackage.STAGE__HAS_CONTAINER:
				getHasContainer().clear();
				getHasContainer().addAll((Collection<? extends Container>)newValue);
				return;
			case UidPackage.STAGE__HAS_MATRIX:
				getHasMatrix().clear();
				getHasMatrix().addAll((Collection<? extends Matrix>)newValue);
				return;
			case UidPackage.STAGE__HAS_REGULATOR:
				getHasRegulator().clear();
				getHasRegulator().addAll((Collection<? extends Regulator>)newValue);
				return;
			case UidPackage.STAGE__HAS_BUTTON:
				getHasButton().clear();
				getHasButton().addAll((Collection<? extends Button>)newValue);
				return;
			case UidPackage.STAGE__HAS_SWITCH:
				getHasSwitch().clear();
				getHasSwitch().addAll((Collection<? extends Switch>)newValue);
				return;
			case UidPackage.STAGE__HAS_EVENTS:
				getHasEvents().clear();
				getHasEvents().addAll((Collection<? extends Event>)newValue);
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
			case UidPackage.STAGE__BACKGROUND:
				setBackground(BACKGROUND_EDEFAULT);
				return;
			case UidPackage.STAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UidPackage.STAGE__HAS_DISPLAY:
				getHasDisplay().clear();
				return;
			case UidPackage.STAGE__HAS_CONTAINER:
				getHasContainer().clear();
				return;
			case UidPackage.STAGE__HAS_MATRIX:
				getHasMatrix().clear();
				return;
			case UidPackage.STAGE__HAS_REGULATOR:
				getHasRegulator().clear();
				return;
			case UidPackage.STAGE__HAS_BUTTON:
				getHasButton().clear();
				return;
			case UidPackage.STAGE__HAS_SWITCH:
				getHasSwitch().clear();
				return;
			case UidPackage.STAGE__HAS_EVENTS:
				getHasEvents().clear();
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
			case UidPackage.STAGE__BACKGROUND:
				return BACKGROUND_EDEFAULT == null ? background != null : !BACKGROUND_EDEFAULT.equals(background);
			case UidPackage.STAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UidPackage.STAGE__HAS_DISPLAY:
				return hasDisplay != null && !hasDisplay.isEmpty();
			case UidPackage.STAGE__HAS_CONTAINER:
				return hasContainer != null && !hasContainer.isEmpty();
			case UidPackage.STAGE__HAS_MATRIX:
				return hasMatrix != null && !hasMatrix.isEmpty();
			case UidPackage.STAGE__HAS_REGULATOR:
				return hasRegulator != null && !hasRegulator.isEmpty();
			case UidPackage.STAGE__HAS_BUTTON:
				return hasButton != null && !hasButton.isEmpty();
			case UidPackage.STAGE__HAS_SWITCH:
				return hasSwitch != null && !hasSwitch.isEmpty();
			case UidPackage.STAGE__HAS_EVENTS:
				return hasEvents != null && !hasEvents.isEmpty();
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
		result.append(" (background: ");
		result.append(background);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //StageImpl
