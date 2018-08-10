//Nombre: Danny Martínez-----PRUEBA PARCIAL
package numerosuerte;
import java.util.Scanner;
public class NumeroSuerte {
    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
                int dia;
                int mes;
                int anio;
                int suma;
                int A,B,C,D;
                int suerte;
        System.out.println("Escriba su fecha de nacimiento...");
        System.out.print("Ingrese el dia: ");
        dia=entrada.nextInt();
        System.out.print("Ingrese el mes: ");
        mes=entrada.nextInt();
        System.out.print("Ingrese el año: ");
        anio=entrada.nextInt();   
        
        suma=dia+mes+anio;

        A=suma/1000;
        B=suma/100%10;
        C=suma/10%10;
        D=suma%10;
        
        suerte=A+B+C+D;
        
        System.out.println("Su numero de la suerte es "+suerte);
    }
    
}
  