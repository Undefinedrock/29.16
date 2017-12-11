import java.util.List;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;





public class DisplayDynamicMST extends Application{

private TextField txfiledVertexName= new TextField();
private TextField textFieldX= new TextField();



private TextField textFieldY= new TextField();


private Button buttonAddVertex= new Button("ADD VERTEX");





private TextField txtf_u= new TextField();
private TextField txtf_v=new TextField();
private TextField txweigh= new TextField();

private Button getButtonAddEdge= new Button("add edge");


private Button buttonstartover= new Button("Start Over (Clear Graphs)");


private Label labelStatus= new Label();
private WeightedGraph graph= new WeightedGraph<>();

private GraphView view= new GraphView(graph);
public void start(Stage primary_Stage){}





}
