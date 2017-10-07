/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EVAL1_9_EDD_1655049
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int alArray2D[][] = new int[3][3];
        // llenar cada elemoeto con numeros aleatorios
        
        for (int i = 0; i < 3; i++) { //filas
            for (int j = 0; j < 3; j++) {//columnas
                alArray2D[i][j] = (int)(Math.random() * 10)+1;
                
            }
            
        }
        
        for (int i = 0; i < 3; i++) { //filas
            for (int j = 0; j < 3; j++) {//columnas
                System.out.print("["+ alArray2D[i][j]+"]");

                //alArray2D[i][j] ;
                
            }
            System.out.println("");
        }
    }
    
}
