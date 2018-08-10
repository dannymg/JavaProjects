/*
    Unidad Educativa Fiscomisional "Padre Jorge A. Quevedo"
    Nombre:Danny Martínez
    Fecha:19-06-2018
    Curso:2° Tecnico
    USAR SWITCH PARA PRESENTAR LOS DIAS DE LA SEMANA */
package diasdelasemana;
import java.util.Scanner;
public class DiasDeLaSemana {
    public static void main(String[] args) {
            Scanner entrada=new Scanner(System.in);
            int dia;
            System.out.print("Ingrese numero: ");
            dia=entrada.nextInt();
          switch(dia){
              case 1:System.out.println("Lunes");break;
              case 2:System.out.println("Martes");break;
              case 3:System.out.println("Miercoles");break;
              case 4:System.out.println("Jueves");break;
              case 5:System.out.println("Viernes");break;
              case 6:System.out.println("Sabado");break;
              case 7:System.out.println("Domingo");break;
            default:System.out.println("Opcion incorrecta");
          }   
    }  
}
