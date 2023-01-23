/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import utilidad.Comparadores;

/**
 *
 * @author Usuario
 */
public class PeliculaService {
    
    private Scanner leer;
    
    private ArrayList<Pelicula>peliculaList;

    public PeliculaService() {
        leer=new Scanner(System.in).useDelimiter("\n");
        peliculaList=new ArrayList();         
    }
    
   public void crearPelicula(){
       
       String respuesta;
       do{
           
           Pelicula peliculaObj=new Pelicula();
           
       System.out.println("ingrese el titulo de la pelicula ");
       String tituloIngresado=leer.next();
       tituloIngresado=tituloIngresado.toUpperCase();
       
       System.out.println("ingrese el director de la pelicula");
       String directorIngresado=leer.next();
       directorIngresado=directorIngresado.toUpperCase();
       
       System.out.println("ingrese la duracion de la pelicula en horas");
       Integer duracionIngresada=leer.nextInt();
  
       
       peliculaList.add(new Pelicula(tituloIngresado,directorIngresado,duracionIngresada));
        
           System.out.println("desea ingresar otra pelicula");
           respuesta=leer.next();
           if(respuesta.equalsIgnoreCase("n")){
               break;
               
           }      
       
       }while(true);
   } 
    public void mostrarPelicula(){
        
        for (Pelicula aux : peliculaList) {
            System.out.println(aux);
            
        }
                  
    }
    public void mostrarPeliculaMas1(){
        
        for (Pelicula aux : peliculaList) {
            if(aux.getDuracion()>1){
                System.out.println(aux);
            }
        }
    }
    public void mostrarDuracionDesc(){
         System.out.println("_______________________");
        System.out.println("      descendente       ");  
        Collections.sort(peliculaList, Comparadores.compararDuracionDesc);
        for (Pelicula aux : peliculaList) {
            System.out.println(aux);
        }
        
    }    
    public void mostrarDuracionAsc(){
        System.out.println("_______________________");
        System.out.println("      ascendente       ");    
        
        
        Collections.sort(peliculaList, Comparadores.compararDuracionAsc);
        
        for (Pelicula aux : peliculaList) {
            System.out.println(aux);
        }
        
    } 
    
    public void mostrarTitulo(){
         System.out.println("_______________________");
        System.out.println("      titulo            ");  
        Collections.sort(peliculaList, Comparadores.compararTitulo);
        for (Pelicula aux : peliculaList) {
            System.out.println(aux);
        }
        
    }    
    public void mostrarDirector(){
         System.out.println("_______________________");
        System.out.println("      director          ");  
        Collections.sort(peliculaList, Comparadores.compararDirector);
        for (Pelicula aux : peliculaList) {
            System.out.println(aux);
        }
        
    }        
    }
    

