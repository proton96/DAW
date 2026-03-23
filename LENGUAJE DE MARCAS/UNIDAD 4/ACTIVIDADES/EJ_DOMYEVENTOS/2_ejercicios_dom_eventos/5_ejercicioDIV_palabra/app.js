"use strict";

// Seleccionamos elementos del DOM
let div = document.getElementById("info");
let boton = document.querySelector("button");

let temporizador;                   // Variable para el intervalo
let juegoActivo = false;            // Controla si el juego está en marcha
let tiempoLimite = 10;              // Tiempo en segundos
let palabraSecreta = "javascript";  // Palabra a adivinar

// Función que inicia el juego
function iniciarJuego() {
    if (juegoActivo) return;            // Evita múltiples inicios

    juegoActivo = true;
    boton.disabled = true;              // Desactivar botón mientras se juega
    div.style.pointerEvents = "auto";   // Habilitar clic en el div
    div.innerText = "Adivina la palabra";
    
    let tiempoRestante = tiempoLimite;

    // Temporizador de cuenta regresiva
    temporizador = setInterval(() => {
        tiempoRestante--;
        div.innerText = `Tiempo: ${tiempoRestante}`;

        if (tiempoRestante <= 0) {
            finalizarJuego(false);
        }
    }, 1000);
}

// Función para verificar la palabra ingresada
function verificarPalabra() {
    if (!juegoActivo) return;

    let respuesta = prompt("Introduce la palabra secreta:").toLowerCase();

    if (respuesta === palabraSecreta) {
        finalizarJuego(true);
    } else {
        darPista(respuesta);
    }
}

// Función para dar pistas
function darPista(respuesta) {
    if (!respuesta) return;

    let mensaje = "Incorrecto. ";
    if (respuesta.length < palabraSecreta.length) {
        mensaje += "La palabra es más larga.";
    } else if (respuesta.length > palabraSecreta.length) {
        mensaje += "La palabra es más corta.";
    } else {
        let aciertos = 0;
        for (let i = 0; i < respuesta.length; i++) {
            if (respuesta[i] === palabraSecreta[i]) aciertos++;
        }
        mensaje += `Has acertado ${aciertos} letra(s) en la posición correcta.`;
    }
    alert(mensaje);
}

// Función para finalizar el juego
function finalizarJuego(ganado) {
    clearInterval(temporizador);        // Detener el temporizador
    juegoActivo = false;
    boton.disabled = false;             // Reactivar el botón
    div.style.pointerEvents = "none";   // Deshabilitar clic en el div

    if (ganado) {
        alert("¡HA GANADO! 🎉");
        div.innerText = "¡Ganaste!";
    } else {
        alert("¡HA PERDIDO! 😢 La palabra era: " + palabraSecreta);
        div.innerText = "Perdiste...";
    }
}

// Eventos
boton.addEventListener("click", iniciarJuego);
div.addEventListener("click", verificarPalabra);
