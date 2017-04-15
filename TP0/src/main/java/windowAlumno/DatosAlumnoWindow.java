package windowAlumno;

import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.MainWindow;

import dominio.Alumno;

public class DatosAlumnoWindow extends MainWindow<DatosAlumno> {

	public DatosAlumnoWindow() {
		super(new DatosAlumno());
	}

	public void createContents(Panel mainPanel) {
		this.setTitle("Datos del Alumno");
		mainPanel.setLayout(new VerticalLayout());

		new Label(mainPanel).setText("Nombre:");
		new Label(mainPanel).setText(Alumno.getInstance().getNombre());
		new Label(mainPanel).setText("Apellido:");
		new Label(mainPanel).setText(Alumno.getInstance().getApellido());
		new Label(mainPanel).setText("Legajo:");
		new Label(mainPanel).setText(String.valueOf((Alumno.getInstance().getLegajo())));
		new Label(mainPanel).setText("Usuario de Git:");
		new Label(mainPanel).setText(Alumno.getInstance().getUserGit());

		new Button(mainPanel).setCaption("Cerrar").onClick(() -> this.close());

	}
}
