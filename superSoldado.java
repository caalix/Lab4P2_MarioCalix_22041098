package Lab4P2_MarioCalix_22041098;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;

public class superSoldado extends Soldados{
    private String[] arma={"Arma Blanca","Bomba","Escopeta","Lanzallamas"};
    private int[] dano={50,150,140,110};

    public superSoldado() {
        super();
    }

    public superSoldado(String nombre, String rango, int edad, int vida, Date tiempoEjer, String[] arma, int[] dano) {
        super(nombre, rango, edad, vida, tiempoEjer);
        this.arma = arma;
        this.dano = dano;
    }

    @Override
    public void setVida(int vida) {
        super.setVida(1000);
    }

    public String[] getArma() {
        return arma;
    }

    public void setArma(String[] arma) {
        this.arma = arma;
    }

    public int[] getDano() {
        return dano;
    }

    public void setDano(int[] dano) {
        this.dano = dano;
    }

    @Override
    public String toString() {
        return "superSoldado{" +
                "arma=" + Arrays.toString(arma) +
                ", dano=" + Arrays.toString(dano) +
                '}';
    }
}
