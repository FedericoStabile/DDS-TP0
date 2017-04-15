package windowAlumno;

import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.MainWindow;

@SuppressWarnings("serial")
public class ActualizarDatosWindow extends MainWindow<ActualizarDatos> {

	public ActualizarDatosWindow() {
		super(new ActualizarDatos());
	}

	@Override
	public void createContents(Panel mainPanel) {
		this.setTitle("Actualizar Datos");
		mainPanel.setLayout(new VerticalLayout());

		new Label(mainPanel).setText("Por favor ingrese los datos pedidos.");
		new Label(mainPanel).setText("Nombre:");
		new TextBox(mainPanel).bindValueToProperty("nombre");
		new Label(mainPanel).setText("Apellido:");
		new TextBox(mainPanel).bindValueToProperty("apellido");
		new Label(mainPanel).setText("Legajo:");
		new TextBox(mainPanel).bindValueToProperty("legajo");
		new Label(mainPanel).setText("Usuario de Git:");
		new TextBox(mainPanel).bindValueToProperty("userGit");

		new Button(mainPanel).setCaption("Cancelar").onClick(() -> this.close());
		new Button(mainPanel).setCaption("Actualizar").onClick(() -> this.getModelObject().actualizarInfo());

	}
}
