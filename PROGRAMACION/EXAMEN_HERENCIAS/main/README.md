## Examen Java
Herencia — Polimorfismo — Sobrecarga
En este examen deberás implementar una jerarquía de clases en Java haciendo uso
de herencia, polimorfismo, sobrescritura y sobrecarga.
La clase base será Animal y se deberán crear tres clases derivadas: Perro, Gato y
Loro.
La aplicación ZooApp gestionará un único ejemplar de cada tipo de animal.
## 1. Clase Animal (abstracta)
• Atributos:
• protected String nombre,
• protected String especie,
• protected int edad.
• Constructores:
• Defecto
• Parámetros.
• Métodos abstractos:
• hacerSonido()
• alimentarse()
• Métodos concretos:
• mostrarDetalles(): muestra la información del animal.
• esMayor(Animal otro): compara edades.
## 2. Clase Perro (hereda de Animal)
• Atributos:
• private String raza
• private boolean entrenado
• Constructores:
• Constructor completo con parámetros.
• Constructor por defecto.
• Métodos sobrescritos:
• hacerSonido(): “El perro ladra: ¡Guau, guau!”.
• alimentarse(): “El perro está comiendo pienso.”
• mostrarDetalles(): incluye raza y si está entrenado.
• Métodos propios:
• moverCola(int veces): usa un bucle.
• crearPerroPorConsola(): método estático.
## 3. Clase Gato (hereda de Animal)
• Atributos:
• private boolean tieneCola
• private int vidasRestantes
• Constructores:
• Constructor completo.
• Constructor por defecto (vidas = 7).
• Métodos sobrescritos:
• hacerSonido(): “miau miau”.
• alimentarse(): “El gato come pescado”.
• mostrarDetalles(): cola y vidas restantes.
• Métodos propios:
• saltar(int veces): usa un bucle.
• crearGatoPorConsola(): método estático.
## 4. Clase Loro (hereda de Animal)
• Atributos:
• private String colorPlumas
• private boolean habla
• Constructores:
• Al menos un constructor completo con parámetros.
• Métodos sobrescritos:
• hacerSonido(): “¡Hola, hola!”.
• alimentarse(): “Come semillas y frutas”.
• mostrarDetalles(): color de plumas y si habla.
## 5. Clase ZooApp (Main)
Gestionará un Perro, un Gato y un Loro (máximo uno de cada).
Cada animal se almacena en su propia variable.
El main debe de tener:
• Crear un Perro.
• Crear un Gato.
• Crear un Loro.
• Mostrar detalles de los animales.
• Comparar edades con esMayor().
• Ejecutar Acciones Automáticas:
Perro → sonido, alimentarse, moverCola(3).
Gato → sonido, alimentarse, saltar(3).
Loro → sonido, alimentarse.
