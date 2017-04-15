package windowAlumno;

import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.MainWindow;

@SuppressWarnings("serial")
public class AccionesWindow extends MainWindow<Acciones> {

	public AccionesWindow() {
		super(new Acciones());
	}

	public void createContents(Panel mainPanel) {
		this.setTitle("Acciones");
		mainPanel.setLayout(new VerticalLayout());

		new Label(mainPanel).setText("Por favor seleccione la acción a realizar:");

		new Button(mainPanel).setCaption("Actualizar Datos").onClick(() -> this.getModelObject().actualizarDatos());

		new Button(mainPanel).setCaption("Ver Datos").onClick(() -> this.getModelObject().verDatos());

		new Button(mainPanel).setCaption("Ver Tareas").onClick(() -> this.getModelObject().verTareas());

		new Button(mainPanel).setCaption("Cancelar").onClick(() -> this.close());

	}

}
