/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EVAL1_2_EDD_16550494
 */
public class PRINCIPAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PruebaNoEstatico pneObj = new PruebaNoEstatico();
        PruebaEstatico.imprimirMensaje();
        System.out.print(pneObj.sNom);
        PruebaEstatico.imprimirMensaje();
        System.out.print(pneObj.sNom);
    }
    
}
    class PruebaNoEstatico{
        public String sNom="Lisseth";
        public void imprimirMensaje(){
            System.out.print("Hola mundo!");

        }
    }
    class PruebaEstatico{
        public static String sNom="Lisseth";
        public static void imprimirMensaje(){
            System.out.print("Hola mundo!");

        }
    }