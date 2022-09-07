package ejercicio4;

public class SmartWatch extends SmartDevice{
    double tamanio;
    boolean esDeportivo;

    public SmartWatch() {
    }

    public SmartWatch(String marca, String modelo, String color, double tamanio, boolean esDeportivo) {
        super(marca, modelo, color);
        this.tamanio = tamanio;
        this.esDeportivo = esDeportivo;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tamanio=" + tamanio +
                ", esDeportivo=" + esDeportivo +
                ", color='" + color + '\'' +
                '}';
    }
}
