/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Paises;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServicioPaises {

    private HashSet<String> paises;
    private ArrayList<String> pais2;
    private static Scanner leer;

    public ServicioPaises() {
        paises = new HashSet();
        pais2 = new ArrayList(paises);
        leer = new Scanner(System.in).useDelimiter("\n");

    }

    public void crearPais() {
        String resp;

        do {
            Paises b4 = new Paises();
            System.out.println("ingrese el nombre del pais");
            b4.setNombre(leer.next());
            paises.add(b4.getNombre());
            System.out.println("¿desea ingresar otro pais?");
            System.out.println("S/N");
            resp = leer.next();
            if (resp.equalsIgnoreCase("N")) {
                break;
            }

        } while (true);

    }

    public void mostrarPais() {
        for (String aux : paises) {
            System.out.println(aux);
        }

    }

    public void ordenar() {
        Collections.sort(pais2);
    }

    //Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
    //buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
    //usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
    //al usuario.
    
    public void eliminarPais(){
        Iterator it = paises.iterator();
        System.out.println("Que pais quieres eliminar?");
        String r = leer.next();
        while (it.hasNext()) {
            if (it.next().equals(r)){
                it.remove();
            }
        }
    }
}
