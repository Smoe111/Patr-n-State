package model;
import javafx.scene.paint.Color;

public class BlackState implements State {

    @Override
    public void administrar(EstadoPersonalizado personalizado) {
        personalizado.getCirculo().setFill(Color.BLACK);
    }
}
