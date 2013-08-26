/**
 */
package uid.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import uid.Controllers;
import uid.UidFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Controllers</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ControllersTest extends TestCase {

	/**
	 * The fixture for this Controllers test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Controllers fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ControllersTest.class);
	}

	/**
	 * Constructs a new Controllers test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllersTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Controllers test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Controllers fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Controllers test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Controllers getFixture() {
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
		setFixture(UidFactory.eINSTANCE.createControllers());
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

} //ControllersTest
