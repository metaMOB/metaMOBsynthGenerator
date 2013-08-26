/**
 */
package uid.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import uid.Notifications;
import uid.UidFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Notifications</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NotificationsTest extends TestCase {

	/**
	 * The fixture for this Notifications test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Notifications fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NotificationsTest.class);
	}

	/**
	 * Constructs a new Notifications test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Notifications test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Notifications fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Notifications test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Notifications getFixture() {
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
		setFixture(UidFactory.eINSTANCE.createNotifications());
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

} //NotificationsTest
