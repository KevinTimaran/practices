package Ejercicios.Polomorfismo;

public class Main {
    public static void main(String[] args) {
        System.out.println("This a exercise of polomorfismo");

        Veiculo [] miVeiculo  = new Veiculo[3];

        miVeiculo[0] = new CarroFamiliar("Rojo", "Toyota", 2020, "ABC123", "5");
        miVeiculo[1] = new CarroCarreras("Azul", "Ferrari", 2021, "DEF456", 300);
        miVeiculo[2] = new CarroCarga("Blanco", "Volvo", 2019, "GHI789", 10000);

        System.out.println("Informacion de los vehiculos:");
        System.out.println("--------------------------------");
        for (Veiculo veiculo : miVeiculo) {
            System.out.println(veiculo.mostrarCarro());
        }
        System.out.println("--------------------------------");
    }
}
