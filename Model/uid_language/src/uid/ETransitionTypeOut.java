/**
 */
package uid;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ETransition Type Out</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see uid.UidPackage#getETransitionTypeOut()
 * @model
 * @generated
 */
public enum ETransitionTypeOut implements Enumerator {
	/**
	 * The '<em><b>Fade Out</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FADE_OUT_VALUE
	 * @generated
	 * @ordered
	 */
	FADE_OUT(0, "fadeOut", "fadeOut"),

	/**
	 * The '<em><b>Swipe Out</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SWIPE_OUT_VALUE
	 * @generated
	 * @ordered
	 */
	SWIPE_OUT(1, "swipeOut", "swipeOut"),

	/**
	 * The '<em><b>Zoom Out</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZOOM_OUT_VALUE
	 * @generated
	 * @ordered
	 */
	ZOOM_OUT(2, "zoomOut", "zoomOut"),

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
	 * The '<em><b>Fade Out</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fade Out</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FADE_OUT
	 * @model name="fadeOut"
	 * @generated
	 * @ordered
	 */
	public static final int FADE_OUT_VALUE = 0;

	/**
	 * The '<em><b>Swipe Out</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Swipe Out</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SWIPE_OUT
	 * @model name="swipeOut"
	 * @generated
	 * @ordered
	 */
	public static final int SWIPE_OUT_VALUE = 1;

	/**
	 * The '<em><b>Zoom Out</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Zoom Out</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ZOOM_OUT
	 * @model name="zoomOut"
	 * @generated
	 * @ordered
	 */
	public static final int ZOOM_OUT_VALUE = 2;

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
	 * An array of all the '<em><b>ETransition Type Out</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ETransitionTypeOut[] VALUES_ARRAY =
		new ETransitionTypeOut[] {
			FADE_OUT,
			SWIPE_OUT,
			ZOOM_OUT,
			NONE,
		};

	/**
	 * A public read-only list of all the '<em><b>ETransition Type Out</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ETransitionTypeOut> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ETransition Type Out</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ETransitionTypeOut get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ETransitionTypeOut result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ETransition Type Out</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ETransitionTypeOut getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ETransitionTypeOut result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ETransition Type Out</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ETransitionTypeOut get(int value) {
		switch (value) {
			case FADE_OUT_VALUE: return FADE_OUT;
			case SWIPE_OUT_VALUE: return SWIPE_OUT;
			case ZOOM_OUT_VALUE: return ZOOM_OUT;
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
	private ETransitionTypeOut(int value, String name, String literal) {
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
	
} //ETransitionTypeOut
