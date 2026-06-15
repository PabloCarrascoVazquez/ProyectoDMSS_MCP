
/*
 * 
 */
package McpMM.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class McpMMPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(McpMM.diagram.part.Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createAgente1CreationTool());
		paletteContainer.add(createContexto2CreationTool());
		paletteContainer.add(createEscritura3CreationTool());
		paletteContainer.add(createFinal4CreationTool());
		paletteContainer.add(createInicio5CreationTool());
		paletteContainer.add(createLectura6CreationTool());
		paletteContainer.add(createOperacionMCP7CreationTool());
		paletteContainer.add(createPropiedad8CreationTool());
		paletteContainer.add(createServerMCP9CreationTool());
		paletteContainer.add(createTareaAnalisis10CreationTool());
		paletteContainer.add(createTareaEnvioContexto11CreationTool());
		paletteContainer.add(createTareaLLM12CreationTool());
		paletteContainer.add(createTareaRecepcionContexto13CreationTool());
		paletteContainer.add(createTareaServerMCP14CreationTool());
		paletteContainer.add(createTareaTransformacionDatos15CreationTool());
		paletteContainer.add(createTareaUsuario16CreationTool());
		paletteContainer.add(createWorkflow17CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(McpMM.diagram.part.Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createEjecutaOperacion1CreationTool());
		paletteContainer.add(createSigue2CreationTool());
		paletteContainer.add(createSigueElse3CreationTool());
		paletteContainer.add(createTareas4CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createAgente1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(McpMM.diagram.part.Messages.Agente1CreationTool_title,
				McpMM.diagram.part.Messages.Agente1CreationTool_desc,
				Collections.singletonList(McpMM.diagram.providers.McpMMElementTypes.Agente_2001));
		entry.setId("createAgente1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(McpMM.diagram.providers.McpMMElementTypes
				.getImageDescriptor(McpMM.diagram.providers.McpMMElementTypes.Agente_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createContexto2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(McpMM.diagram.part.Messages.Contexto2CreationTool_title,
				McpMM.diagram.part.Messages.Contexto2CreationTool_desc,
				Collections.singletonList(McpMM.diagram.providers.McpMMElementTypes.Contexto_3001));
		entry.setId("createContexto2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(McpMM.diagram.providers.McpMMElementTypes
				.getImageDescriptor(McpMM.diagram.providers.McpMMElementTypes.Contexto_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEscritura3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(McpMM.diagram.part.Messages.Escritura3CreationTool_title,
				McpMM.diagram.part.Messages.Escritura3CreationTool_desc,
				Collections.singletonList(McpMM.diagram.providers.McpMMElementTypes.Escritura_3005));
		entry.setId("createEscritura3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(McpMM.diagram.providers.McpMMElementTypes
				.getImageDescriptor(McpMM.diagram.providers.McpMMElementTypes.Escritura_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFinal4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(McpMM.diagram.part.Messages.Final4CreationTool_title,
				McpMM.diagram.part.Messages.Final4CreationTool_desc,
				Collections.singletonList(McpMM.diagram.providers.McpMMElementTypes.Final_3014));
		entry.setId("createFinal4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(McpMM.diagram.providers.McpMMElementTypes
				.getImageDescriptor(McpMM.diagram.providers.McpMMElementTypes.Final_3014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInicio5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(McpMM.diagram.part.Messages.Inicio5CreationTool_title,
				McpMM.diagram.part.Messages.Inicio5CreationTool_desc,
				Collections.singletonList(McpMM.diagram.providers.McpMMElementTypes.Inicio_3013));
		entry.setId("createInicio5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(McpMM.diagram.providers.McpMMElementTypes
				.getImageDescriptor(McpMM.diagram.providers.McpMMElementTypes.Inicio_3013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLectura6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(McpMM.diagram.part.Messages.Lectura6CreationTool_title,
				McpMM.diagram.part.Messages.Lectura6CreationTool_desc,
				Collections.singletonList(McpMM.diagram.providers.McpMMElementTypes.Lectura_3006));
		entry.setId("createLectura6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(McpMM.diagram.providers.McpMMElementTypes
				.getImageDescriptor(McpMM.diagram.providers.McpMMElementTypes.Lectura_3006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createOperacionMCP7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				McpMM.diagram.part.Messages.OperacionMCP7CreationTool_title,
				McpMM.diagram.part.Messages.OperacionMCP7CreationTool_desc,
				Collections.singletonList(McpMM.diagram.providers.McpMMElementTypes.OperacionMCP_3003));
		entry.setId("createOperacionMCP7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(McpMM.diagram.providers.McpMMElementTypes
				.getImageDescriptor(McpMM.diagram.providers.McpMMElementTypes.OperacionMCP_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPropiedad8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(McpMM.diagram.part.Messages.Propiedad8CreationTool_title,
				McpMM.diagram.part.Messages.Propiedad8CreationTool_desc,
				Collections.singletonList(McpMM.diagram.providers.McpMMElementTypes.Propiedad_3002));
		entry.setId("createPropiedad8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(McpMM.diagram.providers.McpMMElementTypes
				.getImageDescriptor(McpMM.diagram.providers.McpMMElementTypes.Propiedad_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createServerMCP9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(McpMM.diagram.part.Messages.ServerMCP9CreationTool_title,
				McpMM.diagram.part.Messages.ServerMCP9CreationTool_desc,
				Collections.singletonList(McpMM.diagram.providers.McpMMElementTypes.ServerMCP_2002));
		entry.setId("createServerMCP9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(McpMM.diagram.providers.McpMMElementTypes
				.getImageDescriptor(McpMM.diagram.providers.McpMMElementTypes.ServerMCP_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTareaAnalisis10CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				McpMM.diagram.part.Messages.TareaAnalisis10CreationTool_title,
				McpMM.diagram.part.Messages.TareaAnalisis10CreationTool_desc,
				Collections.singletonList(McpMM.diagram.providers.McpMMElementTypes.TareaAnalisis_3009));
		entry.setId("createTareaAnalisis10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(McpMM.diagram.providers.McpMMElementTypes
				.getImageDescriptor(McpMM.diagram.providers.McpMMElementTypes.TareaAnalisis_3009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTareaEnvioContexto11CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				McpMM.diagram.part.Messages.TareaEnvioContexto11CreationTool_title,
				McpMM.diagram.part.Messages.TareaEnvioContexto11CreationTool_desc,
				Collections.singletonList(McpMM.diagram.providers.McpMMElementTypes.TareaEnvioContexto_3010));
		entry.setId("createTareaEnvioContexto11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(McpMM.diagram.providers.McpMMElementTypes
				.getImageDescriptor(McpMM.diagram.providers.McpMMElementTypes.TareaEnvioContexto_3010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTareaLLM12CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(McpMM.diagram.part.Messages.TareaLLM12CreationTool_title,
				McpMM.diagram.part.Messages.TareaLLM12CreationTool_desc,
				Collections.singletonList(McpMM.diagram.providers.McpMMElementTypes.TareaLLM_3007));
		entry.setId("createTareaLLM12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(McpMM.diagram.providers.McpMMElementTypes
				.getImageDescriptor(McpMM.diagram.providers.McpMMElementTypes.TareaLLM_3007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTareaRecepcionContexto13CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				McpMM.diagram.part.Messages.TareaRecepcionContexto13CreationTool_title,
				McpMM.diagram.part.Messages.TareaRecepcionContexto13CreationTool_desc,
				Collections.singletonList(McpMM.diagram.providers.McpMMElementTypes.TareaRecepcionContexto_3011));
		entry.setId("createTareaRecepcionContexto13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(McpMM.diagram.providers.McpMMElementTypes
				.getImageDescriptor(McpMM.diagram.providers.McpMMElementTypes.TareaRecepcionContexto_3011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTareaServerMCP14CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				McpMM.diagram.part.Messages.TareaServerMCP14CreationTool_title,
				McpMM.diagram.part.Messages.TareaServerMCP14CreationTool_desc,
				Collections.singletonList(McpMM.diagram.providers.McpMMElementTypes.TareaServerMCP_3012));
		entry.setId("createTareaServerMCP14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(McpMM.diagram.providers.McpMMElementTypes
				.getImageDescriptor(McpMM.diagram.providers.McpMMElementTypes.TareaServerMCP_3012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTareaTransformacionDatos15CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				McpMM.diagram.part.Messages.TareaTransformacionDatos15CreationTool_title,
				McpMM.diagram.part.Messages.TareaTransformacionDatos15CreationTool_desc,
				Collections.singletonList(McpMM.diagram.providers.McpMMElementTypes.TareaTransformacionDatos_3004));
		entry.setId("createTareaTransformacionDatos15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(McpMM.diagram.providers.McpMMElementTypes
				.getImageDescriptor(McpMM.diagram.providers.McpMMElementTypes.TareaTransformacionDatos_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTareaUsuario16CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				McpMM.diagram.part.Messages.TareaUsuario16CreationTool_title,
				McpMM.diagram.part.Messages.TareaUsuario16CreationTool_desc,
				Collections.singletonList(McpMM.diagram.providers.McpMMElementTypes.TareaUsuario_3008));
		entry.setId("createTareaUsuario16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(McpMM.diagram.providers.McpMMElementTypes
				.getImageDescriptor(McpMM.diagram.providers.McpMMElementTypes.TareaUsuario_3008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createWorkflow17CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(McpMM.diagram.part.Messages.Workflow17CreationTool_title,
				McpMM.diagram.part.Messages.Workflow17CreationTool_desc,
				Collections.singletonList(McpMM.diagram.providers.McpMMElementTypes.Workflow_2003));
		entry.setId("createWorkflow17CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(McpMM.diagram.providers.McpMMElementTypes
				.getImageDescriptor(McpMM.diagram.providers.McpMMElementTypes.Workflow_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEjecutaOperacion1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				McpMM.diagram.part.Messages.EjecutaOperacion1CreationTool_title,
				McpMM.diagram.part.Messages.EjecutaOperacion1CreationTool_desc, Collections
						.singletonList(McpMM.diagram.providers.McpMMElementTypes.TareaServerMCPEjecutaOperacion_4004));
		entry.setId("createEjecutaOperacion1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(McpMM.diagram.providers.McpMMElementTypes
				.getImageDescriptor(McpMM.diagram.providers.McpMMElementTypes.TareaServerMCPEjecutaOperacion_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSigue2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(McpMM.diagram.part.Messages.Sigue2CreationTool_title,
				McpMM.diagram.part.Messages.Sigue2CreationTool_desc,
				Collections.singletonList(McpMM.diagram.providers.McpMMElementTypes.TareaSigue_4002));
		entry.setId("createSigue2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(McpMM.diagram.providers.McpMMElementTypes
				.getImageDescriptor(McpMM.diagram.providers.McpMMElementTypes.TareaSigue_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSigueElse3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(McpMM.diagram.part.Messages.SigueElse3CreationTool_title,
				McpMM.diagram.part.Messages.SigueElse3CreationTool_desc,
				Collections.singletonList(McpMM.diagram.providers.McpMMElementTypes.TareaAnalisisSigueElse_4003));
		entry.setId("createSigueElse3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(McpMM.diagram.providers.McpMMElementTypes
				.getImageDescriptor(McpMM.diagram.providers.McpMMElementTypes.TareaAnalisisSigueElse_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTareas4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(McpMM.diagram.part.Messages.Tareas4CreationTool_title,
				McpMM.diagram.part.Messages.Tareas4CreationTool_desc,
				Collections.singletonList(McpMM.diagram.providers.McpMMElementTypes.AgenteTareas_4001));
		entry.setId("createTareas4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(McpMM.diagram.providers.McpMMElementTypes
				.getImageDescriptor(McpMM.diagram.providers.McpMMElementTypes.AgenteTareas_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
