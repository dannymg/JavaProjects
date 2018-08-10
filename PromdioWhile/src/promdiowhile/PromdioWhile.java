/*
    Unidad Educativa Fiscomisional "Padre Jorge A. Quevedo"
    Nombre:Danny Martínez
    Fecha:12-06-2018
    Curso:2° Tecnico
    A UNA CLASE DE 10 ESTUDIANTES SE APLICA UN  EXAMEN, 
    LAS CALIFICACIONES (EN UN RANGO DEL 0 AL 100), DE
    ESTE EXAMEN ESTAN DISPONIBLES PARA SU ANALISIS.
    DETERMINE EL PROMEDIO DE LA CLASE PARA ESTE EXAMEN
*/
package promdiowhile;
import java.util.Scanner;
public class PromdioWhile {
    public static void main(String[] args) {

        int suma=0;
        float promedio;
        int repeticion=1;
        int n=0;
        while(repeticion<=10){
            Scanner entrada = new Scanner(System.in);
            System.out.print("Ingrese nota: ");
            n=entrada.nextInt();
            if(n<=100){
                repeticion++;
                suma=suma+n;
            }
            else{
            System.out.println("Error: Ingrese otra nota");
            n=entrada.nextInt();
            }
        }
        
        promedio=suma/10;
        System.out.println("la suma es "+suma);
        System.out.println("El promedio es "+promedio);
                
                
    }
    
}
    
