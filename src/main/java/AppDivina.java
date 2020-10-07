


import java.util.Random;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;




public class AppDivina extends Application  {

	private Label saludoLabel;
	private Button saludarButton;
	private TextField nombreText;
	private int  Adiviname; 
	private int  Contador=1 ; 



	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		nombreText = new TextField();
		nombreText.setPrefColumnCount(5);
		nombreText.setMaxWidth(150);
		
		
		saludoLabel = new Label();
		saludoLabel.setText("Introduce un numero del 1 al 100");
		saludoLabel.setTranslateY(-80);
		
		
		saludarButton = new Button();
		saludarButton.setText("Comprobar");
		saludarButton.setOnAction(e -> onSaludarButtonAction(e));
		saludarButton.setDefaultButton(true);
	
		VBox root = new VBox();
		root.setSpacing(5);
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(nombreText, saludarButton, saludoLabel);

		  Scene escena = new Scene(root, 320, 200);
		
		primaryStage.setScene(escena);
		primaryStage.setTitle("Adina Numeros");
		primaryStage.show();
	}

	private void onSaludarButtonAction(ActionEvent e) {
		
		try {
			
		int numero = Integer.parseInt(nombreText.getText());
				
		
		
	    	if (Contador==1) {     
	    	Random aleatorio = new Random(); 
	      Adiviname = aleatorio.nextInt(101); 
	    	}
		
		if(numero!=Adiviname) {
		
			
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("AdivinApp");
			alert.setHeaderText("Has fallado");
			if(numero>Adiviname) {
			alert.setContentText("El numero es mas pequeño que " +numero);
			alert.showAndWait();
			}
			else {
				alert.setContentText("El numero es mas mayor que " +numero);
				alert.showAndWait();
			}
			Contador++;

			
			
		}
		
		if(numero==Adiviname){
			Alert alert2 = new Alert(AlertType.INFORMATION);
			alert2.setTitle("AdivinApp");
			alert2.setHeaderText("HAS ACERTADO CRACK");
			alert2.setContentText("Este es tu intento " +Contador);
			alert2.showAndWait();
			Contador++;
			
			
		}
		
		}
		catch(Exception err) {
			Alert alert3 = new Alert(AlertType.ERROR);
			alert3.setTitle("AdivinApp");
			alert3.setHeaderText("ERROR");
			alert3.setContentText("No pongas letras campeon");
			alert3.showAndWait();
		}
		
		
		
	}

	public static void main(String[] args) {
		launch(args);
	}
	
	
}
