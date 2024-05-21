package controller;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.shape.Circle;
import model.BlackState;
import model.EstadoPersonalizado;
import model.RedState;
import model.WhiteState;

public class stateController {

    @FXML
    private Circle circulo;
    @FXML
    private ChoiceBox<String> colorCirculo;
    private EstadoPersonalizado personalizado;

    @FXML
    public void initialize() {
        personalizado = new EstadoPersonalizado(circulo);
        colorCirculo.getItems().addAll("Rojo", "Blanco", "Negro");
        colorCirculo.setValue("Blanco");
        colorCirculo.setOnAction(event -> seleccionarColor());
    }

    @FXML
    public void seleccionarColor() {
        String color = colorCirculo.getValue();
        switch (color) {
            case "Blanco":
                personalizado.setWhiteState();
                break;
            case "Negro":
                personalizado.setBlackState();
                break;
            case "Rojo":
                personalizado.setRedState();
                break;
        }
    }
}
