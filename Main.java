package Lab4P2_MarioCalix_22041098;

import Lab3P2_MarioCalix_22041098.Entrenador;
import Semana3.Dragon;
import Semana3.Perro;
import Tarea1.Vehiculo;

import javax.swing.*;
import java.awt.*;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList inventario = new ArrayList();
        ArrayList listaEscuadrones = new ArrayList();
        ArrayList Escuadron = new ArrayList();
        ArrayList <Soldados>listaSoldados = new ArrayList();
        ArrayList soldadosEscuadron = new ArrayList();
        int opcion = 0;
        while (opcion != 12) {
            opcion = Integer.parseInt(
                    JOptionPane.showInputDialog("1. Crear zona\n" +
                                                "2. Listar zonas\n" +
                                                "3. Crear escuadron\n" +
                                                "4. Listar escuadrones\n" +
                                                "5. Listar escuadron\n" +
                                                "6. Eliminar escuadron\n" +
                                                "7. Añadir soldado\n" +
                                                "8. Listar soldados\n" +
                                                "9. Listar soldados de escuadron por tipo\n" +
                                                "10. Eliminar soldados de escuadron\n" +
                                                "11. Pelear\n" +
                                                "12. Salir\n")
            );

            //CREAR ZONAS
            if(opcion == 1){
                String n;
                int cx,cy,t;
                n=JOptionPane.showInputDialog("Nombre");
                t=Integer.parseInt(JOptionPane.showInputDialog("Tamano (100-300)"));
                cx=Integer.parseInt(JOptionPane.showInputDialog("Coordenada X (0-100)"));
                cy=Integer.parseInt(JOptionPane.showInputDialog("Coordenada Y (0-100)"));

                inventario.add(new Zonas(n,t,cx,cy));
                JOptionPane.showMessageDialog(null, "Zona creada exitosamente.");
            }

            //LISTAR ZONAS
            if(opcion == 2){
                String salida="";
                for (Object o: inventario) {
                    if (o instanceof Zonas) {
                        salida += inventario.indexOf(o) + "- " + o + "\n";
                    }
                }
                JOptionPane.showMessageDialog(null, salida);
            }

            //CREAR ESCUADRON
            if(opcion == 3){
                String n;
                //ArrayList z,s;
                n=JOptionPane.showInputDialog("Nombre");

                inventario.add(new Escuadrones(n,new ArrayList<Zonas>(),new ArrayList<Soldados>()));
                JOptionPane.showMessageDialog(null, "Escuadron creado exitosamente.");
            }

            //LISTAR ESCUADRON
            if(opcion == 4){
                String salida="";
                for (Object x: listaEscuadrones) {
                    if (x instanceof Escuadrones) {
                        salida += listaEscuadrones.indexOf(x) + "- " + x + "\n";
                    }
                }
                JOptionPane.showMessageDialog(null, salida);
            }

            if(opcion == 5){
                String salida="";
                for (Object o: Escuadron) {
                    salida+=Escuadron.indexOf(o)+"- "+o+"\n";
                }
                JOptionPane.showMessageDialog(null, salida);
            }

            //ELIMINAR ESCUADRON
            if(opcion == 6){
                int pos;
                pos=Integer.parseInt(
                        JOptionPane.showInputDialog("Indique la posicion del escuadron que desea" +
                                " eliminar en el inventario")
                );
                listaEscuadrones.remove(pos);
                JOptionPane.showMessageDialog(null,"Elemento eliminado" +
                        " exitosamente");

            }

            //AGREGAR SOLDADO A ESCUADRON
            if(opcion == 7){
                String n, r;
                int e, v;
                Date ti;
                int tipo;
                tipo=Integer.parseInt(JOptionPane.showInputDialog("1-Agregar infanteria ligera\n" +
                        "2-Agregar infanteria pesada\n" +
                        "3-Agregar Sargento\n" +
                        "4-Agregar Capitan\n" +
                        "5-Agregar SuperSoldado"));

                n=JOptionPane.showInputDialog("Nombre");
                r=JOptionPane.showInputDialog("Rango del Soldado");
                e=Integer.parseInt(JOptionPane.showInputDialog("Edad"));
                v=Integer.parseInt(JOptionPane.showInputDialog("Vida (100-400)"));

                if(tipo == 1){
                    int na,d;
                    listaSoldados.add(new ligera(n,r,e,v,new Date(),"Arma Blanca",50));
                }else if(tipo == 2){
                    int na,d;
                    listaSoldados.add(new pesada(n,r,e,v,new Date(),"Bomba",150));
                }else if(tipo == 3){
                    int na,d;
                    listaSoldados.add(new sargento(n,r,e,v,new Date(),"Escopeta",140));
                }else if(tipo == 4){
                    int na,d;
                    listaSoldados.add(new capitan(n,r,e,v,new Date(),"Lanzallamas",110));
                }else if(tipo == 4){
                    int []dano,na,d;
                    String []arma;
                    //listaSoldado.add(new superSoldado(n,r,e,1000,new Date(),"Todas las armas",450));
                }

            }
                //*************************Asioganr soldado a escuadron
            if(opcion == 13){
                int pe, ps;
                pe=Integer.parseInt(JOptionPane.showInputDialog("Posicion de escuadron"));
                ps=Integer.parseInt(JOptionPane.showInputDialog("Posicion del soldado"));
                //listaEscuadrones.get(pe).getlistaSoldados().add(inventario.get(ps));
            }

            if(opcion == 8){
                String salida="";
                for (Object o: listaSoldados) {
                    if (o instanceof Soldados) {
                        salida += listaSoldados.indexOf(o) + "- " + o + "\n";
                    }
                }
                JOptionPane.showMessageDialog(null, salida);
            }

            if(opcion == 11){

            }



        }//FIN DE WHILE







    }
}
