/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejocadenas;

/**
 *
 * @author reroes
 */
public class DemoCadenas031 {
    public static void main(String[] args) {
        String nombre = "Roberto";
        String apellido = "Bustamante";
        int edad = 18;
        String cadenaAcumuladora = "Datos Personales\n";
     // usar el string.format para acumular cadenas   
        cadenaAcumuladora = String.format("%s%s\n", cadenaAcumuladora, nombre);
        
        cadenaAcumuladora = String.format("%s%s\n", cadenaAcumuladora, apellido);
        
        cadenaAcumuladora = String.format("%s%s\n", cadenaAcumuladora,edad);
        
        System.out.printf("%s", cadenaAcumuladora);
        
    }
}
