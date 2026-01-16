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
     note_2= input ("Digite segunda nota: ")
     note_3= input ("Digite Tercera nota: ")

     # Evaluar si este este dato puede ser un numero float
     if note_1.isdigit ():
          if note_1 <= 5.0: 
               calificacion_1 = float (note_1)
               return note_2 
     elif isinstance(note_1, str) or note_1 > 5.0:
          return note_1 

     if note_2.isdigit():
          if note_2 <= 5.0:
               calificacion_2 = float (note_2)
               return note_3
     elif isinstance(note_2, str) or note_2 >= 5.0:
          return note_2
     
     if note_3.isdigit ():
          if note_3 <=5.0:
               calificacion_3= float(note_3)
     
     elif isinstance (note_3, str) or note_3 >= 5.0:
          return note_3


"""     # Evaluar nota 1
     if isinstance (note_1, float) and note_1 <= 5:
          return note_2
     elif isinstance (note_1, str) or note_1 > 5:
          return (f"Por favor verifique que la nota sea valida {note_1}")
     
     
     # Evaluar nota 2
     if isinstance (note_2, float) and note_2 <= 5:
          return note_3
     elif isinstance (note_2, str) or note_2 > 5:
          return (f"Por favor verifique que la nota sea valida {note_2}")
     
    
     # Evaluar nota 3
     if isinstance (note_3, float) and note_3 <= 5:
          return (f"Notas agregadas correctamente {calcula_nota()}")
     else:
          return note_3
"""








def darRespuesta ():
    pass


print (nombreEstudiante ())


"Fecha inicio: 09/Enero/2026/5:00PM"
"Fecha terminado: /Enero/2026/PM"