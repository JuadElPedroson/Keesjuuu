import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class BeginPane extends BorderPane{
	
	private Text txt1;
	private Image image;
	private ImageView imageview;

	public BeginPane() {
		image = new Image(getClass().getResourceAsStream("/images/theRock.jpg"));
		imageview = new ImageView(image);
		setBackground(new Background(new BackgroundFill(Color.LIGHTCORAL, null, null)));
		setPrefSize(500, 500);
		txt1 = new Text("Hallo allemaal, \r Zijn jullie klaar voor keesje en zijn vrienden?!?");
		txt1.setFill(Color.WHITE);
		txt1.setFont(new Font(50));
		setAlignment(imageview, Pos.CENTER);
		this.setBottom(imageview);

		setTop(txt1);

	}

}
