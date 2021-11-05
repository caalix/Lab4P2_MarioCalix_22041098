package Lab4P2_MarioCalix_22041098;

import java.util.Date;

public class capitan extends Soldados{
    private String arma="Lanzallamas";
    private int dano=110;

    public capitan() {
        super();
    }

    public capitan(String nombre, String rango, int edad, int vida, Date tiempoEjer, String arma, int dano) {
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
        return "capitan{" +
                "arma='" + arma + '\'' +
                ", dano=" + dano +
                '}';
    }
}
