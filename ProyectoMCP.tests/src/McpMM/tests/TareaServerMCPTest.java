/**
 */
package McpMM.tests;

import McpMM.McpMMFactory;
import McpMM.TareaServerMCP;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Tarea Server MCP</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TareaServerMCPTest extends TareaEjecutableTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TareaServerMCPTest.class);
	}

	/**
	 * Constructs a new Tarea Server MCP test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TareaServerMCPTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Tarea Server MCP test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TareaServerMCP getFixture() {
		return (TareaServerMCP)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(McpMMFactory.eINSTANCE.createTareaServerMCP());
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

} //TareaServerMCPTest
