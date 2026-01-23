"""Problema a desarrollar:

El módulo debe permitir registrar el nombre de un estudiante y tres calificaciones numéricas.
A partir de esos datos, el programa debe calcular el promedio de las calificaciones y determinar
el resultado final del estudiante según las siguientes reglas:

Si el promedio es mayor o igual a 3.0, el estudiante aprueba.

Si el promedio es menor a 3.0, el estudiante reprueba.

El módulo debe mostrar:

El nombre del estudiante.

El promedio final calculado.

El estado final (aprueba o reprueba)."""


def calcula_nota ():
    return ("Aqui ira el calculo de la nota")

def nombreEstudiante ():
    name_student= input("Hola por favor digite el nombre del estudiante: ")

    if name_student.strip():
         return notasEstudiate()
    else:
         return nombreEstudiante(
              
         )
    
    
def notasEstudiate ():
     note_1= input ("Digite primera nota: ")

     if isinstance (note_1, float):
          calificacion_1 = float (note_1)
          if calificacion_1 <= 5.0:
               note_2=input ("Digite la segunda nota: ")
               print (note_2)
               if isinstance (note_2, float):
                    calificacion_2 = float (note_2)
                    if calificacion_2 <= 5.0:
                         note_3 = input ("Digite la tercera nota: ")
                         print (note_3)
                    else:
                         print(f"Por favor digite una nota valida menor a 5.0{note_3}")
               else:
                    print (f"Verifica que el tipo de dato sea un numero{note_2}")
          else:
                print(f"Por favor digite una nota valida menor a 5.0{note_1}")
     else:
          print (f"Verifica que el tipo de dato sea un numero{note_1}")

                    












def darRespuesta ():
    pass


print (nombreEstudiante ())


"Fecha inicio: 09/Enero/2026/5:00PM"
"Fecha terminado: /Enero/2026/PM"