En este ejercicio, debes crear una jerarquía de clases en Java utilizando herencia. La
clase base se llamará Vehiculo y tendrá un método abstracto encenderMotor(). La
clase derivada también debe heredar las propiedades de Vehiculo, como la marca, el
modelo y el número de puertas. Además, el programa debe permitir la creación de un
vehículo mediante la entrada del usuario.
Requisitos:
1. Clase Vehiculo (abstracta):
o Atributos:
▪ String marca: la marca del vehículo.
▪ String modelo: el modelo del vehículo.
o Constructor:
▪ Un constructor que reciba marca y modelo y los inicialice.
o Método abstracto:
▪ public abstract void encenderMotor().
o Método mostrarDetalles: imprime los detalles del vehículo (marca y
modelo).
2. Clase Coche (hereda de Vehiculo):
o Atributos adicionales:
▪ int numPuertas: número de puertas del coche.
o Constructor:
▪ Constructor que inicializa marca, modelo y numPuertas,
llamando al constructor de la clase base con super().
o Sobrescribir el método mostrarDetalles para que imprima también el
número de puertas.
o Sobrescribir el método encenderMotor para imprimir un mensaje
indicando que el motor del coche ha sido encendido.
o Método adicional:
▪ public void abrirPuertas(): este método deberá usar un
bucle for para simular la apertura de cada puerta. Debe imprimir
"Abriendo puerta X" para cada puerta, donde X es el número de la
puerta. Además, debe usar un if para verificar si el coche tiene
más de 2 puertas y, en ese caso, imprimir "Este coche tiene más
de 2 puertas".
o Método crearCochePorConsola() para usar este método no es necesario
instancias la clase.
Puntos a considerar:
• Utiliza un bucle for en el método abrirPuertas y un if para comprobar el
número de puertas.
