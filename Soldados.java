package Lab4P2_MarioCalix_22041098;

import java.util.Date;

public class Soldados {
    private String nombre, rango;
    private int edad, vida;
    private Date tiempoEjer;

    public Soldados() {
    }

    public Soldados(String nombre, String rango, int edad, int vida, Date tiempoEjer) {
        this.nombre = nombre;
        this.rango = rango;
        this.edad = edad;
        this.vida = vida;
        this.tiempoEjer = tiempoEjer;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Date getTiempoEjer() {
        return tiempoEjer;
    }

    public void setTiempoEjer(Date tiempoEjer) {
        this.tiempoEjer = tiempoEjer;
    }

    @Override
    public String toString() {
        return "Soldados{" +
                "nombre='" + nombre + '\'' +
                ", rango='" + rango + '\'' +
                ", edad=" + edad +
                ", vida=" + vida +
                ", tiempoEjer=" + tiempoEjer +
                '}';
    }
}
