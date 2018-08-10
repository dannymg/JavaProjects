package pruebap2;
import java.util.Scanner;
public class Mayor {
    Scanner entrada=new Scanner(System.in);
    public Mayor (){ };
int edad;    
    public void calcular(){
        System.out.print("Ingrese su edad: ");
        edad=entrada.nextInt();
    } 
    public void mas(){
        if (edad>=18) {
            System.out.println("Mayor de edad");
        }
    }    
    public void menos() {
        if (edad<18) {
            System.out.println("Menor de edad");
        }
    }       
}
