/**
 */
package uid.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import uid.Button;
import uid.Display;
import uid.EntityTransition;
import uid.Matrix;
import uid.Regulator;
import uid.State;
import uid.Switch;
import uid.UidPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uid.impl.StateImpl#getImage_background <em>Image background</em>}</li>
 *   <li>{@link uid.impl.StateImpl#getHasRegulator <em>Has Regulator</em>}</li>
 *   <li>{@link uid.impl.StateImpl#getHasMatrix <em>Has Matrix</em>}</li>
 *   <li>{@link uid.impl.StateImpl#getHasButton <em>Has Button</em>}</li>
 *   <li>{@link uid.impl.StateImpl#getHasDisplay <em>Has Display</em>}</li>
 *   <li>{@link uid.impl.StateImpl#getHasTransition <em>Has Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateImpl extends EntityImpl implements State {
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
	 * The cached value of the '{@link #getHasRegulator() <em>Has Regulator</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasRegulator()
	 * @generated
	 * @ordered
	 */
	protected EList<Regulator> hasRegulator;

	/**
	 * The cached value of the '{@link #getHasMatrix() <em>Has Matrix</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasMatrix()
	 * @generated
	 * @ordered
	 */
	protected EList<Matrix> hasMatrix;

	/**
	 * The cached value of the '{@link #getHasButton() <em>Has Button</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasButton()
	 * @generated
	 * @ordered
	 */
	protected EList<Button> hasButton;

	/**
	 * The cached value of the '{@link #getHasDisplay() <em>Has Display</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasDisplay()
	 * @generated
	 * @ordered
	 */
	protected EList<Display> hasDisplay;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UidPackage.Literals.STATE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UidPackage.STATE__IMAGE_BACKGROUND, oldImage_background, image_background));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Regulator> getHasRegulator() {
		if (hasRegulator == null) {
			hasRegulator = new EObjectResolvingEList<Regulator>(Regulator.class, this, UidPackage.STATE__HAS_REGULATOR);
		}
		return hasRegulator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Matrix> getHasMatrix() {
		if (hasMatrix == null) {
			hasMatrix = new EObjectResolvingEList<Matrix>(Matrix.class, this, UidPackage.STATE__HAS_MATRIX);
		}
		return hasMatrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Button> getHasButton() {
		if (hasButton == null) {
			hasButton = new EObjectResolvingEList<Button>(Button.class, this, UidPackage.STATE__HAS_BUTTON);
		}
		return hasButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Display> getHasDisplay() {
		if (hasDisplay == null) {
			hasDisplay = new EObjectResolvingEList<Display>(Display.class, this, UidPackage.STATE__HAS_DISPLAY);
		}
		return hasDisplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityTransition> getHasTransition() {
		if (hasTransition == null) {
			hasTransition = new EObjectResolvingEList<EntityTransition>(EntityTransition.class, this, UidPackage.STATE__HAS_TRANSITION);
		}
		return hasTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UidPackage.STATE__IMAGE_BACKGROUND:
				return getImage_background();
			case UidPackage.STATE__HAS_REGULATOR:
				return getHasRegulator();
			case UidPackage.STATE__HAS_MATRIX:
				return getHasMatrix();
			case UidPackage.STATE__HAS_BUTTON:
				return getHasButton();
			case UidPackage.STATE__HAS_DISPLAY:
				return getHasDisplay();
			case UidPackage.STATE__HAS_TRANSITION:
				return getHasTransition();
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
			case UidPackage.STATE__IMAGE_BACKGROUND:
				setImage_background((String)newValue);
				return;
			case UidPackage.STATE__HAS_REGULATOR:
				getHasRegulator().clear();
				getHasRegulator().addAll((Collection<? extends Regulator>)newValue);
				return;
			case UidPackage.STATE__HAS_MATRIX:
				getHasMatrix().clear();
				getHasMatrix().addAll((Collection<? extends Matrix>)newValue);
				return;
			case UidPackage.STATE__HAS_BUTTON:
				getHasButton().clear();
				getHasButton().addAll((Collection<? extends Button>)newValue);
				return;
			case UidPackage.STATE__HAS_DISPLAY:
				getHasDisplay().clear();
				getHasDisplay().addAll((Collection<? extends Display>)newValue);
				return;
			case UidPackage.STATE__HAS_TRANSITION:
				getHasTransition().clear();
				getHasTransition().addAll((Collection<? extends EntityTransition>)newValue);
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
			case UidPackage.STATE__IMAGE_BACKGROUND:
				setImage_background(IMAGE_BACKGROUND_EDEFAULT);
				return;
			case UidPackage.STATE__HAS_REGULATOR:
				getHasRegulator().clear();
				return;
			case UidPackage.STATE__HAS_MATRIX:
				getHasMatrix().clear();
				return;
			case UidPackage.STATE__HAS_BUTTON:
				getHasButton().clear();
				return;
			case UidPackage.STATE__HAS_DISPLAY:
				getHasDisplay().clear();
				return;
			case UidPackage.STATE__HAS_TRANSITION:
				getHasTransition().clear();
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
			case UidPackage.STATE__IMAGE_BACKGROUND:
				return IMAGE_BACKGROUND_EDEFAULT == null ? image_background != null : !IMAGE_BACKGROUND_EDEFAULT.equals(image_background);
			case UidPackage.STATE__HAS_REGULATOR:
				return hasRegulator != null && !hasRegulator.isEmpty();
			case UidPackage.STATE__HAS_MATRIX:
				return hasMatrix != null && !hasMatrix.isEmpty();
			case UidPackage.STATE__HAS_BUTTON:
				return hasButton != null && !hasButton.isEmpty();
			case UidPackage.STATE__HAS_DISPLAY:
				return hasDisplay != null && !hasDisplay.isEmpty();
			case UidPackage.STATE__HAS_TRANSITION:
				return hasTransition != null && !hasTransition.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //StateImpl
