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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uid.Button;
import uid.Container;
import uid.Display;
import uid.EntityTransition;
import uid.Matrix;
import uid.Regulator;
import uid.Switch;
import uid.UidPackage;
import uid.View;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uid.impl.ViewImpl#getImage_background <em>Image background</em>}</li>
 *   <li>{@link uid.impl.ViewImpl#getHasTransition <em>Has Transition</em>}</li>
 *   <li>{@link uid.impl.ViewImpl#getName <em>Name</em>}</li>
 *   <li>{@link uid.impl.ViewImpl#getHasDisplay <em>Has Display</em>}</li>
 *   <li>{@link uid.impl.ViewImpl#getHasContainer <em>Has Container</em>}</li>
 *   <li>{@link uid.impl.ViewImpl#getHasMatrix <em>Has Matrix</em>}</li>
 *   <li>{@link uid.impl.ViewImpl#getHasRegulator <em>Has Regulator</em>}</li>
 *   <li>{@link uid.impl.ViewImpl#getHasButton <em>Has Button</em>}</li>
 *   <li>{@link uid.impl.ViewImpl#getHasSwitch <em>Has Switch</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewImpl extends EObjectImpl implements View {
	/**
	 * The default value of the '{@link #getImage_background() <em>Image background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage_background()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_BACKGROUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImage_background() <em>Image background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage_background()
	 * @generated
	 * @ordered
	 */
	protected String image_background = IMAGE_BACKGROUND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasTransition() <em>Has Transition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityTransition> hasTransition;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UidPackage.Literals.VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImage_background() {
		return image_background;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImage_background(String newImage_background) {
		String oldImage_background = image_background;
		image_background = newImage_background;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidPackage.VIEW__IMAGE_BACKGROUND, oldImage_background, image_background));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityTransition> getHasTransition() {
		if (hasTransition == null) {
			hasTransition = new EObjectResolvingEList<EntityTransition>(EntityTransition.class, this, UidPackage.VIEW__HAS_TRANSITION);
		}
		return hasTransition;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UidPackage.VIEW__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Display> getHasDisplay() {
		if (hasDisplay == null) {
			hasDisplay = new EObjectContainmentEList<Display>(Display.class, this, UidPackage.VIEW__HAS_DISPLAY);
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
			hasContainer = new EObjectContainmentEList<Container>(Container.class, this, UidPackage.VIEW__HAS_CONTAINER);
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
			hasMatrix = new EObjectContainmentEList<Matrix>(Matrix.class, this, UidPackage.VIEW__HAS_MATRIX);
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
			hasRegulator = new EObjectContainmentEList<Regulator>(Regulator.class, this, UidPackage.VIEW__HAS_REGULATOR);
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
			hasButton = new EObjectContainmentEList<Button>(Button.class, this, UidPackage.VIEW__HAS_BUTTON);
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
			hasSwitch = new EObjectContainmentEList<Switch>(Switch.class, this, UidPackage.VIEW__HAS_SWITCH);
		}
		return hasSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UidPackage.VIEW__HAS_DISPLAY:
				return ((InternalEList<?>)getHasDisplay()).basicRemove(otherEnd, msgs);
			case UidPackage.VIEW__HAS_CONTAINER:
				return ((InternalEList<?>)getHasContainer()).basicRemove(otherEnd, msgs);
			case UidPackage.VIEW__HAS_MATRIX:
				return ((InternalEList<?>)getHasMatrix()).basicRemove(otherEnd, msgs);
			case UidPackage.VIEW__HAS_REGULATOR:
				return ((InternalEList<?>)getHasRegulator()).basicRemove(otherEnd, msgs);
			case UidPackage.VIEW__HAS_BUTTON:
				return ((InternalEList<?>)getHasButton()).basicRemove(otherEnd, msgs);
			case UidPackage.VIEW__HAS_SWITCH:
				return ((InternalEList<?>)getHasSwitch()).basicRemove(otherEnd, msgs);
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
			case UidPackage.VIEW__IMAGE_BACKGROUND:
				return getImage_background();
			case UidPackage.VIEW__HAS_TRANSITION:
				return getHasTransition();
			case UidPackage.VIEW__NAME:
				return getName();
			case UidPackage.VIEW__HAS_DISPLAY:
				return getHasDisplay();
			case UidPackage.VIEW__HAS_CONTAINER:
				return getHasContainer();
			case UidPackage.VIEW__HAS_MATRIX:
				return getHasMatrix();
			case UidPackage.VIEW__HAS_REGULATOR:
				return getHasRegulator();
			case UidPackage.VIEW__HAS_BUTTON:
				return getHasButton();
			case UidPackage.VIEW__HAS_SWITCH:
				return getHasSwitch();
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
			case UidPackage.VIEW__IMAGE_BACKGROUND:
				setImage_background((String)newValue);
				return;
			case UidPackage.VIEW__HAS_TRANSITION:
				getHasTransition().clear();
				getHasTransition().addAll((Collection<? extends EntityTransition>)newValue);
				return;
			case UidPackage.VIEW__NAME:
				setName((String)newValue);
				return;
			case UidPackage.VIEW__HAS_DISPLAY:
				getHasDisplay().clear();
				getHasDisplay().addAll((Collection<? extends Display>)newValue);
				return;
			case UidPackage.VIEW__HAS_CONTAINER:
				getHasContainer().clear();
				getHasContainer().addAll((Collection<? extends Container>)newValue);
				return;
			case UidPackage.VIEW__HAS_MATRIX:
				getHasMatrix().clear();
				getHasMatrix().addAll((Collection<? extends Matrix>)newValue);
				return;
			case UidPackage.VIEW__HAS_REGULATOR:
				getHasRegulator().clear();
				getHasRegulator().addAll((Collection<? extends Regulator>)newValue);
				return;
			case UidPackage.VIEW__HAS_BUTTON:
				getHasButton().clear();
				getHasButton().addAll((Collection<? extends Button>)newValue);
				return;
			case UidPackage.VIEW__HAS_SWITCH:
				getHasSwitch().clear();
				getHasSwitch().addAll((Collection<? extends Switch>)newValue);
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
			case UidPackage.VIEW__IMAGE_BACKGROUND:
				setImage_background(IMAGE_BACKGROUND_EDEFAULT);
				return;
			case UidPackage.VIEW__HAS_TRANSITION:
				getHasTransition().clear();
				return;
			case UidPackage.VIEW__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UidPackage.VIEW__HAS_DISPLAY:
				getHasDisplay().clear();
				return;
			case UidPackage.VIEW__HAS_CONTAINER:
				getHasContainer().clear();
				return;
			case UidPackage.VIEW__HAS_MATRIX:
				getHasMatrix().clear();
				return;
			case UidPackage.VIEW__HAS_REGULATOR:
				getHasRegulator().clear();
				return;
			case UidPackage.VIEW__HAS_BUTTON:
				getHasButton().clear();
				return;
			case UidPackage.VIEW__HAS_SWITCH:
				getHasSwitch().clear();
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
			case UidPackage.VIEW__IMAGE_BACKGROUND:
				return IMAGE_BACKGROUND_EDEFAULT == null ? image_background != null : !IMAGE_BACKGROUND_EDEFAULT.equals(image_background);
			case UidPackage.VIEW__HAS_TRANSITION:
				return hasTransition != null && !hasTransition.isEmpty();
			case UidPackage.VIEW__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UidPackage.VIEW__HAS_DISPLAY:
				return hasDisplay != null && !hasDisplay.isEmpty();
			case UidPackage.VIEW__HAS_CONTAINER:
				return hasContainer != null && !hasContainer.isEmpty();
			case UidPackage.VIEW__HAS_MATRIX:
				return hasMatrix != null && !hasMatrix.isEmpty();
			case UidPackage.VIEW__HAS_REGULATOR:
				return hasRegulator != null && !hasRegulator.isEmpty();
			case UidPackage.VIEW__HAS_BUTTON:
				return hasButton != null && !hasButton.isEmpty();
			case UidPackage.VIEW__HAS_SWITCH:
				return hasSwitch != null && !hasSwitch.isEmpty();
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
		result.append(" (image_background: ");
		result.append(image_background);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ViewImpl
