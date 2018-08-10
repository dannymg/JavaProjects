/*
    Unidad Educativa Fiscomisional "Padre Jorge A. Quevedo"
    Nombre:Danny Martínez
    Fecha:29-05-2018
    Curso:2° Tecnico
    INGRESAR LA EDAD. SI ES IGUAL O MAYOR A 18 MOSTRAR EL 
    MENSAJE "ES MAYOR DE EDAD"
*/

package mayordeedad;
import java.util.Scanner;
public class MayorDeEdad {
    
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int edad;
        System.out.println("Ingrese su edad: ");
        edad=entrada.nextInt();
        //Instruccion de seleccion
        if(edad>=18) {
            System.out.println("Es mayor de edad");
        }
    }
}
