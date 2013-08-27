/**
 */
package uid.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import uid.StateTransition;
import uid.UidFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>State Transition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StateTransitionTest extends TestCase {

	/**
	 * The fixture for this State Transition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateTransition fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StateTransitionTest.class);
	}

	/**
	 * Constructs a new State Transition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateTransitionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this State Transition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(StateTransition fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this State Transition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateTransition getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UidFactory.eINSTANCE.createStateTransition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //StateTransitionTest
