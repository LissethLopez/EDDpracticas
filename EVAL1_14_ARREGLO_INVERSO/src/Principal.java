
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EVAL1_14_EDD_16550494
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //PEDIR NUMERO DE DATOS
        Scanner sCaptu= new Scanner(System.in);
        System.out.println("Cuantos datos ingresaras");
        int iDatos=sCaptu.nextInt();
        int aDatos[]=new int[iDatos];
        int aDatosC[]=new int[iDatos];
        
        //INGRESAR LOS DATOS
        for (int i = 0; i < aDatos.length; i++) {
            System.out.println("Ingresa el dato");
            aDatos[i]=sCaptu.nextInt();
            
            
        }
        
        //HACER COPIA INVERSA
        for (int i = 0; i < aDatosC.length; i++) {
            iDatos=iDatos-1;
            aDatosC[i]=aDatos[iDatos];
            
        }
        
       //IMPRIMIR COPIA INVERSA
        for (int i : aDatosC) {
            System.out.print(i+","); 
        }
        System.out.println("");
    }
    
}
