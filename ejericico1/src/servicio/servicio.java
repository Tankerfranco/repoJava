/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.raza;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author franc
 */
public class servicio {
    private Scanner leer;
    private ArrayList<String>Mascota;
    private raza m;

    public servicio() {
        this.leer = new Scanner(System.in);
        this.Mascota = new ArrayList();
        this.m = new raza();
    }
    
    public void crearRaza(){
        do{
            System.out.println("Ingrese la raza de la mascota");
            m.setRaza(leer.next());
            Mascota.add(m.getRaza());
            System.out.println("Desea agregar otra mascota?");
            String resp = leer.next().toLowerCase();
            if(resp.equals("n")){
                break;
            }
        }while(true);
    }
    
    public void mostrarRaza(){
        for (String raza : Mascota) {
            System.out.println(raza);
        }
    }

}
