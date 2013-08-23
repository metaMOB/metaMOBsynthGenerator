/**
 */
package uid.tests;

import junit.textui.TestRunner;

import uid.Regulator;
import uid.UidFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Regulator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link uid.Regulator#setValue() <em>Set Value</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class RegulatorTest extends ComponentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RegulatorTest.class);
	}

	/**
	 * Constructs a new Regulator test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegulatorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Regulator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Regulator getFixture() {
		return (Regulator)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UidFactory.eINSTANCE.createRegulator());
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

	/**
	 * Tests the '{@link uid.Regulator#setValue() <em>Set Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uid.Regulator#setValue()
	 * @generated
	 */
	public void testSetValue() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //RegulatorTest
