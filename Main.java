package Lab4P2_MarioCalix_22041098;

import Semana4.miExcepcion;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws ExcepcionEs {
        ArrayList <Zonas>inventario = new ArrayList();
        ArrayList <Escuadrones> listaEscuadrones = new ArrayList();
        ArrayList <Soldados>listaSoldados = new ArrayList();

        int opcion = 0;
        while (opcion != 14) {
            opcion = Integer.parseInt(
                    JOptionPane.showInputDialog("1. Crear zona\n" +
                                                "2. Listar zonas\n" +
                                                "3. Crear escuadron\n" +
                                                "4. Listar escuadrones\n" +
                                                "5. Listar escuadron\n" +
                                                "6. Eliminar escuadron\n" +
                                                "7. Añadir soldado\n" +
                                                "8. Asignar soldado a Escuadron\n" +
                                                "9. Listar soldados\n" +
                                                "10. Listar soldados de escuadron por tipo\n" +
                                                "11. Eliminar soldados de escuadron\n" +
                                                "12. Pelear\n" +
                                                "13. Asignar Zona a Escuadron\n" +
                                                "14. Salir\n")
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

                listaEscuadrones.add(new Escuadrones(n,new ArrayList(),new ArrayList()));
                JOptionPane.showMessageDialog(null, "Escuadron creado exitosamente.");
            }

            //LISTAR ESCUADRONES
            if(opcion == 4){
                String salida="";
                for (Object x: listaEscuadrones) {
                    if (x instanceof Escuadrones) {
                        salida += listaEscuadrones.indexOf(x) + "- " + x + "\n";
                    }
                }
                JOptionPane.showMessageDialog(null, salida);
            }

            //LISTAR ESCUADRON
            if(opcion == 5){
                for (Escuadrones temp: listaEscuadrones) {
                    JOptionPane.showMessageDialog(null,temp);
                }
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
                    Random ran = new Random();
                    int da,na,d;
                    String arma;
                    listaSoldados.add(new superSoldado(n,r,e,1000,new Date(),new String[ran.nextInt()],new int[ran.nextInt()]));
                }

            }
            //Asignar soldado a escuadron
            if(opcion == 8){
                int pe, ps;
                pe=Integer.parseInt(JOptionPane.showInputDialog("Posicion de Escuadron"));
                ps=Integer.parseInt(JOptionPane.showInputDialog("Posicion de soldado"));
                listaEscuadrones.get(pe).getlistaSoldados().add(listaSoldados.get(ps));
            }

            if(opcion == 9){
                String salida="";
                for (Object o: listaSoldados) {
                    if (o instanceof Soldados) {
                        salida += listaSoldados.indexOf(o) + "- " + o + "\n";
                    }
                }
                JOptionPane.showMessageDialog(null, salida);
            }

            //LISTAR TIPOS DE SOLDADOS
            if(opcion == 10) {
                int tipo;
                tipo = Integer.parseInt(JOptionPane.showInputDialog("Selecione el tipo de Soldados a listar\n" +
                        "1-infanteria ligera\n" +
                        "2-infanteria pesada\n" +
                        "3-Sargento\n" +
                        "4-Capitan\n" +
                        "5-SuperSoldado"));
                String salida = "";
                if (tipo == 1) {
                    for (Object o : listaSoldados) {
                        if (o instanceof ligera) {
                            salida += listaSoldados.indexOf(o) + "- " + o + "\n";
                        }
                    }
                    JOptionPane.showMessageDialog(null, salida);
                }else if (tipo == 2) {
                    for (Object o : listaSoldados) {
                        if (o instanceof ligera) {
                            salida += listaSoldados.indexOf(o) + "- " + o + "\n";
                        }
                    }
                    JOptionPane.showMessageDialog(null, salida);
                }else if (tipo == 3) {
                    for (Object o : listaSoldados) {
                        if (o instanceof sargento) {
                            salida += listaSoldados.indexOf(o) + "- " + o + "\n";
                        }
                    }
                    JOptionPane.showMessageDialog(null, salida);
                }else if (tipo == 4) {
                    for (Object o : listaSoldados) {
                        if (o instanceof capitan) {
                            salida += listaSoldados.indexOf(o) + "- " + o + "\n";
                        }
                    }
                    JOptionPane.showMessageDialog(null, salida);
                }else if (tipo == 5) {
                    for (Object o : listaSoldados) {
                        if (o instanceof superSoldado) {
                            salida += listaSoldados.indexOf(o) + "- " + o + "\n";
                        }
                    }
                    JOptionPane.showMessageDialog(null, salida);
                }
            }

            //Eliminar soldados de escuadron
            if(opcion == 11){
                int pos,posS;
                pos=Integer.parseInt(
                        JOptionPane.showInputDialog("Indique la posicion de escuadron"));
                posS=Integer.parseInt(JOptionPane.showInputDialog("Posicion del soldado que desea eliminar"));
                listaEscuadrones.get(pos).listaSoldados.remove(posS);
                JOptionPane.showMessageDialog(null,"Soldado eliminado" +
                        " exitosamente");
            }

            //PELEA
            if(opcion == 12){
                int es, es2;
                int s1,s2;
                JOptionPane.showMessageDialog(null, "Escoga los escuadrones");
                es=Integer.parseInt(JOptionPane.showInputDialog("Posicion de escuadron 1"));
                es2=Integer.parseInt(JOptionPane.showInputDialog("Posicion de escuadron 2"));

                JOptionPane.showMessageDialog(null,listaEscuadrones.get(es).getNombre()+" peleara" +
                        " contra el escuadron "+listaEscuadrones.get(es2).getNombre());

                JOptionPane.showMessageDialog(null, "Escoga la posicion " +
                        "de soldado a atacar.");
                s1=Integer.parseInt(JOptionPane.showInputDialog("Posicion del soldado del escuadron 1"));
                s2=Integer.parseInt(JOptionPane.showInputDialog("Posicion del soldado del escuadron 2"));
                JOptionPane.showMessageDialog(null,listaEscuadrones.get(es).listaSoldados.get(s1).getNombre()+
                        " peleara contra el soldado "+listaEscuadrones.get(es2).listaSoldados.get(s2).getNombre());

                JOptionPane.showMessageDialog(null,listaEscuadrones.get(es).listaSoldados.get(s1).getNombre()+
                        " ataco a "+listaEscuadrones.get(es2).listaSoldados.get(s2).getNombre()+ "haciendole "+
                        listaSoldados.get(es));
            }

            //ASIGNAR ZONA A ESCUADRON
            if(opcion == 13){
                int pz, pe;
                pe=Integer.parseInt(JOptionPane.showInputDialog("Posicion de Escuadron"));
                pz=Integer.parseInt(JOptionPane.showInputDialog("Posicion de Zona"));
                listaEscuadrones.get(pe).getListaZonas().add(inventario.get(pz));
            }



        }//FIN DE WHILE







    }
}
