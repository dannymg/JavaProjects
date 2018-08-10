package operacionesmatematicas;
import java.util.Scanner;
public class Operaciones {
    public Operaciones(){ }
            int n1,n2,s,r,m,d;
           
    public void sumar(){
        s=n1+n2;
        System.out.printf("la suma es ",s);
    }
    public void restar(){
        r=n1-n2;
        System.out.printf("la resta es ",r);
    }

    public void multiplicar(){
        m=n1*n2;
        System.out.printf("la multiplicacion es ",m);

    }
    public void dividir(){
        d=n1/n2;
        System.out.printf("la division es ",d);
    }
}
