package Ejercicios.Polomorfismo;

public class CarroFamiliar extends Veiculo {
    String NumMaximoPersonas;

    public CarroFamiliar() {
    }


    public CarroFamiliar(String color, String marca, int modelo, String placa, String numMaximoPersonas) {
        super(color, marca, modelo, placa);
        NumMaximoPersonas = numMaximoPersonas;
    }


    public String getNumMaximoPersonas() {
        return NumMaximoPersonas;
    }

    public void setNumMaximoPersonas(String numMaximoPersonas) {
        NumMaximoPersonas = numMaximoPersonas;
    }

    @Override
    public String mostrarCarro() {
        return "CarroFamiliar{" +
                "maximoPersonas='" + NumMaximoPersonas + '\'' +
                ", color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo=" + modelo +
                ", placa='" + placa + '\'' +
                '}';
    }
}
