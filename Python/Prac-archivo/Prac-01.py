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

     try:
          float(note_1)
          if note_1 < 5.0:
               note_2 = input("DIgite la segunda nota: ")
     except ValueError:
          print (f"Por favor digite una nota valida {note_2}")
     
     try:
          float(note_2)
          if note_2 < 5.0:
               note_3 = input("Digite la tercera nota: ")
     except ValueError:
          print (f"Por favor digite una nota valida {note_3}")

     try:
          float(note_3)
          if note_3 < 5.0:
               return calcula_nota()
     except:
          print (f"Por favor digite una nota valida {note_3}")          









def darRespuesta ():
    pass


print (nombreEstudiante ())


"Fecha inicio: 09/Enero/2026/5:00PM"
"Fecha terminado: /Enero/2026/PM"