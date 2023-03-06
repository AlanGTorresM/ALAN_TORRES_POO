public class Puerta {
    // 5 atributos
    private int tamanio;
    private String color;
    private String marca;
    private int anios;
    private String acabados;

    //Constructor
    public Puerta(int t, String c, String m, int an, String ac) {
        this.tamanio = t;
        this.color = c;
        this.marca = m;
        this.anios = an;
        this.acabados = ac;
    }
    // metodos de acceso
    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnios() {
        return anios;
    }

    public void setAnios(int anios) {
        this.anios = anios;
    }

    public String getAcabados() {
        return acabados;
    }

    public void setAcabados(String acabados) {
        this.acabados = acabados;
    }
    //toString
    @Override
    public String toString() {
        return "Puerta{" +
                "tamanio=" + tamanio +
                ", color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                ", anios=" + anios +
                ", acabados='" + acabados + '\'' +
                '}';
    }
    public boolean Rechinar(){
        System.out.println("Esta rechinando?");
        boolean rechinando= Math.random()>5.1;
        return rechinando;
    }
    public int inclinacion(){
        System.out.println("En que grado se encuentra?");
        int inclinación= (int)Math.random();
        return inclinación;
    }
    public boolean EstaDanada(){
        System.out.println("Esta dañada?");
        boolean danio= Math.random()> 0.5;
        return danio;
    }
}
