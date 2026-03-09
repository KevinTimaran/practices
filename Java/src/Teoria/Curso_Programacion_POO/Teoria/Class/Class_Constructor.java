package Teoria.Curso_Programacion_POO.Teoria.Class;
// Class
// Attributes
// Method constructor
// Get and set: These methods come after the constructor method
//We're going to use the set method
// Method
public class Class_Constructor {
        // This is the attributes, this datas are  globals
        int id;
        String name;
        String surname;

    // Method constructor, these datas are locals
    public Class_Constructor(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }
    // 2. ¡AGREGA ESTO! El constructor vacío
    public Class_Constructor() {
        // Al dejarlo vacío, permites la creación de un objeto "en blanco"
    }

    // Methods get and set
    // Get = traeme / Brindame: Voy a poder optener los datos para mostrar los datos o hacer operaciones
    // Set = Colocame: Colocar o estableser valores a los atributos este no retorna nada
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    //This is the methods
        public void mostrarNombre(){
            System.out.println("Hello, i am Kevin");
        }
}
