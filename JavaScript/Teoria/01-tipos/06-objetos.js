// Tipo de referencia 
// Un objeto es una colección de propiedades, donde cada propiedad
//  tiene un nombre (clave) y un valor asociado.

let nombre = "Kevin";
let come = "Pizza";
let edad = 43;

// En javaScript a esto se le conoce como llave-valor o propiedad y no como parametro
let persona = {
    nombre: "Kevin",
    come: "Pizza",
    edad: 43,
}; // Objeto vacío
console.log(persona); // Imprime: {}
console.log(persona.nombre); // Imprime: Kevin
console.log(persona ['come']); // Imprime: Pizza
console.log(persona.edad); // Imprime: 43


persona.edad = 100; // Modificando la propiedad 'edad'
console.log(persona.edad); // Imprime: 100


delete persona.come; // Elimina la propiedad 'come'
console.log(persona); // Imprime: undefined