package Ejercicios.Polomorfismo;

public class CarroCarga extends Veiculo {
    int vargaMaximaKg;

    public CarroCarga() {}

    public CarroCarga(int vargaMaximaKg) {
        this.vargaMaximaKg = vargaMaximaKg;
    }

    public CarroCarga(String color, String marca, int modelo, String placa, int vargaMaximaKg) {
        super(color, marca, modelo, placa);
        this.vargaMaximaKg = vargaMaximaKg;
    }

    public int getVargaMaximaKg() {
        return vargaMaximaKg;
    }

    public void setVargaMaximaKg(int vargaMaximaKg) {
        this.vargaMaximaKg = vargaMaximaKg;
    }

    @Override
    public String mostrarCarro() {
        return "CarroCarga{" +
                "cargaMaximaKg=" + vargaMaximaKg +
                ", color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo=" + modelo +
                ", placa='" + placa + '\'' +
                '}';
    }
}
