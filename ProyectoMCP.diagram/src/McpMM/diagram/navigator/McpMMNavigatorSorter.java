/*
* 
*/
package McpMM.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class McpMMNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 7016;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 7015;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof McpMM.diagram.navigator.McpMMNavigatorItem) {
			McpMM.diagram.navigator.McpMMNavigatorItem item = (McpMM.diagram.navigator.McpMMNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return McpMM.diagram.part.McpMMVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
