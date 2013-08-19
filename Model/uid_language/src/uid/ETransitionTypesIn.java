/**
 */
package uid;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ETransition Types In</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see uid.UidPackage#getETransitionTypesIn()
 * @model
 * @generated
 */
public enum ETransitionTypesIn implements Enumerator {
	/**
	 * The '<em><b>Fade In</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FADE_IN_VALUE
	 * @generated
	 * @ordered
	 */
	FADE_IN(0, "fadeIn", "fadeIn"),

	/**
	 * The '<em><b>Swipe In</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SWIPE_IN_VALUE
	 * @generated
	 * @ordered
	 */
	SWIPE_IN(1, "swipeIn", "swipeIn"),

	/**
	 * The '<em><b>Zoom In</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZOOM_IN_VALUE
	 * @generated
	 * @ordered
	 */
	ZOOM_IN(2, "zoomIn", "zoomIn"),

	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(3, "none", "none");

	/**
	 * The '<em><b>Fade In</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fade In</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FADE_IN
	 * @model name="fadeIn"
	 * @generated
	 * @ordered
	 */
	public static final int FADE_IN_VALUE = 0;

	/**
	 * The '<em><b>Swipe In</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Swipe In</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SWIPE_IN
	 * @model name="swipeIn"
	 * @generated
	 * @ordered
	 */
	public static final int SWIPE_IN_VALUE = 1;

	/**
	 * The '<em><b>Zoom In</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Zoom In</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ZOOM_IN
	 * @model name="zoomIn"
	 * @generated
	 * @ordered
	 */
	public static final int ZOOM_IN_VALUE = 2;

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>None</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model name="none"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 3;

	/**
	 * An array of all the '<em><b>ETransition Types In</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ETransitionTypesIn[] VALUES_ARRAY =
		new ETransitionTypesIn[] {
			FADE_IN,
			SWIPE_IN,
			ZOOM_IN,
			NONE,
		};

	/**
	 * A public read-only list of all the '<em><b>ETransition Types In</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ETransitionTypesIn> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ETransition Types In</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ETransitionTypesIn get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ETransitionTypesIn result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ETransition Types In</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ETransitionTypesIn getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ETransitionTypesIn result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ETransition Types In</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ETransitionTypesIn get(int value) {
		switch (value) {
			case FADE_IN_VALUE: return FADE_IN;
			case SWIPE_IN_VALUE: return SWIPE_IN;
			case ZOOM_IN_VALUE: return ZOOM_IN;
			case NONE_VALUE: return NONE;
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
	private ETransitionTypesIn(int value, String name, String literal) {
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
	
} //ETransitionTypesIn
