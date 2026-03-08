package Teoria.Normal;

public class Switch {
    public static void main(String[] args) {
        //This function  to seem to if
        String action = "Agregar";

        switch (action) {
            case "Agregar":
                System.out.println("Agregando...");
                break;

            case "Eliminar":
                System.out.println("Eliminando...");
                break;
            default:
                System.out.println("Accion por defecto si niguna de las dos existe");
                break;
        }

    }
}
