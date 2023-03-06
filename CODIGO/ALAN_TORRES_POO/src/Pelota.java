public class Pelota {
    //5 atributos
    private String color;
    private int tamanio;
    private String marca;
    private String deporte;
    private boolean EstaRebotando;

    //Constructor
    public Pelota(String c, int t, String m, String d, boolean ER){
        this.color=c;
        this.tamanio=t;
        this.marca=m;
        this.deporte=d;
        this.EstaRebotando=ER;
    }
    //Metodos de acceso
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(byte tamanio) {
        this.tamanio = tamanio;
    }

    public String getMaterial() {
        return marca;
    }

    public void setMaterial(String material) {
        this.marca = material;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public boolean isEstaRebotando() {
        return EstaRebotando;
    }

    public void setEstaRebotando(boolean estaRebotando) {
        EstaRebotando = estaRebotando;
    }

    //ToString
    @Override
    public String toString() {
        return "Pelota{" +
                "color='" + color + '\'' +
                ", tamanio=" + tamanio +
                ", material='" + marca + '\'' +
                ", deporte='" + deporte + '\'' +
                ", EstaRebotando=" + EstaRebotando +
                '}';
    }
    public void  MalInflado(){
        System.out.println("El balon esta mal inflado");
    }
    public void Deforme(){
        System.out.println("El balon esta deforme, hay que cambiarlo");
    }
    public void gorrito(){
        System.out.println("El balon se poncho y esta siendo usado como gorrito :) ");
    };
}

