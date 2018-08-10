/*
    Unidad Educativa Fiscomisional "Padre Jorge A. Quevedo"
    Nombre:Danny Martínez
    Fecha:17-07-2018
    Curso:2° Tecnico
    CALCULAR EL SUELDO DE UN EMPLEADO EN UN MES QUE GANA $10 LA HORA.
    SI TRABAJO MAS DE 160 HORAS AL MES GANARA HORA EXTRAS DEL 5% 
*/
package sueldo;
public class Main {
    public static void main(String[] args) {
        Empleado pepe = new Empleado();
        pepe.ingresar();
        pepe.presentar();
        pepe.bono();        
    }
}
