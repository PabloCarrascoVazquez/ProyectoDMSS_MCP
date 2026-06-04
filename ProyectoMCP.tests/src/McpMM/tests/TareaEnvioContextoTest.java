/**
 */
package McpMM.tests;

import McpMM.McpMMFactory;
import McpMM.TareaEnvioContexto;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Tarea Envio Contexto</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TareaEnvioContextoTest extends TareaEjecutableTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TareaEnvioContextoTest.class);
	}

	/**
	 * Constructs a new Tarea Envio Contexto test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TareaEnvioContextoTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Tarea Envio Contexto test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TareaEnvioContexto getFixture() {
		return (TareaEnvioContexto)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(McpMMFactory.eINSTANCE.createTareaEnvioContexto());
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

} //TareaEnvioContextoTest
