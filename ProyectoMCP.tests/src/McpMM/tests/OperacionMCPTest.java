/**
 */
package McpMM.tests;

import McpMM.McpMMFactory;
import McpMM.OperacionMCP;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Operacion MCP</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OperacionMCPTest extends TestCase {

	/**
	 * The fixture for this Operacion MCP test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperacionMCP fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OperacionMCPTest.class);
	}

	/**
	 * Constructs a new Operacion MCP test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperacionMCPTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Operacion MCP test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(OperacionMCP fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Operacion MCP test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperacionMCP getFixture() {
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
		setFixture(McpMMFactory.eINSTANCE.createOperacionMCP());
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

} //OperacionMCPTest
