import 'dart:ffi';
import 'dart:io';

import 'package:dart_basics/dart_basics.dart' as dart_basics;

/*
1- Primeros explicacaion(Variables y guardado de datos)  -13
    * Primeros ejercicios(Variables y guardado de datos) - 72

2- Segunda teoria (Condicionales ) - 99

*/

//-------------------------------------------------------Primeros explicacaion(Variables y guardado de datos)------------------------------------------------------

 void main(List<String> arguments) {
  listExample();
// var name = 'Kevin';
// var age = 20;

// name = 'Stiven';
// print( name);

// Variables numéricos

//   int age = 31;
//   int test = -56;
//   int large = 0111100000;

//   double age2 = 31.4;
//   double age3 = 31;

//   num age4 =12;
//   num age5 = 12.3;

//   //Variables de cadena de texto

//   String name ='AristiDevs';
//   name ='aris';
//   name = "Pepe";
//   name = " Aris 31";
//   String  currentAge ="31 años";
//   // String fullText = name + currentAge;
//   String fullText = "soy $name y tengo $currentAge";
//   print(fullText);

//   //Variables booleanas

//   bool imHappy = true;

//   //Tipo dinamico
//   dynamic example = "Hola soy un ejemplo";
//   print(example);
//   example = 23;
//   print(example);

//   //Tipos fijos
//   final String example2= "Aris";
//   const String example3 = "Aris";

//   //Comversiones
//   String toNumber ="31";
//   int numbesOk = int.parse(toNumber);
//   print(numbesOk);

//   int numberToString = 615;
//   String stringOK = numberToString.toString();
//   print( stringOK);
}

//-----------------------------------------------Primeros ejercicios(Variables y guardado de datos

// void main (List<String> arguments){

//   print("Por favor digite el total a pagar: ");
//   String totalPagar = stdin.readLineSync()!;
//   int cliente = 1;
//   int propina = 50;

//   double numbesOk = double.parse(totalPagar);

//   // pasar mumero a %

//   double porsentaje = propina / 100;

//   String totalPersona = ((numbesOk+( numbesOk * porsentaje))/cliente).toStringAsFixed(3);

//   // Imprimir resultados
//   print ("Cada cliente debe pagar $totalPersona");

// }

//-------------------------------------------------------Segunda teoria (Condicionales )------------------------------------------------------

//     int userAge = 10;

//     if (userAge >= 18 ){
//       print("Eres mayor de edad");
//     } else {
//       print( "Eres menor de edad");
//     }

// (userAge <= 18) ? print("Eres mayor de edad") : print("Eres menor de edad");

//     int experienceYears = 5;

//     if (experienceYears >8){
//       print("Eres programador SENIOR");
//       } else if (experienceYears >= 5){
//         print("Eres programador MID");
//       } else{
//         print( "Eres programador JUNUIR");
//       }

//-----------------------------------------------------------

//------------------------------------------------------------

// void main(List<String> arguments) {
//   print("Introduce el dia de la semana:");
//   int numberOfTheweek = int.parse(stdin.readLineSync()!);

//   // if( numberOfTheweek ==1){
//   //   print("Lunes");

//   // } else if(numberOfTheweek ==2){
//   //   print("Martes");

//   // } else if(numberOfTheweek ==3){
//   //   print("Miercoles");

//   // } else if(numberOfTheweek ==4){
//   //   print("Jueves");

//   // } else if(numberOfTheweek ==5){
//   //   print("Viernes");

//   // } else if(numberOfTheweek ==6){
//   //   print("Sabado");

//   // } else if(numberOfTheweek ==7){
//   //   print("Domingo");
//   // }else {print("El numero no es válido");}

//   switch (numberOfTheweek) {
//     case 1:
//       print("Lunes");
//       break;
//     case 2:
//       print("Martes");
//       break;

//     case 3:
//       print("Miercoles");
//       break;

//     case 4:
//       print("Jueves");
//       break;

//     case 5:
//       print("Viernes");
//       break;

//     case 6:
//       print("Sabado");
//       break;

//     case 7:
//       print("Domingo");
//       break;

//     default:
//       print("Numero no valido");
//       break;
//   }
// }

//----------------------------------------------------- Ejercicio

// void main(List<String> arguments) {
//   print("Introduce un numero:");
//   int numberOfTheweek = int.parse(stdin.readLineSync()!);

//   switch (numberOfTheweek) {
//     case > 0:
//       print("El numero $numberOfTheweek es positivo ");
//       break;

//     case < 0:
//       print("El numero $numberOfTheweek Es negativo");
//       break;

//     case == 0:
//       print("El numero es un cero");
//       break;
//   }
// }

//------------------------------------------------------ Funciones ---------------------------------------------------------------------------------------_

// void greeting(String name) {
//   print(name);
// }

// int number(int A, int B) {
//   return A * B;
// }
//-------------------------------------------------------Estructuras de datos------------------------------------------------------------------------------------------__

void listExample() {
  List<String> names = ["Pepe", "grillo", "Carlos", "Alfonso"];
  //var name2 = ["Rojo", "Verde", "Tomate"];

   print (names[1]);
   //print(names. last);
   //print(name2);

}
