/**
 */
package uid;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Eui Event Callbacks</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see uid.UidPackage#getEuiEventCallbacks()
 * @model
 * @generated
 */
public enum EuiEventCallbacks implements Enumerator {
	/**
	 * The '<em><b>On Touch Down</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ON_TOUCH_DOWN_VALUE
	 * @generated
	 * @ordered
	 */
	ON_TOUCH_DOWN(0, "onTouchDown", "onTouchDown"),

	/**
	 * The '<em><b>Set On Touch Down</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SET_ON_TOUCH_DOWN_VALUE
	 * @generated
	 * @ordered
	 */
	SET_ON_TOUCH_DOWN(1, "setOnTouchDown", "setOnTouchDown"),

	/**
	 * The '<em><b>Set On Touch Move</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SET_ON_TOUCH_MOVE_VALUE
	 * @generated
	 * @ordered
	 */
	SET_ON_TOUCH_MOVE(2, "setOnTouchMove", "setOnTouchMove"),

	/**
	 * The '<em><b>Set On Touch Up</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SET_ON_TOUCH_UP_VALUE
	 * @generated
	 * @ordered
	 */
	SET_ON_TOUCH_UP(3, "setOnTouchUp", "setOnTouchUp");

	/**
	 * The '<em><b>On Touch Down</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>On Touch Down</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ON_TOUCH_DOWN
	 * @model name="onTouchDown"
	 * @generated
	 * @ordered
	 */
	public static final int ON_TOUCH_DOWN_VALUE = 0;

	/**
	 * The '<em><b>Set On Touch Down</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Set On Touch Down</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SET_ON_TOUCH_DOWN
	 * @model name="setOnTouchDown"
	 * @generated
	 * @ordered
	 */
	public static final int SET_ON_TOUCH_DOWN_VALUE = 1;

	/**
	 * The '<em><b>Set On Touch Move</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Set On Touch Move</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SET_ON_TOUCH_MOVE
	 * @model name="setOnTouchMove"
	 * @generated
	 * @ordered
	 */
	public static final int SET_ON_TOUCH_MOVE_VALUE = 2;

	/**
	 * The '<em><b>Set On Touch Up</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Set On Touch Up</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SET_ON_TOUCH_UP
	 * @model name="setOnTouchUp"
	 * @generated
	 * @ordered
	 */
	public static final int SET_ON_TOUCH_UP_VALUE = 3;

	/**
	 * An array of all the '<em><b>Eui Event Callbacks</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EuiEventCallbacks[] VALUES_ARRAY =
		new EuiEventCallbacks[] {
			ON_TOUCH_DOWN,
			SET_ON_TOUCH_DOWN,
			SET_ON_TOUCH_MOVE,
			SET_ON_TOUCH_UP,
		};

	/**
	 * A public read-only list of all the '<em><b>Eui Event Callbacks</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EuiEventCallbacks> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Eui Event Callbacks</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EuiEventCallbacks get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EuiEventCallbacks result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Eui Event Callbacks</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EuiEventCallbacks getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EuiEventCallbacks result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Eui Event Callbacks</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EuiEventCallbacks get(int value) {
		switch (value) {
			case ON_TOUCH_DOWN_VALUE: return ON_TOUCH_DOWN;
			case SET_ON_TOUCH_DOWN_VALUE: return SET_ON_TOUCH_DOWN;
			case SET_ON_TOUCH_MOVE_VALUE: return SET_ON_TOUCH_MOVE;
			case SET_ON_TOUCH_UP_VALUE: return SET_ON_TOUCH_UP;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EuiEventCallbacks(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //EuiEventCallbacks
