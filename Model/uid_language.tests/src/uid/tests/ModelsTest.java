/**
 */
package uid.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import uid.Models;
import uid.UidFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Models</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelsTest extends TestCase {

	/**
	 * The fixture for this Models test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Models fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ModelsTest.class);
	}

	/**
	 * Constructs a new Models test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Models test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Models fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Models test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Models getFixture() {
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
		setFixture(UidFactory.eINSTANCE.createModels());
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

} //ModelsTest
