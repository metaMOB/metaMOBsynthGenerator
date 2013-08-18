/**
 */
package uid.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import uid.Button;
import uid.CheckBox;
import uid.List;
import uid.TextField;
import uid.UidPackage;
import uid.Window;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Window</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uid.impl.WindowImpl#getHasButton <em>Has Button</em>}</li>
 *   <li>{@link uid.impl.WindowImpl#getHasTextField <em>Has Text Field</em>}</li>
 *   <li>{@link uid.impl.WindowImpl#getHasList <em>Has List</em>}</li>
 *   <li>{@link uid.impl.WindowImpl#getHasCheckBox <em>Has Check Box</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WindowImpl extends IEImpl implements Window {
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
	 * The cached value of the '{@link #getHasTextField() <em>Has Text Field</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasTextField()
	 * @generated
	 * @ordered
	 */
	protected EList<TextField> hasTextField;
	/**
	 * The cached value of the '{@link #getHasList() <em>Has List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasList()
	 * @generated
	 * @ordered
	 */
	protected EList<List> hasList;

	/**
	 * The cached value of the '{@link #getHasCheckBox() <em>Has Check Box</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasCheckBox()
	 * @generated
	 * @ordered
	 */
	protected EList<CheckBox> hasCheckBox;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WindowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UidPackage.Literals.WINDOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Button> getHasButton() {
		if (hasButton == null) {
			hasButton = new EObjectResolvingEList<Button>(Button.class, this, UidPackage.WINDOW__HAS_BUTTON);
		}
		return hasButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextField> getHasTextField() {
		if (hasTextField == null) {
			hasTextField = new EObjectResolvingEList<TextField>(TextField.class, this, UidPackage.WINDOW__HAS_TEXT_FIELD);
		}
		return hasTextField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<List> getHasList() {
		if (hasList == null) {
			hasList = new EObjectResolvingEList<List>(List.class, this, UidPackage.WINDOW__HAS_LIST);
		}
		return hasList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CheckBox> getHasCheckBox() {
		if (hasCheckBox == null) {
			hasCheckBox = new EObjectResolvingEList<CheckBox>(CheckBox.class, this, UidPackage.WINDOW__HAS_CHECK_BOX);
		}
		return hasCheckBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UidPackage.WINDOW__HAS_BUTTON:
				return getHasButton();
			case UidPackage.WINDOW__HAS_TEXT_FIELD:
				return getHasTextField();
			case UidPackage.WINDOW__HAS_LIST:
				return getHasList();
			case UidPackage.WINDOW__HAS_CHECK_BOX:
				return getHasCheckBox();
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
			case UidPackage.WINDOW__HAS_BUTTON:
				getHasButton().clear();
				getHasButton().addAll((Collection<? extends Button>)newValue);
				return;
			case UidPackage.WINDOW__HAS_TEXT_FIELD:
				getHasTextField().clear();
				getHasTextField().addAll((Collection<? extends TextField>)newValue);
				return;
			case UidPackage.WINDOW__HAS_LIST:
				getHasList().clear();
				getHasList().addAll((Collection<? extends List>)newValue);
				return;
			case UidPackage.WINDOW__HAS_CHECK_BOX:
				getHasCheckBox().clear();
				getHasCheckBox().addAll((Collection<? extends CheckBox>)newValue);
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
			case UidPackage.WINDOW__HAS_BUTTON:
				getHasButton().clear();
				return;
			case UidPackage.WINDOW__HAS_TEXT_FIELD:
				getHasTextField().clear();
				return;
			case UidPackage.WINDOW__HAS_LIST:
				getHasList().clear();
				return;
			case UidPackage.WINDOW__HAS_CHECK_BOX:
				getHasCheckBox().clear();
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
			case UidPackage.WINDOW__HAS_BUTTON:
				return hasButton != null && !hasButton.isEmpty();
			case UidPackage.WINDOW__HAS_TEXT_FIELD:
				return hasTextField != null && !hasTextField.isEmpty();
			case UidPackage.WINDOW__HAS_LIST:
				return hasList != null && !hasList.isEmpty();
			case UidPackage.WINDOW__HAS_CHECK_BOX:
				return hasCheckBox != null && !hasCheckBox.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WindowImpl
