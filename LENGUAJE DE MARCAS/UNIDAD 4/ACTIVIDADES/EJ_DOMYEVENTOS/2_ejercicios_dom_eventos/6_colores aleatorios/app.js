"use strict";

// Arrays de colores
const digitos_hexadecimales = ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"];
const colores_nombres = ["red", "blue", "green", "yellow", "purple", "orange", "pink", "brown", "cyan", "magenta"];

// Selección de elementos del DOM
let colorTexto = document.querySelector(".color");
let btnHexa = document.getElementById("btn-hexa");
let btnNombre = document.getElementById("btn-nombre");


// Función para generar un color hexadecimal aleatorio
function generarColorHexadecimal() {
    let color = "#";
    for (let i = 0; i < 6; i++) {
        color += digitos_hexadecimales[Math.floor(Math.random() * digitos_hexadecimales.length)];
    }
    
    aplicarColor(color);


}

// Función para seleccionar un color por nombre aleatorio
function generarColorPorNombre() {
    
    let color = colores_nombres[Math.floor(Math.random() * colores_nombres.length)];
    aplicarColor(color);
}

// Función para aplicar el color al fondo y actualizar el texto
function aplicarColor(color) {
    document.body.style.background = color;
    colorTexto.textContent = color;
    colorTexto.style.color = color;
}

// Eventos de los botones
btnHexa.addEventListener("click", generarColorHexadecimal);
btnNombre.addEventListener("click", generarColorPorNombre);
