import java.util.Scanner;

public class Gato {
    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);
        String valores;
        System.out.println("ingresa valores para el gato:");
        valores= entrada.nextLine();
        while(valores.length()< 1 || valores.length()>9){
            System.out.println("Esa entrada no es valida intenta otra");
            valores= entrada.nextLine();
        }
        System.out.printf("| %s %s %s |", valores.charAt(0),valores.charAt(1),valores.charAt(2));
        System.out.println();
        System.out.printf("| %s %s %s |", valores.charAt(3),valores.charAt(4),valores.charAt(5));
        System.out.println();
        System.out.printf("| %s %s %s |", valores.charAt(6),valores.charAt(7),valores.charAt(8));
    }
}
