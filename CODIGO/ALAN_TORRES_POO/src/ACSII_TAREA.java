import java.util.Scanner;
public class ACSII_TAREA {
    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);
        String ingreso;
        boolean valor=true;
        System.out.println("Introduzca valores: ");
        ingreso= entrada.nextLine();
        for (int i=0; i<ingreso.length()-1;i++){
            if ((int)ingreso.charAt(i+1)-(int)ingreso.charAt(i)!=1){
                valor=false;
                break;
            }
        }
        System.out.println("La secuencia es: "+ valor);
    }
}
