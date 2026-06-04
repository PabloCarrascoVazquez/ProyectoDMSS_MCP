/*
 * 
 */
package McpMM.diagram.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * @generated
 */
public class McpMMCreationWizard extends Wizard implements INewWizard {

	/**
	* @generated
	*/
	private IWorkbench workbench;

	/**
	* @generated
	*/
	protected IStructuredSelection selection;

	/**
	* @generated
	*/
	protected McpMM.diagram.part.McpMMCreationWizardPage diagramModelFilePage;

	/**
	* @generated
	*/
	protected McpMM.diagram.part.McpMMCreationWizardPage domainModelFilePage;

	/**
	* @generated
	*/
	protected Resource diagram;

	/**
	* @generated
	*/
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	* @generated
	*/
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	* @generated
	*/
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	* @generated
	*/
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	* @generated
	*/
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	* @generated
	*/
	public void setOpenNewlyCreatedDiagramEditor(boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	* @generated
	*/
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(McpMM.diagram.part.Messages.McpMMCreationWizardTitle);
		setDefaultPageImageDescriptor(McpMM.diagram.part.McpMMDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewMcpMMWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	* @generated
	*/
	public void addPages() {
		diagramModelFilePage = new McpMM.diagram.part.McpMMCreationWizardPage("DiagramModelFile", getSelection(), //$NON-NLS-1$
				"mcpmm_diagram"); //$NON-NLS-1$
		diagramModelFilePage.setTitle(McpMM.diagram.part.Messages.McpMMCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage
				.setDescription(McpMM.diagram.part.Messages.McpMMCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new McpMM.diagram.part.McpMMCreationWizardPage("DomainModelFile", getSelection(), //$NON-NLS-1$
				"mcpmm") { //$NON-NLS-1$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length() - ".mcpmm_diagram".length()); //$NON-NLS-1$
					setFileName(McpMM.diagram.part.McpMMDiagramEditorUtil.getUniqueFileName(getContainerFullPath(),
							fileName, "mcpmm")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage.setTitle(McpMM.diagram.part.Messages.McpMMCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage
				.setDescription(McpMM.diagram.part.Messages.McpMMCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	* @generated
	*/
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor) throws CoreException, InterruptedException {
				diagram = McpMM.diagram.part.McpMMDiagramEditorUtil.createDiagram(diagramModelFilePage.getURI(),
						domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						McpMM.diagram.part.McpMMDiagramEditorUtil.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog.openError(getContainer().getShell(),
								McpMM.diagram.part.Messages.McpMMCreationWizardOpenEditorError, null, e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog.openError(getContainer().getShell(),
						McpMM.diagram.part.Messages.McpMMCreationWizardCreationError, null,
						((CoreException) e.getTargetException()).getStatus());
			} else {
				McpMM.diagram.part.McpMMDiagramEditorPlugin.getInstance().logError("Error creating diagram", //$NON-NLS-1$
						e.getTargetException());
			}
			return false;
		}
		return diagram != null;
	}
}
