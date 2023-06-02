import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class MyScene extends Scene{
	private BeginPane beginpane;
	private MenuBar mb;
	private RootPane rootpane;

	public MyScene() {
		super(new Pane());
		this.rootpane = new RootPane();
		beginpane = new BeginPane();
		showMenu();
		setRoot(new VBox(mb, beginpane));

	}

	public void showMenu() {
		mb = new MenuBar();
		Menu menu = new Menu("Friend Chooser");
		mb.getMenus().add(menu);
		MenuItem mi1 = new MenuItem("?");

		MenuItem mi2 = new MenuItem("?");

		MenuItem mi3 = new MenuItem("?");

		MenuItem mi4 = new MenuItem("?");

		menu.getItems().addAll(mi1, mi2, mi3, mi4);
		rootpane.getChildren().add(mb);

	}

}
