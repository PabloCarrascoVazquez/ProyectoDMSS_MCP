/*
 * 
 */
package McpMM.diagram.providers;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = McpMM.diagram.part.McpMMDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			McpMM.diagram.part.McpMMDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
