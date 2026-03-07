## ACTIVIDAD 10 
## Escribir un programa que pida al usuario un número entero
#  y muestre por pantalla si es un número primo o no.

num = int(input("Introduce un número entero: "))

for i in range (2,num) :
   if (num%i==0):
      print ("No es primo")
      break 
   if (i+1)==num:
        print ("Es primo")




