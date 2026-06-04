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
 * An implementation of the model object '<em><b>Tarea Recepcion Contexto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link McpMM.impl.TareaRecepcionContextoImpl#getRecibeDe <em>Recibe De</em>}</li>
 *   <li>{@link McpMM.impl.TareaRecepcionContextoImpl#getRecepcionAsociada <em>Recepcion Asociada</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TareaRecepcionContextoImpl extends TareaEjecutableImpl implements TareaRecepcionContexto {
	/**
	 * The cached value of the '{@link #getRecibeDe() <em>Recibe De</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecibeDe()
	 * @generated
	 * @ordered
	 */
	protected TareaEnvioContexto recibeDe;
	/**
	 * The cached value of the '{@link #getRecepcionAsociada() <em>Recepcion Asociada</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecepcionAsociada()
	 * @generated
	 * @ordered
	 */
	protected Propiedad recepcionAsociada;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TareaRecepcionContextoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return McpMMPackage.Literals.TAREA_RECEPCION_CONTEXTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TareaEnvioContexto getRecibeDe() {
		if (recibeDe != null && recibeDe.eIsProxy()) {
			InternalEObject oldRecibeDe = (InternalEObject)recibeDe;
			recibeDe = (TareaEnvioContexto)eResolveProxy(oldRecibeDe);
			if (recibeDe != oldRecibeDe) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, McpMMPackage.TAREA_RECEPCION_CONTEXTO__RECIBE_DE, oldRecibeDe, recibeDe));
			}
		}
		return recibeDe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TareaEnvioContexto basicGetRecibeDe() {
		return recibeDe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecibeDe(TareaEnvioContexto newRecibeDe) {
		TareaEnvioContexto oldRecibeDe = recibeDe;
		recibeDe = newRecibeDe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McpMMPackage.TAREA_RECEPCION_CONTEXTO__RECIBE_DE, oldRecibeDe, recibeDe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Propiedad getRecepcionAsociada() {
		if (recepcionAsociada != null && recepcionAsociada.eIsProxy()) {
			InternalEObject oldRecepcionAsociada = (InternalEObject)recepcionAsociada;
			recepcionAsociada = (Propiedad)eResolveProxy(oldRecepcionAsociada);
			if (recepcionAsociada != oldRecepcionAsociada) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, McpMMPackage.TAREA_RECEPCION_CONTEXTO__RECEPCION_ASOCIADA, oldRecepcionAsociada, recepcionAsociada));
			}
		}
		return recepcionAsociada;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Propiedad basicGetRecepcionAsociada() {
		return recepcionAsociada;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecepcionAsociada(Propiedad newRecepcionAsociada) {
		Propiedad oldRecepcionAsociada = recepcionAsociada;
		recepcionAsociada = newRecepcionAsociada;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McpMMPackage.TAREA_RECEPCION_CONTEXTO__RECEPCION_ASOCIADA, oldRecepcionAsociada, recepcionAsociada));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case McpMMPackage.TAREA_RECEPCION_CONTEXTO__RECIBE_DE:
				if (resolve) return getRecibeDe();
				return basicGetRecibeDe();
			case McpMMPackage.TAREA_RECEPCION_CONTEXTO__RECEPCION_ASOCIADA:
				if (resolve) return getRecepcionAsociada();
				return basicGetRecepcionAsociada();
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
			case McpMMPackage.TAREA_RECEPCION_CONTEXTO__RECIBE_DE:
				setRecibeDe((TareaEnvioContexto)newValue);
				return;
			case McpMMPackage.TAREA_RECEPCION_CONTEXTO__RECEPCION_ASOCIADA:
				setRecepcionAsociada((Propiedad)newValue);
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
			case McpMMPackage.TAREA_RECEPCION_CONTEXTO__RECIBE_DE:
				setRecibeDe((TareaEnvioContexto)null);
				return;
			case McpMMPackage.TAREA_RECEPCION_CONTEXTO__RECEPCION_ASOCIADA:
				setRecepcionAsociada((Propiedad)null);
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
			case McpMMPackage.TAREA_RECEPCION_CONTEXTO__RECIBE_DE:
				return recibeDe != null;
			case McpMMPackage.TAREA_RECEPCION_CONTEXTO__RECEPCION_ASOCIADA:
				return recepcionAsociada != null;
		}
		return super.eIsSet(featureID);
	}

} //TareaRecepcionContextoImpl
