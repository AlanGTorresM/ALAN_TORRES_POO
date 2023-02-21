import java.util.Scanner;

public class Ejercicio_String {
    public static void main(String[] args) {
        String valores;
        Scanner entrada= new Scanner (System.in);
        System.out.print("Escribe Nombre, profesión y país: \n");
        valores= entrada.nextLine().toUpperCase();
        String lista[]= valores.split(" ");
        System.out.println("Nombre: "+ lista[0]);
        System.out.println("Profesión: "+ lista[1]);
        System.out.println("País: "+ lista[2]);
    }
}
