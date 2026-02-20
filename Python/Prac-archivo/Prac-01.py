

pregunta = input ("Digite el numero: ")

while pregunta != float:
     pregunta = input ("Digite el numeroooo: ")
     try:
          convertir = float(pregunta)
          while convertir > 5.0: 
               pregunta = input ("Digite un numero menor a 5.0: ")
               convertir = float(pregunta)
     except ValueError:
          print ("Dato erroneo")
     pregunta = convertir
print ("Dato guardado")

          
     


"""
try:
     convertir = float(pregunta)
     while convertir > 5.0: 
          pregunta = input ("Digite el numero: ")
          convertir = float(pregunta)
     print ("Dato guardado")
     
except ValueError:
    print ("Verifica que el dato sea un numero")
     
"""