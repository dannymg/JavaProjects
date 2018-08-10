/*
    Unidad Educativa Fiscomisional "Padre Jorge A. Quevedo"
    Nombre:Danny Martínez
    Fecha:10-07-2018
    Curso:2° Tecnico
    CREAR UNA MATRIZ Y MOSTRARLA POR MEDIO DE UN METODO
*/
package matriz;
public class Matriz {
    public static void main(String[] args) {
        int X[][]={{1,2,8},{4,5,2}};
        int Y[][]={{2,4},{1},{5,4,6}};
        System.out.println("Los valores en el arreglo 1 por filas son: ");
        imprimirArreglo(X);
        System.out.println("Los valores en el arreglo 2 por filas son: ");
        imprimirArreglo(Y);
    }    
    public static void imprimirArreglo(int X[][]){
        for (int fila=0; fila<X.length; fila++) {
            for (int columna=0; columna<X[fila].length; columna++) 
                System.out.printf("%d ",X[fila][columna]);     
                System.out.println(" ");
        }
    }
}
