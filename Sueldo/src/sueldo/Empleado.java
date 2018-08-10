package sueldo;
import java.util.Scanner;
public class Empleado {
    Scanner entrada=new Scanner(System.in);
public Empleado(){};
int horas,sueldo,extra,z;
    public void ingresar(){
        System.out.print("Ingrese las horas que trabajo: ");
        horas=entrada.nextInt();
    }
    public void presentar(){
        if (horas<=160) {
            sueldo=horas*10;
            System.out.println("Su sueldo es de " + sueldo);
        } 
    }    
    public void bono(){
        if (horas>160) {
            horas=horas*10;
            z=horas*5/100;
            extra=horas+z;
            System.out.println("Su sueldo total con horas extras es " + extra);        
        }
    }   
}
