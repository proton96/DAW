"use strict";

let tam_y = 150;
let pos_y = 50;
let temporizador_d, temporizador_t;  // para crecimiento y teclado
let activo_teclado = false

// Elementos del DOM


const b_creci = document.querySelector(".inicio");
const b_pausa = document.querySelector(".paro");
const b_mov = document.querySelector(".activar");


// Evento 'keydown'


// Evento 'click' primer botón
b_creci.addEventListener("click",   
    () => {
        if (!activo_teclado) {
            temporizador_d = setInterval(() => {
                tam_y += 10;
                pos_y -= 5;
               
            });

// Evento 'click' segundo botón
b_pausa.addEventListener("click",   
    () => {
       
        });

// Evento 'click' tercer botón
b_mov.addEventListener("click",   
    () => {
     
        
});
