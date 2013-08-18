/**
 */
package uid.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import uid.IE;
import uid.IEAssoc;
import uid.UidPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uid.impl.IEImpl#getIeAssoc <em>Ie Assoc</em>}</li>
 *   <li>{@link uid.impl.IEImpl#getName <em>Name</em>}</li>
 *   <li>{@link uid.impl.IEImpl#getMargin <em>Margin</em>}</li>
 *   <li>{@link uid.impl.IEImpl#isVisible <em>Visible</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IEImpl extends EObjectImpl implements IE {
	/**
	 * The cached value of the '{@link #getIeAssoc() <em>Ie Assoc</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIeAssoc()
	 * @generated
	 * @ordered
	 */
	protected EList<IEAssoc> ieAssoc;

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
	 * The default value of the '{@link #getMargin() <em>Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMargin()
	 * @generated
	 * @ordered
	 */
	protected static final String MARGIN_EDEFAULT = "0, 0, 0, 0";

	/**
	 * The cached value of the '{@link #getMargin() <em>Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMargin()
	 * @generated
	 * @ordered
	 */
	protected String margin = MARGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VISIBLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isVisible() <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean visible = VISIBLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UidPackage.Literals.IE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IEAssoc> getIeAssoc() {
		if (ieAssoc == null) {
			ieAssoc = new EObjectResolvingEList<IEAssoc>(IEAssoc.class, this, UidPackage.IE__IE_ASSOC);
		}
		return ieAssoc;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UidPackage.IE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMargin() {
		return margin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMargin(String newMargin) {
		String oldMargin = margin;
		margin = newMargin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidPackage.IE__MARGIN, oldMargin, margin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVisible() {
		return visible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisible(boolean newVisible) {
		boolean oldVisible = visible;
		visible = newVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UidPackage.IE__VISIBLE, oldVisible, visible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UidPackage.IE__IE_ASSOC:
				return getIeAssoc();
			case UidPackage.IE__NAME:
				return getName();
			case UidPackage.IE__MARGIN:
				return getMargin();
			case UidPackage.IE__VISIBLE:
				return isVisible();
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
			case UidPackage.IE__IE_ASSOC:
				getIeAssoc().clear();
				getIeAssoc().addAll((Collection<? extends IEAssoc>)newValue);
				return;
			case UidPackage.IE__NAME:
				setName((String)newValue);
				return;
			case UidPackage.IE__MARGIN:
				setMargin((String)newValue);
				return;
			case UidPackage.IE__VISIBLE:
				setVisible((Boolean)newValue);
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
			case UidPackage.IE__IE_ASSOC:
				getIeAssoc().clear();
				return;
			case UidPackage.IE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UidPackage.IE__MARGIN:
				setMargin(MARGIN_EDEFAULT);
				return;
			case UidPackage.IE__VISIBLE:
				setVisible(VISIBLE_EDEFAULT);
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
			case UidPackage.IE__IE_ASSOC:
				return ieAssoc != null && !ieAssoc.isEmpty();
			case UidPackage.IE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UidPackage.IE__MARGIN:
				return MARGIN_EDEFAULT == null ? margin != null : !MARGIN_EDEFAULT.equals(margin);
			case UidPackage.IE__VISIBLE:
				return visible != VISIBLE_EDEFAULT;
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
		result.append(", margin: ");
		result.append(margin);
		result.append(", visible: ");
		result.append(visible);
		result.append(')');
		return result.toString();
	}

} //IEImpl
