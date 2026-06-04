/*
 * 
 */
package McpMM.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	* @generated
	*/
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		McpMM.diagram.preferences.DiagramGeneralPreferencePage.initDefaults(store);
		McpMM.diagram.preferences.DiagramAppearancePreferencePage.initDefaults(store);
		McpMM.diagram.preferences.DiagramConnectionsPreferencePage.initDefaults(store);
		McpMM.diagram.preferences.DiagramPrintingPreferencePage.initDefaults(store);
		McpMM.diagram.preferences.DiagramRulersAndGridPreferencePage.initDefaults(store);

	}

	/**
	* @generated
	*/
	protected IPreferenceStore getPreferenceStore() {
		return McpMM.diagram.part.McpMMDiagramEditorPlugin.getInstance().getPreferenceStore();
	}
}
