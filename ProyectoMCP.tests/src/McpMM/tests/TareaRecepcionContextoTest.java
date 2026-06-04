/**
 */
package McpMM.tests;

import McpMM.McpMMFactory;
import McpMM.TareaRecepcionContexto;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Tarea Recepcion Contexto</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TareaRecepcionContextoTest extends TareaEjecutableTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TareaRecepcionContextoTest.class);
	}

	/**
	 * Constructs a new Tarea Recepcion Contexto test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TareaRecepcionContextoTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Tarea Recepcion Contexto test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TareaRecepcionContexto getFixture() {
		return (TareaRecepcionContexto)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(McpMMFactory.eINSTANCE.createTareaRecepcionContexto());
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

} //TareaRecepcionContextoTest
