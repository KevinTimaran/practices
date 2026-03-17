package Ejercicios.Polomorfismo;

public class Veiculo {
    String marca;
    int modelo;
    String placa;
    String color;

    Veiculo(){
    }

    public Veiculo(String color, String marca, int modelo, String placa) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
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

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String mostrarCarro(){
        return "Marca: " + marca + "\nModelo: " + modelo + "\nPlaca: " + placa + "\nColor: " + color;
    }
}
