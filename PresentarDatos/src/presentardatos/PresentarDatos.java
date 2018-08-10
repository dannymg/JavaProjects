/*
    Unidad Educativa Fiscomisional "Padre Jorge A. Quevedo"
    Nombre:Danny Martínez
    Curso:2° Tecnico
    PRESENTAR DATOS PERSONALES 
*/

package presentardatos;
import java.util.Scanner;
public class PresentarDatos {
    
    public static void main(String[] args) {
    //Ingresar los datos personales
        Scanner ingreso = new Scanner(System.in);
        String nombre;
        String apellido;
        int edad;
        String sexo;
        
        System.out.println("Ingrese su nombre: ");
        nombre=ingreso.nextLine();
        System.out.println("Ingrese su apellido: ");
        apellido=ingreso.nextLine();
        System.out.println("Ingrese su edad: ");
        edad=ingreso.nextInt();
        System.out.println("Ingrese su sexo: ");
        sexo=ingreso.next();
        
        System.out.println("Sus datos son: "+nombre+" "+apellido+" "+edad+" "+sexo);
    }    
}
