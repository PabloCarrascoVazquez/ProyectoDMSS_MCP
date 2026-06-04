/**
 */
package McpMM.tests;

import McpMM.McpMMFactory;
import McpMM.Propiedad;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Propiedad</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PropiedadTest extends TestCase {

	/**
	 * The fixture for this Propiedad test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Propiedad fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PropiedadTest.class);
	}

	/**
	 * Constructs a new Propiedad test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropiedadTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Propiedad test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Propiedad fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Propiedad test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Propiedad getFixture() {
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
		setFixture(McpMMFactory.eINSTANCE.createPropiedad());
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

} //PropiedadTest
