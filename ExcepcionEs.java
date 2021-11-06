package Lab4P2_MarioCalix_22041098;

import java.awt.*;

public class ExcepcionEs extends Exception{
    private int tipo;

    public ExcepcionEs() {
    }

    public ExcepcionEs(String message, int tipo) {
        super(message);
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "ExcepcionEs{" +
                "tipo=" + tipo +
                "} " + super.toString();
    }
}
