
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EVAL1_17_EDD_16550494
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sCaptu= new Scanner(System.in);
        System.out.println("Cuantos datos ingresaras");
        int iDatos=sCaptu.nextInt();
        int aiDatos[]=new int[iDatos];
        
        
        for (int i = 0; i < aiDatos.length; i++) {
            System.out.println("Ingresa el dato");
            aiDatos[i]=sCaptu.nextInt();
            
            
            
        }
        int min, max;
        min = max = aiDatos[0];
        for (int i = 0; i < aiDatos.length; i++) {
            if(min>aiDatos[i]){
                min=aiDatos[i]; 
            }
           
            if(max < aiDatos[i]){
            max = aiDatos[i];
        }
        }
        System.out.println("MAXIMO "+ max +" MINIMO "+ min);
    }

}