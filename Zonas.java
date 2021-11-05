package Lab4P2_MarioCalix_22041098;

import java.util.Date;

public class Zonas {
    private String nombre;
    private int tamano,coordX,coordY;

    public Zonas() {
        super();
    }

    public Zonas(String nombre, int tamano, int coordX, int coordY) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.coordX = coordX;
        this.coordY = coordY;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public int getCoordX() {
        return coordX;
    }

    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }

    public int getCoordY() {
        return coordY;
    }

    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }

    @Override
    public String toString() {
        return "Zonas{" +
                "nombre='" + nombre + '\'' +
                ", tamano=" + tamano +
                ", coordX=" + coordX +
                ", coordY=" + coordY +
                '}';
    }
}
