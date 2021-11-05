package Lab4P2_MarioCalix_22041098;

import java.util.Date;

public class pesada extends Soldados{
    private String arma="Bomba";
    private int dano=150;

    public pesada() {
        super();
    }

    public pesada(String nombre, String rango, int edad, int vida, Date tiempoEjer, String arma, int dano) {
        super(nombre, rango, edad, vida, tiempoEjer);
        this.arma = arma;
        this.dano = dano;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    @Override
    public String toString() {
        return "pesada{" +
                "arma='" + arma + '\'' +
                ", dano=" + dano +
                '}';
    }
}
