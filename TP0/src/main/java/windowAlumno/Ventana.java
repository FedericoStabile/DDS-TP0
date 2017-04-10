package windowAlumno;

import java.awt.Color;

import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.MainWindow;

import dominio.Alumno;

@SuppressWarnings("serial")
public class Ventana extends MainWindow<Alumno> {
	
	public Ventana() {
		super(new Alumno());
	}

	@Override
	public void createContents(Panel mainPanel) {
	    setTitle("Login");
	    mainPanel.setLayout(new VerticalLayout());

	    new Label(mainPanel).setText("Token");

	    new TextBox(mainPanel).bindValueToProperty("TOKEN");

	    new Button(mainPanel) //
	    .setCaption("Loguear") //
	    .onClick(() -> getModelObject().ingresar());

	    new Label(mainPanel) //
	    .setBackground(Color.YELLOW) //
	    .bindValueToProperty("TOKEN");

	  }

	public static void main(String[] args) {
	    new Ventana().startApplication();
	  }

}
