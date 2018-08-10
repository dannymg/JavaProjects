/*
    Unidad Educativa Fiscomisional "Padre Jorge A. Quevedo"
    Nombre:Danny Martínez
    Fecha:29-05-2018
    Curso:2° Tecnico
    INGRESAR TRES NOTAS Y SACAR EL PROMEDIO.SI ES IGUAL O 
    MAYOR A 7 MOSTRAR EL MENSAJE "APROBADO". SI NO, MOSTRAR 
    "RECUPERACION". SI ES MAYOR O IGUAL A 5, MOSTRAR "SUPLETORIO"
    SI NO; MOSTRAR REPROBADO
    
*/
package notas;
import java.util.Scanner;
public class Notas {

    public static void main(String[] args) {
          Scanner entrada=new Scanner(System.in);
        float nota1;
        float nota2;
        float nota3;
        float suma;
        float promedio;
        
        System.out.println("Ingrese la nota 1: ");
        nota1=entrada.nextFloat();
        System.out.println("Ingrese la nota 2: ");
        nota2=entrada.nextFloat();
        System.out.println("Ingrese la nota 3: ");
        nota3=entrada.nextFloat();   
        
        suma=nota1+nota2+nota3;
        System.out.println("La suma de las notas es "+suma);
        
        promedio=suma/3;
        System.out.println("El promedio es "+promedio);
    }
    
}
