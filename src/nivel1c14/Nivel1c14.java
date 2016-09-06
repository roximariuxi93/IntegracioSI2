/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nivel1c14;
import java.util.Scanner;

/**
 * programa:nivel1c14
 * descripcion:
 * fecha: 24 de junio del 2014
 * autor: Roxi
 * @author Roxi
 */
public class Nivel1c14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("ttravis integracion");
        int [] vector;
        int tamaño=10,i=0;
        float acumula=0,promedio=0;
        Scanner entrada=new Scanner(System.in);
        vector = new int [tamaño];
        
        // pedir las 10 notas
        for ( i=0; i<vector.length; i++){
            System.out.printf(" ingrese la nota %d =>",i+1);
            vector[i]=entrada.nextInt();
        }
        //acumula las 10 notas es decir sumarlas
        for ( i=0; i<vector.length; i++){
            acumula=acumula+vector[i];
        }
        
        // sacar el promedio
        promedio=acumula/tamaño;
        System.out.printf("%s  %8s \n","No.ALUMNO","NOTA");
        for  ( i=0; i<vector.length; i++) {
             System.out.printf("%5d %8d \n",i+1,vector[i]);
             
        }
        System.out.println("el promedio de notas es ==> "+promedio);
            
        
    }
    
}
