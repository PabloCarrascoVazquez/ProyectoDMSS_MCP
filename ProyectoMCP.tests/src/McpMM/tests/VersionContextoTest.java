/**
 */
package McpMM.tests;

import McpMM.McpMMFactory;
import McpMM.VersionContexto;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Version Contexto</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VersionContextoTest extends TestCase {

	/**
	 * The fixture for this Version Contexto test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VersionContexto fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VersionContextoTest.class);
	}

	/**
	 * Constructs a new Version Contexto test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionContextoTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Version Contexto test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(VersionContexto fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Version Contexto test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VersionContexto getFixture() {
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
		setFixture(McpMMFactory.eINSTANCE.createVersionContexto());
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

} //VersionContextoTest
