public class DriverTest {
    public static void main(String[] args) {
        Pelota pelota1 = new Pelota("verde",3,"adidas","fucho",true);
        System.out.println(pelota1);
        pelota1.Deforme();
        pelota1.MalInflado();
        pelota1.gorrito();

        Puerta puerta1= new Puerta(52,"blanca", "Muebles Dico", 7, "madera");
        System.out.println(puerta1);
        System.out.println(puerta1.EstaDanada());
        System.out.println(puerta1.inclinacion());
        System.out.println(puerta1.Rechinar());
    }
}
