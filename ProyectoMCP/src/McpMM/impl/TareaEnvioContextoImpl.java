/**
 */
package McpMM.impl;

import McpMM.McpMMPackage;
import McpMM.Propiedad;
import McpMM.TareaEnvioContexto;

import McpMM.TareaRecepcionContexto;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tarea Envio Contexto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link McpMM.impl.TareaEnvioContextoImpl#getEnviaA <em>Envia A</em>}</li>
 *   <li>{@link McpMM.impl.TareaEnvioContextoImpl#getEnvioAsociado <em>Envio Asociado</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TareaEnvioContextoImpl extends TareaEjecutableImpl implements TareaEnvioContexto {
	/**
	 * The cached value of the '{@link #getEnviaA() <em>Envia A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnviaA()
	 * @generated
	 * @ordered
	 */
	protected TareaRecepcionContexto enviaA;
	/**
	 * The cached value of the '{@link #getEnvioAsociado() <em>Envio Asociado</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvioAsociado()
	 * @generated
	 * @ordered
	 */
	protected Propiedad envioAsociado;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TareaEnvioContextoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return McpMMPackage.Literals.TAREA_ENVIO_CONTEXTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TareaRecepcionContexto getEnviaA() {
		if (enviaA != null && enviaA.eIsProxy()) {
			InternalEObject oldEnviaA = (InternalEObject)enviaA;
			enviaA = (TareaRecepcionContexto)eResolveProxy(oldEnviaA);
			if (enviaA != oldEnviaA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, McpMMPackage.TAREA_ENVIO_CONTEXTO__ENVIA_A, oldEnviaA, enviaA));
			}
		}
		return enviaA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TareaRecepcionContexto basicGetEnviaA() {
		return enviaA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnviaA(TareaRecepcionContexto newEnviaA) {
		TareaRecepcionContexto oldEnviaA = enviaA;
		enviaA = newEnviaA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McpMMPackage.TAREA_ENVIO_CONTEXTO__ENVIA_A, oldEnviaA, enviaA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Propiedad getEnvioAsociado() {
		if (envioAsociado != null && envioAsociado.eIsProxy()) {
			InternalEObject oldEnvioAsociado = (InternalEObject)envioAsociado;
			envioAsociado = (Propiedad)eResolveProxy(oldEnvioAsociado);
			if (envioAsociado != oldEnvioAsociado) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, McpMMPackage.TAREA_ENVIO_CONTEXTO__ENVIO_ASOCIADO, oldEnvioAsociado, envioAsociado));
			}
		}
		return envioAsociado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Propiedad basicGetEnvioAsociado() {
		return envioAsociado;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvioAsociado(Propiedad newEnvioAsociado) {
		Propiedad oldEnvioAsociado = envioAsociado;
		envioAsociado = newEnvioAsociado;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McpMMPackage.TAREA_ENVIO_CONTEXTO__ENVIO_ASOCIADO, oldEnvioAsociado, envioAsociado));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case McpMMPackage.TAREA_ENVIO_CONTEXTO__ENVIA_A:
				if (resolve) return getEnviaA();
				return basicGetEnviaA();
			case McpMMPackage.TAREA_ENVIO_CONTEXTO__ENVIO_ASOCIADO:
				if (resolve) return getEnvioAsociado();
				return basicGetEnvioAsociado();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case McpMMPackage.TAREA_ENVIO_CONTEXTO__ENVIA_A:
				setEnviaA((TareaRecepcionContexto)newValue);
				return;
			case McpMMPackage.TAREA_ENVIO_CONTEXTO__ENVIO_ASOCIADO:
				setEnvioAsociado((Propiedad)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case McpMMPackage.TAREA_ENVIO_CONTEXTO__ENVIA_A:
				setEnviaA((TareaRecepcionContexto)null);
				return;
			case McpMMPackage.TAREA_ENVIO_CONTEXTO__ENVIO_ASOCIADO:
				setEnvioAsociado((Propiedad)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case McpMMPackage.TAREA_ENVIO_CONTEXTO__ENVIA_A:
				return enviaA != null;
			case McpMMPackage.TAREA_ENVIO_CONTEXTO__ENVIO_ASOCIADO:
				return envioAsociado != null;
		}
		return super.eIsSet(featureID);
	}

} //TareaEnvioContextoImpl
