package ejercicio4;

public class SmartPhone extends SmartDevice{
    String tipoPantalla;
    int ram;
    String sistemaOperativo;

    public SmartPhone() {
    }

    public SmartPhone(String marca, String modelo, String color, String tipoPantalla, int ram, String sistemaOperativo) {
        super(marca, modelo, color);
        this.tipoPantalla = tipoPantalla;
        this.ram = ram;
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getTipoPantalla() {
        return tipoPantalla;
    }

    public int getRam() {
        return ram;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", tipoPantalla='" + tipoPantalla + '\'' +
                ", ram=" + ram +
                ", color='" + color + '\'' +
                '}';
    }
}
