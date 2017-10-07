
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EVAL1_13_EDD_16550494
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int  aiEdades[][];
        
        //PREGUNTAR CUANTOS GRUPOS TIENEN
        Scanner sCaptu=new Scanner (System.in);
        System.out.println("Cuantos grupos tienes");
        int iNoGru=sCaptu.nextInt();
        aiEdades = new int[iNoGru][];
        
        for (int i = 0; i < aiEdades.length; i++) {
            System.out.println("Cuantos alumnos tienes");
            int iNoAlu=sCaptu.nextInt();
            aiEdades[i]=new int[iNoAlu];
            
            for (int j = 0; j < iNoAlu; j++) {
            System.out.println("Introduce la edad");
            aiEdades[i][j]=sCaptu.nextInt();
            
        }
              
        }
         //CALCULAR EL PROMEDIO
        double iSum;
        double dProm=0;
            for (int k = 0; k < iNoGru; k++) {
                iSum=0;
                for (int l = 0; l < aiEdades[k].length; l++) {
                    iSum+=aiEdades[k][l];
                    dProm=iSum/(aiEdades[k].length);
                    
                }
                
                System.out.println("Suma "+iSum);
                System.out.println("Promedio "+dProm);
               
                
            }
           
       
    }
    
    
}
