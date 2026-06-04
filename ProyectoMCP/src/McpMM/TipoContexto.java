/**
 */
package McpMM;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Tipo Contexto</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see McpMM.McpMMPackage#getTipoContexto()
 * @model
 * @generated
 */
public enum TipoContexto implements Enumerator {
	/**
	 * The '<em><b>ENTERO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTERO_VALUE
	 * @generated
	 * @ordered
	 */
	ENTERO(0, "ENTERO", "ENTERO"),

	/**
	 * The '<em><b>CADENA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CADENA_VALUE
	 * @generated
	 * @ordered
	 */
	CADENA(1, "CADENA", "CADENA"),

	/**
	 * The '<em><b>REAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REAL_VALUE
	 * @generated
	 * @ordered
	 */
	REAL(2, "REAL", "REAL"),

	/**
	 * The '<em><b>BOOLEANO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEANO_VALUE
	 * @generated
	 * @ordered
	 */
	BOOLEANO(3, "BOOLEANO", "BOOLEANO"),

	/**
	 * The '<em><b>TEXTO EXTENSO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXTO_EXTENSO_VALUE
	 * @generated
	 * @ordered
	 */
	TEXTO_EXTENSO(4, "TEXTO_EXTENSO", "TEXTO_EXTENSO"),

	/**
	 * The '<em><b>ARCHIVO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARCHIVO_VALUE
	 * @generated
	 * @ordered
	 */
	ARCHIVO(5, "ARCHIVO", "ARCHIVO"),

	/**
	 * The '<em><b>COLECCION ARCHIVOS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLECCION_ARCHIVOS_VALUE
	 * @generated
	 * @ordered
	 */
	COLECCION_ARCHIVOS(6, "COLECCION_ARCHIVOS", "COLECCION_ARCHIVOS");

	/**
	 * The '<em><b>ENTERO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ENTERO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENTERO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ENTERO_VALUE = 0;

	/**
	 * The '<em><b>CADENA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CADENA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CADENA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CADENA_VALUE = 1;

	/**
	 * The '<em><b>REAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REAL_VALUE = 2;

	/**
	 * The '<em><b>BOOLEANO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BOOLEANO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOOLEANO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BOOLEANO_VALUE = 3;

	/**
	 * The '<em><b>TEXTO EXTENSO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TEXTO EXTENSO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEXTO_EXTENSO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TEXTO_EXTENSO_VALUE = 4;

	/**
	 * The '<em><b>ARCHIVO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ARCHIVO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARCHIVO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ARCHIVO_VALUE = 5;

	/**
	 * The '<em><b>COLECCION ARCHIVOS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COLECCION ARCHIVOS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLECCION_ARCHIVOS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COLECCION_ARCHIVOS_VALUE = 6;

	/**
	 * An array of all the '<em><b>Tipo Contexto</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TipoContexto[] VALUES_ARRAY =
		new TipoContexto[] {
			ENTERO,
			CADENA,
			REAL,
			BOOLEANO,
			TEXTO_EXTENSO,
			ARCHIVO,
			COLECCION_ARCHIVOS,
		};

	/**
	 * A public read-only list of all the '<em><b>Tipo Contexto</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TipoContexto> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tipo Contexto</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TipoContexto get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoContexto result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Contexto</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TipoContexto getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TipoContexto result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tipo Contexto</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TipoContexto get(int value) {
		switch (value) {
			case ENTERO_VALUE: return ENTERO;
			case CADENA_VALUE: return CADENA;
			case REAL_VALUE: return REAL;
			case BOOLEANO_VALUE: return BOOLEANO;
			case TEXTO_EXTENSO_VALUE: return TEXTO_EXTENSO;
			case ARCHIVO_VALUE: return ARCHIVO;
			case COLECCION_ARCHIVOS_VALUE: return COLECCION_ARCHIVOS;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TipoContexto(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TipoContexto
