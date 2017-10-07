/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EVAL1_21_EDD_16550494
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int aiArray2D[][]= new int[5][5];
        int aiCArray2D[][]=new int[5][5];
        //LENAR ARRELGO CON MUMEROS ALEATORIOS 
          for (int i = 0; i <  aiArray2D.length; i++) {//FILAS
              for (int j = 0; j <  aiArray2D.length; j++) {//COLUMNAS
                  aiArray2D[i][j]=(int)(Math.random()*100)+1;
                  
              }
                 
             }
          //IMPRIMIR
          for (int i = 0; i <  aiArray2D.length; i++) {//FILAS
              for (int j = 0; j <  aiArray2D.length; j++) {//COLUMNAS
                  System.out.print("[" + aiArray2D[i][j]+ "]");
                  
              }
                 System.out.println("");
             }
          
          //--------------------------------------------------------------------------------------------
          
          //MATRIZ COPIA
          int c=aiArray2D.length,c1=aiArray2D.length;
          for (int i =0; i<aiArray2D.length; i++) {
                  c=c-1;
              for (int j =0; j<aiArray2D.length; j++) {
                  //c1=c1-1;
                  aiCArray2D[i][j]=aiArray2D[c][c1];
                  

              }
        }
          //IMPRIMIR COPIA
          for (int i = 0; i < aiCArray2D.length; i++) {//FILAS
              for (int j = 0; j <  aiCArray2D.length; j++) {//COLUMNAS
                  System.out.print("[" + aiCArray2D[i][j]+ "]");
                  
              }
                 System.out.println("");
             }
          
          
          
          
          
          
          
          
    }
    
    
    
}
