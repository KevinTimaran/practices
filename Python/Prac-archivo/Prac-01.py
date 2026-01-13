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
         return nombreEstudiante
    
    
def notasEstudiate (self):
        self.notas = {
        "note_1": input ("Digite primera nota: "),
        "note_2": input ("Digite segunda nota: "),
        "note_3": input ("Digite Tercera nota: ")} 

        note_1 = float(notas["note_1"])
        note_2 = float(notas["note_2"])
        note_3 = float(notas["note_3"])

        if isinstance (note_1, float):
             return note_2
        elif isinstance (note_1, float):
             return ("Por favor verifique que la nota sea un numero", notas["note_1"])
        


    
    
    

def darRespuesta ():
    pass


print (nombreEstudiante ())


"Fecha inicio: 09/Enero/2026/5:00PM"
"Fecha terminado: /Enero/2026/PM"