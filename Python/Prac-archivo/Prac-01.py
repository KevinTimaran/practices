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


def darNombre ():
    return darNombre()

def calcula_nota ():
    pass

def darPregunta ():
    name_student= str(input("Hola por favor digite el nombre del estudiante: "))

    note_1 = float(input ("Digite primera nota: "))
    note_2 = float(input ("Digite segunda nota: "))
    note_3 = float(input ("Digite Tercera nota: "))

    if name_student == str:
        return note_1
    if name_student != str:
        return (f"Por favor el nombre deben ser letras y no numeros {name_student}")
    if note_1 == int:
        return note_2
    if note_1 != int:
        return (f"Por favor la nota deben ser valores numericos {note_1}")
    if note_2 == int:
        return note_3
    if note_2 != int:
        return (f"Por favor la nota deben ser valores numericos {note_2}")
    if note_3 == int:
        return calcula_nota()
    else:
        return (f"Por favor la nota deben ser valores numericos {note_3}")
    

def darRespuesta ():
    pass


print (darPregunta())