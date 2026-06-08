
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
		paletteContainer.add(createLectura4CreationTool());
		paletteContainer.add(createOperacionMCP5CreationTool());
		paletteContainer.add(createPropiedad6CreationTool());
		paletteContainer.add(createServerMCP7CreationTool());
		paletteContainer.add(createTareaAnalisis8CreationTool());
		paletteContainer.add(createTareaEnvioContexto9CreationTool());
		paletteContainer.add(createTareaFinal10CreationTool());
		paletteContainer.add(createTareaInicial11CreationTool());
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
		paletteContainer.add(createEmpiezaCon2CreationTool());
		paletteContainer.add(createFinalizaCon3CreationTool());
		paletteContainer.add(createRealiza4CreationTool());
		paletteContainer.add(createSigue5CreationTool());
		paletteContainer.add(createSigueElse6CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createAgente1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(McpMM.diagram.part.Messages.Agente1CreationTool_title,
				McpMM.diagram.part.Messages.Agente1CreationTool_desc,
				Collections.singletonList(McpMM.diagram.providers.McpMMElementTypes.Agente_2002));
		entry.setId("createAgente1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(McpMM.diagram.providers.McpMMElementTypes
				.getImageDescriptor(McpMM.diagram.providers.McpMMElementTypes.Agente_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createContexto2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(McpMM.diagram.part.Messages.Contexto2CreationTool_title,
				McpMM.diagram.part.Messages.Contexto2CreationTool_desc,
				Collections.singletonList(McpMM.diagram.providers.McpMMElementTypes.Contexto_3013));
		entry.setId("createContexto2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(McpMM.diagram.providers.McpMMElementTypes
				.getImageDescriptor(McpMM.diagram.providers.McpMMElementTypes.Contexto_3013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEscritura3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(McpMM.diagram.part.Messages.Escritura3CreationTool_title,
				McpMM.diagram.part.Messages.Escritura3CreationTool_desc,
				Collections.singletonList(McpMM.diagram.providers.McpMMElementTypes.Escritura_3003));
		entry.setId("createEscritura3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(McpMM.diagram.providers.McpMMElementTypes
				.getImageDescriptor(McpMM.diagram.providers.McpMMElementTypes.Escritura_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLectura4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(McpMM.diagram.part.Messages.Lectura4CreationTool_title,
				McpMM.diagram.part.Messages.Lectura4CreationTool_desc,
				Collections.singletonList(McpMM.diagram.providers.McpMMElementTypes.Lectura_3004));
		entry.setId("createLectura4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(McpMM.diagram.providers.McpMMElementTypes
				.getImageDescriptor(McpMM.diagram.providers.McpMMElementTypes.Lectura_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createOperacionMCP5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				McpMM.diagram.part.Messages.OperacionMCP5CreationTool_title,
				McpMM.diagram.part.Messages.OperacionMCP5CreationTool_desc,
				Collections.singletonList(McpMM.diagram.providers.McpMMElementTypes.OperacionMCP_3001));
		entry.setId("createOperacionMCP5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(McpMM.diagram.providers.McpMMElementTypes
				.getImageDescriptor(McpMM.diagram.providers.McpMMElementTypes.OperacionMCP_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPropiedad6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(McpMM.diagram.part.Messages.Propiedad6CreationTool_title,
				McpMM.diagram.part.Messages.Propiedad6CreationTool_desc,
				Collections.singletonList(McpMM.diagram.providers.McpMMElementTypes.Propiedad_3014));
		entry.setId("createPropiedad6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(McpMM.diagram.providers.McpMMElementTypes
				.getImageDescriptor(McpMM.diagram.providers.McpMMElementTypes.Propiedad_3014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createServerMCP7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(McpMM.diagram.part.Messages.ServerMCP7CreationTool_title,
				McpMM.diagram.part.Messages.ServerMCP7CreationTool_desc,
				Collections.singletonList(McpMM.diagram.providers.McpMMElementTypes.ServerMCP_2001));
		entry.setId("createServerMCP7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(McpMM.diagram.providers.McpMMElementTypes
				.getImageDescriptor(McpMM.diagram.providers.McpMMElementTypes.ServerMCP_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTareaAnalisis8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				McpMM.diagram.part.Messages.TareaAnalisis8CreationTool_title,
				McpMM.diagram.part.Messages.TareaAnalisis8CreationTool_desc,
				Collections.singletonList(McpMM.diagram.providers.McpMMElementTypes.TareaAnalisis_3007));
		entry.setId("createTareaAnalisis8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(McpMM.diagram.providers.McpMMElementTypes
				.getImageDescriptor(McpMM.diagram.providers.McpMMElementTypes.TareaAnalisis_3007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTareaEnvioContexto9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				McpMM.diagram.part.Messages.TareaEnvioContexto9CreationTool_title,
				McpMM.diagram.part.Messages.TareaEnvioContexto9CreationTool_desc,
				Collections.singletonList(McpMM.diagram.providers.McpMMElementTypes.TareaEnvioContexto_3008));
		entry.setId("createTareaEnvioContexto9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(McpMM.diagram.providers.McpMMElementTypes
				.getImageDescriptor(McpMM.diagram.providers.McpMMElementTypes.TareaEnvioContexto_3008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTareaFinal10CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				McpMM.diagram.part.Messages.TareaFinal10CreationTool_title,
				McpMM.diagram.part.Messages.TareaFinal10CreationTool_desc,
				Collections.singletonList(McpMM.diagram.providers.McpMMElementTypes.TareaFinal_3011));
		entry.setId("createTareaFinal10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(McpMM.diagram.providers.McpMMElementTypes
				.getImageDescriptor(McpMM.diagram.providers.McpMMElementTypes.TareaFinal_3011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTareaInicial11CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				McpMM.diagram.part.Messages.TareaInicial11CreationTool_title,
				McpMM.diagram.part.Messages.TareaInicial11CreationTool_desc,
				Collections.singletonList(McpMM.diagram.providers.McpMMElementTypes.TareaInicial_3012));
		entry.setId("createTareaInicial11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(McpMM.diagram.providers.McpMMElementTypes
				.getImageDescriptor(McpMM.diagram.providers.McpMMElementTypes.TareaInicial_3012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTareaLLM12CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(McpMM.diagram.part.Messages.TareaLLM12CreationTool_title,
				McpMM.diagram.part.Messages.TareaLLM12CreationTool_desc,
				Collections.singletonList(McpMM.diagram.providers.McpMMElementTypes.TareaLLM_3005));
		entry.setId("createTareaLLM12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(McpMM.diagram.providers.McpMMElementTypes
				.getImageDescriptor(McpMM.diagram.providers.McpMMElementTypes.TareaLLM_3005));
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
				Collections.singletonList(McpMM.diagram.providers.McpMMElementTypes.TareaRecepcionContexto_3009));
		entry.setId("createTareaRecepcionContexto13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(McpMM.diagram.providers.McpMMElementTypes
				.getImageDescriptor(McpMM.diagram.providers.McpMMElementTypes.TareaRecepcionContexto_3009));
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
				Collections.singletonList(McpMM.diagram.providers.McpMMElementTypes.TareaServerMCP_3010));
		entry.setId("createTareaServerMCP14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(McpMM.diagram.providers.McpMMElementTypes
				.getImageDescriptor(McpMM.diagram.providers.McpMMElementTypes.TareaServerMCP_3010));
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
				Collections.singletonList(McpMM.diagram.providers.McpMMElementTypes.TareaTransformacionDatos_3002));
		entry.setId("createTareaTransformacionDatos15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(McpMM.diagram.providers.McpMMElementTypes
				.getImageDescriptor(McpMM.diagram.providers.McpMMElementTypes.TareaTransformacionDatos_3002));
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
				Collections.singletonList(McpMM.diagram.providers.McpMMElementTypes.TareaUsuario_3006));
		entry.setId("createTareaUsuario16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(McpMM.diagram.providers.McpMMElementTypes
				.getImageDescriptor(McpMM.diagram.providers.McpMMElementTypes.TareaUsuario_3006));
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
						.singletonList(McpMM.diagram.providers.McpMMElementTypes.TareaServerMCPEjecutaOperacion_4008));
		entry.setId("createEjecutaOperacion1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(McpMM.diagram.providers.McpMMElementTypes
				.getImageDescriptor(McpMM.diagram.providers.McpMMElementTypes.TareaServerMCPEjecutaOperacion_4008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEmpiezaCon2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(McpMM.diagram.part.Messages.EmpiezaCon2CreationTool_title,
				McpMM.diagram.part.Messages.EmpiezaCon2CreationTool_desc,
				Collections.singletonList(McpMM.diagram.providers.McpMMElementTypes.WorkflowEmpiezaCon_4002));
		entry.setId("createEmpiezaCon2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(McpMM.diagram.providers.McpMMElementTypes
				.getImageDescriptor(McpMM.diagram.providers.McpMMElementTypes.WorkflowEmpiezaCon_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFinalizaCon3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				McpMM.diagram.part.Messages.FinalizaCon3CreationTool_title,
				McpMM.diagram.part.Messages.FinalizaCon3CreationTool_desc,
				Collections.singletonList(McpMM.diagram.providers.McpMMElementTypes.WorkflowFinalizaCon_4003));
		entry.setId("createFinalizaCon3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(McpMM.diagram.providers.McpMMElementTypes
				.getImageDescriptor(McpMM.diagram.providers.McpMMElementTypes.WorkflowFinalizaCon_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRealiza4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(McpMM.diagram.part.Messages.Realiza4CreationTool_title,
				McpMM.diagram.part.Messages.Realiza4CreationTool_desc,
				Collections.singletonList(McpMM.diagram.providers.McpMMElementTypes.AgenteRealiza_4001));
		entry.setId("createRealiza4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(McpMM.diagram.providers.McpMMElementTypes
				.getImageDescriptor(McpMM.diagram.providers.McpMMElementTypes.AgenteRealiza_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSigue5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(McpMM.diagram.part.Messages.Sigue5CreationTool_title,
				McpMM.diagram.part.Messages.Sigue5CreationTool_desc,
				Collections.singletonList(McpMM.diagram.providers.McpMMElementTypes.TareaSigue_4004));
		entry.setId("createSigue5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(McpMM.diagram.providers.McpMMElementTypes
				.getImageDescriptor(McpMM.diagram.providers.McpMMElementTypes.TareaSigue_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSigueElse6CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(McpMM.diagram.part.Messages.SigueElse6CreationTool_title,
				McpMM.diagram.part.Messages.SigueElse6CreationTool_desc,
				Collections.singletonList(McpMM.diagram.providers.McpMMElementTypes.TareaAnalisisSigueElse_4007));
		entry.setId("createSigueElse6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(McpMM.diagram.providers.McpMMElementTypes
				.getImageDescriptor(McpMM.diagram.providers.McpMMElementTypes.TareaAnalisisSigueElse_4007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
