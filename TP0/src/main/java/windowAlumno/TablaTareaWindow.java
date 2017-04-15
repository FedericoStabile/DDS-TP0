package windowAlumno;

import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.tables.Column;
import org.uqbar.arena.widgets.tables.Table;
import org.uqbar.arena.windows.MainWindow;

import dominio.Calificacion;

public class TablaTareaWindow extends MainWindow<TablaTarea> {

	public TablaTareaWindow() {
		super(new TablaTarea());
	}

	public void createContents(Panel mainPanel) {
		this.setTitle("Tabla de Tareas");
		mainPanel.setLayout(new VerticalLayout());

		Table<TablaTarea> table = new Table<TablaTarea>(mainPanel, TablaTarea.class);
		table.setHeight(200);
		table.setWidth(450);
		table.bindItemsToProperty("descripcion");
		table.bindValueToProperty("nota");

		new Column<TablaTarea>(table) //
				.setTitle("Descrpcion").setFixedSize(150).bindContentsToProperty("descripcion");

		new Column<TablaTarea>(table) //
				.setTitle("Nota").setFixedSize(150).bindContentsToProperty("nota");

	}

}
