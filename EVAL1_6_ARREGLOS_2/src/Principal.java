
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EVAL1_6_EDD_16550494
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    
    public static final int iTAMA=5;
    public static void main(String[] args) {
       
        String asNombres[]=new String[iTAMA];
        //CAPTURAR 5 NNOMBRES 
        Scanner sCaptu = new Scanner (System.in);
        for (int i = 0; i < iTAMA; i++) {
           System.out.println("Tu nombre :");
           asNombres[i]=sCaptu.nextLine();
        }
        for (String asNombre : asNombres) {
            System.out.println("Nombre: " + asNombre);
            
        }
        //CREAR UNA COPIA DEL ARREGLO
        /*String asCopia[]=asNombre;//Esto no funciona
        asNombre[0]="HOLA MUNDO";
        System.out.println(asCopia[0]);*/
         
        String asCopia[]=new String[iTAMA];
        for (int i = 0; i < iTAMA; i++) {
            asCopia[i]=asNombres[i];
            
        }
        asNombres[0]="Hola mundo ";
        System.out.println("Nombre = " + asNombres[0]);
        System.out.println("Copia = " + asCopia[0]);
    }
    
}
