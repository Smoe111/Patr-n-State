package model;

import javafx.scene.shape.Circle;

public class EstadoPersonalizado {

    private State state;
    private Circle circulo;

    public EstadoPersonalizado(Circle circulo) {
        this.circulo = circulo;
        this.state = new WhiteState();
    }

    public Circle getCirculo() {
        return circulo;
    }

    public void setState(State state) {
        this.state = state;
    }

    public  void seleccionar(){
        state.administrar(this);
    }
    public void setRedState() {
        setState(new RedState());
        seleccionar();
    }

    public void setWhiteState() {
        setState(new WhiteState());
        seleccionar();
    }

    public void setBlackState() {
        setState(new BlackState());
        seleccionar();
    }

}