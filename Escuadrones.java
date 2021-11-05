package Lab4P2_MarioCalix_22041098;

import Lab3P2_MarioCalix_22041098.Entrenador;
import Semana4.miExcepcion2;

import java.util.ArrayList;

public class Escuadrones {
    private String nombre;
    ArrayList<Zonas> listaZonas = new ArrayList();
    ArrayList<Soldados> listaSoldados = new ArrayList();

    public Escuadrones() {
    }

    public Escuadrones(String nombre, ArrayList<Zonas> listaZonas, ArrayList<Soldados> listaSoldados) {
        this.nombre = nombre;
        this.listaZonas = listaZonas;
        this.listaSoldados = listaSoldados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Zonas> getListaZonas() {
        return listaZonas;
    }

    public void setListaZonas(ArrayList<Zonas> listaZonas) {
        this.listaZonas = listaZonas;
    }

    public ArrayList<Soldados> getlistaSoldados() {
        return listaSoldados;
    }

    public void setlistaSoldados(ArrayList<Soldados> listaSoldados) {
        listaSoldados = listaSoldados;
    }

    @Override
    public String toString() {
        return "Escuadrones{" +
                "nombre='" + nombre + '\'' +
                ", listaZonas=" + listaZonas +
                ", listaSoldados=" + listaSoldados +
                '}';
    }
}
