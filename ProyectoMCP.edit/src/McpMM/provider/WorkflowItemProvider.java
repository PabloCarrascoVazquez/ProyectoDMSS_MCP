/**
 */
package McpMM.provider;


import McpMM.McpMMFactory;
import McpMM.McpMMPackage;
import McpMM.Workflow;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link McpMM.Workflow} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WorkflowItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNombreWorkflowPropertyDescriptor(object);
			addEmpiezaConPropertyDescriptor(object);
			addFinalizaConPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Nombre Workflow feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNombreWorkflowPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Workflow_nombreWorkflow_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Workflow_nombreWorkflow_feature", "_UI_Workflow_type"),
				 McpMMPackage.Literals.WORKFLOW__NOMBRE_WORKFLOW,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Empieza Con feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEmpiezaConPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Workflow_empiezaCon_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Workflow_empiezaCon_feature", "_UI_Workflow_type"),
				 McpMMPackage.Literals.WORKFLOW__EMPIEZA_CON,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Finaliza Con feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFinalizaConPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Workflow_finalizaCon_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Workflow_finalizaCon_feature", "_UI_Workflow_type"),
				 McpMMPackage.Literals.WORKFLOW__FINALIZA_CON,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(McpMMPackage.Literals.WORKFLOW__CONTEXTO);
			childrenFeatures.add(McpMMPackage.Literals.WORKFLOW__TAREA);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Workflow.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Workflow"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Workflow)object).getNombreWorkflow();
		return label == null || label.length() == 0 ?
			getString("_UI_Workflow_type") :
			getString("_UI_Workflow_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Workflow.class)) {
			case McpMMPackage.WORKFLOW__NOMBRE_WORKFLOW:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case McpMMPackage.WORKFLOW__CONTEXTO:
			case McpMMPackage.WORKFLOW__TAREA:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(McpMMPackage.Literals.WORKFLOW__CONTEXTO,
				 McpMMFactory.eINSTANCE.createContexto()));

		newChildDescriptors.add
			(createChildParameter
				(McpMMPackage.Literals.WORKFLOW__TAREA,
				 McpMMFactory.eINSTANCE.createTareaFinal()));

		newChildDescriptors.add
			(createChildParameter
				(McpMMPackage.Literals.WORKFLOW__TAREA,
				 McpMMFactory.eINSTANCE.createTareaInicial()));

		newChildDescriptors.add
			(createChildParameter
				(McpMMPackage.Literals.WORKFLOW__TAREA,
				 McpMMFactory.eINSTANCE.createTareaTransformacionDatos()));

		newChildDescriptors.add
			(createChildParameter
				(McpMMPackage.Literals.WORKFLOW__TAREA,
				 McpMMFactory.eINSTANCE.createTareaLLM()));

		newChildDescriptors.add
			(createChildParameter
				(McpMMPackage.Literals.WORKFLOW__TAREA,
				 McpMMFactory.eINSTANCE.createTareaUsuario()));

		newChildDescriptors.add
			(createChildParameter
				(McpMMPackage.Literals.WORKFLOW__TAREA,
				 McpMMFactory.eINSTANCE.createTareaAnalisis()));

		newChildDescriptors.add
			(createChildParameter
				(McpMMPackage.Literals.WORKFLOW__TAREA,
				 McpMMFactory.eINSTANCE.createTareaEnvioContexto()));

		newChildDescriptors.add
			(createChildParameter
				(McpMMPackage.Literals.WORKFLOW__TAREA,
				 McpMMFactory.eINSTANCE.createTareaRecepcionContexto()));

		newChildDescriptors.add
			(createChildParameter
				(McpMMPackage.Literals.WORKFLOW__TAREA,
				 McpMMFactory.eINSTANCE.createTareaServerMCP()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return McpMMEditPlugin.INSTANCE;
	}

}
