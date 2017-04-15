package windowAlumno;

import org.json.simple.parser.ParseException;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.MainWindow;

@SuppressWarnings("serial")
public class LoginWindow extends MainWindow<Login> {

	public LoginWindow() {
		super(new Login());
	}

	@Override
	public void createContents(Panel mainPanel) {
		this.setTitle("Login");
		mainPanel.setLayout(new VerticalLayout());

		new Label(mainPanel).setText("Ingrese Token Alumno");

		new TextBox(mainPanel).bindValueToProperty("token");

		new Button(mainPanel).setCaption("Loguear").onClick(() -> {
			try {
				this.getModelObject().intentarLogueo();

				// Debería llamar a la siguiente pantalla si no salta ninguna
				// excepcion

			} catch (ParseException e) {
			}
		});

	}

	public static void main(String[] args) {
		new TablaTareaWindow().startApplication();

	}
}
