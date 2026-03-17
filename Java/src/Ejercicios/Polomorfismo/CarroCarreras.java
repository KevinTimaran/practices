package Ejercicios.Polomorfismo;

public class CarroCarreras extends Veiculo {
    int velocidadMaxima;

    public CarroCarreras() {
    }

    public CarroCarreras(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public CarroCarreras(String color, String marca, int modelo, String placa, int velocidadMaxima) {
        super(color, marca, modelo, placa);
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    @Override
    public String mostrarCarro() {
        return "CarroCarreras{" +
                "velocidadMaxima=" + velocidadMaxima +
                ", color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo=" + modelo +
                ", placa='" + placa + '\'' +
                '}';
    }
}
