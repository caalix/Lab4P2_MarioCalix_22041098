package Lab4P2_MarioCalix_22041098;

public class Armas {
    private String nombre;
    private int dano;

    public Armas() {
    }

    public Armas(String nombre, int dano) {
        this.nombre = nombre;
        this.dano = dano;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    @Override
    public String toString() {
        return "Armas{" +
                "nombre='" + nombre + '\'' +
                ", dano=" + dano +
                '}';
    }


}
